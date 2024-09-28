package homework.hw10;

import java.util.ArrayList;
import java.util.LinkedList;

public class TimeTest {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 50000; i++) {
            arrayList.add(i);
        }
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 50000; i++) {
            linkedList.add(i);
        }


        Long startArr = System.currentTimeMillis();
            for (int i = 0; i < 50000; i++) {
                arrayList.add(1, i);
            }
        Long finishArr = System.currentTimeMillis();
        System.out.println("For arrList " + (finishArr - startArr));



        Long startLinked = System.currentTimeMillis();
            for (int i = 0; i < 50000; i++) {
                linkedList.add(1, i);
            }
        Long finishLinked = System.currentTimeMillis();
        System.out.println("For linkedList " + (finishLinked - startLinked));

    }
}
