package com.AgroMX.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.AgroMX.app.model.Category;
import com.AgroMX.app.service.CategoryService;


@RestController
@RequestMapping("/category")
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;
    
    @GetMapping("{id}")
    public ResponseEntity<Category> getCategory(@PathVariable("id") Long id){
        return ResponseEntity.ok(CategoryService.getOrderById(id));
    }

    @PostMapping("/")
    public ResponseEntity<Category> createCategory(@RequestBody Category categoryInfo){
        return ResponseEntity.status(201).body(orderInfo);
    }
}
