/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Windows 8.1
 */
public class Dosen extends Pegawai{
    public int jumlahSks;
    public int tarifSks;

    public Dosen(String nip, String nama, String alamat) {
       super(nip, nama, alamat);
    }

    public void setSks(int jumlahSks) {
        this.jumlahSks = jumlahSks;
    }

    public void setTarifSks(int tarifSks) {
        this.tarifSks = tarifSks;
    }
   
    public int getGaji(){
        int gaji = jumlahSks * tarifSks;
        System.out.println("Gaji Dosen : "+gaji);
        return gaji;
    }
}
