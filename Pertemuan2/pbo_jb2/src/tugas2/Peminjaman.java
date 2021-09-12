/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author Windows 8.1
 */
public class Peminjaman {
    public String id;
    public String namaMember;
    public String namaGame;
    public int harga;
    
    public void tampilBarang(){
        System.out.println("id :"+id);
        System.out.println("Nama Member :"+namaMember);
        System.out.println("Nama Game Yang Dipinjam :"+namaGame);
        System.out.println("Total Harga :"+harga);
    }
        
}
