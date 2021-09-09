package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void shouldTheStationAboveMax() {
        Radio radio = new Radio();
        int expected = radio.getCurrentRadioStation();
        radio.setCurrentRadioStation(radio.getMaxStation() + 3);
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTheStationAboveMin() {
        Radio radio = new Radio();
        int expected = radio.getCurrentRadioStation();
        radio.setCurrentRadioStation(radio.getMinStation() - 3);
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTheStationByButtonNextIfCurrentIsNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.getMaxStation());
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldTheStationByButtonNext() {
        Radio radio = new Radio();
        radio.nextRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    void shouldTheStationByButtonPrevIfCurrentIsNull() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.getMinStation());
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldTheStationByButtonPrev() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        int expected = 2;
        radio.prevRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeAboveMaximum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        int expected = 2;
        radio.decreaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeIfMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}