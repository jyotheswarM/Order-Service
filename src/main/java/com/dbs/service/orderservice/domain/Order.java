package com.dbs.service.orderservice.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Order {
	@Id
    @GeneratedValue
    private int orderId;
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="order_date")
	private Date orderDate;
    
	@Column(name="shipping_date")
	private Date shippingAddress;
   
	@Column(name="order_items")
	private String orderItems;

	@Column(name="total")
	private double total;
}
