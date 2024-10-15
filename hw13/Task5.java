package homework.hw13;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {

        Map<String, Sklad> store = new HashMap<>();

        store.put("SIM", new Sklad(5, "8-22", "Podolsk"));
        store.put("Planshet", new Sklad(2, "10-22", "Khimki"));
        store.put("Telephon", new Sklad(3, "11-22", "Tver"));
        store.put("PC", new Sklad(9, "8-19", "Kaluga"));
        store.put("Printer", new Sklad(5, "8-20", "Korolev"));
        store.put("Fax", new Sklad(4, "8-22", "Orehovo"));
        store.put("Nayshniki", new Sklad(2, "8-21", "Ijevsk"));
        store.put("Chasy", new Sklad(1, "6-22", "MSK"));
        store.put("Kolonka", new Sklad(6, "11-18", "SPB"));
        store.put("TV", new Sklad(5, "8-22", "Pytilkovo"));
        store.put("Aksessyari", new Sklad(4, "8-22", "Perm"));
        store.put("Consoli", new Sklad(3, "10-22", "Lipeck"));

        for (String key : store.keySet()) {
            Sklad sklad = store.get(key);
            System.out.println(key + " - " + sklad.getCount() + " шт.");
        }

    }
}
