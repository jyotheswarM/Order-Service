package com.dbs.service.orderservice.controller;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.service.orderservice.domain.Order;
import com.dbs.service.orderservice.domain.OrderRequest;
import com.dbs.service.orderservice.domain.OrderServiceException;
import com.dbs.service.orderservice.service.OrderService;

@RestController
@RequestMapping("/Orderservice")
public class OrderServiceController {
	
	@Autowired OrderService orderService;
	
	@PostMapping(value="/feign/createService",produces= {MediaType.APPLICATION_JSON_VALUE})
	public String createOderDetails(@Valid @RequestBody OrderRequest request,BindingResult result) throws OrderServiceException{
		if(result.hasErrors()) {
			throw new OrderServiceException(HttpStatus.BAD_REQUEST, "Bad Request");
			
		}
		Order order=new Order();
		BeanUtils.copyProperties(request, order);
		orderService.insertOderDetails(order);

		return 	"Success";	
	}

	

}
