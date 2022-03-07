package Examen_java;

import java.util.*;

public class SpecialDishes extends Dishes
{
    private Calendar startDate;
    private Calendar endDate;
    
    public SpecialDishes(DishName dishName, Calendar startDate, Calendar endDate) {
        super(dishName);
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public Calendar getStartDate() {
        return this.startDate;
    }
    
    public Calendar getEndDate() {
        return this.endDate;
    }
}
