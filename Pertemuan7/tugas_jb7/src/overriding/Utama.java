/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author Windows 8.1
 */
public class Utama {
    public static void main(String[] args) {
        Manusia a = new Manusia();
        Dosen b = new Dosen();
        Mahasiswa c = new Mahasiswa();
        
        a.Bernafas();
        a.Makan();
        b.Makan();
        b.Lembur();
        c.Makan();
        c.Tidur();
    }
}
