package cn.tedu.ajax.entity;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 2905888894945816600L;

	private String username;
	private String password;
	private Integer age;
	private String phone;
	private String email;
	private Integer idDelete;
	private Integer department;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getIdDelete() {
		return idDelete;
	}
	public void setIdDelete(Integer idDelete) {
		this.idDelete = idDelete;
	}
	public Integer getDepartment() {
		return department;
	}
	public void setDepartment(Integer department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", age=" + age + ", phone=" + phone
				+ ", email=" + email + ", idDelete=" + idDelete + ", department=" + department + "]";
	}
	
	
	

}
