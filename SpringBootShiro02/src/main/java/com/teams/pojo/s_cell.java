package com.teams.pojo;

public class s_cell {
	private int id; // 序号
	private String store_id; // 库存编号
	private String product_id; // 产品编号
	private String product_name; // 产品名称
	private String stock_name;// 库房名称
	private String product_type;// 产品类型
	private double min_amount; // 库存报警下限数
	private double max_amount; // 库存报警上限数
	private String address;//存储地址
	private double max_capacity_amount; // 最大存储量
	private double amount; // 当前存储量
	private String config; // 配置要求
	private String register; // 登记人
	private String register_time; // 登记时间
	private String checker; // 复核人
	private String check_time; // 复核时间
	private String check_tag; // 审核标志

	public s_cell() {
		super();
	}

	public s_cell(int id, String store_id, String product_id, String product_name, String stock_name,
			String product_type, double min_amount, double max_amount,String address, double max_capacity_amount, double amount,
			String config, String register, String register_time, String checker, String check_time, String check_tag) {
		super();
		this.id = id;
		this.store_id = store_id;
		this.product_id = product_id;
		this.product_name = product_name;
		this.stock_name = stock_name;
		this.product_type = product_type;
		this.min_amount = min_amount;
		this.max_amount = max_amount;
		this.address = address;
		this.max_capacity_amount = max_capacity_amount;
		this.amount = amount;
		this.config = config;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_time = check_time;
		this.check_tag = check_tag;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStore_id() {
		return store_id;
	}

	public void setStore_id(String store_id) {
		this.store_id = store_id;
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

	public String getStock_name() {
		return stock_name;
	}

	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public double getMin_amount() {
		return min_amount;
	}

	public void setMin_amount(double min_amount) {
		this.min_amount = min_amount;
	}

	public double getMax_amount() {
		return max_amount;
	}

	public void setMax_amount(double max_amount) {
		this.max_amount = max_amount;
	}

	public double getMax_capacity_amount() {
		return max_capacity_amount;
	}

	public void setMax_capacity_amount(double max_capacity_amount) {
		this.max_capacity_amount = max_capacity_amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getRegister_time() {
		return register_time;
	}

	public void setRegister_time(String register_time) {
		this.register_time = register_time;
	}

	public String getChecker() {
		return checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public String getCheck_time() {
		return check_time;
	}

	public void setCheck_time(String check_time) {
		this.check_time = check_time;
	}

	public String getCheck_tag() {
		return check_tag;
	}

	public void setCheck_tag(String check_tag) {
		this.check_tag = check_tag;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
