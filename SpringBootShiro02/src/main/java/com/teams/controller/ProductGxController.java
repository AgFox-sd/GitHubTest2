package com.teams.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.teams.pojo.D_file;
import com.teams.pojo.D_gonxus;
import com.teams.pojo.M_design_procedure;
import com.teams.pojo.M_design_procedure_details;
import com.teams.pojo.M_gonxu;
import com.teams.service.ProductGxService;
import com.teams.utils.Params;

@Controller
public class ProductGxController {
    @Autowired
	ProductGxService service;
	
 
	//产品档案查询
		@RequestMapping("/selD_fileIds")
		@ResponseBody
		public  PageInfo<D_file> selectId(@RequestBody Params param) {
			PageInfo<D_file> list=service.selecIds(param);
			return list;
		}
		//工序步骤查询
		@RequestMapping("/selectbz")
		@ResponseBody
		public  List<M_gonxu> selectbz(String parent_id) {
			List<M_gonxu> list=service.selectbz(parent_id);
			return list;
		}
		
		//添加产品物料组成设计单和物料组成明细单
		@RequestMapping("/productgxzc")
		@ResponseBody
	    public List<D_gonxus> productgxzc(@RequestParam("bh") String[] bh,@RequestParam("mc") String[] mc,@RequestParam("lx") Double[] lx,@RequestParam("dc") String[] dc,@RequestParam("sl") Double[] sl,@RequestParam("dw") Double[] dw,@RequestParam("product_id") String product_id,@RequestParam("product_name") String product_name,@RequestParam("sjdh") String sjdh,@RequestParam("sjr") String sjr,@RequestParam("djr") String djr) {		
			double zje =0;
						for (int i = 0; i <bh.length; i++) {
				service.addgxmx(sjdh, bh[i], lx[i], dc[i], sl[i], dw[i], djr);				
				zje +=dw[i];
			}
			if(service.selectcount(sjdh)>0) {
				service.updzje(zje,sjdh);
			}else {
				service.addgx(sjdh, product_id, product_name, zje, sjr, djr);
			}
			List<D_gonxus> list = new ArrayList<D_gonxus>();
	    	List<M_design_procedure_details> lists=service.selectcpmxb(sjdh);
	    	for (M_design_procedure_details a : lists) {
	    		D_gonxus dmd = new D_gonxus(a.getProcedure_id(),a.getName(),a.getLabour_hour_amount(),a.getAmount_unit(),a.getCost_price(),a.getSubtotal());
				list.add(dmd);
			}
			return list;
		}
	    @RequestMapping("/selectyczgx")
	    @ResponseBody
	    public List<D_gonxus> selectyczgx(String design_id){
	    	List<D_gonxus> list = new ArrayList<D_gonxus>();
	    	List<M_design_procedure_details> lists=service.selectcpmxb(design_id);
	    	for (M_design_procedure_details a : lists) {
	    		D_gonxus dmd = new D_gonxus(a.getProcedure_id(),a.getName(),a.getLabour_hour_amount(),a.getAmount_unit(),a.getCost_price(),a.getSubtotal());
				list.add(dmd);
			}
			return list;
	    }
	    
	    @RequestMapping("/updsjbz")
	    @ResponseBody
	    public int updsjbz(String product_id) {
			return service.updsj("已设计",product_id);
	    }
	    @RequestMapping("/delgxsjd")
	    @ResponseBody
	    public List<D_gonxus> delgxsjd(int id,double xj,String parent_id){
	    	service.delgxsjd(id,parent_id);
	    	service.updgxsjd(xj,parent_id);
	    	List<D_gonxus> list = new ArrayList<D_gonxus>();
	    	List<M_design_procedure_details> lists=service.selectcpmxb(parent_id);
	    	for (M_design_procedure_details a : lists) {
	    		D_gonxus dmd = new D_gonxus(a.getProcedure_id(),a.getName(),a.getLabour_hour_amount(),a.getAmount_unit(),a.getCost_price(),a.getSubtotal());
				list.add(dmd);
			}
	    	return list;
	    }
 	    //查询产品工序
	    @RequestMapping("/selectcpgx")
	    @ResponseBody
	    public PageInfo<M_design_procedure> selectcpgx(@RequestBody Params Params){
	    	PageInfo<M_design_procedure> list =service.selectcpgx(Params);
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
	    	service.updsj("已审核", product_id);
	    	return row;
	    }
	    
	    @RequestMapping("/delgxsj")
	    @ResponseBody
	    public int delgxsj(String check_yj,String design_id) {
	    	int row=service.delgxsj(check_yj,design_id);
	    	return row;
	    } 
	    
	    @RequestMapping("/selectcpgxs")
	    @ResponseBody
	    public PageInfo<M_design_procedure> selectcpgxs(@RequestBody Params Params){
	    	PageInfo<M_design_procedure> list =service.selectcpgxs(Params);
	    	return list;
	    }
	    
	    @RequestMapping("/selectcpgxss")
	    @ResponseBody
	    public PageInfo<M_design_procedure> selectcpgxss(@RequestBody Params Params){
	    	PageInfo<M_design_procedure> list =service.selectcpgxss(Params);
	    	return list;
	    }
	  //添加产品物料组成设计单和物料组成明细单
	  		@RequestMapping("/productgxbg")
	  		@ResponseBody
	  	    public int productgxbg(String sjdh,String change_yj) {
	  			return service.updbg(sjdh,change_yj);
	  		}
}
