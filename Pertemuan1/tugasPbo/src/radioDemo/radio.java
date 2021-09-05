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
public class radio {
    private String merek,channel;
    private int volume;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    public void gantiChannel(String newValue){
        channel = newValue;
    }
    public void tambahVolume(int increment){
        volume = volume + increment;
    }
    public void kurangiVolume(int decrement){
        volume = volume - decrement;
    }
    public void cetakStatus(){
        System.out.println("Merek: "+ merek);
        System.out.println("Channel: "+ channel);
        System.out.println("Volume: "+volume);
    }
}
