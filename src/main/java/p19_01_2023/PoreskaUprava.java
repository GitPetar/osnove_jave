package p19_01_2023;

import java.util.ArrayList;

public class PoreskaUprava {
private String imeGrada;
private ArrayList<Objekat> objekti = new ArrayList<>();

public PoreskaUprava(String imeGrada) {
    this.imeGrada = imeGrada;
}

public void dodaj(Objekat objekat) {
    this.objekti.add(objekat);
}

public void stampaj() {
    System.out.println("Ime Grada: " + imeGrada);
    for (Objekat objekat : this.objekti) {
        objekat.stampaj();
    }
    System.out.println("Porez na nivou grada je " + ukupanPorez());
    System.out.println("Objekat sa najvecim porezom je " + najveciPorez().porez());
    System.out.println("Objekat sa najmanjim porezom je " + najmanjiPorez().porez());
}

public double ukupanPorez() {
    double ukupanPorez = 0;
    for (Objekat objekat : objekti) {
        ukupanPorez += objekat.porez();
    }
    return ukupanPorez;
}

public Objekat najveciPorez() {
    Objekat najveciPorez = new Kuca();
    for (Objekat objekat : this.objekti) {
        if (najveciPorez.porez() < objekat.porez()) {
            najveciPorez = objekat;
        }
    }
    return najveciPorez;
}

public Objekat najmanjiPorez() {
    Objekat najmanjiPorez = najveciPorez();
    for (Objekat objekat : this.objekti) {
        if (najmanjiPorez.porez() > objekat.porez()) {
            najmanjiPorez = objekat;
        }
    }
    return najmanjiPorez;
}
}
