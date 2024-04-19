package com.binar.batch7.CH3_Task;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Restoran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;
        Map<String, Integer> order = new HashMap<>();

        System.out.println("==========================");
        System.out.println("Selamat datang di BinarFud");
        System.out.println("==========================");

        List<ListMenu> menuList = Arrays.asList(
                new ListMenu("Nasi Goreng", 15000),
                new ListMenu("Mie Goreng", 13000),
                new ListMenu("Nasi + Ayam", 18000),
                new ListMenu("Es Teh Manis", 3000),
                new ListMenu("Es Jeruk", 5000)
        );

        do {
            Optional<Map<String, Integer>> menuMap = Optional.of(menuList.stream()
                    .collect(Collectors.toMap(ListMenu::getName, ListMenu::getPrice)));
            if (menuMap.isPresent()){
                menuMap.get().forEach((name, price)-> System.out.println(name + "\t\t | \t\t" + price));
            }
//            pilihan = -1;
//            int count = 1;
//            for (Map.Entry<String, Integer> entry : Menu.getMenu().entrySet()) {
//                System.out.println(count + ". " + entry.getKey() + "\t| " + entry.getValue());
//                count++;
//            }
            System.out.println("99. Lihat Pesanan");
            System.out.println("0. Keluar aplikasi");
            System.out.print("\n=> ");

            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Input tidak valid");
                if (scanner.hasNext()) {
                    String notIntValue = scanner.next();
                    System.out.println("Input is not an Integer: " + notIntValue);
                } else {
                    System.out.println("No More Input");
                }
                scanner.nextLine();
            }

            if (pilihan >= 1 && pilihan <= Menu.getMenu().size()) {
                String pilihItem = (String) Menu.getMenu().keySet().toArray()[pilihan - 1];
                int harga = Menu.getMenu().get(pilihItem);
                addOrder(pilihItem, harga, scanner, order);
            } else if (pilihan == 99) {
                viewOrder(order);
                manageOrder(order, scanner);
            }
        } while (pilihan != 0);
        System.exit(0);
    }

    static void addOrder(String itemName, int price, Scanner scanner, Map<String, Integer> order) {
        System.out.println("\n=================");
        System.out.println("Berapa pesanan anda");
        System.out.println("=================\n");
        System.out.println(itemName + "\t| " + price);
        System.out.println("(input 0 untuk kembali)");
        System.out.print("\nQty=> ");

        try {
            int qty = Integer.parseInt(scanner.next());
            if (qty > 0) {
                order.put(itemName, qty);
            } else if (qty == 0) {
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
                    return; // Menggunakan return untuk keluar dari metode addOrder
                }
            } else {
                System.out.println("Pesanan tidak ditambahkan.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid");
        }
    }


    private static void viewOrder(Map<String, Integer> order) {
        if (order.isEmpty()) {
            System.out.println("Tidak ada pesanan.");
        } else {
            System.out.println("\nPesanan:");
            AtomicInteger totalQty = new AtomicInteger();
            AtomicInteger total = new AtomicInteger();
            order.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(entry -> {
                        int subtotal = entry.getValue() * entry.getValue();
                        System.out.println(entry.getKey() + "\t| Qty: " + entry.getValue() + "\t| Total: " + subtotal);
                        totalQty.addAndGet(entry.getValue());
                        total.addAndGet(subtotal);
                    });

            System.out.println("Total Qty: " + totalQty);
            System.out.println("Total Harga: " + total);
        }
    }

    private static void manageOrder(Map<String, Integer> order, Scanner scanner) {
        System.out.println("\n1. Konfirmasi dan Bayar");
        System.out.println("2. Update Pesanan");
        System.out.println("3. Hapus Pesanan");
        System.out.println("4. Kembali ke menu utama");
        System.out.print("\n=> ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                Konfirmasi.confirmAndPay(order);
                break;
            case 2:
                updateOrder(order, scanner);
                break;
            case 3:
                deleteOrder(order, scanner);
                break;
            case 4:
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    private static void updateOrder(Map<String, Integer> order, Scanner scanner) {
        System.out.print("Masukkan nama makanan yang akan diupdate: ");
        String itemName = scanner.nextLine();
        if (order.containsKey(itemName)) {
            int price = Menu.getMenu().get(itemName);
            addOrder(itemName, price, scanner, order);
        } else {
            System.out.println("Pesanan tidak ditemukan.");
        }
    }

    private static void deleteOrder(Map<String, Integer> order, Scanner scanner) {
        System.out.print("Masukkan nama makanan yang akan dihapus: ");
        String itemName = scanner.nextLine();
        if (order.containsKey(itemName)) {
            order.remove(itemName);
            System.out.println("Pesanan berhasil dihapus.");
        } else {
            System.out.println("Pesanan tidak ditemukan.");
        }
    }
}