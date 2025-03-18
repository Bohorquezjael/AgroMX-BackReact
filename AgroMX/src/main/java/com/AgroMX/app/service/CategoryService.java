package com.AgroMX.app.service;

import com.AgroMX.app.model.Category;

public interface CategoryService {
    
    Category createCategory(Category Category);

    Category getCategoryById(Long id);

    Category getCategoryByName(String name);

    Category updateCategory(Long id, Category newCategory);

    Category deleteCategory(Long id);
}
