package homework.hw13;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {

        Map<String, String> flora = new HashMap<>();

        flora.put("арбуз", "ягода");
        flora.put("банан", "трава");
        flora.put("вишня", "ягода");
        flora.put("груша", "фрукт");
        flora.put("дыня", "овощ");
        flora.put("ежевика", "куст");
        flora.put("жень-шень", "корень");
        flora.put("земляника", "ягода");
        flora.put("ирис", "цветок");
        flora.put("картофель", "клубень");

        for (Map.Entry<String, String> elemFlora : flora.entrySet()) {
            System.out.println(elemFlora.getKey() + " - " + elemFlora.getValue());
        }

    }
}
