package com.softwarepaws.productsapi.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

@DataJpaTest
public class ProductRepositoryTests {
	@Autowired
	ProductRepository productRepo;

	@BeforeEach()
	void setup() {
		
	}
	
	@AfterEach()
	void teardown() {
		
	}
	
	void searchByTerm_returnsEmptyPageWhenTermNotFound() {
		
		
	}

	void searchByTerm_returnsMatchingItemBasedOnIdentifier() {

	}
	
	void searchByTerm_returnsItemsWhenSearchTermIsContainedInAnyField() {
		
	}
	
void searchByTerm_PaginationWorks() {
		
	}

}
