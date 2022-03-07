package Examen_java;

import java.util.*;

public class DishRecipe
{   
    DishName dishName;
    private List<Ingredients> ingredients = new ArrayList<>();
    
    public DishRecipe(DishName dishName) {
        this.dishName = dishName;
    }
    
    public void addIngredient(Ingredients ingredient) {
        ingredients.add(ingredient);
    }
    
    public DishName getDishName() {
        return dishName;
    }
    
    public List<Ingredients> getIngredientsList() {
        return this.ingredients;
    }
 
    @Override
    public String toString() {
        return "Dish recipe name: " + dishName + "Ingredients: " + ingredients.toString();
    }
    
}
