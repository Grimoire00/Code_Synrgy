package CH2.Pertemuan1.StudiCase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        boolean inginPesanLagi = true;
        double totalHarga = 0;


        System.out.println("Selamat datang di Restoran Team C!");

        do {
            System.out.println("\nMenu Makanan:");
            System.out.println("1. Nasi Goreng  | Rp. 15.000 ");
            System.out.println("2. Mie Goreng   | Rp. 10.000 ");
            System.out.println("3. Ayam Goreng  | Rp. 20.000 ");
            System.out.print("Pilih Menu : ");
            int pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    menu.setMenu("Nasi Goreng");
                    menu.setHarga(15000);
                    break;
                case 2:
                    menu.setMenu("Mie Goreng");
                    menu.setHarga(10000);
                    break;
                case 3:
                    menu.setMenu("Ayam Goreng");
                    menu.setHarga(20000);
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    continue;
            }

            System.out.print("Jumlah pesanan " + menu.getMenu() + ": ");
            int qty = input.nextInt();

            totalHarga += menu.getHarga() * qty;

            System.out.print("Apakah Anda ingin memesan lagi? (ya/tidak): ");
            String pesanLagi = input.next();
            if (!pesanLagi.equalsIgnoreCase("ya")) {
                inginPesanLagi = false;
            }
        } while (inginPesanLagi);
        try  {
            String filePath = "struk.txt";
            File file = new File(filePath);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write("=========================================\n");
            writer.write("BinarFud\n");
            writer.write("=========================================\n\n");
            writer.write("Terima kasih sudah memesan di BinarFud\n\n");
            writer.write("Dibawah ini adalah pesanan anda\n\n");
            writer.write("Total Harga  : " + totalHarga + "\n");
            writer.write("\nPembayaran : BinarCash\n\n");
            writer.write("=========================================\n");
            writer.write("Simpan struk ini sebagai bukti pembayaran\n");
            writer.write("=========================================\n\n");
            writer.flush();
            writer.close();
            System.out.println("Struk berhasil di cetak.");
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat menulis ke file: " + e.getMessage());
        }
        System.out.println("Terima kasih telah memesan!");
        System.out.println("Total belanja Anda adalah: Rp. " + totalHarga);
        input.close();
    }
}