package homework.hw12;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strings.add(i, scanner.nextLine());
        }

        strings = doubleValues(strings);

        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> strings) {
        ArrayList<String> tempStrings = new ArrayList<>();

        for (String element : strings) {
            tempStrings.add(element);
            tempStrings.add(element);
        }

        return tempStrings;
    }

}
