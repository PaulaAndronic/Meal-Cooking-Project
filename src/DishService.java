package Examen_java;

import java.util.*;

public class DishService {
    DishDB dishDB = new DishDB();
    IngredientDB ingredients = new IngredientDB();
    
    public DishService(DishDB dishDBGiven, IngredientDB ingred) {
        this.dishDB = dishDBGiven;
        this.ingredients = ingred;
    }
    
    public IngredientDB cookNormalDish(DishName dishName) throws MissingIngredientsException, InvalidDishException{
        int index = -1;
        for (int i = 0; i < dishDB.getDishes().size(); i++) {
            if (dishDB.getDishes().get(i).getDishName().equals(dishName)) {
                index = i;
            }
        }
        
        if(index == -1) {
            throw new InvalidDishException();
        }
        else {
            int index2 = -1;
            int missingQuantity = 0;
            DishRecipe recipe = dishDB.getDishRecipe().get(index);
            for(int i = 0; i < recipe.getIngredientsList().size(); i++) {
                if(recipe.getIngredientsList().get(i).getQuantity() > ingredients.returnQuantity(recipe.getIngredientsList().get(i).getName())) {
                    index2 = i;
                    missingQuantity = -ingredients.getQuantityName(recipe.getIngredientsList().get(i).getName()) +
                                      recipe.getIngredientsList().get(i).getQuantity();
                }
           }
            
            if(index2 == -1) {
               for(int i = 0; i < recipe.getIngredientsList().size(); i++) {
                
                int quantityUpdated = ingredients.getQuantityName(recipe.getIngredientsList().get(i).getName()) - 
                                      recipe.getIngredientsList().get(i).getQuantity();
             
                ingredients.updateQuantity(recipe.getIngredientsList().get(i), quantityUpdated);
           
               }
            }
            
            else {
                throw new MissingIngredientsException(recipe.getIngredientsList().get(index2),missingQuantity);
            }
        } 
        return ingredients;
    
    }
    
    public IngredientDB cookSpecialDish(DishName dishName) throws MissingIngredientsException, InvalidSpecialDishException, InvalidTimeFrameException {
        int index = -1;
        for (int i = 0; i < dishDB.getDishes().size(); i++) {
            if (dishDB.getDishes().get(i).getDishName().equals(dishName)) {
                if(dishDB.getDishes().get(i) instanceof SpecialDishes) {
                    index = i;
                }
            }
        }
        
        if(index == -1) {
            throw new InvalidSpecialDishException();
        }
        else {
            int index3 = -1;
            Calendar calendar = Calendar.getInstance();
            SpecialDishes a = ((SpecialDishes) dishDB.getDishes().get(index));
                if((a.getStartDate()).get(Calendar.DATE) < calendar.get(Calendar.DATE) &&  a.getEndDate().get(Calendar.DATE) > calendar.get(Calendar.DATE)) {
                    index3 = 0;
                }
                else if (a.getStartDate().get(Calendar.DATE) == calendar.get(Calendar.DATE) && a.getEndDate().get(Calendar.DATE) == calendar.get(Calendar.DATE)){
                    if(a.getStartDate().get(Calendar.HOUR) < calendar.get(Calendar.HOUR) && a.getEndDate().get(Calendar.HOUR) > calendar.get(Calendar.HOUR)) {
                        index3 = 0;
                 }
            } 
            if(index3 == -1) {
                throw new InvalidTimeFrameException();
            }
            else {
                int index2 = -1;
                int missingQuantity = 0;
                DishRecipe recipe = dishDB.getDishRecipe().get(index);
                for(int i = 0; i < recipe.getIngredientsList().size(); i++) {
                    if(recipe.getIngredientsList().get(i).getQuantity() > ingredients.returnQuantity(recipe.getIngredientsList().get(i).getName())) {
                        index2 = i;
                        missingQuantity = -ingredients.getQuantityName(recipe.getIngredientsList().get(i).getName()) +
                                          recipe.getIngredientsList().get(i).getQuantity();
                    }
                }
                
                if(index2 == -1) {
                   for(int i = 0; i < recipe.getIngredientsList().size(); i++) {
                    
                    int quantityUpdated = ingredients.getQuantityName(recipe.getIngredientsList().get(i).getName()) - 
                                          recipe.getIngredientsList().get(i).getQuantity();
                 
                    ingredients.updateQuantity(recipe.getIngredientsList().get(i), quantityUpdated);
               
                   }
                }
                
                else {
                    throw new MissingIngredientsException(recipe.getIngredientsList().get(index2),missingQuantity);
                }
            } 
        }
            return ingredients;
        
    }
}
