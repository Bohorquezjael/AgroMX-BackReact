package com.AgroMX.app.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.AgroMX.app.model.Product;
import com.AgroMX.app.repository.ProductRepository;
import com.AgroMX.app.service.ProductService;

import com.AgroMX.app.Exceptions.EntityDuplicated;
import com.AgroMX.app.Exceptions.EntityNotFoundException;

@Service
public class ProductServiceImp implements ProductService {

    private final ProductRepository productRepository;
    private Logger logger = LoggerFactory.getLogger(ProductServiceImp.class);

    public ProductServiceImp(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public Optional<Product> createProduct(Product product) {
        if(productRepository.existsByProductName(product.getProductName())){
            logger.error("Product already exists with name: " + product.getProductName());
            throw new EntityDuplicated(product.getProductName());
        }
        logger.info("Product created with id: " + product.getProductName());
        return Optional.of(productRepository.save(product));
    }

    @Override
    public Optional<Product> getProduct(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if(product.isEmpty()){
            logger.error("Product not found with id: " + id);
            throw new EntityNotFoundException(id);
        }
        logger.info("Product found with id: " + id);
        return product;
    }

    @Override
    public Optional<Product> updateProduct(Long id, Product product) {
        if(productRepository.existsById(id)){
            product.setId(id);
            logger.info("Product updated with id: " + id);
            return Optional.of(productRepository.save(product));
        }else{
            logger.error("Product not found with id: " + id);
            throw new EntityNotFoundException(id);
        }
    }

    @Override
    public void deleteProduct(Long id) {
        if(productRepository.existsById(id)){
            productRepository.deleteById(id);
            logger.info("Product deleted with id: " + id);
        }else{
            logger.error("Product not found with id: " + id);
            throw new EntityNotFoundException(id);
        }
    }

    @Override
    public Iterable<Product> getProductsByCategory(Long id) {
        //! TODO: Implement this method
        throw new UnsupportedOperationException("Unimplemented method 'getProductsByCategory'");
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }
    
}
