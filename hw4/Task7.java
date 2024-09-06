package homework.hw4;

import java.util.Arrays;
import java.util.Collections;

public class Task7 {
    public static void main(String[] args) {

        Integer[] numbers = new Integer[20];
        int counter = 0;

        while (counter < numbers.length) {
            numbers[counter++] = (int) (Math.random() * 100);
        }
        Arrays.sort(numbers, Collections.reverseOrder());

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
