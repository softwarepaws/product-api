package com.softwarepaws.productsapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.softwarepaws.productsapi.model.Product;
import com.softwarepaws.productsapi.repository.ProductRepository;

@Service
public class ProductService implements IProductService {
	
	private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductByUpc(String upc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductByEan13(String ean13) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductBySku(String sku) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductByAsin(String asin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductByMpn(String mpn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> searchProducts(String query, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByCategory(String category, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByBrand(String brand, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByManufacturer(String manufacturer, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByTitle(String title, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		
	}

}
