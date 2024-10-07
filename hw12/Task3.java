package homework.hw12;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("тест");
        strings.add("роза");
        strings = fix(strings);


        for (String str : strings) {
            System.out.println(str);
        }
    }


    public static ArrayList<String> fix(ArrayList<String> strings) {

        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();

            if (element.contains("р") && element.contains("л")) {
                continue;

            } else if (element.contains("р")) {
                iterator.remove();

            } else if (element.contains("л")) {
                int index = strings.indexOf(element);
                strings.set(index, element.repeat(2));

            }
        }
        return strings;
    }

}
