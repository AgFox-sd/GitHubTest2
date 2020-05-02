package com.teams.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.teams.pojo.D_file;
import com.teams.pojo.D_gonxus;
import com.teams.pojo.D_module_details;
import com.teams.pojo.M_design_procedure;
import com.teams.pojo.M_design_procedure_details;
import com.teams.pojo.M_gonxu;
import com.teams.service.ProductGxService;
import com.teams.service.ProductSjService;

@Controller
public class ProductGxController {
    @Autowired
	ProductGxService service;
	
 
	//产品档案查询
		@RequestMapping("/selD_fileIds")
		@ResponseBody
		public  List<D_file> selectId() {
			List<D_file> list=service.selecIds();
			return list;
		}
		//工序步骤查询
		@RequestMapping("/selectbz")
		@ResponseBody
		public  List<M_gonxu> selectbz() {
			List<M_gonxu> list=service.selectbz();
			return list;
		}
		
		//添加产品物料组成设计单和物料组成明细单
		@RequestMapping("/productgxzc")
		@ResponseBody
	    public List<D_gonxus> productgxzc(@RequestParam("bh") String[] bh,@RequestParam("mc") String[] mc,@RequestParam("lx") Double[] lx,@RequestParam("dc") String[] dc,@RequestParam("sl") Double[] sl,@RequestParam("dw") Double[] dw,@RequestParam("product_id") String product_id,@RequestParam("product_name") String product_name,@RequestParam("sjdh") String sjdh,@RequestParam("sjr") String sjr,@RequestParam("djr") String djr) {		
			double zje =0;
			
	    	List<D_gonxus> list = new ArrayList<D_gonxus>();
			for (int i = 0; i <bh.length; i++) {
				service.addgxmx(sjdh, bh[i], lx[i], dc[i], sl[i], dw[i], djr);				
				D_gonxus dmd = new D_gonxus(bh[i],mc[i],lx[i],dc[i],sl[i],dw[i]);
				zje +=dw[i];
				list.add(dmd);
			}
			service.addgx(sjdh, product_id, product_name, zje, sjr, djr);
			service.updsj("已设计",product_id);
			return list;
		}
	    //查询产品工序
	    @RequestMapping("/selectcpgx")
	    @ResponseBody
	    public List<M_design_procedure> selectcpgx(){
	    	List<M_design_procedure> list =service.selectcpgx("等待审核");
	    	return list;
	    }
	    
	    @RequestMapping("/selectcpmxb")
	    @ResponseBody
	    public List<M_design_procedure_details> selectcpmxb(@RequestParam("parent_id")String parent_id){
	    	List<M_design_procedure_details> list =service.selectcpmxb(parent_id);
	    	return list;
	    }
	    
	    @RequestMapping("/updsjd")
	    @ResponseBody
	    public int updsjd(@RequestParam("check_tag")String check_tag,@RequestParam("design_id")String design_id,@RequestParam("product_id")String product_id,@RequestParam("checker")String checker) {
	    	int row=service.updsjd(check_tag,checker, design_id);
	    	int row1=service.updsj("已审核", product_id);
	    	return row;
	    }
	    
	    @RequestMapping("/delgxsj")
	    @ResponseBody
	    public int delgxsj(@RequestParam("design_id")String design_id) {
	    	int row=service.delgxsj(design_id);
	    	int row1=service.delgxsjs(design_id);
	    	System.out.println("进入delgxsj");
	    	return row;
	    } 
	    
	    @RequestMapping("/selectcpgxs")
	    @ResponseBody
	    public List<M_design_procedure> selectcpgxs(){
	    	List<M_design_procedure> list =service.selectcpgxs();
	    	return list;
	    }
	    
	  //添加产品物料组成设计单和物料组成明细单
	  		@RequestMapping("/productgxbg")
	  		@ResponseBody
	  	    public List<D_gonxus> productgxbg(@RequestParam("bh") String[] bh,@RequestParam("mc") String[] mc,@RequestParam("lx") Double[] lx,@RequestParam("dc") String[] dc,@RequestParam("sl") Double[] sl,@RequestParam("dw") Double[] dw,@RequestParam("product_id") String product_id,@RequestParam("product_name") String product_name,@RequestParam("sjdh") String sjdh,@RequestParam("sjr") String sjr,@RequestParam("djr") String djr) {		
	  			double zje =0;
	  			//service.updbgs(sjdh);
	  			service.delgxbg(sjdh);
	  	    	List<D_gonxus> list = new ArrayList<D_gonxus>();
	  			for (int i = 0; i <bh.length; i++) {
	  				service.addgxmx(sjdh, bh[i], lx[i], dc[i], sl[i], dw[i], djr);
	  				//service.updbgs(bh[i],lx[i], sl[i], dw[i], sjdh);
	  				D_gonxus dmd = new D_gonxus(bh[i],mc[i],lx[i],dc[i],sl[i],dw[i]);
	  				zje +=dw[i];
	  				list.add(dmd);
	  			}
	  			//service.addgx(sjdh, product_id, product_name, zje, sjr, djr);
	  			service.updbg(zje, sjdh);
	  			return list;
	  		}
}
