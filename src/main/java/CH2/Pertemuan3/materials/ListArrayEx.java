package CH2.Pertemuan3.materials;

import java.util.ArrayList;

public class ListArrayEx {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Nasi Goreng");
        names.add("Mie Ayam");
        names.add("Nasi Ayam");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
