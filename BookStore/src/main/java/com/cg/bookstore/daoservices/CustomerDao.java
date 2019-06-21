package com.cg.bookstore.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookstore.beans.Customer;


public interface CustomerDao extends JpaRepository<Customer, String>{

}
