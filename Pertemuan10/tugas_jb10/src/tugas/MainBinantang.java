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
public class MainBinantang {
    public static void main(String[] args) {
        Singa sg = new Singa("Lion", 4, "Hraww", "orange");
        Keledai kl = new Keledai("Maxi", 4, "iiiiiii", "coklat");
        Gorila gr = new Gorila("Yaya", 2, "Hwaaaaa", "Hitam");
        
        sg.displayBinatang();
        sg.displayMakanan();
        sg.displayData();
        
        kl.displayBinatang();
        kl.displayMakanan();
        kl.displayData();
        
        gr.displayBinatang();
        gr.displayMakanan();
        gr.displayData();
    }
}
