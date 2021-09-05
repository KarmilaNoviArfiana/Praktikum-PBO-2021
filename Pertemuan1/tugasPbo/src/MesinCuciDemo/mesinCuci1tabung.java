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
public class mesinCuci1tabung extends mesinCuci{
    private String tipeMesin;
    private int kecepatan;
    
    public void setTipeMesin(String newValue){
        tipeMesin = newValue;
    }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe Mesin: "+tipeMesin);
    }
}
