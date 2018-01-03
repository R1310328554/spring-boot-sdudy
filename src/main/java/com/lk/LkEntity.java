package com.lk;

public class LkEntity{

	/** 个人信息.客户编号 */
	private String customerId;
	/** 个人信息.客户姓名 */
	private String customerName;
	/** 个人信息.身份证 */
	private String idCardNo;
	/** 个人信息.手机号 */
	private String mobile;

	// zzg 20170628
	private String telephone;
	private String departmentId;
	private String departmentName;
	private String salesmanId;
	private String salesmanName;
	private String borrowerSource;
	private String bankName;


	/**
	 * 配额调整: 基本属性
	 */
	private String	QQ;
	private String	wechat;
	private String	whether_fill_property_info;
	private String	whether_purchase_financing;
	//	private String	mobile;
	private String	bank_reservemobile;
	private String	mobf3;
	private String	whether_change_mobile_number;
	private String	emergency_tel;
	private String	emergency_contact_mobf3;
	private String	employee_or_salesman;
	private String	employee_createtime;
	private String	employee_workstate;
	private String	employee_level;

	public String getQQ() {
		return QQ;
	}

	public void setQQ(String QQ) {
		this.QQ = QQ;
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getWhether_fill_property_info() {
		return whether_fill_property_info;
	}

	public void setWhether_fill_property_info(String whether_fill_property_info) {
		this.whether_fill_property_info = whether_fill_property_info;
	}

	public String getWhether_purchase_financing() {
		return whether_purchase_financing;
	}

	public void setWhether_purchase_financing(String whether_purchase_financing) {
		this.whether_purchase_financing = whether_purchase_financing;
	}

	public String getBank_reservemobile() {
		return bank_reservemobile;
	}

	public void setBank_reservemobile(String bank_reservemobile) {
		this.bank_reservemobile = bank_reservemobile;
	}

	public String getMobf3() {
		return mobf3;
	}

	public void setMobf3(String mobf3) {
		this.mobf3 = mobf3;
	}

	public String getWhether_change_mobile_number() {
		return whether_change_mobile_number;
	}

	public void setWhether_change_mobile_number(String whether_change_mobile_number) {
		this.whether_change_mobile_number = whether_change_mobile_number;
	}

	public String getEmergency_tel() {
		return emergency_tel;
	}

	public void setEmergency_tel(String emergency_tel) {
		this.emergency_tel = emergency_tel;
	}

	public String getEmergency_contact_mobf3() {
		return emergency_contact_mobf3;
	}

	public void setEmergency_contact_mobf3(String emergency_contact_mobf3) {
		this.emergency_contact_mobf3 = emergency_contact_mobf3;
	}

	public String getEmployee_or_salesman() {
		return employee_or_salesman;
	}

	public void setEmployee_or_salesman(String employee_or_salesman) {
		this.employee_or_salesman = employee_or_salesman;
	}

	public String getEmployee_createtime() {
		return employee_createtime;
	}

	public void setEmployee_createtime(String employee_createtime) {
		this.employee_createtime = employee_createtime;
	}

	public String getEmployee_workstate() {
		return employee_workstate;
	}

	public void setEmployee_workstate(String employee_workstate) {
		this.employee_workstate = employee_workstate;
	}

	public String getEmployee_level() {
		return employee_level;
	}

	public void setEmployee_level(String employee_level) {
		this.employee_level = employee_level;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getIdCardNo() {
		return idCardNo;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getSalesmanId() {
		return salesmanId;
	}

	public void setSalesmanId(String salesmanId) {
		this.salesmanId = salesmanId;
	}

	public String getSalesmanName() {
		return salesmanName;
	}

	public void setSalesmanName(String salesmanName) {
		this.salesmanName = salesmanName;
	}

	public String getBorrowerSource() {
		return borrowerSource;
	}

	public void setBorrowerSource(String borrowerSource) {
		this.borrowerSource = borrowerSource;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "LkEntity{" +
				"customerId='" + customerId + '\'' +
				", customerName='" + customerName + '\'' +
				", idCardNo='" + idCardNo + '\'' +
				", mobile='" + mobile + '\'' +
				", telephone='" + telephone + '\'' +
				", departmentId='" + departmentId + '\'' +
				", departmentName='" + departmentName + '\'' +
				", salesmanId='" + salesmanId + '\'' +
				", salesmanName='" + salesmanName + '\'' +
				", borrowerSource='" + borrowerSource + '\'' +
				", bankName='" + bankName + '\'' +
				", QQ='" + QQ + '\'' +
				", wechat='" + wechat + '\'' +
				", whether_fill_property_info='" + whether_fill_property_info + '\'' +
				", whether_purchase_financing='" + whether_purchase_financing + '\'' +
				", bank_reservemobile='" + bank_reservemobile + '\'' +
				", mobf3='" + mobf3 + '\'' +
				", whether_change_mobile_number='" + whether_change_mobile_number + '\'' +
				", emergency_tel='" + emergency_tel + '\'' +
				", emergency_contact_mobf3='" + emergency_contact_mobf3 + '\'' +
				", employee_or_salesman='" + employee_or_salesman + '\'' +
				", employee_createtime='" + employee_createtime + '\'' +
				", employee_workstate='" + employee_workstate + '\'' +
				", employee_level='" + employee_level + '\'' +
				'}';
	}
}