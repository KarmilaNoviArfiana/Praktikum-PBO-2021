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
public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public int diskon;
    public int hargaJual;
    
    public int hitungHargaJual(){
        hargaJual = hargaDasar - (hargaDasar*diskon/100);
        return hargaJual;
    }
    
    public void tampilData(){
        System.out.println("Kode Barang: "+kode);
        System.out.println("Nama Barang: "+namaBarang);
        System.out.println("Harga Dasar: "+hargaDasar);
        System.out.println("Diskon : "+diskon+"%");
        System.out.println("Total Harga Jual: "+hargaJual);
    }
}
