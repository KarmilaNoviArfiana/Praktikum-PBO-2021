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
public class TugasMain {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("2789","Ayu","Malang");
        dosen.setSks(32);
        dosen.setTarifSks(25000);
        
        Pegawai pegawai = new Pegawai("8975", "Joko", "Malang");
        
        DaftarGaji daftarGaji = new DaftarGaji(2);
        daftarGaji.addPegawai(dosen);
        daftarGaji.addPegawai(pegawai);
        daftarGaji.printSemuaGaji();
        dosen.getGaji();
        pegawai.getGaji(300000);
    }
}
    
