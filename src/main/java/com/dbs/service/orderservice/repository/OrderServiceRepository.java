package com.dbs.service.orderservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dbs.service.orderservice.domain.Order;

@Repository("oderRepository")
public interface OrderServiceRepository extends CrudRepository<Order, Integer>{
	
	
}
