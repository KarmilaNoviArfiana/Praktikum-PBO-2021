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
public class setrikaUap extends setrika{
    private String tenagaPanas;
    
    public void SetSumberTenaga(String newValue){
        tenagaPanas = newValue;
    }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Sumber Tenaga Panas: "+tenagaPanas);
    }
}
