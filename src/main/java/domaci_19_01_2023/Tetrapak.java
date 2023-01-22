package domaci_19_01_2023;

public class Tetrapak extends Ambalaza {
private boolean mozeSeReciklirati;
private double osnovnaCena;

public Tetrapak() {
}

public Tetrapak(String barkod, String naziv, double netoTezina, double brutoTezina, boolean mozeSeReciklirati,
                double osnovnaCena) {
    super(barkod, naziv, netoTezina, brutoTezina);
    this.mozeSeReciklirati = mozeSeReciklirati;
    this.osnovnaCena = osnovnaCena;
}

public boolean isMozeSeReciklirati() {
    return mozeSeReciklirati;
}

public void setMozeSeReciklirati(boolean mozeSeReciklirati) {
    this.mozeSeReciklirati = mozeSeReciklirati;
}

public double getOsnovnaCena() {
    return osnovnaCena;
}

public void setOsnovnaCena(double osnovnaCena) {
    this.osnovnaCena = osnovnaCena;
}

@Override
double cena() {
    if (this.mozeSeReciklirati) {
        return tezinaPakovanja() * 1.5 + this.osnovnaCena;
    }
    return this.osnovnaCena;
}

@Override
void stampaj() {
    System.out.println("Artikl: " + this.naziv + ", Barkod: " + this.barkod);
    System.out.println("Bruto tezina: " + this.brutoTezina + "kg, Neto tezina: " + this.netoTezina + "kg" + ", Tezina" +
    " " + "pakovanja: " + tezinaPakovanja());
    System.out.println("Osnovna cena: " + this.osnovnaCena + ", cena: " + this.cena());
    System.out.println("Moze se reciklirati: " + this.mozeSeReciklirati);
}
}
