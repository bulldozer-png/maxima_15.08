package homework.hw4;

public class Task2 {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        int counter = 0;

        while (counter < numbers.length) {
            numbers[counter++] = (int) (Math.random() * 100);
        }

        counter = 0;
        int maxValue = 0;

        while (counter < numbers.length) {
            if (maxValue < numbers[counter]) {
                maxValue = numbers[counter];
            }
            counter++;
        }

        String result = String.format("Максимальное значение %d", maxValue);
        System.out.println(result);
    }
}
