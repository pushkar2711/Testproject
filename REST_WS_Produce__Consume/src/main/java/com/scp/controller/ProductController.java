package com.scp.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.scp.bean.Product;
import com.scp.entities.ProductEntity;
import com.scp.services.ProductService;
import com.scp.services.ProductServiceImpl;
@Path("/products")
public class ProductController {
	ProductService productService=new ProductServiceImpl();
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public ProductEntity getProduct(@PathParam("id") int id){
		return productService.getProduct(id);
	}
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public List<ProductEntity> getAllProductInfo(){
		return productService.getAllProducts();
		
	}
	@DELETE
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public int deleteProduct(@PathParam("id")int id){
		return productService.deleteProduct(id);
	}
	@POST
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public ProductEntity addProduct(ProductEntity productEntity){
		return productService.addProduct(productEntity);
	}
	@PUT
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public ProductEntity updateProduct(ProductEntity productEntity){
		return productService.updateProduct(productEntity);
		
	}
	}
