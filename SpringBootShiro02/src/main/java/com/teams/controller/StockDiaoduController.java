package com.teams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.teams.pojo.S_gather;
import com.teams.pojo.S_gather_details;
import com.teams.pojo.s_cell;
import com.teams.pojo.s_pay;
import com.teams.pojo.s_pay_details;
import com.teams.pojo.stockjh;
import com.teams.pojo.stockjhs;
import com.teams.service.StockDiaoduService;

@Controller
public class StockDiaoduController {

	@Autowired
	StockDiaoduService service;
	
	//查询所有入库单
	@RequestMapping("selectoutStock")
	@ResponseBody
	public List<S_gather> selectoutStock(){
		return service.selectoutStock();
	}
	
	@RequestMapping("selectAlloutStock")
	@ResponseBody
	public List<S_gather> selectAlloutStock(){
		return service.selectAlloutStock();
	}
	
	@RequestMapping("selectAllinStock")
	@ResponseBody
	public List<s_pay> selectAllinStock(){
		return service.selectAllinStock();
	}
	
	//查询所有出库单
	@RequestMapping("selectoutStock1")
	@ResponseBody
	public List<s_pay> selectoutStock1(){
		return service.selectoutStock1();
	}
	
	@RequestMapping("selectoutStockcount1")
	@ResponseBody
	public int selectoutStockcount1(){
		return service.selectoutStockcount1();
	}
	
	@RequestMapping("selectoutStockcount2")
	@ResponseBody
	public int selectoutStockcount2(){
		return service.selectoutStockcount2();
	}
	
	@RequestMapping("selectoutStockcount3")
	@ResponseBody
	public int selectoutStockcount3(){
		return service.selectoutStockcount3();
	}
	
	@RequestMapping("selectoutStockcount4")
	@ResponseBody
	public int selectoutStockcount4(){
		return service.selectoutStockcount4();
	}
	
	@RequestMapping("selectoutStockcount5")
	@ResponseBody
	public int selectoutStockcount5(){
		return service.selectoutStockcount5();
	}
	
	@RequestMapping("selectoutStockcount6")
	@ResponseBody
	public int selectoutStockcount6(){
		return service.selectoutStockcount6();
	}
	
	@RequestMapping("selectoutStockcount7")
	@ResponseBody
	public int selectoutStockcount7(){
		return service.selectoutStockcount7();
	}
	
	@RequestMapping("selectoutStockcount8")
	@ResponseBody
	public int selectoutStockcount8(){
		return service.selectoutStockcount8();
	}
	@RequestMapping("selectAlloutStockcount1")
	@ResponseBody
	public int selectAlloutStockcount1(){
		return service.selectAlloutStockcount1();
	}
	
	@RequestMapping("selectAlloutStockcount2")
	@ResponseBody
	public int selectAlloutStockcount2(){
		return service.selectAlloutStockcount2();
	}
	
	@RequestMapping("selectAlloutStockcount3")
	@ResponseBody
	public int selectAlloutStockcount3(){
		return service.selectAlloutStockcount3();
	}
	
	@RequestMapping("selectAlloutStockcount4")
	@ResponseBody
	public int selectAlloutStockcount4(){
		return service.selectAlloutStockcount4();
	}
	
	//查询所有入库单详情
	@RequestMapping("selectoutStockXq")
	@ResponseBody
	public List<S_gather_details> selectoutStockXq(String gather_id){
		return service.selectoutStockXq(gather_id);
	}

	//查询所有出库单详情
	@RequestMapping("selectoutStockXq1")
	@ResponseBody
	public List<s_pay_details> selectoutStockXq1(String pay_id){
		return service.selectoutStockXq1(pay_id);
	}
	
	//查询有无可调度的安全配置库存
	@RequestMapping("selectKdd")
	@ResponseBody
	public int selectKdd(String product_id) {
		return service.selectKdd(product_id);
	}
	
	//根据产品编号多表联查
	@RequestMapping("selectoutStockCp")
	@ResponseBody
	public List<stockjh> selectoutStockCp(String product_id,String gather_id){
		return service.selectoutStockCp(product_id,gather_id);
	}
	
