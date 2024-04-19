package CH1.Pertemuan5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LatihanKelas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList kontak = new ArrayList();
        boolean isTambahLagi = false;
        do{
            System.out.println("== Aplikasi Buku Telepon ==");
            System.out.println("1. Tambah Kontak");
            System.out.println("2. Cetak Buku Telepon");
            System.out.println("3. Tampilkan Riwayat Buku Telepon");
            System.out.println("4. Cetak Ke CSV");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Masukkan Nama : ");
                    String nama = scanner.next();
                    System.out.print("Masukkan Nomor Telepon : ");
                    String nomorTelepon = scanner.next();
                    kontak.add(nama + "," + nomorTelepon);
                    isTambahLagi = true;
                    break;
                case 2:
                    System.out.println("Cetak Buku Telepon");
                    isTambahLagi = true;
                    break;
                case 3:
                    System.out.println("Tampilkan Riwayat Buku Telepon");
                    isTambahLagi = true;
                    break;
                case 4:
                    String filePath = "phonebook.csv";
                    try  {
                        File file = new File(filePath);
                        FileWriter fileWriter = new FileWriter(file);
                        BufferedWriter writer = new BufferedWriter(fileWriter);
                        writer.write("Nama, Nomor Telepon\n");
                        for (int i = 0; i < kontak.size(); i++) {
                            writer.write(kontak.get(i) + "\n");
                        }
                        writer.close();
                        System.out.println("Phonebook berhasil di cetak.");
                        isTambahLagi = false;
                    } catch (IOException e) {
                        System.err.println("Terjadi kesalahan saat menulis ke file: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Keluar");
                    isTambahLagi = false;
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    isTambahLagi = true;
            }
        } while (isTambahLagi);
    }
}
