package com.teste.recipejavaapi.service;
import com.teste.recipejavaapi.RecipeRepository.RecipeRepository;
import com.teste.recipejavaapi.model.Recipe;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Recipe save(Recipe recipe) {
        return this.recipeRepository.save(recipe);
    }

    /*@Override
    public void update(String id, Recipe recipe) {
        Recipe toUpdate = this.get(id);
        toUpdate.setTitle(recipe.getTitle());
        toUpdate.setDescription(recipe.getDescription());
        toUpdate.cleanIngredients();

        recipe.getIngredients().forEach(ingredient -> toUpdate.addIngredient(ingredient));

        this.save(toUpdate);
    }

    @Override
    public void delete(String id) {
        Recipe toDelete = this.get(id);
        this.recipeRepository.delete(toDelete);
    }

    @Override
    public Recipe get(String id) {
        return this.recipeRepository.findById(id).orElseThrow(RecipeNotFoundException::new);
    }

    @Override
    public List<Recipe> listByIngredient(String ingredient) {
        return this.recipeRepository.findAllByIngredients(ingredient)
                .stream()
                .sorted(Comparator.comparing(Recipe::getTitle))
                .collect(Collectors.toList());
    }
}

*/

   }


