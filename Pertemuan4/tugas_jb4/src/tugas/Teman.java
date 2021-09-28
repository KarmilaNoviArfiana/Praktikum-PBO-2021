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
public class Teman {
    private String nama;
    private String hobi;
    private String usia;

    public Teman(String nama, String hobi, String usia) {
        this.nama = nama;
        this.hobi = hobi;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getUsia() {
        return usia;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }
    
    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Hobi: " + this.hobi + "\n";
        info += "Usia: " + this.usia + "\n";
        return info;
    }
}
