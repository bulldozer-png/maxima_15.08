package homework.hw3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        String aboutMe = String.format("Меня зовут %s. \nЯ родился %d.%d.%d", name, d,m,y);

        System.out.println(aboutMe);

    }
}
