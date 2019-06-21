package com.cg.bookstore.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Admin {
@Id
private String adminEmailId;
private String adminPassword;
public Admin() {
	super();
}

public Admin(String adminEmailId, String adminPassword) {
	super();
	this.adminEmailId = adminEmailId;
	this.adminPassword = adminPassword;
}

public String getAdminEmailId() {
	return adminEmailId;
}

public void setAdminEmailId(String adminEmailId) {
	this.adminEmailId = adminEmailId;
}

public String getAdminPassword() {
	return adminPassword;
}

public void setAdminPassword(String adminPassword) {
	this.adminPassword = adminPassword;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((adminEmailId == null) ? 0 : adminEmailId.hashCode());
	result = prime * result + ((adminPassword == null) ? 0 : adminPassword.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Admin other = (Admin) obj;
	if (adminEmailId == null) {
		if (other.adminEmailId != null)
			return false;
	} else if (!adminEmailId.equals(other.adminEmailId))
		return false;
	if (adminPassword == null) {
		if (other.adminPassword != null)
			return false;
	} else if (!adminPassword.equals(other.adminPassword))
		return false;
	return true;
}

@Override
public String toString() {
	return "Admin [adminEmailId=" + adminEmailId + ", adminPassword=" + adminPassword + "]";
}

}
