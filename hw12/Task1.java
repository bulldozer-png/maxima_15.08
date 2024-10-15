package homework.hw12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(i, scanner.nextLine());
        }
        strings.remove(2);

//        for (int i = strings.size() - 1; i >= 0; i--) {
//            System.out.println(strings.get(i));
//        }
        Collections.reverse(strings);
        strings.forEach(System.out::println);
    }
}
