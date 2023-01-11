package domaci_10_01_2023;

public class Vaga {
    private String mernaJedinica;
    private Proizvod proizvod;

    Vaga() {
    }

    public String getMernaJedinica() {
        return mernaJedinica;
    }

    public void setMernaJedinica(String mernaJedinica) {
        this.mernaJedinica = mernaJedinica;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public double sracunajCenu(double tezina) {
        if (mernaJedinica.equals("kg")) {
            return proizvod.getCenaKg() * tezina;
        } else if (mernaJedinica.equals("lb")) {
            return proizvod.getCenaLb() * tezina;
        }
        return 0;
    }

    public void stampajRacun(double tezina) {
        proizvod.print();
        if (mernaJedinica.equals("kg")) {
            System.out.println("Cena po kilogramu je " + proizvod.getCenaKg());
            System.out.println("Ukupno: " + sracunajCenu(tezina));
        } else if (mernaJedinica.equals("lb")) {
            System.out.println("Cena po lb je " + proizvod.getCenaLb());
            System.out.println("Ukupno: " + sracunajCenu(tezina));
        }

    }
}
