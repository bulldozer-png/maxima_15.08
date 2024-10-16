package homework.hw13;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {

        Map<String, String> humans = new HashMap<>();

        humans.put("Sidorov", "Ivan");
        humans.put("Smirnov", "Alex"); // value
        humans.put("Avanov", "Petr");
        humans.put("Ivanov", "Valentin"); // key
        humans.put("Krijanov", "Vlad");
        humans.put("Numanov", "Kiril");
        humans.put("Sokolov", "Arnold");
        humans.put("Ivanov", "Alex"); // key / value
        humans.put("Pyhov", "Mike");
        humans.put("Zdanov", "Luke");


        for (String key : humans.keySet()) {
            String value = humans.get(key);
            System.out.println(key + " - " + value);
        }
        /**
         *  Совпаление по ключу перезапишет значение, совпадение по значению
         *  просто добавится, так как ключ уникальный.
         */

    }
}
