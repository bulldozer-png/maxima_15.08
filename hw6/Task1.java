package homework.hw6;

public class Task1 {
    public static void main(String[] args) {

        int result = toCube(5);
        System.out.println(result);

    }

    static int toCube(int number) {
        number = (int) Math.pow(number, 3);
        return number;
    }


}
