package com.eteg.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eteg.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
