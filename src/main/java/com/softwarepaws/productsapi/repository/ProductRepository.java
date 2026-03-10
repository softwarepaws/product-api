package com.softwarepaws.productsapi.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softwarepaws.productsapi.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	Optional<Product> findByEan13(String ean13);

	Optional<Product> findByUpc12(String upc12);

	Optional<Product> findByAsin(String asin);

	Optional<Product> findByMpn(String mpn);

	@Query("SELECT p FROM Product p WHERE " + "LOWER(p.ean13) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR "
			+ "LOWER(p.upc12) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR "
			+ "LOWER(p.asin) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR "
			+ "LOWER(p.mpn) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR "
			+ "LOWER(p.title) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR "
			+ "LOWER(p.brand) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR "
			+ "LOWER(p.manufacturer) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR "
			+ "LOWER(p.model) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR "
			+ "LOWER(p.description) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR "
			+ "LOWER(p.category) LIKE LOWER(CONCAT('%', :searchTerm, '%'))")
	Page<Product> searchByTerm(@Param("searchTerm") String searchTerm, Pageable pageable);

}
