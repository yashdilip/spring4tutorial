package com.practice.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.practice.spring.model.Customer;

@Component
public class CustomerDAO {

	private static List<Customer> customers;
	
	static{
		customers = new ArrayList<Customer>();
		customers.add(new Customer(101L, "John", "Doe", "djohn@gmail.com", "121-232-3435"));
		customers.add(new Customer(201L, "Russ", "Smith", "sruss@gmail.com", "343-545-2345"));
		customers.add(new Customer(301L, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
	}
	
	public List<Customer> list(){
		return customers;
	}
	
	public Customer get(Long id){
		for(Customer c:customers){
			if(c.getId().equals(id)){
				return c;
			}
		}
		return null;
	}
	
	public Customer create(Customer c){
		c.setId(System.currentTimeMillis());
		customers.add(c);
		return c;
	}
	
	public Long delete(Long id){
		for(Customer c:customers){
			if(c.getId().equals(id)){
				customers.remove(c);
				return id;
			}
		}
		return null;
	}
	
	public Customer update(Long id, Customer customer){
		for(Customer c:customers){
			if(c.getId().equals(id)){
				customer.setId(c.getId());
				customers.remove(c);
				customers.add(customer);
				return customer;
			}
		}
		return null;
	}
}
