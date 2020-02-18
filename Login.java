package com.cg.ecom.dto;

/*******Contains ID, password, user name and role of the user*******/
public class Login{
	private String id;
	private String password;
	private String userName;
	private String role;
	
    public Login() {
		super();
	}
    
	public Login(String id, String password, String userName, String role) {
		super();
		this.id = id;
		this.password = password;
		this.userName = userName;
		this.role = role;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return id + " "  + userName + " " + role;
	}

}
