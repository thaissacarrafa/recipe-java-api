package com.teste.recipejavaapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("recipe")

public class ReceitasController {

    @Autowired
    private RecipeController service;

    @PostMapping
    public Recipe save(@Valid @RequestBody Recipe recipe) {
        return service.save(recipe);
    }

    @PutMapping("{id}")
    public void update(@PathVariable String id, @Valid @RequestBody Recipe recipe) {
        service.update(id, recipe);
    }

    @DeleteMapping("{id}")
    public void deleteid(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("{id}")
    public Recipe get(@PathVariable String id) {
        return service.get(id);
    }

    @GetMapping("/ingredient")
    public List<Recipe> listByIngredient(@RequestParam(name = "ingredient") String ingredient) {
        return service.listByIngredient(ingredient);
    }

    @DeleteMapping("/ingredient")
    public void deleteingredient(@PathVariable String ingredient) {
        service.delete(ingredient)
    }

    @PatchMapping("id")
    public void change(@PathVariable String id, @Valid @RequestBody Recipe recipe) {
        service.update(id, recipe);
    }

}