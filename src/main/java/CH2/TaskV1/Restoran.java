package CH2.TaskV1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Restoran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        Map<String, Integer> order = new HashMap<>();
        int totalQty = 0;

        System.out.println("==========================");
        System.out.println("Selamat datang di BinarFud");
        System.out.println("==========================");
        do {
            pilihan = -1;
            int count = 1;
            for (Map.Entry<String, Integer> entry : Menu.getMenu().entrySet()) {
                System.out.println(count + ". " + entry.getKey() + "\t| " + entry.getValue());
                count++;
            }
            System.out.println("99. Pesan dan Bayar");
            System.out.println("0. Keluar aplikasi");
            System.out.print("\n=> ");

            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine();
            } else {
                if (scanner.hasNext()) {
                    String notIntValue = scanner.next();
                    System.out.println("Input is not an Integer: " + notIntValue);
                } else {
                    System.out.println("No More Input");
                }
                scanner.nextLine();
                continue;
            }

            if (pilihan >= 1 && pilihan <= Menu.getMenu().size()) {
                String pilihItem = (String) Menu.getMenu().keySet().toArray()[pilihan - 1];
                int harga = Menu.getMenu().get(pilihItem);
                order.put(pilihItem, harga);
                System.out.println("\n=================");
                System.out.println("Berapa pesanan anda");
                System.out.println("=================\n");
                System.out.println(pilihItem + "\t| " + harga);
                System.out.println("(input 0 untuk kembali)");
                System.out.print("\nQty=> ");

                try {
                    int qty = Integer.parseInt(scanner.next());
                    if (qty < 1) {
                        System.out.println("=========================");
                        System.out.println("Minimal 1 jumlah pesanan!");
                        System.out.println("=========================\n");
                        System.out.println("=================================");
                        System.out.println("Mohon masukkan input pilihan anda");
                        System.out.println("=================================");
                        System.out.println("(y) untuk lanjut");
                        System.out.println("(n) untuk keluar");
                        System.out.print("=> ");
                        String choice = scanner.next().toLowerCase();

                        if (choice.equals("n")) {
                            System.exit(0);
                        } else if (!choice.equals("y")) {
                            continue;
                        }
                    }
                    if (qty == 0) {
                        order.remove(pilihItem);
                    } else {
                        totalQty += qty;
                        order.put(pilihItem, harga * qty);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid");
                }
            } else if (pilihan == 99) {
                Konfirmasi.confirmOrder(order, totalQty);
                order.clear();
                totalQty = 0;
            }
        } while (pilihan != 0);
        System.exit(0);
    }
}
