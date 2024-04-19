package CH2.TaskV1;

import lombok.AllArgsConstructor;

import java.util.LinkedHashMap;
import java.util.Map;

@AllArgsConstructor
class Menu {
    private static final Map<String, Integer> menu = new LinkedHashMap<>();

    static {
        menu.put("Nasi Goreng", 15000);
        menu.put("Mie Goreng", 13000);
        menu.put("Nasi + Ayam", 18000);
        menu.put("Es Teh Manis", 3000);
        menu.put("Es Jeruk", 5000);
    }

    public static Map<String, Integer> getMenu() {
        return menu;
    }
}
