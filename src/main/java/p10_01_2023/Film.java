package p10_01_2023;

public class Film {
    private String nazivFilma;
    private int izGodine;
    private Reziser reziser = new Reziser();

    public Film() {
    }

    public Film(String nazivFilma, int izGodine) {
        this.nazivFilma = nazivFilma;
        this.izGodine = izGodine;
    }

    public Reziser getReziser() {
        return reziser;
    }

    public void setReziser(Reziser reziser) {
        this.reziser = reziser;
    }

    public String getNazivFilma() {
        return nazivFilma;
    }

    public void setNazivFilma(String nazivFilma) {
        this.nazivFilma = nazivFilma;
    }

    public int getIzGodine() {
        return izGodine;
    }

    public void setIzGodine(int izGodine) {
        this.izGodine = izGodine;
    }

    public void print() {
        System.out.println(nazivFilma + ", napravljen " + izGodine + " godine.");
        System.out.println("Reziser ovog filma je " + reziser.getImeIPrezime());
    }

}
