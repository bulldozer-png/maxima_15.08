package hw3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            System.out.println();

            for (int j = 0; j < n; j++) {
                System.out.print(8);
            }
        }

    }
}
