package Examen_java;


public class MissingIngredientsException extends Exception {
    
    public MissingIngredientsException(Ingredients ingred, int neededQuantity) {
        super(ingred.getName() + "  " + ingred.getQuantity() + " " + neededQuantity);
    }
}
