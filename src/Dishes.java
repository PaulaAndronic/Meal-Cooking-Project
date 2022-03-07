package Examen_java;


public class Dishes
{
    DishName dishName;
    int weight;
    
    public Dishes(DishName dishName) {
        this.dishName = dishName;
    } 
    
    public void setWeight() {
       switch(dishName) {
           case CHICKEN_PIE:
           {
               this.weight = 200;
               break;
           }
           case VANILLA_CAKE:
           {
               this.weight = 500;
               break;
           }
           case PASTA_ARRABIATA:
           {
               this.weight = 550;
               break;
           }
           case CHICKEN_CURRY:
           {
               this.weight = 350;
               break;
           }
           case FRIED_RICE:
           {
               this.weight = 600;
               break;
           }
       }
    }
    
    public DishName getDishName() {
        return dishName;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
}
