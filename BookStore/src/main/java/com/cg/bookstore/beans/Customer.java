package com.cg.bookstore.beans;

import java.util.Map;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Customer {
@Id
private String customerEmailId;
private String  customerFullName;
private String customerPassword;
@Embedded
private Address adress;

@OneToMany(fetch = FetchType.LAZY,mappedBy="customer")
private Map<Long, BookOrder>orders;
private long mobileNumber;
public Customer() {
	super();
}

public Customer(String customerEmailId, String customerFullName, String customerPassword) {
	super();
	this.customerEmailId = customerEmailId;
	this.customerFullName = customerFullName;
	this.customerPassword = customerPassword;
}

public Customer(String customerEmailId, String customerFullName, String customerPassword, Address adress,
		Map<Long, BookOrder> orders, long mobileNumber) {
	super();
	this.customerEmailId = customerEmailId;
	this.customerFullName = customerFullName;
	this.customerPassword = customerPassword;
	this.adress = adress;
	this.orders = orders;
	this.mobileNumber = mobileNumber;
}

public Customer(String customerEmailId, String customerFullName, String customerPassword, Address adress,
		long mobileNumber) {
	super();
	this.customerEmailId = customerEmailId;
	this.customerFullName = customerFullName;
	this.customerPassword = customerPassword;
	this.adress = adress;
	this.mobileNumber = mobileNumber;
}
public String getCustomerEmailId() {
	return customerEmailId;
}
public void setCustomerEmailId(String customerEmailId) {
	this.customerEmailId = customerEmailId;
}
public String getCustomerFullName() {
	return customerFullName;
}
public void setCustomerFullName(String customerFullName) {
	this.customerFullName = customerFullName;
}
public String getCustomerPassword() {
	return customerPassword;
}
public void setCustomerPassword(String customerPassword) {
	this.customerPassword = customerPassword;
}
public Address getAdress() {
	return adress;
}
public void setAdress(Address adress) {
	this.adress = adress;
}
public Map<Long, BookOrder> getOrders() {
	return orders;
}
public void setOrders(Map<Long, BookOrder> orders) {
	this.orders = orders;
}
public long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((adress == null) ? 0 : adress.hashCode());
	result = prime * result + ((customerEmailId == null) ? 0 : customerEmailId.hashCode());
	result = prime * result + ((customerFullName == null) ? 0 : customerFullName.hashCode());
	result = prime * result + ((customerPassword == null) ? 0 : customerPassword.hashCode());
	result = prime * result + (int) (mobileNumber ^ (mobileNumber >>> 32));
	result = prime * result + ((orders == null) ? 0 : orders.hashCode());
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
	Customer other = (Customer) obj;
	if (adress == null) {
		if (other.adress != null)
			return false;
	} else if (!adress.equals(other.adress))
		return false;
	if (customerEmailId == null) {
		if (other.customerEmailId != null)
			return false;
	} else if (!customerEmailId.equals(other.customerEmailId))
		return false;
	if (customerFullName == null) {
		if (other.customerFullName != null)
			return false;
	} else if (!customerFullName.equals(other.customerFullName))
		return false;
	if (customerPassword == null) {
		if (other.customerPassword != null)
			return false;
	} else if (!customerPassword.equals(other.customerPassword))
		return false;
	if (mobileNumber != other.mobileNumber)
		return false;
	if (orders == null) {
		if (other.orders != null)
			return false;
	} else if (!orders.equals(other.orders))
		return false;
	return true;
}
@Override
public String toString() {
	return "Customer [customerEmailId=" + customerEmailId + ", customerFullName=" + customerFullName
			+ ", customerPassword=" + customerPassword + ", adress=" + adress + ", orders=" + orders + ", mobileNumber="
			+ mobileNumber + "]";
}

}
