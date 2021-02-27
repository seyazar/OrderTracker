/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TermProject;

/**
 *
 * @author Shahla
 */
public class Meal extends Order {
    private String mealCategory,
                    mealType;

    public Meal(int OrderNum, double price, String OrderType, String mealCategory,String mealType) {
        super(OrderNum, price, OrderType);
        this.mealType = mealType;
        this.mealCategory=mealCategory;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+"\nMeal Type: "+mealType+"\nMeal Category: "+mealCategory+"\nService in "+calculateServiceTime()+" mins."+
                "\nPrice: "+calculatePrice()*serve;
    }
    
    @Override
    public double calculateServiceTime() {
        double prepTime=0;
        if(mealCategory.equalsIgnoreCase("breakfast"))
        {
            prepTime=30;
        }
        else if(mealCategory.equalsIgnoreCase("lunch"))
        {
            prepTime=10;
        }
        
        else if(mealCategory.equalsIgnoreCase("dinner"))
        {
            prepTime=20;
        }
        return prepTime;
    }

    @Override
    public double calculatePrice() {
        double cost=0;
        if(mealType.equalsIgnoreCase("vegetarian"))
             cost=price;
        else if(mealType.equalsIgnoreCase("chicken"))
                cost=price*1.5;
        else if(mealType.equalsIgnoreCase("meat"))
            cost=price*3;
        
        return cost;
    }
    
    
        
    

}
