package com.AgroMX.app.controller.impl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.AgroMX.app.controller.ProductController;
import com.AgroMX.app.model.Product;
import com.AgroMX.app.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductControllerImp implements ProductController{

    private final ProductService productService;

    public ProductControllerImp(ProductService productService){
        this.productService = productService;
    }

    @PostMapping
    @Override
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return productService.createProduct(product)
                .map(productCreated -> ResponseEntity.status(201).body(productCreated))
                .orElseGet(() -> ResponseEntity.status(400).build());
    }

    @GetMapping("{id}")
    @Override
    public ResponseEntity<Product> getProduct(@PathVariable Long id) {
        return productService.getProduct(id)
                .map(product -> ResponseEntity.ok(product))
                .orElseGet(() -> ResponseEntity.status(404).build());
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return productService.updateProduct(id, product)
                .map(productUpdated -> ResponseEntity.status(202).body(productUpdated))
                .orElseGet(() -> ResponseEntity.status(404).build());
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<Product> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.status(204).build();    
    }

    @GetMapping("/category/{id}")
    @Override
    public ResponseEntity<Iterable<Product>> getProductByCategory(@PathVariable Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductByCategory'");
    }

    @GetMapping("/all")
    @Override
    public ResponseEntity<Iterable<Product>> getAllProducts() {
        List<Product> products = (List<Product>) productService.getAllProducts();
        if (products.isEmpty()) {
            return ResponseEntity.status(404).build();
        } else {
            return ResponseEntity.ok(products);
        }
    }
    
}
