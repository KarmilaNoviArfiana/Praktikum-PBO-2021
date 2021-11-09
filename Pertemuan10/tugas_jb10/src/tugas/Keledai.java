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
public class Keledai extends Binatang implements IHerbivora{
    private String suara;
    private String warnaBulu;

    public Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    
    @Override
    public void displayBinatang() {
        System.out.println("Keledai Adalah Hewan Herbivora dan Hewan Mamalia");
    }

    @Override
    public void displayMakanan() {
        System.out.println("Hewan ini memakan Sayuran dan Buah");   
    }
    
    public void displayData(){
        System.out.println("Nama Hewan Ini Adalah "+super.nama);
        System.out.println(super.nama+" Memiliki Jumlah Kaki "+super.jmlKaki);
        System.out.println(super.nama+" Memiliki Suara "+suara);
         System.out.println(super.nama+" Memiliki Warna Bulu "+warnaBulu);
        System.out.println();
    }
}
