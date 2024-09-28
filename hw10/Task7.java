package homework.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        List<Integer> numMultiple3 = new ArrayList<>();
        List<Integer> numMultiple2 = new ArrayList<>();
        List<Integer> numOther = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numbers.add(scanner.nextInt());
        }

        for (Integer num : numbers) {
            if (num % 3 == 0) {
                numMultiple3.add(num);
            }
            if (num % 2 == 0) {
                numMultiple2.add(num);
            }
            if (num % 3 != 0 && num % 2 != 0) {
                numOther.add(num);
            }
        }

        System.out.println("На 3 без остатка:");
        printList(numMultiple3);
        System.out.println();

        System.out.println("На 2 без остатка:");
        printList(numMultiple2);
        System.out.println();

        System.out.println("Остальные числа:");
        printList(numOther);

    }

    public static void printList(List list) {
        for (Object num : list) {
            System.out.println(num);
        }
    }

}
