package com.scp.services;

import java.util.List;

import com.scp.entities.ProductEntity;

public interface ProductService {
	public ProductEntity addProduct(ProductEntity product);
	public ProductEntity getProduct(int productId);
	public int deleteProduct(int productId);
	public ProductEntity updateProduct(ProductEntity product);
	public List<ProductEntity> getAllProducts();


}
