package homework.hw6;

public class Task3 {
    public static void main(String[] args) {

        smallerNumber(13, -23);

    }

    static void smallerNumber(int n1, int n2) {
        if (n1 < n2) {
            System.out.println(n1);
        } else if (n2 < n1) {
            System.out.println(n2);
        } else {
            System.out.println(n1 + " == " + n2);
        }
    }


}
