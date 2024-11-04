package ru.maxima.hw17.an_radio;

import java.util.Random;

public class NasheFM implements Radio {
    String[] songs = {"Song1", "Song2", "Song3"};
    Random random = new Random();

    @Override
    public String getSong() {
        return songs[random.nextInt(songs.length)];
    }

    @Override
    public String toString() {
        return NasheFM.class.getSimpleName();
    }
}
