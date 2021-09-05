/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MesinCuciDemo;

/**
 *
 * @author Windows 8.1
 */
public class mesinCuci {
     private String merek;
    private int cuci;
    private int pengering;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    public void tambahKecepatanCuci(int increment){
        cuci = cuci + increment;
    }
    public void kurangiKecepatanCuci(int decrement){
        cuci = cuci - decrement;
    }
     public void setKecepatanPengering(int newValue){
        pengering = newValue;
    }
    public void cetakStatus(){
        System.out.println("Merek: "+ merek);
        System.out.println("Kecepatan Cuci: "+ cuci);
        System.out.println("Kecepatan Pengering: "+pengering);
    }
}
