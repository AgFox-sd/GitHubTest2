package com.teams.controller;

import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.teams.pojo.m_gys;
import com.teams.pojo.provider;
import com.teams.pojo.recommend;
import com.teams.pojo.recommendXq;
import com.teams.service.recommendService;

@Controller
public class recommendController {
    @Autowired
	recommendService service;
    
    @RequestMapping("/selectrec")
    @ResponseBody
    public List<recommend> selectrec(){
    	List<recommend> list =service.selectrec();
    	return list;
    }
    
    @RequestMapping("/selectgys")
    @ResponseBody
    public List<provider> selectgys(String recommendId){
    	List<provider> list =service.selectgys(recommendId);
    	return list;
    }
    
    @RequestMapping("/gyszc")
    @ResponseBody
    public List<m_gys> gyszc(@RequestParam("bh")String bh[],@RequestParam("gbh")String gbh[],@RequestParam("gmc")String gmc[],@RequestParam("yz")String yz[],@RequestParam("fx")String fx[],@RequestParam("qy")String qy[],@RequestParam("sjdh")String sjdh,@RequestParam("product_id")String product_id,@RequestParam("product_name")String product_name,@RequestParam("tjr")String tjr){
        service.addgys(sjdh, product_id, product_name, tjr);
    	List<m_gys> list =new ArrayList<m_gys>();
    	for (int i = 0; i <bh.length; i++) {
    		service.addgysmx(sjdh, gbh[i], gmc[i]);
    		m_gys dmd = new m_gys(bh[i],gbh[i],gmc[i],yz[i],fx[i],qy[i]);
			list.add(dmd);
		}
    	service.updtj(product_id);
    	return list;
    }
    
    @RequestMapping("/selectfname")
    @ResponseBody
    public List<recommend> selectfname(){
    	List<recommend> list=service.selectfname();
    	return list;
    }
    
    @RequestMapping("/selectmxb")
    @ResponseBody
    public List<recommendXq> selectmxb(@RequestParam("recommendId")String recommendId){
    	List<recommendXq> list =service.selectmxb(recommendId);
    	System.out.println(recommendId);
    	return list;
    }
    
    @RequestMapping("/updsh")
    @ResponseBody
    public int updsh(@RequestParam("recommendId")String recommendId) {
    	int row=service.updsh(recommendId);
    	return row;
    }
    
    @RequestMapping("/updshs")
    @ResponseBody
    public int updshs(@RequestParam("recommendId")String recommendId) {
    	int row=service.updshs(recommendId);
    	return row;
    }
    
    @RequestMapping("/selectreco")
    @ResponseBody
    public List<recommend> selectreco(){
    	List<recommend> list=service.selectreco();
    	return list;
    }
    
    @RequestMapping("/selectgymx")
    @ResponseBody
    public List<recommendXq>selectgymx(@RequestParam("recommendId")String recommendId){
    	List<recommendXq> list=service.selectgymx(recommendId);
    	return list;
    }
    
    @RequestMapping("/selectwbg")
    @ResponseBody
    public List<recommend> selectwbg(){
    	List<recommend> list =service.selectwbg();
    	return list;
    }
    
    @RequestMapping("/delbgs")
    @ResponseBody
    public String delbgs(@RequestParam("id") String id) {
    	int row =service.delbgs(id);
    	return row>0?"成功":"失败";
    }
    
    @RequestMapping("/bgxius")
    @ResponseBody
    public List<m_gys> bgxius(@RequestParam("bh")String bh[],@RequestParam("mc")String mc[],@RequestParam("lx")String lx[],@RequestParam("dc")String dc,@RequestParam("sl")String sl[],@RequestParam("dw")String dw[]){
    	List<m_gys> list =new ArrayList<m_gys>();
    	for (int i = 0; i <bh.length; i++) {
    		service.addgysmx(dc, mc[i], lx[i]);
     		m_gys dmd = new m_gys(bh[i],mc[i],lx[i],dc,sl[i],dw[i]);
 			list.add(dmd);
 		}
     	return list;
     }
    	
    @RequestMapping("/updbgs")
    @ResponseBody
    public int updbgs(@RequestParam("recommendId") String recommendId) {
    	int row =service.updbgs(recommendId);
    	return row;
    }
    }
     

