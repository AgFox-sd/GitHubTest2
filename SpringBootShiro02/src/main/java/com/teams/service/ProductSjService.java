package com.teams.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.teams.pojo.D_file;
import com.teams.pojo.D_module;
import com.teams.pojo.D_module_details;
import com.teams.pojo.Feilei;
import com.teams.pojo.Pclass;
import com.teams.pojo.Type;
import com.teams.utils.Params;

public interface ProductSjService {

	// 查询审核通过的产品信息
	List<D_file> selectProduct(String check_tag);

	// 删除和恢复审核通过的产品信息
	int updDelete_tag(String product_id, String delete_tag);

	// 查询风险
	List<Feilei> selectfeilei();

	// 增加产品
	int addda(D_file file);

	// 永久删除审核通过的产品信息
	int yjDeleteProduct(String product_id);

	List<D_file> selectcpdash(String check_tag);// 产品档案等待审核查询

	List<Type> selecttype();// 产品类型查询

	List<Pclass> selectpclass();// 产品档次查询

	int updfh(D_file d_file);// 产品档案审核

	int selectddfh(String check_tag);// 查询等待复核总数

	int selecttgfh(String check_tag);// 查询通过复核总数

	List<D_module> selectwusjsh(String check_tag);// 产品物料设计单查询

	int selectwuddshsum(String check_tag);// 查询产品物料设计单等待审核总数

	List<D_module_details> selectwlmx(String design_id);// 查询产品设计单物料明细

	int updatewlsh(D_module d_module);// 物料组成设计通过

	void delwlsjmx(String design_id); // 物料组成设计不通过

	void updcpdnwlsj(String product_id, String design_module_tag);// 物料组成设计不通过

	int delwlsj(String design_id);// 物料组成设计不通过

	// 查询显示的信息为所有已通过复核的产品档案
	List<D_file> selectId2(String check_tag);

	// 通过产品编号(id)查询档案信息
	D_file Selidxx(String product_id);

	// 修改产品档案信息
	int updBG(D_file file);

	// 查询通过审核的商品档案信息
	List<D_file> Selad(String check_tag, String design_module_tag, int tid,String sjdh);

	// 物料组成设计单
	void productWlZc(String sjdh, String product_id, String product_name, String sjr, double d);

	// 物料明细单
	void wlZcMx(String sjdh, String string, String string2, String string3, int i, double d, double e);

	// 修改物料为已设计
	void updWlSj(String product_id, String design_module_tag);

	// 产品档案查询
	PageInfo<D_file> selecId(Params params);

	// 物料查询
	List<D_module> selD_module();

	// 物料查询详情
	List<D_module_details> selD_MODULE_DETAILS(String design_id);

	// 查询名称是否重复
	int selectname(D_file file);

	// 变更删除
	int delid(int id);

	int upzjq(double jq, String product_id, String product_name);

	// 变更查询物料
	List<D_file> selwl(String design_id);

	// 修改物料总金额
	int updzje(double d, String spid, String spmc);

	// 重新提交
	int upgwsh(String check_tag, String change_tag, String product_id, String product_name);

	// 物料明细单
	void zjwl(String design_id, String product_id, String product_name, String amount_unit,
			int amount, double residual_amount, double cost_price,double subtotal);

	List<D_module> selD_moduleS();

	int delwlsjzcd(String design_id, String product_id);

	int selectCount(String sjdh);
}
