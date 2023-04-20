/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalprojectuts;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Pak Pin
 */
public class FinalProjectUTS {

    static void waktu() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }

    public static void main(String[] args) {

        login[] loginarray = {
            new login("dupelbangah", "123456"),
            new login("duniapelajar", "1997"),
            new login("tokobuku", "palinglengkap")
        };

        barang[] daftarBarang = {
            new barang("Penggaris    ", 5000, 50),
            new barang("Buku Tulis   ", 10000, 50),
            new barang("Bolpoin      ", 2500, 100),
            new barang("Pensil Warna ", 20000, 50),
            new barang("Buku Gambar  ", 5000, 50),
            new barang("Gunting      ", 6000, 100),};
        Scanner scanner = new Scanner(System.in);
        boolean masuk = false;

        //Login
        while (!masuk) {
            System.out.println("================================================= ");
            System.out.println(" $$ Selamat Datang di Admin Toko Dunia Pelajar $$ ");
            System.out.println("================================================= \n");
            System.out.println("Silahkan Masukkan Username dan Password");
            System.out.print("Masukkan Username : ");
            String user = scanner.nextLine();
            System.out.print("Masukkan Password : ");
            String pass = scanner.nextLine();

            for (login log : loginarray) {
                if (log.getUsername().equals(user) && log.getPassword().equals(pass)) {
                    masuk = true;
                }

            }
            System.out.println("Anda Berhasil Login.\n");
            if (!masuk) {
                System.out.println("Username atau Password yang anda masukkan salah.");

                break;
            }

            //Menu
            while (masuk == true) {
                System.out.println("============");
                System.out.println("=== Menu ===");
                System.out.println("============");
                System.out.println("1. Lihat Daftar Barang");
                System.out.println("2. Tambahkan Barang");
                System.out.println("3. Hapus Barang");
                System.out.println("4. Keluar");
                System.out.print("Pilih Menu : ");
                int pilih = scanner.nextInt();
                System.out.println("");
                scanner.nextLine();

                switch (pilih) {
                    case 1:
                        System.out.println("=============");
                        System.out.println("Daftar Barang");
                        System.out.println("=============");
                        System.out.println("Nama Barang" + "\tHarga" + "\tStok");
                        System.out.println("");
                        for (barang barang : daftarBarang) {
                            System.out.println(barang.getNama() + "\t" + barang.getHarga() + "\t" + barang.getStok());
                        }
                        break;

                    case 2:
                        System.out.println("=============");
                        System.out.println("Tambah Barang");
                        System.out.println("=============");

                        System.out.print("Masukkan Nama Barang : ");
                        String namaBaru = scanner.nextLine();

                        System.out.print("Msukkan Harga Barang : ");
                        int hargaBaru = scanner.nextInt();

                        System.out.print("Masukkan Stok Barang : ");
                        int stokBaru = scanner.nextInt();

                        barang[] newbarangarray = new barang[daftarBarang.length + 1];
                        for (int i = 0; i < daftarBarang.length; i++) {
                            newbarangarray[i] = daftarBarang[i];
                        }
                        newbarangarray[daftarBarang.length] = new barang(namaBaru, hargaBaru, stokBaru);
                        daftarBarang = newbarangarray;

                        System.out.println("Barang Berhasil ditambahkan");
                        break;

                    case 3:
                        System.out.println("=============");
                        System.out.println("Hapus Barang");
                        System.out.println("=============");

                        System.out.print("Masukkan Nama Barang yang ingin dihapus : ");
                        String itemToRemove = scanner.nextLine();

                        boolean found = false;
                        for (int i = 0; i < daftarBarang.length; i++) {
                            if (daftarBarang[i].getNama().equals(itemToRemove)) {

                                found = true;

                                for (int j = i; j < daftarBarang.length - 1; j++) {
                                    daftarBarang[j] = daftarBarang[j + 1];
                                }

                                barang[] newBarangArray = new barang[daftarBarang.length - 1];
                                for (int j = 0; j < newBarangArray.length; j++) {
                                    newBarangArray[j] = daftarBarang[j];
                                }
                                daftarBarang = newBarangArray;

                                System.out.println("Barang berhasil dihapus");
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Barang tidak ditemukan");
                        }
                        break;

                    case 4:
                        masuk = false;
                        System.out.println("========================");
                        System.out.println("Anda Keluar dari Program");
                        System.out.println("========================");
                        waktu();
                        break;
                }
            }
            masuk = false;
            break;
        }
    }
}
