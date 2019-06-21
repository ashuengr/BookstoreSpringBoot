package com.cg.bookstore.beans;

import java.time.LocalDate;
import java.util.Map;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class BookOrder {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long orderId;
@ManyToOne
private Customer customer;
@Embedded
private Address shippingAddress;
private String recepientName;
private LocalDate orderDate;
private String orderStatus;
private int orderQuantity;
private double orderPrice;
private String orderPaymentMethod;
public BookOrder() {
	super();
}
public BookOrder(long orderId, Customer customer, Address shippingAddress, String recepientName, LocalDate orderDate,
		String orderStatus, int orderQuantity, double orderPrice, String orderPaymentMethod) {
	super();
	this.orderId = orderId;
	this.customer = customer;
	this.shippingAddress = shippingAddress;
	this.recepientName = recepientName;
	this.orderDate = orderDate;
	this.orderStatus = orderStatus;
	this.orderQuantity = orderQuantity;
	this.orderPrice = orderPrice;
	this.orderPaymentMethod = orderPaymentMethod;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((customer == null) ? 0 : customer.hashCode());
	result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
	result = prime * result + (int) (orderId ^ (orderId >>> 32));
	result = prime * result + ((orderPaymentMethod == null) ? 0 : orderPaymentMethod.hashCode());
	long temp;
	temp = Double.doubleToLongBits(orderPrice);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + orderQuantity;
	result = prime * result + ((orderStatus == null) ? 0 : orderStatus.hashCode());
	result = prime * result + ((recepientName == null) ? 0 : recepientName.hashCode());
	result = prime * result + ((shippingAddress == null) ? 0 : shippingAddress.hashCode());
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
	BookOrder other = (BookOrder) obj;
	if (customer == null) {
		if (other.customer != null)
			return false;
	} else if (!customer.equals(other.customer))
		return false;
	if (orderDate == null) {
		if (other.orderDate != null)
			return false;
	} else if (!orderDate.equals(other.orderDate))
		return false;
	if (orderId != other.orderId)
		return false;
	if (orderPaymentMethod == null) {
		if (other.orderPaymentMethod != null)
			return false;
	} else if (!orderPaymentMethod.equals(other.orderPaymentMethod))
		return false;
	if (Double.doubleToLongBits(orderPrice) != Double.doubleToLongBits(other.orderPrice))
		return false;
	if (orderQuantity != other.orderQuantity)
		return false;
	if (orderStatus == null) {
		if (other.orderStatus != null)
			return false;
	} else if (!orderStatus.equals(other.orderStatus))
		return false;
	if (recepientName == null) {
		if (other.recepientName != null)
			return false;
	} else if (!recepientName.equals(other.recepientName))
		return false;
	if (shippingAddress == null) {
		if (other.shippingAddress != null)
			return false;
	} else if (!shippingAddress.equals(other.shippingAddress))
		return false;
	return true;
}
public long getOrderId() {
	return orderId;
}
public void setOrderId(long orderId) {
	this.orderId = orderId;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public Address getShippingAddress() {
	return shippingAddress;
}
public void setShippingAddress(Address shippingAddress) {
	this.shippingAddress = shippingAddress;
}
public String getRecepientName() {
	return recepientName;
}
public void setRecepientName(String recepientName) {
	this.recepientName = recepientName;
}
public LocalDate getOrderDate() {
	return orderDate;
}
public void setOrderDate(LocalDate orderDate) {
	this.orderDate = orderDate;
}
public String getOrderStatus() {
	return orderStatus;
}
public void setOrderStatus(String orderStatus) {
	this.orderStatus = orderStatus;
}
public int getOrderQuantity() {
	return orderQuantity;
}
public void setOrderQuantity(int orderQuantity) {
	this.orderQuantity = orderQuantity;
}
public double getOrderPrice() {
	return orderPrice;
}
public void setOrderPrice(double orderPrice) {
	this.orderPrice = orderPrice;
}
public String getOrderPaymentMethod() {
	return orderPaymentMethod;
}
public void setOrderPaymentMethod(String orderPaymentMethod) {
	this.orderPaymentMethod = orderPaymentMethod;
}
@Override
public String toString() {
	return "BookOrder [orderId=" + orderId + ", customer=" + customer + ", shippingAddress=" + shippingAddress
			+ ", recepientName=" + recepientName + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus
			+ ", orderQuantity=" + orderQuantity + ", orderPrice=" + orderPrice + ", orderPaymentMethod="
			+ orderPaymentMethod + "]";
}

}
