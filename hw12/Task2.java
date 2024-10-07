package homework.hw12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");

        for (int i = 0; i < 3; i++) {
            strings.add(i + i + 1, "именно");
        }

//        for (String str : strings) {
//            System.out.println(str);
//        }
        strings.forEach(System.out::println);

    }
}
