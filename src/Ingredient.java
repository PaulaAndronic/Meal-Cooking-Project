package Examen_java;


public enum Ingredient {
    FLOUR(1), EGGS(2), TOMATOES(3), PASTA(4), CHICKEN(5), 
    CURRY_SAUCE(6), RICE(7), SALT(8), SUGAR(9), VANILLA(10);
    
    private int id;
    
    Ingredient(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
}
