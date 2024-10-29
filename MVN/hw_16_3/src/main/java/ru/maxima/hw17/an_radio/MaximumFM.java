package ru.maxima.hw17.an_radio;

import java.util.Random;

public class MaximumFM implements Radio {
    String[] songs = {"Song111", "Song222", "Song333"};
    Random random = new Random();

    @Override
    public String getSong() {
        return songs[random.nextInt(songs.length)];
    }

    @Override
    public String toString() {
        return MaximumFM.class.getSimpleName();
    }
}
