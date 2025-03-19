package com.AgroMX.app.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.AgroMX.app.controller.CategoryController;
import com.AgroMX.app.model.Category;
import com.AgroMX.app.service.CategoryService;

@CrossOrigin(origins = "*")
@RequestMapping("/categories")
@RestController
public class CategoryControllerImpl implements CategoryController {

    private final CategoryService categoryService;

    public CategoryControllerImpl(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    @GetMapping("{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(categoryService.getCategoryById(id));
    }

    @Override
    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody Category newCategory) {
        return ResponseEntity.status(201).body(categoryService.createCategory(newCategory));
    }

    @PutMapping("{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable("id") Long id, @RequestBody Category category) {
        return ResponseEntity.ok(categoryService.updateCategory(id, category));
    }

    @Override
    @DeleteMapping("{id}")
    public ResponseEntity<Category> deleteCategory(@PathVariable("id") Long id) {
        categoryService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }
}
