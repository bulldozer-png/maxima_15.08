package homework.hw4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];
        int[] littleArray1 = new int[10];
        int[] littleArray2 = new int[10];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (i < 10) {
                littleArray1[i] = numbers[i];
            } else {
                littleArray2[i % 10] = numbers[i];
            }
        }

        for (int j = 0; j < littleArray2.length; j++) {
            System.out.println(littleArray2[j]);
        }

    }
}
