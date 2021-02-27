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
public class Drink extends Order{
    private String hotOrCold;
    private boolean alcholic;

    public Drink(int OrderNum, double price, String OrderType,String hotOrCold, boolean alcholic) {
        super( OrderNum, price, OrderType);
        this.hotOrCold=hotOrCold;
        this.alcholic=alcholic;
    }
    
    @Override
    public String toString()
    {
    return super.toString()+"\nDrink is: "+hotOrCold+"\n Service in "+calculateServiceTime()+" mins."+"\nPrice: "+calculatePrice()*serve;
    }
    
    @Override
    public double calculateServiceTime() {
       double preptime=0;
       if(hotOrCold.equalsIgnoreCase("hot"))
       {
       preptime=10;
       }
       else 
           if(hotOrCold.equalsIgnoreCase("cold"))
           {
           preptime=5;
           }
       return preptime;
    }
    
    @Override
    public double calculatePrice(){
        if(alcholic)
            return price*2.5;
        else
            return price;
    }

}
