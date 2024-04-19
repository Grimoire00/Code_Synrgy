package CH1.Pertemuan2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RestoranRidho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Food Menu");
        System.out.println("1. Fried Rice - Rp. 15.000");
        System.out.println("2. Fried Noodle - Rp. 20.000");
        System.out.println("3. Fried Chicken - Rp. 25.000");
        System.out.print("Choose food number: ");
        try {
            var choose = input.nextInt();
            System.out.print("Qty => ");
            var qty = input.nextInt();
            switch (choose) {
                case 1:
                    displayMenu("Fried Rice", 15000, qty);
                    break;
                case 2:
                    displayMenu("Fried Noodle", 20000, qty);
                    break;
                case 3:
                    displayMenu("Fried Chicken", 25000, qty);
                    break;
                default:
                    System.out.println("Order not available!");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Input only number! please input right number!");
        }
    }

    public static void displayMenu(String name, Integer price, Integer qty) {
        System.out.println("Food name: " + name);
        System.out.println("Food price: Rp. " + price);
        System.out.println("Total order: Rp. " + (double) (price * qty));
    }
}


