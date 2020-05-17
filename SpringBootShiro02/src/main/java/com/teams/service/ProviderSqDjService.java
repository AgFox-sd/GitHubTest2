package com.teams.service;

import java.util.List;

import com.teams.pojo.D_file;
import com.teams.pojo.provider;
import com.teams.pojo.providerSq;
import com.teams.pojo.providerSqXq;

public interface ProviderSqDjService {
	// 查询供应商审核通过
	List<provider> selprovider();

	// 查询商品
	List<D_file> selD_file();
	
	List<providerSqXq> selproviderSqXq(String providerId);
	
	List<providerSqXq> selXq(String product_id,String product_name);

	//int selXq(String product_id,String product_name);
	
	// 添加providerSq
	int addproviderSq(String providerSqId, String providerId, String providerName, String providerPhone,String register);

	// 增加providerSqXq
	int addproviderSqXq(String providerSqId, String providerSqXqId, String product_id, String product_name,
			String unit,double price,double subtotal);
	
	//修改
	int updproviderSqXq(int amount,double price,double subtotal,String product_id,String product_name);

	//审核
    //查询等待审核
    List<providerSq> selproviderSq();
    
    //查询详情
    List<providerSqXq> selcxxq(String providerSqId);
    
    //修改审核状态
    int updshzt(String check_tag,String checker,String change_tag,String providerSqId,String providerName);
    
    //查询
    //登记查询所有
    List<providerSq> seldjsy();
    List<providerSqXq> selshxq(String providerSqId);
    
    //变更
    //查寻所有未变更
    List<providerSq> selsywbg(String change_tag);
    
    //查询商品
    List<D_file> selspbg(String providerSqId);
    
    //删除商品
    int delid(int id,String product_id,String product_name);
    
    //修改为已变更
    int updybg(String changer,String change_tag,String check_tag,String providerSqId,String providerId);
    
}
