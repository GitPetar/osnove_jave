package p10_01_2023;

import java.util.ArrayList;

public class Reziser {
    private String imeIPrezime;
    private int starost;
    private ArrayList<Film> reziraniFilmovi = new ArrayList<Film>();

    Reziser() {
    }

    public Reziser(String imeIPrezime, int starost) {
        this.imeIPrezime = imeIPrezime;
        this.starost = starost;
    }

    public ArrayList<Film> getReziraniFilmovi() {
        return reziraniFilmovi;
    }

    public void setReziraniFilmovi(ArrayList<Film> reziraniFilmovi) {
        this.reziraniFilmovi = reziraniFilmovi;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public void print() {
        System.out.println(imeIPrezime + ", star " + starost + " godina.");
        for (int i = 0; i < reziraniFilmovi.size(); i++) {
            System.out.println("Rezirao je " + reziraniFilmovi.get(i).getNazivFilma());
        }

    }

}
