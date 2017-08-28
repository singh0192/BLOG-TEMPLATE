/**
 * 
 */
package com.rein.model;

/**
 * @author HOME-PC
 *
 */
public class User {
	
	private int u_id;
	private String userName;
	private String password;
	private String email;
	private String phoneNumber;
	private String dob;
	private String role;
	private int active;
	
	
	
	
	public User(User user) {
		super();
		this.u_id = user.u_id;
		this.userName = user.userName;
		this.password = user.password;
		this.email = user.email;
		this.phoneNumber = user.phoneNumber;
		this.dob = user.dob;
		this.role = user.role;
		this.active = user.active;
	}
	public User() {
		
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", dob=" + dob + ", role=" + role + ", active=" + active + "]";
	}
	

	

}
