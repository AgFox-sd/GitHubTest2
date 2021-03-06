package com.teams.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.teams.pojo.D_file;
import com.teams.pojo.M_design_procedure;
import com.teams.pojo.M_design_procedure_details;
import com.teams.pojo.M_gonxu;
import com.teams.utils.Params;

public interface ProductGxMapper {
	//产品档案查询
	List<D_file> selecIds(Params params);
	//工序步骤查询
	List<M_gonxu> selectbz(String parent_id);
	 //增加产品工序
	int addgx(@Param("design_id")String design_id,@Param("product_id")String product_id,@Param("product_name")String product_name,@Param("cost_price_sum")Double cost_price_sum,@Param("designer")String designer,@Param("register")String register);
//增加产品工序明细
	int addgxmx(@Param("parent_id")String parent_id,@Param("procedure_id")String procedure_id,
			@Param("labour_hour_amount")Double labour_hour_amount,@Param("amount_unit")String amount_unit,
			@Param("cost_price")Double cost_price,@Param("subtotal")Double subtotal,
			@Param("register")String register);
    //查询产品工序
	List<M_design_procedure> selectcpgx(Params params);
	
	int updsj(@Param("design_procedure_tag")String design_procedure_tag,@Param("product_id")String product_id);
    
	List<M_design_procedure_details> selectcpmxb(@Param("parent_id")String parent_id);

    int updsjd(@Param("check_tag")String check_tag,@Param("checker") String checker,@Param("design_id")String design_id);
    
    int delgxsj(String check_yj,@Param("design_id")String design_id);
    
    int delgxsjs(@Param("parent_id")String parent_id);

    List<M_design_procedure>selectcpgxs(Params params);
    
    int updbg(@Param("design_id")String design_id,String change_yj);
    
    int delgxbg(@Param("parent_id")String parent_id);
	int updGx(String design_procedure_tag,String design_id);
	
	List<M_design_procedure> selectcpgxss(Params params);
	
	void delgxsjd(int id, String parent_id);
	void updgxsjd(double xj, String parent_id);
	int selectcount(String sjdh);
	void updzje(double zje, String sjdh);
}
