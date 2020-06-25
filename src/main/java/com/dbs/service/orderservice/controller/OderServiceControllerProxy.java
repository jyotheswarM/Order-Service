package com.dbs.service.orderservice.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="OrderService" )
public interface OderServiceControllerProxy {
	
	   @RequestMapping("/employee/findall")
	   public String  createOderDetails();

}
