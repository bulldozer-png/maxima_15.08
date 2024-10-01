package homework.hw11;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Coin coin1 = new Coin(10, 1.5, "Russia", 1000);
        Coin coin2 = new Coin(15, 1.3, "Poland", 2500);
        Coin coin3 = new Coin(5, 1.0, "America", 1100);
        Coin coin4 = new Coin(10, 0.7, "Italy", 650);
        Coin coin5 = new Coin(1, 2.0, "Russia", 2000);
        Coin coin6 = new Coin(15, 2.0, "Poland", 2500);

        TreeSet<Coin> coins = new TreeSet<>();

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

        System.out.println(coin1);

    }
}
