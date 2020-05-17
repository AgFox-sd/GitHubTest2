package com.teams.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.teams.pojo.cgDiaodu;
import com.teams.pojo.cgDiaoduXq;
import com.teams.pojo.cgPlanXq;
import com.teams.pojo.provider;
import com.teams.service.CgDiaoduService;
import com.teams.service.LyService;

@Controller
public class CgDiaoduController {

	@Autowired
	CgDiaoduService service;
	
	@Autowired
	LyService Service1;
	
	//查询采购计划明细
	@RequestMapping("/selectcgPlanXq")
	@ResponseBody
	public List<cgPlanXq> selectcgPlanXq(){
		return service.selectcgPlanXq();
	}
	
	//查询产品推荐的供应商信息
	@RequestMapping("/selectCgGys")
	@ResponseBody
	public List<provider> selectCgGys(String product_id){
		return service.selectCgGys(product_id);
	}
	
	//添加采购信息
    @RequestMapping("/addCgZx")
    @ResponseBody
    public int addCgZx(String cgDiaoduId,String cgPlanId,String product_id,String product_name,String register,String[] bh,String[] mc,String[] dh,String[] lxr,int[] sl,double[] dj) {
    	int zsl = 0;
    	double zje = 0;
    	for (int i = 0; i < dj.length; i++) {
			zsl+=sl[i];
			zje+=sl[i]*dj[i];			
		}
    	service.addCgZx(cgDiaoduId,cgPlanId,product_id,product_name,zsl,zje,register);
    	for (int i = 0; i < dj.length; i++) {
			service.addCgZxXq(cgDiaoduId,bh[i],mc[i],dh[i],lxr[i],sl[i],dj[i],sl[i]*dj[i]);
		}
    	return service.updCgJhXq(cgPlanId,product_id);
    }
	
    //查询数量
    @RequestMapping("/selectAllCgCount1")
    @ResponseBody
    public int selectAllCgCount1() {
    	return service.selectAllCgCount1();
    }
    
    @RequestMapping("/selectAllCgCount2")
    @ResponseBody
    public int selectAllCgCount2() {
    	return service.selectAllCgCount2();
    }
    
    @RequestMapping("/selectAllCgCount3")
    @ResponseBody
    public int selectAllCgCount3() {
    	return service.selectAllCgCount3();
    }
    
    @RequestMapping("/selectAllCgCount4")
    @ResponseBody
    public int selectAllCgCount4() {
    	return service.selectAllCgCount4();
    }
    
    @RequestMapping("/selectAllCgCount5")
    @ResponseBody
    public int selectAllCgCount5() {
    	return service.selectAllCgCount5();
    }
    
    @RequestMapping("/selectAllCgCount6")
    @ResponseBody
    public int selectAllCgCount6() {
    	return service.selectAllCgCount6();
    }
    
    @RequestMapping("/selectAllCgCount7")
    @ResponseBody
    public int selectAllCgCount7() {
    	return service.selectAllCgCount7();
    }
    
    @RequestMapping("/selectAllCgCount8")
    @ResponseBody
    public int selectAllCgCount8() {
    	return service.selectAllCgCount8();
    }
    //查询所有采购调度单
    @RequestMapping("/selectcgDiaodu")
    @ResponseBody
    public List<cgDiaodu> selectcgDiaodu(){
    	return service.selectcgDiaodu();
    }
    
    //根据编号查询采购调度单详情
    @RequestMapping("/selectcgDiaoduXq")
    @ResponseBody
    public List<cgDiaoduXq> selectcgDiaoduXq(String cgDiaoduId){
    	return service.selectcgDiaoduXq(cgDiaoduId);
    }
    
    //查询等待审核的采购调度单
    @RequestMapping("/selectcgDiaoduDdsh")
    @ResponseBody
    public List<cgDiaodu> selectcgDiaoduDdsh(){
    	return service.selectcgDiaoduDdsh();
    }
    
    //修改采购调度单为未审核 修改 采购计划单为未执行
    @RequestMapping("/updateDiaodu")
    @ResponseBody
    public int updateDiaodu(String cgDiaoduId,String cgPlanId,String product_id,String checker) {
    	service.updCgJhXq1(cgPlanId,product_id);
    	return service.updateDiaodu(checker,cgDiaoduId);
    }
    
    //修改采购调度单为审核通过
    @RequestMapping("/updDiaoduSh")
    @ResponseBody
    public int updDiaoduSh(String cgDiaoduId,String product_id,String product_name,String[] mc,String[] bh,String[] lxr,String[] dh,int[] sl,double[] dj,double[] xj,String checker,HttpSession ses) {
		String storer = (String) ses.getAttribute("username");
		String reason = "采购入库";
		for (int i = 0; i < dj.length; i++) {
			String gather_id = Dindan();
			Service1.addsg(gather_id,storer,reason,sl[i],xj[i],"审核通过","已登记",cgDiaoduId);
			Service1.addsgxq(gather_id,product_id,product_name,sl[i],dj[i],xj[i],"已登记");
		}
    	return service.updDiaoduSh(checker,cgDiaoduId);
    }

  //生成订单编号
  	public String Dindan() {
  		SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
  		String batchno=format.format(new Date());
  		int num=(int)((Math.random()*9+1)*100000);
  		return 401+batchno+num;
  	}
}
