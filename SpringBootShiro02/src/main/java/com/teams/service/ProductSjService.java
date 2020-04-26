package com.teams.service;
import java.util.List;

import com.teams.pojo.D_file;

public interface ProductSjService {
	
	//查询审核通过的产品信息
	List<D_file> selectProduct(String check_tag);

	//删除和恢复审核通过的产品信息
	int updDelete_tag(int product_id, String delete_tag);

	//永久删除审核通过的产品信息
	int yjDeleteProduct(int product_id);
}
