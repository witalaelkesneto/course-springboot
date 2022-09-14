package com.eteg.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eteg.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
