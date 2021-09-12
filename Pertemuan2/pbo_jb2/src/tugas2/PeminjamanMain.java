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
public class PeminjamanMain {
    public static void main(String[] args) {
        Peminjaman pnjm1 = new Peminjaman();
        Peminjaman pnjm2 = new Peminjaman();
        Peminjaman pnjm3 = new Peminjaman();
        
        pnjm1.id ="A1";
        pnjm1.namaMember = "Karmila";
        pnjm1.namaGame = "The Sims";
        pnjm1.harga = 15000;
        pnjm1.tampilBarang();
        
        pnjm2.id ="A2";
        pnjm2.namaMember = "Novi";
        pnjm2.namaGame = "Kanon";
        pnjm2.harga = 10000;
        pnjm2.tampilBarang();
        
        pnjm3.id ="A3";
        pnjm3.namaMember = "Arfiana";
        pnjm3.namaGame = "Harvest Moon";
        pnjm3.harga = 20000;
        pnjm3.tampilBarang();
    }
}
