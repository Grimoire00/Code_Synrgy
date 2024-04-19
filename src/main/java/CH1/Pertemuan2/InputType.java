package CH1.Pertemuan2;

import java.util.Scanner;

public class InputType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter an Integer: ");
        int number = input.nextInt();
        System.out.println("You Entered " + number);

        input.close();
    }
}
