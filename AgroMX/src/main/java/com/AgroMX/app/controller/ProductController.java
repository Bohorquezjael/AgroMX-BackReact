package com.AgroMX.app.controller;

import java.util.Set;

import org.springframework.http.ResponseEntity;

import com.AgroMX.app.model.Product;

public interface ProductController {
    
    public ResponseEntity<Product> createProduct(Product product);

    public ResponseEntity<Product> getProduct(Long id);

    public ResponseEntity<Product> updateProduct(Long id, Product product);

    public ResponseEntity<Product> deleteProduct(Long id);
    
    public ResponseEntity<Set<Product>> getProductByCategory(Long id);

    public ResponseEntity<Set<Product>> getAllProducts();
}