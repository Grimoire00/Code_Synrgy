package CH2.Pertemuan3.materials;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Nasi Goreng");
        names.add("Mie Ayam");
        names.add("Nasi Ayam");
        names.add("Nasi Ayam");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
