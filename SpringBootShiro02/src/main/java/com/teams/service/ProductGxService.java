package com.teams.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.teams.pojo.D_file;
import com.teams.pojo.M_design_procedure;
import com.teams.pojo.M_design_procedure_details;
import com.teams.pojo.M_gonxu;

public interface ProductGxService {
	    //产品档案查询
		List<D_file> selecIds();
		//工序步骤查询
		List<M_gonxu> selectbz();

		int addgx(String design_id,String product_id,String product_name,Double cost_price_sum,String designer,String register);

		int addgxmx(String parent_id,String procedure_id,Double labour_hour_amount,String amount_unit,Double cost_price,Double subtotal,String register);

		List<M_design_procedure> selectcpgx(String check_tag);

		int updsj(String design_procedure_tag,String product_id);

		List<M_design_procedure_details> selectcpmxb(String parent_id);

	    int updsjd(String check_tag,String design_id);

	    int delgxsj(String design_id);
	    
	    int delgxsjs(String parent_id);
	    
	    List<M_design_procedure>selectcpgxs();

	    int updbg(@Param("cost_price_sum")double cost_price_sum,@Param("design_id")String design_id);

	    int delgxbg(@Param("parent_id")String parent_id);
}
