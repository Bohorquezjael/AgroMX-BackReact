package com.AgroMX.app.controller;

import org.springframework.http.ResponseEntity;

import com.AgroMX.app.model.Category;

public interface CategoryController {
    ResponseEntity<Category> getCategoryById(Long id);
    ResponseEntity<Category> createCategory(Category newCategory);
    ResponseEntity<Category> updateCategory(Category category, Long id);
    ResponseEntity<Category> deleteCategory(Long id);
}

