package CH2.Pertemuan3.materials;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        // Membuat objek map
        Map<String, String> map = new HashMap();
        map.put("name", "John Doe");
        map.put("email", "alfinmurod39@gmail.com");
        map.put("phone", "089531369676:");

        System.out.println(map.get("name "));
    }
}
