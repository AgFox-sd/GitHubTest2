package com.teams.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.PageInfo;
import com.teams.pojo.D_file;
import com.teams.pojo.M_design_procedure;
import com.teams.pojo.M_design_procedure_details;
import com.teams.pojo.M_gonxu;
import com.teams.utils.Params;

public interface ProductGxService {
	    //产品档案查询
	    PageInfo<D_file> selecIds(Params param);
		//工序步骤查询
		List<M_gonxu> selectbz(String parent_id);

		int addgx(String design_id,String product_id,String product_name,Double cost_price_sum,String designer,String register);

		int addgxmx(String parent_id,String procedure_id,Double labour_hour_amount,String amount_unit,Double cost_price,Double subtotal,String register);

		PageInfo<M_design_procedure> selectcpgx(Params Params);

		int updsj(String design_procedure_tag,String product_id);

		List<M_design_procedure_details> selectcpmxb(String parent_id);

	    int updsjd(String check_tag,String checker,String design_id);

	    int delgxsj(String check_yj,String design_id);
	    
	    int delgxsjs(String parent_id);
	    
	    PageInfo<M_design_procedure> selectcpgxs(Params Params);
	    int updbg(String design_id,String change_yj);

	    int delgxbg(@Param("parent_id")String parent_id);
		int updGx(String design_procedure_tag,String design_id);
		PageInfo<M_design_procedure> selectcpgxss(Params Params);
		void delgxsjd(int id, String parent_id);
		void updgxsjd(double xj, String parent_id);
		int selectcount(String sjdh);
		void updzje(double zje, String sjdh);
}
