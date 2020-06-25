package com.dbs.service.orderservice.service;

import com.dbs.service.orderservice.domain.Order;
import com.dbs.service.orderservice.domain.OrderServiceException;

public interface OrderService {

	void insertOderDetails(Order order) throws OrderServiceException;
}
