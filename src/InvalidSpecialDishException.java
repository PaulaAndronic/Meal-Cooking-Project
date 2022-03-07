package Examen_java;

public class InvalidSpecialDishException extends Exception 
{
   public InvalidSpecialDishException() {
       super("Invalid SpecialDish Name");
   }
}