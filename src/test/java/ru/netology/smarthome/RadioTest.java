package ru.netology.smarthome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationNumberMaxAllowedValue() {
        Radio radio = new Radio();

        radio.setStationNumber(9);

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberMinAllowedValue() {
        Radio radio = new Radio();

        radio.setStationNumber(0);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldNotSetStationNumberAboveRange() {
        Radio radio = new Radio();

        radio.setStationNumber(10);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberBelowRange() {
        Radio radio = new Radio();

        radio.setStationNumber(-1);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextValueIfCurrentIsNot9() {
        Radio radio = new Radio();

        radio.setStationNumber(8);
        radio.next();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextValueIfCurrentIs9() {
        Radio radio = new Radio();

        radio.setStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevValueIfCurrentIsNot0() {
        Radio radio = new Radio();

        radio.setStationNumber(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevValueIfCurrentIs0() {
        Radio radio = new Radio();

        radio.setStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfNot100() {
        Radio radio = new Radio();

        radio.setVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeIf100() {
        Radio radio = new Radio();

        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfNot0() {
        Radio radio = new Radio();

        radio.setVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeIf0() {
        Radio radio = new Radio();

        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}
