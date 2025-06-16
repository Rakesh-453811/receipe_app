package com.example.recipe_app.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.*;

import com.example.recipe_app.model.Category;
import com.example.recipe_app.model.Recipe;
import com.example.recipe_app.service.CategoryService;
import com.example.recipe_app.service.RecipeService;

@Controller
public class RecipeController {
	
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	RecipeService recipeService;
	
	@GetMapping("/home")
	public String showHomePage(Model model) {
		List<Category> categories = categoryService.getAllCategories();
		model.addAttribute("categories", categories);
		model.addAttribute("recipe", new Recipe());
		return "home";
	}

	
	@GetMapping("/category")
	public String showCategoryPage(Model model) {
		//List<Category> categories = categoryService.getAllCategories();
		
		model.addAttribute("category", new Category());
		return "add-category";
	}
	
	@PostMapping("/addcategory")
	public String saveCategory(@ModelAttribute("category") Category category) {
		
		categoryService.saveCategory(category);
		return "redirect:/home";
	}
	
	@PostMapping("/saveRecipe")
	public String saveRecipe(@ModelAttribute("recipe") Recipe recipe) {
		recipeService.saveRecipe(recipe);
		return "redirect:/home";
		
	}
}
