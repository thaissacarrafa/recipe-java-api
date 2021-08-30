package com.teste.recipejavaapi.service;

import java.util.List;

public interface RecipeService {

    Recipe save(Recipe recipe);

    void update(String id, Recipe recipe);

    void delete(String id);

    Recipe get(String id);

    List<Recipe> listByIngredient(String ingredient);


}