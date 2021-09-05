/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setrikaDemo;

/**
 *
 * @author Windows 8.1
 */
public class setrikaDemo {
    public static void main(String[] args){
        
        setrika stk1 = new setrika();
        setrikaUap stk2 = new setrikaUap();
        
        stk1.setMerek("philips");
        stk1.naikkanSuhu(10);
        stk1.naikkanSuhu(7);
        stk1.turunkanSuhu(2);
        stk1.cetakStatus();
        
        stk2.setMerek("Sony");
        stk2.naikkanSuhu(20);
        stk2.SetSumberTenaga("Air");
        stk2.cetakStatus();
        
    }
}
