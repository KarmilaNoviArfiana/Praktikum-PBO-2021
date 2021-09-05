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
public class mesinCuciDemo {
    public static void main(String[] args){
        
        mesinCuci mc1 = new mesinCuci();
        mesinCuci1tabung mc2 = new mesinCuci1tabung();
        
        mc1.setMerek("Sharp");
        mc1.tambahKecepatanCuci(50);
        mc1.kurangiKecepatanCuci(10);
        mc1.setKecepatanPengering(3);
        mc1.cetakStatus();
        
        mc2.setMerek("Samsung");
        mc2.tambahKecepatanCuci(30);
        mc2.setKecepatanPengering(2);
        mc2.setTipeMesin("Top Loading");
        mc2.cetakStatus();
    }
}
