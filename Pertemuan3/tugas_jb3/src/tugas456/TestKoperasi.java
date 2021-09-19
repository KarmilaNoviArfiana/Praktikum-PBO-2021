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
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int pinjam,bayar;
        
        Anggota donny = new Anggota(111333444, "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPjm());
        
        //System.out.println("\nMeminjam uang 10.000.000...");
        System.out.print("pinjam : ");
        pinjam = input.nextInt();
        donny.pinjam(pinjam);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJmlPjm());
        
        //System.out.println("\nMeminjam uang 4.000.000...");
        System.out.print("pinjam : ");
        pinjam = input.nextInt();
        donny.pinjam(pinjam);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJmlPjm());
        
        //System.out.println("\nMembayar angsuran 300.000");
        System.out.print("Angsur : ");
        bayar = input.nextInt();
        donny.angsur(bayar);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJmlPjm());
        
        //System.out.println("\nMembayar angsuran 3.000.000");
        System.out.print("Angsur : ");
        bayar = input.nextInt();
        donny.angsur(bayar);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJmlPjm());

    }

}
