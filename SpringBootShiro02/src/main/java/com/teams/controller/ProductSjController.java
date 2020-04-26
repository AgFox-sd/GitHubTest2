package com.teams.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.teams.service.ProductSjService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teams.pojo.D_file;
import com.teams.pojo.D_module_details;

@Controller
public class ProductSjController {
	
	@Autowired
    ProductSjService service;
	
	//查询显示的信息为所有已通过复核的产品档案
	@RequestMapping("/selectId2")
	@ResponseBody
	public List<D_file> selectId2() {
			//System.out.println("1111");
			List<D_file> list=service.selectId2("审核通过");
			//System.out.println(list);
			return list;
	}
	
	
	//通过产品编号(id)查询档案信息
	@RequestMapping("/Selidxx")
	@ResponseBody
	public D_file Selidxx(String product_id) {
		D_file file=service.Selidxx(product_id);
		return file;
	}
	
	//提交变更(修改)
	@RequestMapping("/updBG")
	@ResponseBody
	public String updBG(@RequestBody D_file file) {
		 int upd=service.updBG(file);
		 return upd>0?"成功":"失败";
   }


	
	//查询通过审核的商品档案信息
	@RequestMapping("/Selad")
	@ResponseBody
	public List<D_file> Selad() {
		List<D_file> list=service.Selad("审核通过","未设计",1);
		return list;
	}
	
	//查询通过审核的物料信息
	@RequestMapping("/Selad2")
	@ResponseBody
	public List<D_file> Selad2() {
		List<D_file> list=service.Selad("审核通过","未设计", 2);
		return list;
	}
	//添加产品物料组成设计单和物料组成明细单
	@RequestMapping("/productWlZc")
	@ResponseBody
    public List<D_module_details> productWlZc(@RequestParam("bh") String[] bh,@RequestParam("mc") String[] mc,@RequestParam("lx") String[] lx,@RequestParam("dc") String[] dc,@RequestParam("sl") int[] sl,@RequestParam("dw") String[] dw,@RequestParam("dj") double[] dj,@RequestParam("product_id") String product_id,@RequestParam("product_name") String product_name,@RequestParam("sjdh") String sjdh,@RequestParam("sjr") String sjr) {		
		List<D_module_details> list = new ArrayList<D_module_details>();
		for (int i = 0; i < dj.length; i++) {
			service.productWlZc(sjdh,product_id,product_name,sjr,sl[i]*dj[i]);
			service.wlZcMx(sjdh,bh[i],mc[i],dw[i],sl[i],dj[i],sl[i]*dj[i]);
			service.updWlSj(product_id,"已设计");
			D_module_details dmd = new D_module_details(bh[i],mc[i],dw[i],sl[i],dj[i],sl[i]*dj[i],lx[i],dc[i]);
			list.add(dmd);
			//System.out.println(bh[i]+mc[i]+lx[i]+dc[i]+sl[i]+dj[i]+dw[i]+product_id+product_name+sjdh+sjr);
		}
		return list;
	}
}
