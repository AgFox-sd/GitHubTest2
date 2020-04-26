package com.teams.service;
import java.util.List;

import com.teams.pojo.D_file;
import com.teams.pojo.D_module;
import com.teams.pojo.D_module_details;
import com.teams.pojo.Pclass;
import com.teams.pojo.Type;

public interface ProductSjService {

	
	List<D_file> selectcpdash(String check_tag);//产品档案等待审核查询
	
	List<Type> selecttype();//产品类型查询
	
	List<Pclass> selectpclass();//产品档次查询
	
	int updfh(D_file d_file);//产品档案审核
	
	int selectddfh(String check_tag);//查询等待复核总数
	
	int selecttgfh(String check_tag);//查询通过复核总数

	
	
	
	List<D_module> selectwusjsh(String check_tag);//产品物料设计单查询
	
	int selectwuddshsum(String check_tag);//查询产品物料设计单等待审核总数
	
	List<D_module_details> selectwlmx(String design_id);//查询产品设计单物料明细
    
	int updatewlsh(D_module d_module);//物料组成设计通过
    
	void delwlsjmx(String design_id);  //物料组成设计不通过
    
	void updcpdnwlsj(String product_id, String design_module_tag);//物料组成设计不通过

	int delwlsj(String design_id);//物料组成设计不通过
   
	

}
