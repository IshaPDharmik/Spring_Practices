package com.entity;

public class Register {

	private int Reg_Id;
	private String Name;
	private String Address;
	private int Salary;
	private String DOB;
	private String Email;
	private long MobileNo;
	private String username;
	private String password;

	private Login lg;

	public Register() {

	}

	public Register(int reg_Id, String name, String address, int salary, String dOB, String email, long mobileNo,
			String username, String password, Login lg) {
		super();
		Reg_Id = reg_Id;
		Name = name;
		Address = address;
		Salary = salary;
		DOB = dOB;
		Email = email;
		MobileNo = mobileNo;
		this.username = username;
		this.password = password;
		this.lg = lg;
	}

	public int getReg_Id() {
		return Reg_Id;
	}

	public void setReg_Id(int reg_Id) {
		Reg_Id = reg_Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public long getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Login getLg() {
		return lg;
	}

	public void setLg(Login lg) {
		this.lg = lg;
	}

	@Override
	public String toString() {
		return "Register [Reg_Id=" + Reg_Id + ", Name=" + Name + ", Address=" + Address + ", Salary=" + Salary
				+ ", DOB=" + DOB + ", Email=" + Email + ", MobileNo=" + MobileNo + ", username=" + username
				+ ", password=" + password + ", lg=" + lg + "]";
	}

}