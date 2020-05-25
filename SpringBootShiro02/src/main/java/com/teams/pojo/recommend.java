package com.teams.pojo;

public class recommend {
	private int id;//#序号	
	private String recommendId;//#推荐单编号（格式：050300+当前年月日+6位随机数）
	private String product_id ;//'产品编号',
	private String product_name;//'产品名称',
	private String recommender;//#推荐人
	private String recommend_time ;//#推荐时间
	private String recommend_tag;//#推荐标志
	private String checker;//#审核人
	private String check_tag;//'等待审核',##审核标志 
	private String check_time;//#审核时间
	private String changer;//#变更人
	private String change_time;//#变更时间
	private String change_tag;//'未变更'#变更标志 
	private String tname;//产品类型
	private String fname;//产品风险
	
	private String checker_yj;
	private String change_yj;
	public recommend() {
		super();
	}
	public recommend(int id, String recommendId, String product_id, String product_name, String recommender,
			String recommend_time, String recommend_tag, String checker, String check_tag, String check_time,
			String changer, String change_time, String change_tag, String tname, String check_yj, String change_yj,String fname) {
		super();
		this.id = id;
		this.recommendId = recommendId;
		this.product_id = product_id;
		this.product_name = product_name;
		this.recommender = recommender;
		this.recommend_time = recommend_time;
		this.recommend_tag = recommend_tag;
		this.checker = checker;
		this.check_tag = check_tag;
		this.check_time = check_time;
		this.changer = changer;
		this.change_time = change_time;
		this.change_tag = change_tag;
		this.tname = tname;
		this.checker_yj = check_yj;
		this.change_yj = change_yj;
		this.fname = fname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRecommendId() {
		return recommendId;
	}
	public void setRecommendId(String recommendId) {
		this.recommendId = recommendId;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getRecommender() {
		return recommender;
	}
	public void setRecommender(String recommender) {
		this.recommender = recommender;
	}
	public String getRecommend_time() {
		return recommend_time;
	}
	public void setRecommend_time(String recommend_time) {
		this.recommend_time = recommend_time;
	}
	public String getRecommend_tag() {
		return recommend_tag;
	}
	public void setRecommend_tag(String recommend_tag) {
		this.recommend_tag = recommend_tag;
	}
	public String getChecker() {
		return checker;
	}
	public void setChecker(String checker) {
		this.checker = checker;
	}
	public String getCheck_tag() {
		return check_tag;
	}
	public void setCheck_tag(String check_tag) {
		this.check_tag = check_tag;
	}
	public String getCheck_time() {
		return check_time;
	}
	public void setCheck_time(String check_time) {
		this.check_time = check_time;
	}
	public String getChanger() {
		return changer;
	}
	public void setChanger(String changer) {
		this.changer = changer;
	}
	public String getChange_time() {
		return change_time;
	}
	public void setChange_time(String change_time) {
		this.change_time = change_time;
	}
	public String getChange_tag() {
		return change_tag;
	}
	public void setChange_tag(String change_tag) {
		this.change_tag = change_tag;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getChecker_yj() {
		return checker_yj;
	}
	public void setChecker_yj(String checker_yj) {
		this.checker_yj = checker_yj;
	}
	public String getChange_yj() {
		return change_yj;
	}
	public void setChange_yj(String change_yj) {
		this.change_yj = change_yj;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	
	
}
