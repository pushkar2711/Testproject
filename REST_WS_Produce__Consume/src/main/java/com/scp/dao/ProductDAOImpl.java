package com.scp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.scp.entities.ProductEntity;
import com.scp.utils.sessionFactoryUtil;

public class ProductDAOImpl implements ProductDAO{

	@Override
	public ProductEntity addProduct(ProductEntity product) {
		
		SessionFactory sessionFactory=sessionFactoryUtil.getSessionfactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(product);
		session.flush();
		tx.commit();
		// TODO Auto-generated method stub
		return product;
	}

	@Override
	public ProductEntity getProduct(int productId) {
		SessionFactory sessionFactory=sessionFactoryUtil.getSessionfactory();
		Session session=sessionFactory.openSession();
		ProductEntity entity=session.get(ProductEntity.class,productId);
		session.close();
		
		// TODO Auto-generated method stub
		return entity;
	}

	@Override
	public int deleteProduct(int productId) {
		SessionFactory sessionFactory=sessionFactoryUtil.getSessionfactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(getProduct(productId));
		session.flush();
		tx.commit();
		// TODO Auto-generated method stub
		return productId;
	}

	@Override
	public ProductEntity updateProduct(ProductEntity product) {
		SessionFactory sessionFactory=sessionFactoryUtil.getSessionfactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(product);
		session.flush();
		tx.commit();
		session.close();
		// TODO Auto-generated method stub
		return getProduct(product.getProductId());
	}

	@Override
	public List<ProductEntity> getAllProducts() {
		SessionFactory sessionFactory=sessionFactoryUtil.getSessionfactory();
		Session session=sessionFactory.openSession();
		List<ProductEntity> entities=session.createQuery("from ProductEntity").list();
		session.close();
		// TODO Auto-generated method stub
		return entities;
	}

}
