/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author Windows 8.1
 */
public class BarangMain {
    public static void main(String[] args) {
        Barang br1 = new Barang();
        Barang br2 = new Barang();
        
        br1.kode ="1A";
        br1.namaBarang = "pensil";
        br1.hargaDasar = 3000;
        br1.diskon = 50;
        br1.hitungHargaJual();
        br1.tampilData();
        
        br2.kode ="6C";
        br2.namaBarang = "Buku Gambar";
        br2.hargaDasar = 15000;
        br2.diskon = 20;
        br2.hitungHargaJual();
        br2.tampilData();
    }
}
