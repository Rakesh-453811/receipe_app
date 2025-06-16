package com.example.recipe_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.recipe_app.model.Recipe;



@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long>{
	
}
