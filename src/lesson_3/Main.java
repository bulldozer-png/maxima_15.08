package lesson_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**

         Арифметические операторы
         + Складывает значения по обе стороны от оператора
         - Вычитает правый операнд из левого операнда
         * Умножает значения по обе стороны от оператора
         / Оператор деления делит левый операнд на правый операнд
         % Делит левый операнд на правый операнд и возвращает остаток
         ++ Инкремент - увеличивает значение операнда на 1 х++ постфиксная, ++х префиксная
         -- Декремент - уменьшает значение операнда на 1 х-- постфиксная, --х префиксная

         **/

//        int ost = 8 % 3; // 3 + 3 + 2
//        int ost = 10 % 3; // 3 + 3 + 3 +1
//        System.out.println(ost);

//        int a = 1;
//        int res = a + 1; // a + 1 === a++
//        int res1 = a++;
//        int res2 = ++a;
//        a++;
//        a++;
//
//        System.out.println(res1);
//        System.out.println(res2);
//        System.out.println(a);

//        int a = 10;
//
//        System.out.println(--a);

        /**
         * Операторы сравнения
         *
         * == Проверяет, равны или нет значения двух операндов, если да,
         * то условие становится истинным (A == B) – не верны
         *
         * != Проверяет, равны или нет значения двух операндов,
         * если значения не равны, то условие становится истинным (A != B) – значение истинна
         *
         * > Проверяет, является ли значение левого операнда больше,
         * чем значение правого операнда, если да, то условие становится истинным (A > B) – не верны
         *
         * < Проверяет, является ли значение левого операнда меньше,
         * чем значение правого операнда, если да, то условие становится истинным (A < B) – значение истинна
         *
         * >= Проверяет, является ли значение левого операнда больше или равно значению правого операнда,
         * если да, то условие становится истинным (A >= B) – значение не верны
         *
         * <= Проверяет, если значение левого операнда меньше или равно значению правого операнда,
         * если да, то условие становится истинным (A <= B) – значение истинна
         *
         * */

//        int a = 10;
//        int b = 5;
//
//        boolean isOneEqualsTwo = a != b;
//
//        System.out.println(isOneEqualsTwo);

        /**
         *
         * Логические операторы
         *
         * && Называется логический оператор «И». Если оба операнда являются не равны нулю, то условие становится истинным
         * || Называется логический оператор «ИЛИ». Если любой из двух операндов не равен нулю, то условие становится истинным
         * ! Называется логический оператор «НЕ». Использование меняет логическое состояние своего операнда.
         * Если условие имеет значение true, то оператор логического «НЕ» будет делать false
         *
         * */

//        boolean isIWillGoToWalking;
//
//        int temperature = 17;
//        boolean isWeekend = true;
//
//        isIWillGoToWalking = isWeekend || temperature >= 25;
//
//        System.out.println(isIWillGoToWalking);
//
//        boolean c = 250 > 1000;
//
//        System.out.println(!c);



//        boolean isIWillGoToWalking;
//
//        int temperature = 17;
//        boolean isWeekend = true;
//
//        isIWillGoToWalking = isWeekend || temperature >= 25;
//
//        if (isIWillGoToWalking){
//            System.out.println("go walk");
//        }else{
//            System.out.println("no walk");
//        }

//        int dayOfWeek = 3;
//
//        if (dayOfWeek == 1){
//            System.out.println("mon");
//        }else if (dayOfWeek == 2){
//            System.out.println("tue");
//        } else if (dayOfWeek == 3) {
//            System.out.println("wed");
//        } else if (dayOfWeek == 4) {
//            System.out.println("thu");
//        } else if (dayOfWeek == 5) {
//            System.out.println("fri");
//        } else if (dayOfWeek == 6) {
//            System.out.println("sat");
//        } else if (dayOfWeek == 7) {
//            System.out.println("sun");
//        } else {
//            System.out.println("dont know");
//        }

//        Scanner scanner = new Scanner(System.in);
//
//
//        int a = scanner.nextInt();
//
//        if (a > 50 && a < 100){
//            System.out.println("DA");
//        }else{
//            System.out.println("NET");
//        }



        int dayOfWeek = 5;

        switch(dayOfWeek){
            case(1):
                System.out.println("mon");
                break;
            case(2):
                System.out.println("tue");
                break;
            case(3):
                System.out.println("wed");
                break;
            case(4):
                System.out.println("thu");
                break;
            case(5):
                System.out.println("fri");
                break;
            case(6):
                System.out.println("sat");
                break;
            case(7):
                System.out.println("sun");
                break;
            default:
                System.out.println("dont know");
                break;
        }


    }
}
