package com.softwarepaws.productsapi.service;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.softwarepaws.productsapi.repository.ProductRepository;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTests {

	@Mock
	UpcItemClient mockItemClient;
	@Mock
	ProductRepository productRepo;
	
	@InjectMocks
	ProductService productService;

	void createProduct_savesNewProduct() {

	}

}
