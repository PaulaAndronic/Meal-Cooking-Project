package Examen_java;



public class InvalidDishException extends Exception 
{
   public InvalidDishException() {
       super("Invalid Dish Name");
   }
}
