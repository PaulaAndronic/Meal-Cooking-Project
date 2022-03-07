package Examen_java;

import java.util.*;

public class IngredientDB {
    ArrayList <Ingredients> ingredients = new ArrayList<>();
    
    public void addIngredient(Ingredients ingred) {
        ingredients.add(ingred);
    }
    
    public void addQuantity(Ingredients ingred, int quantity) {
        for(Ingredients ingredient : ingredients) {
            if(ingredient.getName().equals(ingred.getName())) {
                ingredient.setQuantity(ingredient.getQuantity() + quantity);
            }
        }
    }
    
    @Override
    public String toString() {
        return "List of ingredients: \n " + ingredients.toString();
    }
    
    
    public int getQuantityName(Ingredient ingredientName) {
        for(Ingredients ingred : ingredients) { 
            if(ingred.getName().equals(ingredientName)) {
                return ingred.getQuantity();
            }
        }
        return 0;
    }
    
    public ArrayList<Ingredients> getListIngredientsDB() {
        return this.ingredients;
    }
    
    public int returnQuantity (Ingredient ingredientName) {
        if (ingredients.isEmpty() == false) {
            for(Ingredients ingred : ingredients) {
                if(ingred.ingredientName.equals(ingredientName) ) {
                    return ingred.quantity;
                }  
            }
        }
        return 0;
    }
    
    public void updateQuantity(Ingredients ingred, int quantity) {
        for(Ingredients ingredient : ingredients) {
            if(ingredient.getName().equals(ingred.getName())) {
                ingredient.setQuantity(quantity);
            }
        }
    
    }
    
    public void constructIngredientDB(IngredientDB ingred) {
        ingredients = ingred.getListIngredientsDB();
    }
    
}