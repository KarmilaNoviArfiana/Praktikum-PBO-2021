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
public class Tahun {
    private String tahun;
    private Kejadian bulan[];
    private String kejadian;

    public Tahun(String tahun,String kejadian, int jumlah) {
        this.tahun = tahun;
        this.kejadian = kejadian;
        this.bulan = new Kejadian[jumlah];
        this.initKejadian();
    }

    private void initKejadian() {
        for (int i = 0; i < bulan.length; i++) {
            this.bulan[i] = new Kejadian(String.valueOf(i + 1));
        }
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }
    
    public void setDoraemon(Doraemon doraemon, int bulan) {
        this.bulan[bulan - 1].Doraemon(doraemon);
    }
    
    public Kejadian[] tanggal() {
        return bulan;
    }
     
    public String info() {
        String info = "";
        info += "Tahun : " + tahun + "\n";
        info += "Kejadian : " + kejadian + "\n";
        for (Kejadian kejadian : bulan) {
            info += kejadian.info();
        }
        return info;
    }
     
}
