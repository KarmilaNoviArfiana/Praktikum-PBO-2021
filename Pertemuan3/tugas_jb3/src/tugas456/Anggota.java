/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas456;

/**
 *
 * @author Windows 8.1
 */
public class Anggota {
    private int noKTP;
    private String nama;
    private int limitPjm;
    private int jmlPjm;

    public Anggota(int noKTP, String nama, int limitPjm) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPjm = limitPjm;
        this.jmlPjm = 0;
    }

    public int getNoKTP() {
        return noKTP;
    }

    public void setNoKTP(int noKTP) {
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLimitPjm() {
        return limitPjm;
    }

    public int getJmlPjm() {
        return jmlPjm;
    }
    
    public void pinjam(int pjm){
        if(pjm > limitPjm){
            System.out.println("Maaf Jumlah Pinjaman Melebihi Limit!");
        }
        else{
            jmlPjm += pjm;
        }
    }
    
    public void angsur(int bayar){
        if(bayar < (0.1 * jmlPjm)){
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
        else{
            jmlPjm -= bayar;
        }
    }
}