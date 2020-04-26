package com.teams.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.teams.pojo.D_file;

public interface ProductSjMapper {
	
	//查询审核通过的产品信息
	List<D_file> selectProduct(String check_tag);

	//删除和恢复审核通过的产品信息
	int updDelete_tag(@Param("product_id") int product_id, @Param("delete_tag") String delete_tag);

	//永久删除审核通过的产品信息
	int yjDeleteProduct(int product_id);

}
