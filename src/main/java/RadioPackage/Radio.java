package RadioPackage;

public class Radio {

    public int nomberChanel;
    public int currentVolume;


    public int getNomberChanel() {
        return nomberChanel;
    }


    public void setNextChanel(int newNextChanel) {
        if (newNextChanel <= 9) {
            newNextChanel = newNextChanel + 1;
        }
        if (newNextChanel > 9) {
            return;
        }
        nomberChanel = newNextChanel;
    }

    public void setPrevChanel(int newPrevChanel) {
        if (newPrevChanel <= 9) {
            newPrevChanel = newPrevChanel - 1;

        }
        if (newPrevChanel < 0) {
            newPrevChanel = 9;
        }
        if (newPrevChanel > 9) {
            return;
        }
        nomberChanel = newPrevChanel;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setIncreaseVolume(int newIncreaseVolume) {
        if (newIncreaseVolume < 100) {
            newIncreaseVolume = newIncreaseVolume + 1;
        }
        if (newIncreaseVolume > 100) {
            return;
        }
        currentVolume = newIncreaseVolume;
    }

    public void setReduceVolume(int newReduceVolume) {
        if (newReduceVolume <= 100) {
            newReduceVolume = newReduceVolume - 1;
        }
        if (newReduceVolume < 0) {
            return;
        }
        if (newReduceVolume > 100) {
            return;
        }


        currentVolume = newReduceVolume;
    }


}