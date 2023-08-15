package com.dziombra.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dziombra.dscommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
