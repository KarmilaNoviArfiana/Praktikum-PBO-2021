/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilDemo;

/**
 *
 * @author Windows 8.1
 */
public class mobil {
    private String merek;
    private int kecepatan;
    private int persneling;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    public void gantiPersneling(int newValue){
        persneling = newValue;
    }
    public void tambahKecepatan(int increment){
        kecepatan = kecepatan + increment;
    }
    public void kurangiKecepatan(int decrement){
        kecepatan = kecepatan - decrement;
    }
    public void cetakStatus(){
        System.out.println("Merek: "+ merek);
        System.out.println("Kecepatan: "+ kecepatan);
        System.out.println("Persneling: "+ persneling);
    }
}
