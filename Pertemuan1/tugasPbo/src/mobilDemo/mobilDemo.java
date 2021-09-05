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
public class mobilDemo {
    public static void main(String[] args){
        
        mobil mb1 = new mobil();
        mobil mb2 = new mobil();
        
        mb1.setMerek("Honda Jazz");
        mb1.tambahKecepatan(70);
        mb1.gantiPersneling(2);
        mb1.kurangiKecepatan(41);
        mb1.cetakStatus();
        
       mb2.setMerek("Avanza");
       mb2.tambahKecepatan(20);
       mb2.gantiPersneling(1);
       mb1.cetakStatus();
    }
}
