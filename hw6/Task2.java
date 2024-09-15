package homework.hw6;

public class Task2 {
    public static void main(String[] args) {

        isDiffFromFive(-7);

    }

    static void isDiffFromFive(int number) {
        if (number > 5) {
            System.out.println(true);
        } else if (number < 5) {
            System.out.println(false);
        } else {
            System.out.println(number + " == 5");
        }
    }


}
