package p12_01_2023;

public class Ugovor {
    private String adresa;
    private FizickoLice prodavac, klijent;
    private int cena, dan, mesec, godina;

    public Ugovor(String adresa, FizickoLice prodavac, FizickoLice klijent, int cena, int dan, int mesec, int godina) {
        this.adresa = adresa;
        this.prodavac = prodavac;
        this.klijent = klijent;
        this.cena = cena;
        this.dan = dan;
        this.mesec = mesec;
        this.godina = godina;
    }

    public double procenatZarade() {
        if (klijent.isRanijeKupovao()) {
            return 0.02;
        }
        return 0.03;
    }

    public double zaradaAgencije() {
        return 1000 + cena * procenatZarade();
    }

    public void stampaj() {
        System.out.println("Dana " + dan + "." + mesec + "." + godina + ". god, sklopljen je ugovor izmedju " + prodavac.getImeIPrezime() + " i " + klijent.getImeIPrezime() + " o kupovini nekretnine " + adresa + " po ceni od " + cena + " pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od " + zaradaAgencije() + ".");
    }

}
