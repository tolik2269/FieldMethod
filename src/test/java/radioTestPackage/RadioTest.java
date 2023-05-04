package radioTestPackage;

import RadioPackage.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

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
    public void nextChanel() {
        Radio radio = new Radio();
        radio.setNextChanel(8);

        int expected = 9;
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
        radio.setIncreaseVolume(20);

        int expected = 21;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume() {
        Radio radio = new Radio();
        radio.setReduceVolume(20);

        int expected = 19;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(105);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minReduseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-6);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
