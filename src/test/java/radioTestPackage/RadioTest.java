package radioTestPackage;

import RadioPackage.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void test() {
        Radio radio = new Radio(10);
        Assertions.assertEquals(10,radio.getNumberOfStations());
    }

    @Test
    public void prevChanel() {
        Radio radio = new Radio();
        radio.setPrevChanel(7);

        int expected = 6;
        int actual = radio.getNomberChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevMinChanel() {
        Radio radio = new Radio();
        radio.setPrevChanel(0);

        int expected = 9;
        int actual = radio.getNomberChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevMinMinChanel() {
        Radio radio = new Radio();
        radio.setPrevChanel(9);

        int expected = 8;
        int actual = radio.getNomberChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChanelMax() {
        Radio radio = new Radio();
        radio.setPrevChanel(11);

        int expected = 0;
        int actual = radio.getNomberChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChanel() {
        Radio radio = new Radio();
        radio.setNextChanel(8);

        int expected = 9;
        int actual = radio.getNomberChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextMaxMaxChanel() {
        Radio radio = new Radio();
        radio.setNextChanel(10);

        int expected = 0;
        int actual = radio.getNomberChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextMaxChanel() {
        Radio radio = new Radio();
        radio.setNextChanel(9);

        int expected = 0;
        int actual = radio.getNomberChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(12);
        int expected = 13;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMaxVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMaxMaxVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeMax() {
        Radio radio = new Radio();
        radio.setReduceVolume(100);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume() {
        Radio radio = new Radio();
        radio.setReduceVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minReduseVolume() {
        Radio radio = new Radio();
        radio.setReduceVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
