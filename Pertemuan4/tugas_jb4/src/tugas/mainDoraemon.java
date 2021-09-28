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
public class mainDoraemon {
    public static void main(String[] args) {
        
        Teman teman = new Teman("Nobita", "Bermain","12");
        Doraemon d = new Doraemon("Doraemon", "baling", teman);
        Tahun t = new Tahun("2021","kebakaran", 12);
        t.setDoraemon(d, 1);
        System.out.println(t.info());
        
        
    }
}
 