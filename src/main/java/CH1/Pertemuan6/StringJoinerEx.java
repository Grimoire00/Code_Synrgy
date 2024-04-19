package CH1.Pertemuan6;

import java.util.StringJoiner;

public class StringJoinerEx {

    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(";");
        sj.add("Apple");
        sj.add("Banana");
        sj.add("Orange");

        StringJoiner sj2 = new StringJoiner(",", "[", "]");
        sj2.add("Apple");
        sj2.add("Banana");
        sj2.add("Orange");

        String fruit = sj.toString();
        String fruit2 = sj2.toString();
        System.out.println(fruit);
        System.out.println(fruit2);
    }
}
