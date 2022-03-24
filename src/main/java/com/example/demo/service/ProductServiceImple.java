package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;


@Service
public class ProductServiceImple implements ProductServiceinterface{

	@Autowired
	private ProductRepository repository;
	
	@Override
	public Product saveProduct(Product product) {
		return repository.save(product);
	}

	@Override
	public Product saveProducts(List<Product> products) {
		return  (Product) repository.saveAll(products);
	}

	@Override
	public List<Product> getProducts() {
		return repository.findAll();
	}

//	@Override
//	public Product getProductsById(int id) {
//		return repository.findAllById(id).orElse(other:null);
//	}
	
	@Override
	public Product getProductsById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductsByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public String deleteProduct(int id) {
		repository.deleteById(id);	
		return "product removed !! "+id;
	}

	
	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Product updateProduct(Product product) {
//		Product existingproduct = repository.findAllById(product.getId).orElse(other:null);
//		existingproduct.setName(Product.getName());
//		existingproduct.setQuantity(Product.getQuantity());
//		existingproduct.setPrice(Product.getPrice());
//		return repository.save(existingproduct);
//	}

}
