package com.dbs.service.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.dbs.service.orderservice.domain.Order;
import com.dbs.service.orderservice.domain.OrderServiceException;
import com.dbs.service.orderservice.repository.OrderServiceRepository;

@Service("orderService")
public class OrderServiceImp implements OrderService{

	@Autowired OrderServiceRepository orderServiceRepository;
	
	@Override
	public void insertOderDetails( final Order order) throws OrderServiceException {
		try {
		 orderServiceRepository.save(order);
		}catch(Exception ex) {
			throw new OrderServiceException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server error");
		}
	}
	

}
