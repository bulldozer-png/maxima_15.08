package hw2;

public class Task6 {
    public static void main(String[] args) {
        /**
         * 7 Task
         * */

        int a = 10;
        int b = 20;
        int c = 30;

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Треугольник существует.");

        } else {
            System.out.println("Треугольник не существует.");
        }

    }
}
