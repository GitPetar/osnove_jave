package domaci_19_01_2023;

import java.util.ArrayList;

public class Korpa {
private ArrayList<Ambalaza> ambalaze = new ArrayList<>();

public void dodaj(Ambalaza ambalaza) {
    this.ambalaze.add(ambalaza);
}

public void izbaci(String barkod) {
    this.ambalaze.removeIf(ambalaza -> ambalaza.getBarkod().equals(barkod));
}

public double ukupnaCena(SuperKartica superKartica) {
    return this.cena(superKartica.getPopust());
}

private double cena(double popust) {
    double cena = -popust;
    for (Ambalaza ambalaza : this.ambalaze) {
        cena += ambalaza.cena();
    }
    return cena;
}

}
