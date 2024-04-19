package CH1.Pertemuan3and4;

import java.util.Date;

public class ForEx {
    public static void main(String[] args) {
        for (int i = 0; i<=5; i++){
            System.out.println("Ini adalah looping");
            System.out.println("Cetak angka = " +i);
        }
        System.out.println("=================");
        whileLoop();
    }
    public static void whileLoop(){
        int num1 = 0;
        int num2 = 23;
        while (num1 <= num2){
            System.out.println("print" + new Date());
            num1++;
        }
    }
}
