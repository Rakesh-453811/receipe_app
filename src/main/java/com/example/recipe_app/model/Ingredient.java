

package com.example.recipe_app.model;

import jakarta.persistence.*;

@Entity
public class Ingredient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ingredient_id")
	private Long id;
	@Column(name="ingredient_name")
	private String name;
	@Column(name="quantity")
	private int quantity; // in grams
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="recipe_id")
	private Recipe recipe;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public Ingredient() {
		super();
	}

	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
	}
	
	
}
