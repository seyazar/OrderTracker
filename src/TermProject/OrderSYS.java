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
public class OrderSYS {
    private static ArrayList<Order> orders=new ArrayList<Order>();
    
    public static boolean addOrder(Order o){
    
        for(int i=0;i<orders.size();i++){
            if(o.getId()==orders.get(i).getId())
                return false;
        }
        orders.add(o);
        return true;
    }
    
    public static boolean removeOrder(int id){
    
        for(int i=0;i<orders.size();i++){
            if(id==orders.get(i).getId()){
                orders.remove(i);
                return true;
            }                                  
        }
        return false;
    }
 
    public static Order searchOrder(int id){
        for(int i=0;i<orders.size();i++){
            if(id==orders.get(i).getId()){
                return orders.get(i);        
            }                                  
        }
        return null;
    }
    
    public static String displayAllOrders(){
        String str="";
        for(int i=0; i<orders.size(); i++){
            str+=orders.get(i).toString()+"\n\n";
        }
        return str;
    }
    
    public static ArrayList<Order> getOrders(){
        return orders;
    }

}
