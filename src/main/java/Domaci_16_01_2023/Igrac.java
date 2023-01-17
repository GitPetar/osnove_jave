package Domaci_16_01_2023;

import java.util.ArrayList;

public class Igrac extends Osoba {
    private int broj;
    private String pozicija;
    private boolean kapiten;
    private ArrayList<Karton> kartoni;

    public Igrac(String imeIPrezime, String jmbg, int godinaRodjenja) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.kartoni = new ArrayList<>();
    }

    public Igrac() {
        this.kartoni = new ArrayList<>();
    }

    public void dodajKarton(String karton) {
        switch (karton) {
            case "crveni":
                this.kartoni.add(new Karton("crveni"));
                break;
            default:
                this.kartoni.add(new Karton("zuti"));
        }
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Broj dresa: " + this.broj + ", pozicija: " + this.pozicija);
        if (this.kapiten) {
            System.out.println("Ovaj igrac je ujedno i kapiten tima");
        }
        if (this.kartoni.size() > 0) {
            int zuti = 0;
            int crveni = 0;
            for (Karton karton : kartoni
            ) {
                if (karton.getTip().equals("zuti"))
                {
                    zuti++;
                }
                if (karton.getTip().equals("crveni")) {
                    crveni++;
                }
            }
            System.out.println("Ovaj igrac ima " + zuti + " zutih kartona i " + crveni + " crvenih");
        }

    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }
}