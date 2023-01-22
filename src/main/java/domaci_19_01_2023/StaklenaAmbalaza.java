package domaci_19_01_2023;

public class StaklenaAmbalaza extends Ambalaza {
private double kaucija, osnovnaCena;
private boolean placaSeKaucija;

public StaklenaAmbalaza() {
}

public StaklenaAmbalaza(String barkod, String naziv, double netoTezina, double brutoTezina, double kaucija,
                        double osnovnaCena, boolean placaSeKaucija) {
    super(barkod, naziv, netoTezina, brutoTezina);
    this.kaucija = kaucija;
    this.osnovnaCena = osnovnaCena;
    this.placaSeKaucija = placaSeKaucija;
}

@Override
double cena() {
    if (placaSeKaucija) {
        return this.osnovnaCena * 1.2 + this.kaucija;
    }
    return this.osnovnaCena * 1.2;
}

@Override
void stampaj() {
    System.out.println("Artikl: " + this.naziv + ", Barkod: " + this.barkod);
    System.out.println("Bruto tezina: " + this.brutoTezina + "kg, Neto tezina: " + this.netoTezina + "kg" + ", Tezina"
    + " " + "pakovanja: " + tezinaPakovanja());
    System.out.println("Osnovna cena: " + this.osnovnaCena + ", cena: " + this.cena());
    if (placaSeKaucija) {System.out.println("kaucija iznosi: " + kaucija);}
}
////metoda stampaj stampa sve podatke iz klase staklena flasa.
}
