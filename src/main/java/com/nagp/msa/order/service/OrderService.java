package com.nagp.msa.order.service;

import com.nagp.msa.order.dto.OrdersDto;

public interface OrderService {


	public OrdersDto getOrders(Integer orderId);
}
