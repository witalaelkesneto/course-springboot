package com.eteg.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eteg.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
