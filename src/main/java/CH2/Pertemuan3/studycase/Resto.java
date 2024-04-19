package CH2.Pertemuan3.studycase;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Resto {

    private static final Map<String, Integer> menu = new LinkedHashMap<>();
    static {
        menu.put("Nasi Goreng", 15000);
        menu.put("Mie Goreng", 13000);
        menu.put("Nasi + Ayam", 18000);
        menu.put("Es Teh Manis", 3000);
        menu.put("Es Jeruk", 5000);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        Map<String, Integer> order = new HashMap<>();

        System.out.println("==========================");
        System.out.println("Selamat datang di BinarFud");
        System.out.println("==========================");
        do {
            pilihan = -1;
            System.out.println("=> ");
            int count = 1;
            for (Map.Entry<String, Integer> entry : menu.entrySet()){
                System.out.println(count + ". " + entry.getKey() + "\t| " +entry.getValue());
                count++;
            }
            System.out.println("99. Lihat Pesanan");
            System.out.println("0. Keluar aplikasi");
            System.out.print("\n=> ");

            if(scanner.hasNextInt()){
                pilihan = scanner.nextInt();
                scanner.nextLine();
            }
            else {
                System.out.println("Input tidak valid");
                if (scanner.hasNext()){
                    String notIntValue = scanner.next();
                    System.out.println("Input is not an Integer: " +notIntValue);

                }else {
                    System.out.println("No More Input");
                }
                scanner.nextLine();
            }

            if (pilihan >= 1 && pilihan <= menu.size()){
                String pilihItem = (String) menu.keySet().toArray()[pilihan - 1];
                int harga = menu.get(pilihItem);
                addOrder(pilihItem, harga, scanner, order);
            } else if (pilihan == 99){
                viewOrder(order);
                manageOrder(order, scanner);
            }
        } while (pilihan != 0);
        System.exit(0);
    }

    private static void addOrder(String itemName, int price, Scanner scanner, Map<String, Integer> order) {
        System.out.println("\n=================");
        System.out.println("Berapa pesanan anda");
        System.out.println("=================\n");
        System.out.println(itemName + "\t| " + price);
        System.out.println("(input 0 untuk kembali)");
        System.out.print("\nQty=> ");

        try {
            int qty = Integer.parseInt(scanner.next());
            if(qty > 0){
                order.put(itemName, qty);
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
            System.out.println("Pesanan:");
            int totalQty = 0;
            int total = 0;
            for (Map.Entry<String, Integer> entry : order.entrySet()) {
                System.out.println(entry.getKey() + "\t| Qty: " + entry.getValue() + "\t| Total: " + entry.getValue() * menu.get(entry.getKey()));
                totalQty += entry.getValue();
                total += entry.getValue() * menu.get(entry.getKey());
            }
            System.out.println("Total Qty: " + totalQty);
            System.out.println("Total Harga: " + total);
        }
    }

    private static void manageOrder(Map<String, Integer> order, Scanner scanner) {
        System.out.println("1. Konfirmasi dan Bayar");
        System.out.println("2. Update Pesanan");
        System.out.println("3. Hapus Pesanan");
        System.out.println("4. Kembali ke menu utama");
        System.out.print("\nPilih tindakan=> ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            case 1:
                confirmAndPay(order);
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
            int price = menu.get(itemName);
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

    private static void confirmAndPay(Map<String, Integer> order) {
        int totalQty = 0;
        int total = 0;

        try {
            FileWriter writer = new FileWriter("struk.txt");
            writer.write("==================\n");
            writer.write("BinarFud\n");
            writer.write("==================\n");
            writer.write("Terimkasih sudah memesan di BinarFud\n\n");
            writer.write("Dibawah ini adalah pesanan anda\n\n");
            for (Map.Entry<String, Integer> entry : order.entrySet()){
                writer.write(entry.getKey() + "\t" + entry.getValue() + "\t" + entry.getValue() * menu.get(entry.getKey()) + "\n");
                totalQty += entry.getValue();
                total += entry.getValue() * menu.get(entry.getKey());
            }
            writer.write("-----------------------+\n");
            writer.write("Total\t\t"+ totalQty +"\t"+ total + "\n");
            writer.write("\nPembayaran : BinarCash\n\n");
            writer.write("==========================\n");
            writer.write("Simpan struk ini sebagai\nbukti pembayaran\n");
            writer.write("==========================\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Pesanan telah dikonfirmasi dan struk telah dicetak.");
    }
}