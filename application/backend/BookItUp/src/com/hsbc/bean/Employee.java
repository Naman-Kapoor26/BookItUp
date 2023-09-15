package com.hsbc.bean;

public class Employee {
	

	private int userId;
	
	private String role;
	
	private String name;
	
	private String email;
	
	private long phone;
	
	public Employee(String role, String name, String email, long phone) {
		super();
		this.role = role;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [userId=" + userId + ", role=" + role + ", name=" + name + ", email=" + email + ", phone="
				+ phone + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	
	
	

}
