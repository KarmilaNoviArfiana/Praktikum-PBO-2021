/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author Windows 8.1
 */
import backend.*;

public class TestBackendPeminjaman {

    public static void main(String[] args) {
        // TODO code application logic here
        Anggota Kynanti = new Anggota().getById(1);
        Anggota Devo = new Anggota().getById(2);
        Anggota Mila = new Anggota().getById(3);
        Buku psikologi = new Buku().getById(8);
        Buku rasi = new Buku().getById(9);
        Buku sains = new Buku().getById(10);
        Peminjaman pinjam1 = new Peminjaman(Kynanti, psikologi, "2020-11-27", "2020-11-30");
        Peminjaman pinjam2 = new Peminjaman(Devo, rasi, "2020-11-25", "2020-11-28");
        Peminjaman pinjam3 = new Peminjaman(Mila, sains, "2020-11-26", "2020-11-29");
        //test insert
        pinjam1.save();
        pinjam2.save();
        pinjam3.save();
        //test update
        pinjam2.setTanggalkembali("2020-12-01");
        pinjam1.save();
        //test delete
        pinjam3.delete();
        //test select all
        for (Peminjaman p : new Peminjaman().getAll()) {
            System.out.println("Nama: " + p.getAnggota().getNama() + ", Judul: "
                    + p.getBuku().getJudul()
                    + ", Tanggal Peminjaman: " + p.getTanggalpinjam() + ", Tanggal Kembali: "
                    + p.getTanggalkembali());
        }
        //test search
        for (Peminjaman p : new Peminjaman().search("25")) {
            System.out.println("Nama: " + p.getAnggota().getNama() + ", Judul: "
                    + p.getBuku().getJudul()
                    + ", Tanggal Peminjaman: " + p.getTanggalpinjam() + ", Tanggal Kembali: "
                    + p.getTanggalkembali());
        }
    }
}
