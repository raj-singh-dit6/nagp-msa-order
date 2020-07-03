package com.nagp.msa.order.dto;

import java.util.List;

import com.nagp.msa.order.model.Order;

public class OrdersDto {
	
	private List<Order> orders;

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
