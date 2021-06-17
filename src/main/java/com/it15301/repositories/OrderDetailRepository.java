package com.it15301.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it15301.entity.Order;
import com.it15301.entity.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
	List<OrderDetail> findByOrder(Order order);
}
