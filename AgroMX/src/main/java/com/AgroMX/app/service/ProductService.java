package com.AgroMX.app.service;

import java.util.Optional;

import com.AgroMX.app.model.Product;

public interface ProductService {
    
    public Optional<Product> createProduct(Product product);

    public Optional<Product> getProduct(Long id);

    public Optional<Product> updateProduct(Long id, Product product);

    public void deleteProduct(Long id);
    
    public Iterable<Product> getProductsByCategory(Long id); //? TODO: change id to string

    public Iterable<Product> getAllProducts();
}
