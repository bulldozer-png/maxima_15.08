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
        }

        int a = 0;
        while (a < littleArray1.length) {
            littleArray1[a] = numbers[a];
            a++;
        }
        int b = 0;
        while (b < littleArray2.length) {
            littleArray2[b] = numbers[a];
            b++;
            a++;
        }


        for (int j = 0; j < littleArray2.length; j++) {
            System.out.println(littleArray2[j]);
        }

    }
}
