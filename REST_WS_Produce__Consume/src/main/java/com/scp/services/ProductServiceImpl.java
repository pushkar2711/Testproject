package com.scp.services;

import java.util.ArrayList;
import java.util.List;

import com.scp.bean.Product;
import com.scp.dao.ProductDAO;
import com.scp.dao.ProductDAOImpl;
import com.scp.entities.ProductEntity;

public class ProductServiceImpl implements ProductService {
	ProductDAO productDao=new ProductDAOImpl();

	@Override
	public ProductEntity addProduct(ProductEntity product) {
		return productDao.addProduct(product);
	}
	
	@Override
	public ProductEntity getProduct(int productId) {
		
		return productDao.getProduct(productId);
	}

	@Override
	public int deleteProduct(int productId) {
		return productDao.deleteProduct(productId);
	}

	@Override
	public ProductEntity updateProduct(ProductEntity product) {
		return productDao.updateProduct(product);
	}

	@Override
	public List<ProductEntity> getAllProducts() {
		return productDao.getAllProducts();
	}

}
