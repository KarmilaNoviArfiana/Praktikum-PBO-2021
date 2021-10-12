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
public class DaftarGaji {
    public Pegawai listPegawai[];
    public int jumlah;

    public DaftarGaji(int jumlah) {
        listPegawai = new Pegawai[jumlah];
    }
    
    public void addPegawai(Pegawai Pegawai) {
        listPegawai[jumlah] = Pegawai;
        jumlah++;
    }
    
    public void printSemuaGaji() {
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nama   : "+listPegawai[i].getNama());
            System.out.println("NIP    : " + listPegawai[i].nip);
            System.out.println("Alamat : " + listPegawai[i].alamat);
            System.out.println("---------------------");
        }
    }
}
