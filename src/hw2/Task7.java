package hw2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /**
         * 8 Task
         * */

        Scanner scanner = new Scanner(System.in);

        double t = scanner.nextDouble();

        int[] array1 = {60, 120, 300, 360, 540, 600, 780, 840, 1020, 1080, 1260, 1320, 1500, 1560, 1740, 1800, 1980, 2040, 2220, 2280, 2460, 2520, 2700, 2760, 2940, 3000, 3180, 3240, 3420, 3480};
        int[] array2 = {180, 420, 660, 900, 1140, 1380, 1620, 1860, 2100, 2340, 2580, 2820, 3060, 3300, 3540};
        int[] array3 = {240, 480, 720, 960, 1200, 1440, 1680, 1920, 2160, 2400, 2640, 2880, 3120, 3360, 3600};

        boolean flag1 = false; //zel
        boolean flag2 = false; //jelt
        boolean flag3 = false; //hrasn

//        if (t < 3) {
//            System.out.println("зелёный");
//        } else if (t >= 3 && t < 4) {
//            System.out.println("жёлтый");
//        } else if (t >= 4 && t < 5) {
//            System.out.println("красный");
//        }

        for (int i = 0; i < array1.length; i++) {
            if (t * 60 >= array1[i]) {
                // Если больше значения зеленых секунд
                for (int n = 0; n < array2.length; n++) {
                    // Но также меньше значения жёлтых секунд
                    if (t * 60 < array2[n]) {
                        flag1 = true;
                        break;
                    } else {
                        flag1 = false;
                    }
                }
            }
        }
        for (int x = 0; x < array1.length; x++) {

            if (t * 60 > array1[x]) {
                // Если больше значения зеленых секунд
                for (int n = 0; n < array2.length; n++) {
                    // Но также больше либо равно значениям жёлтых секунд
                    if (t * 60 <= array2[n]) {
                        flag2 = true;
                        break;
                    } else {
                        flag2 = false;
                    }
                }
            }
        }

        for (int y = 0; y < array1.length; y++) {
            // Если меньше значения зеленых секунд
            if (t * 60 < array1[y]) {
                for (int n = 0; n < array3.length; n++) {
                    // Но также больше либо равно значениям красных секунд
                    if (t * 60 >= array3[n]) {
                        flag3 = true;
                        break;
                    } else {
                        flag3 = false;
                    }
                }
            }
        }


        if (flag1 == true) {
            System.out.println("zel");
        } else if (flag2 == true) {
            System.out.println("jelt");
        } else if (flag3 == true) {
            System.out.println("krasn");
        }
    }
}
