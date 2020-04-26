package com.teams.service;
import java.util.List;

import com.teams.pojo.D_file;

public interface ProductSjService {

		//查询显示的信息为所有已通过复核的产品档案
		List<D_file> selectId2(String check_tag);
		//通过产品编号(id)查询档案信息
		D_file Selidxx(String product_id);
		//修改产品档案信息
		int updBG(D_file file);
		//查询通过审核的商品档案信息
		List<D_file> Selad(String check_tag,String design_module_tag, int tid);
		//物料组成设计单
		void productWlZc(String sjdh, String product_id, String product_name, String sjr, double d);
		//物料明细单
		void wlZcMx(String sjdh, String string, String string2, String string3, int i, double d, double e);
		//修改物料为已设计
		void updWlSj(String product_id, String design_module_tag);
		
}
