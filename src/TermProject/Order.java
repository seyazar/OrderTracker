/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TermProject;

import java.util.ArrayList;

/**
 *
 * @author Shahla
 */
public abstract class Order implements Price {
    
    protected static int beginId=99; 
    protected int id;
    protected int serve;
    protected double price;
    protected String OrderType;
    protected ArrayList<Coupon> coupons=new ArrayList<Coupon>();

    public Order(int serve, double price, String OrderType) {
        
        this.serve = serve;
        this.price = price;
        this.OrderType = OrderType;
        id=++beginId;
    }
    
    public boolean addCoupon(Coupon c){
        for(int i=0; i<coupons.size(); i++){
            if(coupons.get(i).getCouponId()==c.getCouponId())
                return false;
        }
        coupons.add(c);
        return true;
    }

    @Override
   public String toString(){
   
   return "Id:"+id+"\nNumber of Orders: "+serve+"\n Type of the Order: "+OrderType;
   }
    
    public abstract double calculateServiceTime();
    
    
    public int getId(){
        return id;
    }
    
    public void setPrice(double price){
        this.price=price;
    }
}

