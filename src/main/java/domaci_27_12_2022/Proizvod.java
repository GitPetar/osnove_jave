package domaci_27_12_2022;

import org.example.Main;

public class Proizvod {
    String naziv;
    double cena;
    double tezina;

    public Proizvod(String naziv, double cena, double tezina) {
        this.naziv = naziv;
        this.cena = cena;
        this.tezina = tezina;
    }

    public void stampaj() {
        System.out.print(naziv + ", " + cena + " dinra, " + tezina + " grama");
    }

    public double konvertuj(String jedinicaMase) {
        if (jedinicaMase.equals("Kg")) {
            return tezina / 1000;
        } else if (jedinicaMase.equals("t")) {
            return tezina / 1000000;
        } else {
            return 0;
        }
    }
}
