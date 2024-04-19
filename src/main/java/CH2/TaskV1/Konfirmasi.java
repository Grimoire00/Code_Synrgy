package CH2.TaskV1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Konfirmasi {
    public static void confirmOrder(Map<String, Integer> order, int totalQty) {
        int total = 0;

        System.out.println("========================");
        System.out.println("Konfirmasi & Pembayaran");
        System.out.println("========================\n");
        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + (entry.getValue() / Menu.getMenu().get(entry.getKey())) + "\t" + entry.getValue());
            total += entry.getValue();
        }

        System.out.println("---------------------------+");
        System.out.println("Total\t\t\t" + totalQty + "\t" + total);
        System.out.println("1. Konfirmasi dan Bayar");
        System.out.println("2. Kembali ke menu utama");
        System.out.println("0. Keluar Aplikasi");
        System.out.print("\n=> ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                try {
                    FileWriter writer = new FileWriter("struk.txt");
                    writer.write("==================\n");
                    writer.write("BinarFud\n");
                    writer.write("==================\n");
                    writer.write("Terimkasih sudah memesan di BinarFud\n\n");
                    writer.write("Dibawah ini adalah pesanan anda\n\n");
                    for (Map.Entry<String, Integer> entry : order.entrySet()) {
                        writer.write(entry.getKey() + "\t" + (entry.getValue() / Menu.getMenu().get(entry.getKey())) + "\t" + entry.getValue() + "\n");
                    }
                    writer.write("-----------------------+\n");
                    writer.write("Total\t\t" + totalQty + "\t" + total + "\n");
                    writer.write("\nPembayaran : BinarCash\n\n");
                    writer.write("==========================\n");
                    writer.write("Simpan struk ini sebagai\nbukti pembayaran\n");
                    writer.write("==========================\n");
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.exit(0);
                break;
            case 2:
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("input tidak valid");
        }
    }
}
