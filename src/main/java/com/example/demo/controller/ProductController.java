package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductServiceinterface;

@RestController
public class ProductController {
	
@Autowired	
private ProductServiceinterface service;

@PostMapping("/addproduct")
public Product addProduct(@RequestBody Product product) {
	return service.saveProduct(product);
}

@PostMapping("/addproducts")
public List<Product> addProducts(@RequestBody List<Product> products) {
	return (List<Product>) service.saveProducts(products);
}

@GetMapping("/products")
public List<Product> findAllProducts(){
	return service.getProducts();
}

@GetMapping("/product/{id}")
public Product findProductById(@PathVariable int id) {
	return service.getProductsById(id);    //not defined in service
}

@GetMapping("/product/{name}")
public Product findProductByName(@PathVariable String name) {
	return service.getProductsByName(name);
}

@DeleteMapping("/delete/{id}")
public String gdeleteProduct(@PathVariable int id) {
	return service.deleteProduct(id);
}

@PutMapping("/update")
public Product updateProduct(@RequestBody Product product) {
	return service.updateProduct(product);      //not defined in service
}

}
