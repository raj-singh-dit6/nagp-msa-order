package com.nagp.msa.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.msa.order.dto.OrdersDto;
import com.nagp.msa.order.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	private final static Logger LOG = LoggerFactory.getLogger(OrderController.class);

	@Autowired OrderService orderService;
	
	
	@GetMapping("/{orderId}")
	public ResponseEntity<OrdersDto> getOrder(@PathVariable Integer orderId) {
		LOG.debug("inside UserController.getUser method");
		return new ResponseEntity<>(orderService.getOrders(orderId), HttpStatus.OK);
	}

}