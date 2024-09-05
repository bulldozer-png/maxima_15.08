package homework.hw4;

public class Task6 {
    public static void main(String[] args) {

        int[] numbers = new int[20];
        int counter = 0;
        int resultMax = Integer.MIN_VALUE;
        int resultMin = Integer.MAX_VALUE;

        while (counter < numbers.length) {
            numbers[counter] = (int) (Math.random() * 100);

            if (numbers[counter] > resultMax) {
                resultMax = numbers[counter];
            }
            if (numbers[counter] < resultMin) {
                resultMin = numbers[counter];
            }
            counter++;
        }

        String result = String.format("Max: %d | Min: %d", resultMax, resultMin);
        System.out.println(result);

    }
}
