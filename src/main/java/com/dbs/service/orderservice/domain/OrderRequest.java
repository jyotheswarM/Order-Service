package com.dbs.service.orderservice.domain;

import java.sql.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderRequest {
	
	@NotNull(message="Customer name should not be null")
	@NotEmpty(message="Customer name should not be empty")
	@JsonProperty("customer_name")
	private String customerName;
	
	@NotNull(message="order Date should not be null")
	@NotEmpty(message="order Date name should not be empty")
	@JsonProperty("order_date")
	@JsonFormat(shape= JsonFormat.Shape.STRING ,pattern="dd-mm-yyyy")
	private Date orderDate;
    
	@NotNull(message="shipping Address should not be null")
	@NotEmpty(message="shipping Address should not be empty")
	@JsonProperty("shipping_date")
	@JsonFormat(shape= JsonFormat.Shape.STRING ,pattern="dd-mm-yyyy")
	private Date shippingAddress;
   
	@NotNull(message="Order Items should not be null")
	@NotEmpty(message="Order Items should not be empty")
	@JsonProperty("order_items")
	private String orderItems;

	@NotNull(message="Total should not be null")
	@JsonProperty("total")
	private double total;

}
