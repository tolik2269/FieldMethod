package radioTestPackage;

import RadioPackage.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testSetNomberChanel() {
        Radio radio = new Radio();
        radio.setNomberChanel(5);

        int expected = 5;
        int actual = radio.getNomberChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetNomberChanelMax() {
        Radio radio = new Radio();
        radio.setNomberChanel(10);

        int expected = 0;
        int actual = radio.getNomberChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetNomberChanelMin() {
        Radio radio = new Radio();
        radio.setNomberChanel(-1);

        int expected = 0;
        int actual = radio.getNomberChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextChanel() {
        Radio radio = new Radio();
        radio.setNomberChanel(5);
        radio.NextChanel();

        int expected = 6;
        int actual = radio.getNomberChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextChanelMax() {
        Radio radio = new Radio();
        radio.setNomberChanel(9);
        radio.NextChanel();

        int expected = 0;
        int actual = radio.getNomberChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevChanel() {
        Radio radio = new Radio();
        radio.setNomberChanel(9);
        radio.PrevChanel();

        int expected = 8;
        int actual = radio.getNomberChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevChanelMin() {
        Radio radio = new Radio();
        radio.setNomberChanel(0);
        radio.PrevChanel();

        int expected = 9;
        int actual = radio.getNomberChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-5);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(121);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(12);
        radio.IncreaseVolume();

        int expected = 13;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.IncreaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.ReduceVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReduceVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.ReduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}