package homework.hw6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        int number_one = getInt();
        int number_two = getInt();
        char operation = getOperation();

        if (number_two == 0 && operation == '/') {
            System.out.println("На ноль делить нельзя.");
        } else {
            int answer = calc(number_one, number_two, operation);
            System.out.println(answer);
        }

    }

    static int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    static int calc(int num1, int num2, char operation) {
        return switch (operation) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> 0;
        };
//        int result = 0;
//        switch (operation) {
//            case '+':
//                result = num1 + num2;
//                break;
//            case '-':
//                result = num1 - num2;
//                break;
//            case '*':
//                result = num1 * num2;
//                break;
//            case '/':
//                result = num1 / num2;
//                break;
//        }
//        return result;
    }


}
