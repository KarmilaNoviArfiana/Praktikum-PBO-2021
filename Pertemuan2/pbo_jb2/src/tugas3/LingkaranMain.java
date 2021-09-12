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
public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran lk1 = new Lingkaran();
        
        System.out.println("Luas Lingkaran: "+lk1.hitungLuas(11, 3.14));
        System.out.println("Keliling Lingkaran: "+lk1.hitungKeliling(14, 3.14));
    }
}
