package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minStation) {
            return;
        }
        if (currentRadioStation > maxStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void nextRadioStation() {
        if (currentRadioStation < maxStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minStation;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > minStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}