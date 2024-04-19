package CH1.Pertemuan2;

import java.util.Scanner;

public class TugasPertemuan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihMakanan, qty;
        String namaMakanan = null;
        double harga = 0, pajak = 0.1, diskon = 0;

        System.out.println("======= RESTORANKU =======");
        System.out.println("1. Ayam    ======  12.000");
        System.out.println("2. Gurami  ======  10.000");
        System.out.println("3. Bebek   ======  14.000");
        System.out.println("note. Setiap Pembelian akan dikenakan pajak 10%");
        System.out.println("========================");
        System.out.print("Pilih Menu : ");
        pilihMakanan = scanner.nextInt();
        System.out.print("Pilih Qty : ");
        qty = scanner.nextInt();

        switch (pilihMakanan){
            case 1:
                namaMakanan = "Ayam";
                diskon = 12000 * qty;
                break;
            case 2:
                namaMakanan = "Gurami";
                diskon = 10000 * qty;
                break;
            case 3:
                namaMakanan = "Bebek";
                diskon = 14000 * qty;
                break;
        }

        System.out.println("");
        System.out.println("Pesanan Anda " + namaMakanan + " Qty " + qty);
        System.out.println("Total Harga : " + harga);
    }
}
