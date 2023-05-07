package ru.netology.smarthome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationNumberMaxAllowedValueNoParam() {
        Radio radio = new Radio();

        radio.setStationNumber(9);

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberMaxAllowedValueWithParam() {
        Radio radio = new Radio(23);

        radio.setStationNumber(22);

        int expected = 22;
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
    public void shouldNotSetStationNumberAboveRangeNoParam() {
        Radio radio = new Radio();

        radio.setStationNumber(10);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberAboveRangeWithParam() {
        Radio radio = new Radio(45);

        radio.setStationNumber(45);

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
    public void shouldSetNextValueIfCurrentIsNot9NoParam() {
        Radio radio = new Radio();

        radio.setStationNumber(8);
        radio.next();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextValueIfCurrentIsNotMaxWithParam() {
        Radio radio = new Radio(45);

        radio.setStationNumber(43);
        radio.next();

        int expected = 44;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextValueIfCurrentIs9NoParam() {
        Radio radio = new Radio();

        radio.setStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextValueIfCurrentIsMaxWithParam() {
        Radio radio = new Radio(34);

        radio.setStationNumber(33);
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
    public void shouldSetPrevValueIfCurrentIsZeroNoParam() {
        Radio radio = new Radio();

        radio.setStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevValueIfCurrentIsZeroWithParam() {
        Radio radio = new Radio(54);

        radio.setStationNumber(0);
        radio.prev();

        int expected = 53;
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
