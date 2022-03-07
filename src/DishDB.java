package Examen_java;

import java.util.*;

public class DishDB {
    ArrayList<Dishes> dishes = new ArrayList<>();
    ArrayList<DishRecipe> dishRecipe = new ArrayList<>();
    

    public void addNormalDishes(NormalDishes normalDish) {
        dishes.add(normalDish);
    }

    public void addSpecialDishes(SpecialDishes specialDish) {
        dishes.add(specialDish);
    }
    
    public ArrayList<Dishes> getDishes() {
        return this.dishes;
    } 
    
    public ArrayList<DishRecipe> getDishRecipe() {
        return this.dishRecipe;
    } 
    
    public void setRecipe(DishName dishName) throws InvalidDishException {

        switch (dishName) {
            case CHICKEN_PIE: 
            {
                DishRecipe chickenPie = new DishRecipe(dishName);
                chickenPie.addIngredient(new Ingredients(Ingredient.FLOUR, 1));
                chickenPie.addIngredient(new Ingredients(Ingredient.CHICKEN, 2));
                dishRecipe.add(chickenPie);
                break;
            }

            case VANILLA_CAKE: 
            {
                DishRecipe vanillaCake = new DishRecipe(dishName);
                vanillaCake.addIngredient(new Ingredients(Ingredient.FLOUR, 1));
                vanillaCake.addIngredient(new Ingredients(Ingredient.SUGAR, 1));
                vanillaCake.addIngredient(new Ingredients(Ingredient.EGGS, 3));
                vanillaCake.addIngredient(new Ingredients(Ingredient.VANILLA, 1));
                dishRecipe.add(vanillaCake);
                break;
            }

            case PASTA_ARRABIATA: 
            {
                DishRecipe pastaArrabiata = new DishRecipe(dishName);
                pastaArrabiata.addIngredient(new Ingredients(Ingredient.TOMATOES, 2));
                pastaArrabiata.addIngredient(new Ingredients(Ingredient.PASTA, 1));
                pastaArrabiata.addIngredient(new Ingredients(Ingredient.SALT, 1));
                dishRecipe.add(pastaArrabiata);
                break;
            }

            case CHICKEN_CURRY: 
            {
                DishRecipe chickenCurry = new DishRecipe(dishName);
                chickenCurry.addIngredient(new Ingredients(Ingredient.CHICKEN, 1));
                chickenCurry.addIngredient(new Ingredients(Ingredient.RICE, 1));
                chickenCurry.addIngredient(new Ingredients(Ingredient.CURRY_SAUCE, 2));
                dishRecipe.add(chickenCurry);
                break;
            }

            case FRIED_RICE: 
            {
                DishRecipe friedRice = new DishRecipe(dishName);
                friedRice.addIngredient(new Ingredients(Ingredient.RICE, 1));
                friedRice.addIngredient(new Ingredients(Ingredient.EGGS, 3));
                dishRecipe.add(friedRice);
                break;
            }
            
            default:
            {
                throw new InvalidDishException();
            }
        }

    }
    
    public DishRecipe verifyIfExisting(DishName name) throws InvalidDishException{
        int index = -1;
        for (int i = 0; i < dishRecipe.size(); i++) {
            if (dishRecipe.get(i).getDishName().equals(name)) {
                index = i;
            }
        }
        
        if(index == -1) {
            throw new InvalidDishException();
        }
        
        return dishRecipe.get(index);
    }
}

