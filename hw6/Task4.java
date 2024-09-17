package homework.hw6;

public class Task4 {
    public static void main(String[] args) {

        sumPower(2, 3);

    }

    static void sumPower(int number, int power) {
        int result = toPower(number, power) + toPower(number, power);
        System.out.println(result);
    }

    static int toPower(int n, int p) {
        int resultPower = 1;
        for (int i = 1; i <= p; i++) {
            resultPower = n * resultPower;
        }
        return resultPower;
    }


}
