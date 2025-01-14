package com.entity;

public class Login {

	private int L_id;
	private String username;
	private String password;

	public Login() {

	}

	public Login(int l_id, String username, String password) {
		super();
		L_id = l_id;
		this.username = username;
		this.password = password;
	}

	public int getL_id() {
		return L_id;
	}

	public void setL_id(int l_id) {
		L_id = l_id;
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

	@Override
	public String toString() {
		return "Login [L_id=" + L_id + ", username=" + username + ", password=" + password + "]";
	}

}