	//根据产品编号多表联查
	@RequestMapping("selectoutStockCp1")
	@ResponseBody
	public stockjhs selectoutStockCp1(String product_id,String pay_id){
		return service.selectoutStockCp1(product_id,pay_id);
	}
	
	//修改库存
	@RequestMapping("updDiaodu")
	@ResponseBody
	public int updDiaodu(String product_id,String gathered_amount,String gather_id) {
		service.updKc(gathered_amount,product_id);
		service.updZb(gathered_amount,gather_id);
		return service.updDiaodu(gathered_amount,product_id,gather_id);
	}
	
	//修改库存
	@RequestMapping("updDiaodu1")
	@ResponseBody
	public int updDiaodu1(String product_id,String paid_amount,String pay_id) {
		service.updKc1(paid_amount,product_id);
		service.updZb1(paid_amount,pay_id);
		return service.updDiaodu1(paid_amount,product_id,pay_id);
	}
	
	@RequestMapping("updDiaodu2")
	@ResponseBody
	public int updDiaodu2(String product_id,String paid_amount,String pay_id) {
		service.updZb2(paid_amount,pay_id);
		return service.updDiaodu2(paid_amount,product_id,pay_id);
	}
	
	@RequestMapping("updDiaodu3")
	@ResponseBody
	public int updDiaodu3(String product_id,String paid_amount,String pay_id) {
		service.updKc2(paid_amount,product_id);
		return service.updDiaodu3(paid_amount,product_id,pay_id);
	}
	//修改入库表为已调度
	@RequestMapping("updZdiaodu")
	@ResponseBody
	public int updZdiaodu(String attemper,String gather_id) {
		return service.updZdiaodu(attemper,gather_id);
	}
	
	//修改出库表为已调度
	@RequestMapping("updZdiaodu1")
	@ResponseBody
	public int updZdiaodu1(String attemper,String pay_id) {
		return service.updZdiaodu1(attemper,pay_id);
	}
	
	@RequestMapping("updZdiaodu2")
	@ResponseBody
	public int updZdiaodu2(String attemper,String pay_id) {
		return service.updZdiaodu2(attemper,pay_id);
	}
	
	@RequestMapping("updZdiaodu3")
	@ResponseBody
	public int updZdiaodu3(String attemper,String pay_id,String pg_id) {
		service.updpg(pg_id);
		return service.updZdiaodu3(attemper,pay_id);
	}
	
	@RequestMapping("updDdu")
	@ResponseBody
	public int updDdu(String product_id,String attemper,String gather_id) {
		service.updKcxq(gather_id,product_id);
		return service.updDdu(attemper,gather_id);
	}
	
	@RequestMapping("updDdu1")
	@ResponseBody
	public int updDdu1(String product_id,String pay_id) {	
		service.updKcxq1(pay_id,product_id);
		return 1;
	}
	
	@RequestMapping("updDdu2")
	@ResponseBody
	public int updDdu2(String attemper,String pay_id) {	
		return service.updDdu1(attemper, pay_id);
	}
	
	//查询库存
	@RequestMapping("selectscell")
	@ResponseBody
	public List<s_cell> selectscell() {			
		return service.selectscell();
	}
	
	@RequestMapping("selectscellcount1")
	@ResponseBody
	public int selectscellcount1() {			
		return service.selectscellcount1();
	}
	
	@RequestMapping("selectscellcount2")
	@ResponseBody
	public int selectscellcount2() {			
		return service.selectscellcount2();
	}
	
	@RequestMapping("selectscellcount3")
	@ResponseBody
	public int selectscellcount3() {			
		return service.selectscellcount3();
	}
	
	@RequestMapping("selectscellcount4")
	@ResponseBody
	public int selectscellcount4() {			
		return service.selectscellcount4();
	}
	
	//查询所有出库单
	@RequestMapping("/GetCkd")
	@ResponseBody
	public List<s_pay> selectGetCkd(@RequestParam("reason")String reason,@RequestParam("store_tag")String store_tag,@RequestParam("check_tag")String check_tag){
		return service.selectGetCkd(reason,store_tag,check_tag);
	}	
	
	
}
