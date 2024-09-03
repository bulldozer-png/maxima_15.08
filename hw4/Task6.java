package homework.hw4;

public class Task6 {
    public static void main(String[] args) {

        int[] numbers = new int[20];
        int counter = 0;

        while (counter < numbers.length) {
            numbers[counter++] = (int) (Math.random() * 100);
        }

        int maxValue = 0;
        int minValue;
        for (int i = 0; i < numbers.length; i++) {
            if (maxValue < numbers[i]) {
                maxValue = numbers[i];
            }
        }

        minValue = maxValue;
        for (int j = 0; j < numbers.length; j++) {
            if (minValue > numbers[j]) {
                minValue = numbers[j];
            }
        }

        String result = String.format("%d %d", maxValue, minValue);
        System.out.println(result);

    }
}
