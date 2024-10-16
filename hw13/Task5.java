package homework.hw13;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {

        Map<String, Object> store = new HashMap<>();

        store.put("SIM", new SIMCard(5));
        store.put("Planshet", new Planshet(15));
        store.put("Telephon", new Telephon(51));
        store.put("PC", new PC(25));
        store.put("Printer", new Printer(52));
        store.put("Fax", new Fax(53));
        store.put("Nayshniki", new Nayshniki(35));
        store.put("Chasy", new Chasy(45));
        store.put("Kolonka", new Kolonka(54));
        store.put("TV", new TV(55));


        for (Map.Entry<String, Object> entry : store.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}


class SIMCard extends Sklad {
    public SIMCard(Integer count) {
        super(count);
    }
}

class Planshet extends Sklad {
    public Planshet(Integer count) {
        super(count);
    }
}

class Telephon extends Sklad {
    public Telephon(Integer count) {
        super(count);
    }
}

class PC extends Sklad {
    public PC(Integer count) {
        super(count);
    }
}

class Printer extends Sklad {
    public Printer(Integer count) {
        super(count);
    }
}

class Fax extends Sklad {
    public Fax(Integer count) {
        super(count);
    }
}

class Nayshniki extends Sklad {
    public Nayshniki(Integer count) {
        super(count);
    }
}

class Chasy extends Sklad {
    public Chasy(Integer count) {
        super(count);
    }
}

class Kolonka extends Sklad {
    public Kolonka(Integer count) {
        super(count);
    }
}

class TV extends Sklad {
    public TV(Integer count) {
        super(count);
    }
}










