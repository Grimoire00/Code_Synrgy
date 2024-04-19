package com.binar.batch7.CH3_Task;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Konfirmasi {
    public static void confirmAndPay(Map<String, Integer> order) {
        int totalQty = 0;
        int total = 0;

        try {
            FileWriter writer = new FileWriter("struk.txt");
            writer.write("==================\n");
            writer.write("BinarFud\n");
            writer.write("==================\n");
            writer.write("Terimkasih sudah memesan di BinarFud\n\n");
            writer.write("Dibawah ini adalah pesanan anda\n\n");
            for (Map.Entry<String, Integer> entry : order.entrySet()) {
                writer.write(entry.getKey() + "\t" + entry.getValue() + "\t" + entry.getValue() * Menu.getMenu().get(entry.getKey()) + "\n");
                totalQty += entry.getValue();
                total += entry.getValue() * Menu.getMenu().get(entry.getKey());
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

        System.out.println("Pesanan telah dikonfirmasi dan struk telah dicetak.");
        System.exit(0);
    }
}

