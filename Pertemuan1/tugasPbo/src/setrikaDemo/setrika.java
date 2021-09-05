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
public class setrika {
    private String merek;
    private int suhu;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    public void naikkanSuhu(int increment){
        suhu = suhu + increment;
    }
    public void turunkanSuhu(int decrement){
        suhu = suhu - decrement;
    }
    public void cetakStatus(){
        System.out.println("Merek: "+ merek);
        System.out.println("Pengaturan Suhu: "+ suhu);
    }
}
