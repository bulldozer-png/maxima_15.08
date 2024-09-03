package homework.hw4;

public class Task7 {
    public static void main(String[] args) {

        int[] numbers = new int[20];
        int counter = 0;

        while (counter < numbers.length) {
            numbers[counter++] = (int) (Math.random() * 100);
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        System.out.println("git work !!!");
    }
}
