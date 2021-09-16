package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldTheStationAboveMax() {
        radio.setCurrentRadioStation(11);
        int expected = radio.getCurrentRadioStation();
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTheStationAboveMin() {
        int expected = radio.getCurrentRadioStation();
        radio.setCurrentRadioStation(radio.getMinStation() - 3);
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTheStationByButtonNextIfCurrentIsNine() {
        int expected = radio.getCurrentRadioStation();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldTheStationByButtonNext() {
        radio.nextRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    void shouldTheStationByButtonPrevIfCurrentIsNull() {
        radio.setCurrentRadioStation(radio.getMinStation());
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldTheStationByButtonPrev() {
        radio.setCurrentRadioStation(3);
        radio.prevRadioStation();
        int expected = 2;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseVolume() {
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeAboveMaximum() {
        radio.setCurrentVolume(100);
        int expected = 100;
        radio.increaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        radio.setCurrentVolume(3);
        int expected = 2;
        radio.decreaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeIfMin() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}