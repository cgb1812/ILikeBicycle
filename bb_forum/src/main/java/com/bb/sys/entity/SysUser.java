package com.bb.sys.entity;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable{

	private static final long serialVersionUID = 7016943441409205262L;
	public String id;
	public String username;
	public String password;
	public String salt;
	public String email;
	public String mobile;
	public String valid;
	public String deptId;
	public Date createdTime;
	public String createdUser;
	public Date modifiedTime;
	public String modifiedUser;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getValid() {
		return valid;
	}
	public void setValid(String valid) {
		this.valid = valid;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public Date getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	public String getModifiedUser() {
		return modifiedUser;
	}
	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}
	@Override
	public String toString() {
		return "SysUser [id=" + id + ", username=" + username + ", password=" + password + ", salt=" + salt + ", email="
				+ email + ", mobile=" + mobile + ", valid=" + valid + ", deptId=" + deptId + ", createdTime="
				+ createdTime + ", createdUser=" + createdUser + ", modifiedTime=" + modifiedTime + ", modifiedUser="
				+ modifiedUser + "]";
	}

}
