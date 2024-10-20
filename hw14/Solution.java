package homework.hw14;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Solution {

    public static Set<Integer> createSet() {
        Set<Integer> numbers = new HashSet<>();
//        for (int i = 0; i < 20; i++) {
//            numbers.add(i);
//        }
        Stream.iterate(0, i -> i + 1).limit(20).forEach(numbers::add);

        return numbers;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> numbers) {
        numbers.removeIf(num -> num > 10);
        return numbers;
    }


    public static void main(String[] args) {

        Set<Integer> numbers = createSet();
        removeAllNumbersGreaterThan10(numbers);

    }
}
