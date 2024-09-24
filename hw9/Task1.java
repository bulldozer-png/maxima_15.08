package homework.hw9;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("Some");
        strings.add("text");
        strings.add("in");
        strings.add("my");
        strings.add("list");

        System.out.println(strings.size());

        for (String str : strings) {
            System.out.println(str);
        }

    }
}
