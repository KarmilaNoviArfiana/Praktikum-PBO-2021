/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author Windows 8.1
 */
public class Lingkaran {
    public double phi;
    public double r;
    
    public double hitungLuas(double r, double phi){
       double luas = phi * r*r;
       return luas;
    }
    public double hitungKeliling(double r,double phi){
       double keliling = 2 *phi*r;
       return keliling;
    }
    
        
}


