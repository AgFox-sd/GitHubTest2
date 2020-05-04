package com.teams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.teams.pojo.D_file;
import com.teams.pojo.s_cell;
import com.teams.service.StockPzService;

@Controller
public class StockPzController {
	
	@Autowired
	StockPzService service;
	
	//查询库存配置未设计的产品和物料
	@RequestMapping("selectWsj")
	@ResponseBody
	public List<D_file> selectWsj(){
		return service.selectWsj();
	}
	
	//查询库存配置未设计的产品和物料数量
	@RequestMapping("selectZs")
	@ResponseBody
	public int selectZs(){
		return service.selectZs();
	}
	
	//增加库存配置信息
	@RequestMapping("addKc")
	@ResponseBody
	public s_cell addKc(@RequestBody s_cell s_cell){
		if (service.selectCount(s_cell.getProduct_id())>0) {			
		}else {
			service.addkC(s_cell);
		}
		return service.selectKc(s_cell.getProduct_id());
	}
	
	//修改库存配置信息
	@RequestMapping("updKc")
	@ResponseBody
	public int updKc(@RequestBody s_cell s_cell){
		service.updDfile(s_cell.getProduct_id());
		return service.updKc(s_cell);
	}
		
	//查询所有未审核的库存配置信息
	@RequestMapping("selectAll")
	@ResponseBody
	public List<s_cell> selectAll(String check_tag){
		return service.selectAll(check_tag);
	}
	
	//查询所有未审核或审核通过的配置单数量
	@RequestMapping("selectAllCount")
	@ResponseBody
	public int selectAllCount(String check_tag){
		return service.selectAllCount(check_tag);
	}
	
	//根据产品编号查询库存配置信息
	@RequestMapping("selectKcById")
	@ResponseBody
	public s_cell selectKcById(String product_id) {
		return service.selectKc(product_id);		
	}
	
	//审核库存配置信息
	@RequestMapping("updfh")
	@ResponseBody
	public int updfh(@RequestBody s_cell s_cell) {
		return service.updfh(s_cell);
	}
	
	//查询所有库存配置信息
    @RequestMapping("selectSy")
	@ResponseBody
	public List<s_cell> selectSy(){
		return service.selectSy();
	}
	
	//查询所有库存配置信息的总数
    @RequestMapping("selectSycount1")
	@ResponseBody
	public List<s_cell> selectSycount1(){
		return service.selectSycount1();
	}
	
	//查询未完成库存配置信息的总数
    @RequestMapping("selectSycount2")
	@ResponseBody
	public List<s_cell> selectSycount2(){
		return service.selectSycount2();
	}
	
	//查询完成库存配置信息的总数
    @RequestMapping("selectSycount3")
	@ResponseBody
	public List<s_cell> selectSycount3(){
		return service.selectSycount3();
	}
	
}
