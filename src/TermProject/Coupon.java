/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TermProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Shahla
 */
public class Coupon {
    private int couponId,
            discountRate;
    
    public Coupon(int couponId, int discountRate){
        this.couponId=couponId;
        this.discountRate=discountRate;
    }
    
    
    public static  int getDiscountRate(int id){
        File file=new File("coupon.txt");
        if(!file.exists())
            System.out.println("File could not be found");
        Scanner input=null;
        
        try{
            input=new Scanner(file);
            while(input.hasNext()){
                int file_id=input.nextInt();
                int discount_rate=input.nextInt();
                if(file_id==id)
                    return discount_rate;
            }
        }catch(FileNotFoundException ex){
            
        }finally{
            input.close();
        }
        return 0;        
    }
    
    public int getDiscount(){
        return discountRate;
    }
    
    public int getCouponId(){
        return couponId;
    }
    
    @Override
    public String toString(){
        return "\nCoupon\n Coupon ID: "+couponId+"\nDiscount Rate: "+discountRate;
    }
    
}
