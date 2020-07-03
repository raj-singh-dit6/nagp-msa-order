package com.nagp.msa.order.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nagp.msa.order.dto.OrdersDto;
import com.nagp.msa.order.model.Order;

@Service
public class OrderServiceImpl implements OrderService{
	private static List<Order> orders=null;
	static {
		Order o1=new Order(1,100.00, "14-Apr-2020");
		Order o2=new Order(1,250.00, "15-Apr-2020");
		orders= new ArrayList<>();
		orders.add(o1);
		orders.add(o2);
	}
	@Override
	public OrdersDto getOrders(Integer orderId) {
		OrdersDto result=new OrdersDto();
		result.setOrders(orders);
		return result;
	}
	
}
