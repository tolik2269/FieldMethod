package RadioPackage;

public class Radio {
    private int nomberChanel;
    private int currentVolume;
    public int stationsMax;

    public Radio() {
        stationsMax = 9;
    }

    public Radio(int stationsCount) {
        stationsMax = stationsCount - 1;
    }


    public int getNomberChanel() {
        return nomberChanel;
    }

    public void setNomberChanel(int newNomberChanel) {
        if (newNomberChanel < 0) {
            return;
        }
        if (newNomberChanel > stationsMax) {
            return;
        }
        this.nomberChanel = newNomberChanel;
    }

    public void NextChanel() {
        if (nomberChanel != stationsMax) {
            nomberChanel = nomberChanel + 1;
        } else {
            nomberChanel = 0;
        }


    }

    public void PrevChanel() {
        if (nomberChanel != 0) {
            nomberChanel = nomberChanel - 1;
        } else {

            nomberChanel = stationsMax;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void IncreaseVolume() {
        if (currentVolume != 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }

    }

    public void ReduceVolume() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }


}