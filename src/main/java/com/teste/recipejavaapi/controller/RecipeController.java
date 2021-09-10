package com.teste.recipejavaapi.controller;

import com.teste.recipejavaapi.model.Recipe;
import com.teste.recipejavaapi.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("recipe")

public class RecipeController {

    @Autowired
    private RecipeService service;

    @PostMapping
    public Recipe save(@RequestBody Recipe recipe) {
        return service.save(recipe);
    }

    /* @PutMapping("/{id}")
    public void update(@PathVariable String id, @Valid @RequestBody Recipe recipe) { service.update(id, recipe);
    }

    @DeleteMapping("/{id}")
    public void deleteId(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/{id}")
    public Recipe get(@PathVariable String id) {
        return service.get(id);
    }

    @GetMapping("/ingredient")
    public List<Recipe> listByIngredient(@RequestParam List<String> ingredient) {
        return service.listByIngredient(ingredient);
    }

    @PatchMapping("/{id}")
    public void changeingredient(@PathVariable String id,@RequestParam List <String> ingredient)  {
        service.update(id,ingredient);
    }
*/
 }
