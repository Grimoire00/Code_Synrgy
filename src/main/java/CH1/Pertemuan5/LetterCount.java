package CH1.Pertemuan5;

import java.util.HashMap;

public class LetterCount {

    public static void main(String[] args) {
        String input = "keramas";

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (map.containsKey(input.charAt(i))) {
                int n = map.get(input.charAt(i)) + 1;
                map.put(input.charAt(i), n);
            } else {
                map.put(input.charAt(i), 1);
            }
        }
        System.out.println(map);

    }
}

