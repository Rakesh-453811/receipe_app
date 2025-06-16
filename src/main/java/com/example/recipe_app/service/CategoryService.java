package com.example.recipe_app.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.recipe_app.model.Category;
import com.example.recipe_app.repository.CategoryRepository;

import jakarta.transaction.Transactional;

import java.util.List;


@Service
@Transactional
public class CategoryService{
	@Autowired
	private CategoryRepository cr;
	
	public void saveCategory(Category category) {
		cr.save(category);
	}
	
	public Category getCategory(Long id) {
		Category category = cr.findById(id).orElse(null);
        System.out.println("Category: " + category);
        return category;
    }
	
	public List<Category> getAllCategories(){
		return cr.findAll();
	}
	
}
