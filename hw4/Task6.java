package homework.hw4;

public class Task6 {
    public static void main(String[] args) {

        int[] numbers = new int[20];
        int counter = 0;

        int resultMax = 0;
        int resultMin = 0;

        int maxValue = 2147483647;
        int minValue = -2147483648;

        while (counter < numbers.length) {

            numbers[counter] = (int) (Math.random() * 100);

            if (numbers[counter] > minValue) {
                resultMax = numbers[counter];
                minValue = numbers[counter];
            }

            if (numbers[counter] < maxValue) {
                resultMin = numbers[counter];
                maxValue = numbers[counter];
            }
            counter++;
        }

        String result = String.format("%d %d", resultMax, resultMin);
        System.out.println(result);

    }
}
