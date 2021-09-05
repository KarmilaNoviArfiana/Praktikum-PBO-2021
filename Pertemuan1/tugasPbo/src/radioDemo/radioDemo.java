/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radioDemo;

/**
 *
 * @author Windows 8.1
 */
public class radioDemo {
    public static void main(String[] args){
        
        radio rd1 = new radio();
        radio rd2 = new radio();
        
        rd1.setMerek("Rolton");
        rd1.gantiChannel("Radio Strato (101,9 FM)");
        rd1.tambahVolume(20);
        rd1.cetakStatus();
        
        rd2.setMerek("Sony");
        rd2.gantiChannel("Radio JJ (105,1 FM)");
        rd2.gantiChannel("Rdio PAS (104,3 FM)");
        rd2.tambahVolume(50);
        rd2.kurangiVolume(12);
        rd2.cetakStatus();   
    }
}
