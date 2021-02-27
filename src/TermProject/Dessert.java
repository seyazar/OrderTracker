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
public class Dessert extends Order {
    private boolean prepared;
    private boolean diabetic;

    public Dessert(int OrderNum, double price, String OrderType,boolean prepared, boolean diabetic) {
        super(OrderNum, price, OrderType);
        this.prepared=prepared;
        this.diabetic=diabetic;
    }

    
    @Override
    public String toString(){
        return super.toString()+"\nIs the dessert prepared? "+prepared+"\nService in"+calculateServiceTime()+" mins."+"\nPrice: "+calculatePrice()*serve;
    }
    @Override
    public double calculateServiceTime() {
       double preptime;
        if(prepared)
            preptime=5;
        else
            preptime=15;
        return preptime;
    }

    @Override
    public double calculatePrice() {
        if(diabetic)
            return price*2;
        else
            return price;
            
    }

}
