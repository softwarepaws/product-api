package com.softwarepaws.productsapi.service;

import java.util.List;

import com.softwarepaws.productsapi.model.Product;

public interface IProductService {
	Product saveProduct(Product product);
	Product getProductByUpc(String upc);
	Product getProductByEan13(String ean13);
	Product getProductById(Long id);
	Product getProductBySku(String sku);
	Product getProductByAsin(String asin);
	Product getProductByMpn(String mpn);
	List<Product> searchProducts(String query, int page, int size);
	List<Product> getAllProducts(int page, int size);
	List<Product> getProductsByCategory(String category, int page, int size);
	List<Product> getProductsByBrand(String brand, int page, int size);
	List<Product> getProductsByManufacturer(String manufacturer, int page, int size);
	List<Product> getProductsByTitle(String title, int page, int size);
	void deleteProduct(Long id);
	
}
