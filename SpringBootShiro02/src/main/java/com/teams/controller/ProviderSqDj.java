package com.teams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.teams.pojo.D_file;
import com.teams.pojo.provider;
import com.teams.pojo.providerSq;
import com.teams.pojo.providerSqXq;
import com.teams.service.ProviderSqDjService;
import com.teams.utils.Params;

@Controller
public class ProviderSqDj {
	@Autowired
	ProviderSqDjService service;

	@RequestMapping("/seltg")
	@ResponseBody
	public PageInfo<provider> selprovider(@RequestBody Params params) {
		PageInfo<provider> list = service.selprovider(params);
		return list;
	}

	@RequestMapping("/selcp")
	@ResponseBody
	public List<D_file> selD_file(String providerId) {
		List<D_file> list = service.selD_file(providerId);
		return list;
	}

	// 查询商品信息
	@RequestMapping("/selproviderSqXq")
	@ResponseBody
	public List<providerSqXq> selproviderSqXq(String providerSqId) {
		List<providerSqXq> list = service.selproviderSqXq(providerSqId);
		return list;
	}

	// 报价单
	@RequestMapping("/addbjd")
	@ResponseBody
	public int addbjd(@RequestParam("providerSqId") String providerSqId, @RequestParam("providerId") String providerId,
			@RequestParam("providerName") String providerName, @RequestParam("providerPhone") String providerPhone,
			@RequestParam("register") String register, @RequestParam("providerSqXqId") String providerSqXqId,
			@RequestParam("product_id") String[] product_id, @RequestParam("product_name") String[] product_name,
			@RequestParam("unit") String[] unit, @RequestParam("price") double[] price,
			@RequestParam("subtotal") double[] subtotal) {
		service.addproviderSq(providerSqId, providerId, providerName, providerPhone, register);
		for (int i = 0; i < price.length; i++) {
			service.addproviderSqXq(providerSqId, providerSqXqId, product_id[i], product_name[i], unit[i], price[i],
					subtotal[i]);
		}
		return 1;
	}

	// 修改
	@RequestMapping("/updbjd")
	@ResponseBody
	public int updbjd(@RequestParam("price") double[] price,
			@RequestParam("product_id") String[] product_id,
			@RequestParam("product_name") String[] product_name) {
		for (int i = 0; i < price.length; i++) {
			service.updproviderSqXq(price[i], product_id[i], product_name[i]);
		}
		return 1;
	}

	// 审核
	// 查询等待审核
	@RequestMapping("/selddsh")
	@ResponseBody
	public PageInfo<providerSq> selproviderSq(@RequestBody Params params) {
		PageInfo<providerSq> list = service.selproviderSq(params);
		return list;
	}

	// 查询商品
	@RequestMapping("/selcxxq")
	@ResponseBody
	public List<providerSqXq> selcxxq(String providerSqId) {
		List<providerSqXq> list = service.selcxxq(providerSqId);
		return list;
	}

	// 修改审核状态
	@RequestMapping("/updshzt")
	@ResponseBody
	public String updshzt(String check_tag, String checker,String change_tag,String shbz, String providerSqId, String providerName) {
		int row = service.updshzt(check_tag, checker,change_tag,shbz, providerSqId, providerName);
		return row > 0 ? "成功" : "失败";
	}

	// 登记
	// 查询登记所有
	@RequestMapping("/seldjsy")
	@ResponseBody
	public PageInfo<providerSq> seldjsy(@RequestBody Params params) {
		PageInfo<providerSq> row = service.seldjsy(params);
		return row;
	}

	@RequestMapping("/selshxq")
	@ResponseBody
	public List<providerSqXq> selshxq(String providerSqId) {
		List<providerSqXq> row = service.selshxq(providerSqId);
		return row;
	}

	// 变更
	// 查询所有未变更
	@RequestMapping("/selsywbg")
	@ResponseBody
	public PageInfo<providerSq> selsywbg(@RequestBody Params params) {
		PageInfo<providerSq> row = service.selsywbg(params);
		return row;
	}

	// 变更时查询商品
	@RequestMapping("/selspbg")
	@ResponseBody
	public List<D_file> selspbg(String providerSqId) {
		List<D_file> row = service.selspbg(providerSqId);
		return row;
	}

	// 变更时增加商品
	@RequestMapping("/seladd")
	@ResponseBody
	public int seladd(@RequestParam("providerSqId") String providerSqId,
			@RequestParam("providerSqXqId") String providerSqXqId, @RequestParam("product_id") String[] product_id,
			@RequestParam("product_name") String[] product_name, @RequestParam("unit") String[] unit,
			@RequestParam("price") double[] price, @RequestParam("subtotal") double[] subtotal) {
		for (int i = 0; i < price.length; i++) {
			service.addproviderSqXq(providerSqId, providerSqXqId, product_id[i], product_name[i], unit[i], price[i], subtotal[i]);
		}
		return 1;
	}

	// 变更时删除商品
	@RequestMapping("/delid")
	@ResponseBody
	public String delid(@RequestParam("id") int id, @RequestParam("product_id") String product_id,
			@RequestParam("product_name") String product_name) {
		int row = service.delid(id, product_id, product_name);
		return row > 0 ? "成功" : "失败";
	}

	// 修改已变更未审核
	@RequestMapping("/updybg")
	@ResponseBody
	public String updybg(@RequestParam("changer") String changer, @RequestParam("change_tag") String change_tag,
			@RequestParam("check_tag") String check_tag,@RequestParam("bgbz") String bgbz,
			@RequestParam("providerSqId") String providerSqId,
			@RequestParam("providerId") String providerId) {
		int row = service.updybg(changer, change_tag, check_tag, bgbz,providerSqId, providerId);
		return row > 0 ? "成功" : "失败";
	}

	@RequestMapping("/selectCount")
	@ResponseBody
	public int selectCount(String providerId) {
		return service.selectCount(providerId);
	}
}
