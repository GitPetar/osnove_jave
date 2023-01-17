package domaci_17_01_2023;

public class VideoPlayer {
    private int duzina, trenutnoVreme, jacinaZvuka, kavlitet;

    public String vreme() {
        return "" + (this.trenutnoVreme / 60) + ":" + ((this.trenutnoVreme % 60) / 10) + "" + ((this.trenutnoVreme % 60) % 10) + "/" + (this.duzina / 60) + ":" + ((this.duzina % 60) / 10) + "" + ((this.duzina % 60) % 10);
    }

    public void stampaj() {
        System.out.println(this.vreme());
        System.out.println("Jacina zvuka: " + jacinaZvuka);
        System.out.println(this.kavlitet + "p");
    }

    public VideoPlayer() {
        this.jacinaZvuka = 75;
        this.trenutnoVreme = 0;
        this.kavlitet = 360;
    }

    public VideoPlayer(int duzina) {
        this.duzina = duzina;
        this.jacinaZvuka = 75;
        this.trenutnoVreme = 0;
        this.kavlitet = 360;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(int trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public int getDuzina() {
        return duzina;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public void setKavlitet(int kavlitet) {
        this.kavlitet = kavlitet;
    }
}
