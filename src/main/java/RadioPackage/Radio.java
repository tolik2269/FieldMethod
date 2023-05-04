package RadioPackage;

public class Radio {

    public int nomberChanel;
    public int currentVolume;


    public int getNomberChanel() {
        return nomberChanel;
    }


    public void setNextChanel(int newNextChanel) {
        if (newNextChanel < 10) {
            newNextChanel = newNextChanel + 1;
        }
        if (newNextChanel > 9) {
            newNextChanel = 0;
        }
        nomberChanel = newNextChanel;
    }

    public void setPrevChanel(int newPrevChanel) {
        if (newPrevChanel < 10) {
            newPrevChanel = newPrevChanel - 1;

        }
        if (newPrevChanel == -1) {
            newPrevChanel = 9;
        }
        nomberChanel = newPrevChanel;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }


    public void setIncreaseVolume(int newIncreaseVolume) {
        if (newIncreaseVolume < 100) {
            newIncreaseVolume = newIncreaseVolume + 1;
        }
        currentVolume = newIncreaseVolume;
    }

    public void setReduceVolume(int newReduceVolume) {
        if (newReduceVolume < 100) {
            newReduceVolume = newReduceVolume - 1;
        }
        currentVolume = newReduceVolume;
    }


}