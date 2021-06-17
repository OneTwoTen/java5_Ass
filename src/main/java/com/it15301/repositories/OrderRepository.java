package com.it15301.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it15301.entity.Order;
import com.it15301.entity.User;

public interface OrderRepository extends JpaRepository<Order, Integer>{
List<Order> findByUser(User user);
}
