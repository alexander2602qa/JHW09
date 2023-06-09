package ru.netology.smarthome;

public class Radio {
    private int stationNumber = 0;
    private int volume = 0;

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > 9) {
            return;
        }
        stationNumber = newStationNumber;
    }

    public void next() {
        if (stationNumber == 9) {
            stationNumber = 0;
        } else {
            stationNumber++;
        }
    }

    public void prev() {
        if (stationNumber == 0) {
            stationNumber = 9;
        } else {
            stationNumber--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        volume = newVolume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}
