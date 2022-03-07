package Examen_java;


public class Ingredients {
    Ingredient ingredientName;
    int quantity;
    
    public Ingredients(Ingredient ingredient, int quantity) {
        this.ingredientName = ingredient;
        this.quantity = quantity;
    }
    
    public Ingredient getName() {
        return ingredientName;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }
    
    @Override
    public String toString() {
        return "Ingredient name: " + ingredientName + " ID: " + ingredientName.getId() + " quantity: " + quantity + "\n";
    }
}

