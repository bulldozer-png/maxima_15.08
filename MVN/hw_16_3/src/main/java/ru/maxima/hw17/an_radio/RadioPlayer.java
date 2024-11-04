package ru.maxima.hw17.an_radio;

import java.util.List;

public class RadioPlayer {

    private List<Radio> radios;

    public void setRadio(List<Radio> radios) {
        this.radios = radios;
    }


    public void play() {

        for (Radio radio : radios) {
            System.out.println("Играет: " + radio.getSong() + ", на радио " + radio.toString());
        }
    }
}
