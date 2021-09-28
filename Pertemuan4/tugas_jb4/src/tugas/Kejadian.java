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
public class Kejadian {
    private String bulan;
    private String kejadian;
    private Doraemon doraemon;

    public Kejadian(String bulan) {
        this.bulan = bulan;
    }

    public String getbulan() {
        return bulan;
    }

    public void setKode(String bulan) {
        this.bulan = bulan;
    }

    public String getKejadian() {
        return kejadian;
    }

    public void setKejadian(String kejadian) {
        this.kejadian = kejadian;
    }

    public Doraemon getDoraemon() {
        return doraemon;
    }

    void Doraemon(Doraemon doraemon) {
        this.doraemon = doraemon;
    }
    
    public String info() {
        String info = "";
        info += "Bulan: " + bulan + "\n";
        if (this.doraemon != null) {
            info += "" + doraemon.info() + "\n";
        }
        return info;
    }

    
}
