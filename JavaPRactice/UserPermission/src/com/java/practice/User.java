package com.java.practice;

import java.util.List;

public class User {

	String USerName;
	List<Permission> permissions;
	public String getUSerName() {
		return USerName;
	}
	public void setUSerName(String uSerName) {
		USerName = uSerName;
	}
	public List<Permission> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
	
}

class Permission{
	
	String PermissionName;

	public String getPermissionName() {
		return PermissionName;
	}

	public void setPermissionName(String permissionName) {
		PermissionName = permissionName;
	}
	
	
}
