package homework.hw14;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static Set<Integer> createSet(){
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> sset){
        sset.removeIf(num -> num > 10);
        return sset;
    }


    public static void main(String[] args) {

        Set<Integer> fullSet = createSet();
        removeAllNumbersGreaterThan10(fullSet);

    }
}
