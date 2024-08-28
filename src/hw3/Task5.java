package hw3;

public class Task5 {
    public static void main(String[] args) {

        int counterOne = 1;
        int counterTwo = 1;

        while (counterOne <= 10) {
            System.out.println();

            while (counterTwo <= 10) {
                System.out.print(counterOne * counterTwo + " ");
                counterTwo++;
            }
            counterTwo = 1;
            counterOne++;
        }

    }
}
