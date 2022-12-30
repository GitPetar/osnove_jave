package domaci_29_12_2022;

public class Proizvod {
    String naziv;
    double cena;
    int tezina; //u gramima

    public Proizvod(String naziv, double cena, int tezina) {
        this.naziv = naziv;
        this.cena = cena;
        this.tezina = tezina;
    }

    public void stampaj() {
        System.out.println(naziv + ", " + cena + " RSD, " + tezina + "g");
    }

    public void povecajCenu(double povecanje) {
        cena += povecanje;
    }

    public double vratiCenuSaPopustom(int popust) {
        return (cena * (100 - popust)) / 100;
    }

    public double racunajPostarinu() {
        if (tezina <= 100) {
            return 200;
        } else if (tezina <= 500) {
            return 400;

        } else {
            return 1000;
        }
    }
}
