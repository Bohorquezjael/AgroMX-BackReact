package com.AgroMX.app.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.AgroMX.app.repository.CategoryRepository;

@Component
@Order(1)
public class CategoryDataLoader implements CommandLineRunner{
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        categoryRepository.save(new Category("Fertilizantes", "Productos para nutrir tus plantas", "https://www.google.com"));
        categoryRepository.save(new Category("Semillas", "Semillas de todo tipo de plantas", "https://www.google.com"));
        categoryRepository.save(new Category("Herramientas", "Herramientas para el cuidado de tus plantas", "https://www.google.com"));
    }
}
