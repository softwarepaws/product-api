package com.softwarepaws.productsapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softwarepaws.productsapi.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByEan13(String ean13);
    Optional<Product> findByUpc12(String upc12);
}
