package homework.hw13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Map<Integer, String> families = new HashMap<>();

        families.put(13, "Ивановы");
        families.put(37, "Петровы");
        families.put(322, "Абрамовичи");


        Scanner scanner = new Scanner(System.in);
        int numberHouse = scanner.nextInt();

        System.out.println(families.getOrDefault(numberHouse, "Номер дома не записан!"));


    }
}
