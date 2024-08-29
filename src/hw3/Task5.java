package hw3;

public class Task5 {
    public static void main(String[] args) {

        int counterOne = 1;

        while (counterOne <= 10) {
            System.out.println();
            int counterTwo = 1;

            while (counterTwo <= 10) {
                System.out.print(counterOne * counterTwo++ + " ");
            }

            counterOne++;
        }

    }
}
