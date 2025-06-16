package com.example.recipe_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.recipe_app.model.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
