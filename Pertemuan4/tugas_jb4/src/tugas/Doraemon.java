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
public class Doraemon {
    private String nama;
    private String alatAjaib;
    private Teman teman;
    private Kejadian kejadian;

    public Doraemon(String nama, String alatAjaib, Teman teman) {
        this.nama = nama;
        this.alatAjaib = alatAjaib;
        this.teman = teman;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlatAjaib() {
        return alatAjaib;
    }

    public void setAlatAjaib(String alatAjaib) {
        this.alatAjaib = alatAjaib;
    }

    public Teman getTeman() {
        return teman;
    }

    public void setTeman(Teman teman) {
        this.teman = teman;
    }

    public Kejadian getKejadian() {
        return kejadian;
    }

    public void setKejadian(Kejadian kejadian) {
        this.kejadian = kejadian;
    }
    
    
    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Alat Ajaib: " + this.alatAjaib + "\n";
        info += "Teman: " + this.teman.info() + "\n";
        return info;
    }
}
