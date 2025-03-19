package com.AgroMX.app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AgroMX.app.model.Category;
import com.AgroMX.app.repository.CategoryRepository;
import com.AgroMX.app.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category getCategoryByName(String name) {
        return categoryRepository.findByName(name).orElse(null);
    }

    @Override
    public Category updateCategory(Long id, Category newCategory) {
        return categoryRepository.findById(id)
            .map(category -> {
                category.setCategoryName(newCategory.getCategoryName());
                category.setCategoryDescription(newCategory.getCategoryDescription());
                category.setCategoryUrlImage(newCategory.getCategoryUrlImage());
                return categoryRepository.save(category);
            })
            .orElse(null); // O lanzar una excepción si no se encuentra la categoría
    }

    @Override
    public Category deleteCategory(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        if (category.isPresent()) {
            categoryRepository.deleteById(id);
            return category.get();
        }
        return null; // O lanzar una excepción si no se encuentra la categoría
    }
}