package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.Product;

public interface ProductServiceinterface {

	public Product saveProduct(Product product);
	public Product saveProducts(List<Product> products);
	public List<Product> getProducts();
	public Product getProductsById(int id);
	public Product getProductsByName(String name);
	public String deleteProduct(int id);
	public Product updateProduct(Product product) ;
	
}
