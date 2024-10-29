package ru.maxima.hw17.an_radio;

import java.util.Random;

public class RetroFM implements Radio {
    String[] songs = {"Song11", "Song22", "Song33"};
    Random random = new Random();

    @Override
    public String getSong() {
        return songs[random.nextInt(songs.length)];
    }

    @Override
    public String toString() {
        return RetroFM.class.getSimpleName();
    }
}
