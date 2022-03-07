package Examen_java;

import java.util.*;
public class MainExamen {
    
    public static void main(String [] args) throws InvalidDishException, MissingIngredientsException, InvalidSpecialDishException, InvalidTimeFrameException {
        Ingredients ingredient1 = new Ingredients(Ingredient.SALT,3);
        Ingredients ingredient2 = new Ingredients(Ingredient.FLOUR,5);
        Ingredients ingredient3 = new Ingredients(Ingredient.CHICKEN,4);
        Ingredients ingredient4 = new Ingredients(Ingredient.EGGS,3);
        Ingredients ingredient5 = new Ingredients(Ingredient.TOMATOES,2);
        Ingredients ingredient6 = new Ingredients(Ingredient.PASTA,5);
        Ingredients ingredient7 = new Ingredients(Ingredient.CURRY_SAUCE,1);
        Ingredients ingredient8 = new Ingredients(Ingredient.RICE,3);
        Ingredients ingredient9 = new Ingredients(Ingredient.SUGAR,10);
        Ingredients ingredient10 = new Ingredients(Ingredient.EGGS,3);
        
        IngredientDB ingredientsDB = new IngredientDB();

        ingredientsDB.addIngredient(ingredient1);
        ingredientsDB.addIngredient(ingredient2);
        ingredientsDB.addIngredient(ingredient3);
        ingredientsDB.addIngredient(ingredient4);
        ingredientsDB.addIngredient(ingredient5);
        ingredientsDB.addIngredient(ingredient6);
        ingredientsDB.addIngredient(ingredient7);
        ingredientsDB.addIngredient(ingredient8);
        ingredientsDB.addIngredient(ingredient9);
        ingredientsDB.addIngredient(ingredient10);
        
        System.out.println(ingredientsDB.toString());
        
        System.out.println("Initial quantity for " + Ingredient.SALT + " is: " + ingredientsDB.returnQuantity(Ingredient.SALT));
        ingredientsDB.addQuantity(ingredient1, 5);
        System.out.println("Quantity for " + Ingredient.SALT + " after adding an additional quantity is: " + ingredientsDB.returnQuantity(Ingredient.SALT));
        
        NormalDishes normalDish1 = new NormalDishes(DishName.CHICKEN_PIE);
        NormalDishes normalDish2 = new NormalDishes(DishName.PASTA_ARRABIATA);
        NormalDishes normalDish3 = new NormalDishes(DishName.FRIED_RICE);
        
        Calendar startDate1 = Calendar.getInstance(); 
        startDate1.add(Calendar.DATE, -10);  
        startDate1.add(Calendar.HOUR, -10);
        
        Calendar endDate1 = Calendar.getInstance(); 
        endDate1.add(Calendar.DATE, 5); 
        endDate1.add(Calendar.HOUR, 10);
        
        SpecialDishes specialDish1 = new SpecialDishes(DishName.VANILLA_CAKE, startDate1, endDate1);
        
        Calendar startDate2 = Calendar.getInstance(); 
        startDate2.add(Calendar.DATE, -5);  
        startDate2.add(Calendar.HOUR, -5);
        
        Calendar endDate2 = Calendar.getInstance(); 
        endDate2.add(Calendar.DATE, 10); 
        endDate2.add(Calendar.HOUR, 3);
        
        SpecialDishes specialDish2 = new SpecialDishes(DishName.CHICKEN_CURRY, startDate2, endDate2);
        
        normalDish1.setWeight();
        normalDish2.setWeight();
        normalDish3.setWeight();
        specialDish1.setWeight();
        specialDish2.setWeight();
        
        DishDB dishDB = new DishDB();
        dishDB.addNormalDishes(normalDish1);
        dishDB.addNormalDishes(normalDish2);
        dishDB.addNormalDishes(normalDish3);
        dishDB.addSpecialDishes(specialDish1);
        dishDB.addSpecialDishes(specialDish2);
        
        dishDB.setRecipe(DishName.CHICKEN_PIE);
        dishDB.setRecipe(DishName.PASTA_ARRABIATA);
        dishDB.setRecipe(DishName.VANILLA_CAKE);
        dishDB.setRecipe(DishName.CHICKEN_CURRY);
        dishDB.setRecipe(DishName.FRIED_RICE);
       
        System.out.println(dishDB.verifyIfExisting(DishName.PASTA_ARRABIATA));
        System.out.println(dishDB.verifyIfExisting(DishName.VANILLA_CAKE));
        
        
        DishService dishService = new DishService(dishDB, ingredientsDB);
        System.out.println(ingredientsDB.returnQuantity(Ingredient.FLOUR));
        System.out.println(ingredientsDB.returnQuantity(Ingredient.CHICKEN));
        
        ingredientsDB.constructIngredientDB(dishService.cookNormalDish(DishName.CHICKEN_PIE));
        ingredientsDB.constructIngredientDB(dishService.cookSpecialDish(DishName.VANILLA_CAKE));
        
        System.out.println(ingredientsDB.returnQuantity(Ingredient.FLOUR));
        System.out.println(ingredientsDB.returnQuantity(Ingredient.CHICKEN));
            
    }
}
