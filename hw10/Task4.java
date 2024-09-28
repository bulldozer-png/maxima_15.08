package homework.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strings.add(0, scanner.nextLine());
        }

        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }
}
