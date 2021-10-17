/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author Windows 8.1
 */
public class Overloading {
    private int sudut;
    
    public int totalSudut(int sudutA){
        sudut = 180 - sudutA;
        System.out.println("Total Sudut: "+sudut);
        return sudut;
    }
    public int totalSudut(int sudutA,int sudutB){
        sudut = 180 - (sudutA + sudutB);
        System.out.println("Total Sudut: "+sudut);
        return sudut;
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        int keliling = sisiA + sisiB + sisiC;
        System.out.println("Keliling: "+keliling);
        return keliling;
    }
    public double keliling(int sisiA, int sisiB){
        double keliling = Math.sqrt(Math.pow(sisiA,2) + Math.pow(sisiB,2));
        System.out.println("Keliling: "+keliling);
        return keliling;
    }
    
    public static void main(String[] args) {
        Overloading hitung = new Overloading();
        
        hitung.totalSudut(45);
        hitung.totalSudut(25, 45);
        hitung.keliling(12, 15, 16);
        hitung.keliling(11, 15);
    }
}
