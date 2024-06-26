package com.sh.admin.order.model.service;

import com.sh.admin.order.model.dao.OrderMapper;
import com.sh.admin.order.model.dto.OrderDto;
import com.sh.admin.order.model.dto.OrderItemDto;
import com.sh.admin.order.model.dto.OrderQuantityDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class OrderService {
    private final OrderMapper orderMapper;

    public OrderService(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    public List<OrderDto> findOrderList() {
        return orderMapper.findOrderList();
    }

    public List<OrderItemDto> findByOrderId(int orderId) {
        return orderMapper.findByOrderId(orderId);
    }

    public int orderCancelByOrderId(int cancelOrderId, LocalDate cancelDate) {
        return orderMapper.orderCancelByOrderId(cancelOrderId,cancelDate);
    }

    public int shipmentByOrderId(int orderId, long trackNumber, LocalDate shipmentDate) {
        return orderMapper.shipmentByOrderId(orderId,trackNumber,shipmentDate);
    }

    public List<OrderItemDto> findByOrderItemDto(String orderId) {
        return orderMapper.findByOrderItemDto(orderId);
    }

    public int updateOrder(int itemId, int itemQuantity) {
        return orderMapper.updateOrder(itemId,itemQuantity);
    }


    public List<OrderQuantityDto> findOrderItem() {
        return orderMapper.findAllOrderItem();
    }

    public int updateOrderStatus(int orderId) {
        return orderMapper.updateOrderStatus(orderId);
    }

    public int nowQuantity(int orderItemId) {
        return orderMapper.nowQuantity(orderItemId);
    }

    public int orderQuantity(int orderItemId) {
        return orderMapper.orderQuantity(orderItemId);
    }

    public int insertSales(OrderItemDto orderItemDto) {
        return orderMapper.insertSales(orderItemDto);
    }
}
