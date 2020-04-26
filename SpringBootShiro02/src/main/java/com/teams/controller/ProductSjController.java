package com.teams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.teams.service.ProductSjService;
import com.teams.pojo.D_file;
@Controller
public class ProductSjController {
	@Autowired
    ProductSjService service;
	
	//查询审核通过的产品信息
	@RequestMapping("/selectAllProduct")
	@ResponseBody
	public List<D_file> selectProduct() {
			List<D_file> list=service.selectProduct("审核通过");
			return list;
	}
	
	//删除审核通过的产品信息
	@RequestMapping("/deleteProduct")
	@ResponseBody
	public int deleteProduct(@RequestParam("product_id") int product_id) {
		return service.updDelete_tag(product_id,"已删除");
	}
	
	//恢复审核通过的产品信息
	@RequestMapping("/recoverProduct")
	@ResponseBody
	public int recoverProduct(@RequestParam("product_id") int product_id) {
		return service.updDelete_tag(product_id,"未删除");
	}
	
	//永久删除审核通过的产品信息
	@RequestMapping("/yjDeleteProduct")
	@ResponseBody
	public int yjDeleteProduct(@RequestParam("product_id") int product_id) {
		return service.yjDeleteProduct(product_id);
	}
	
}
