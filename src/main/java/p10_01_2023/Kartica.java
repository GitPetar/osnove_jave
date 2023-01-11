package p10_01_2023;

public class Kartica {
    private double popust = Math.random() * 0.06 + 0.05;
    private String brojKartice = "666 666";

    public Kartica() {
    }

    public Kartica(double popust, String brojKartice) {
        this.popust = popust;
        this.brojKartice = brojKartice;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

}
