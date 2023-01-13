package domaci_12_01_2023;

public class Transakcija {
    private String id;
    private Racun prilivOd, prilivNa;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Racun getPrilivOd() {
        return prilivOd;
    }

    public void setPrilivOd(Racun prilivOd) {
        this.prilivOd = prilivOd;
    }

    public Racun getPrilivNa() {
        return prilivNa;
    }

    public void setPrilivNa(Racun prilivNa) {
        this.prilivNa = prilivNa;
    }

    public Transakcija(String id, Racun prilivOd, Racun prilivNa) {
        this.id = id;
        this.prilivOd = prilivOd;
        this.prilivNa = prilivNa;
    }

    private int provizija(int transakcija) {
        if (transakcija < 4500) {
            return 45;
        }
        return transakcija / 100;
    }

    public void izvrsiTransakciju(int transakcija) {
        if (this.prilivOd.getTrenutnoStanje() >= (transakcija + provizija(transakcija))) {
            this.prilivOd.promeniStanjeZa(-transakcija - provizija(transakcija));
            this.prilivNa.promeniStanjeZa(transakcija);
            stampaj(transakcija);
        } else {
            System.out.println("Nemate dovoljno sredstava za ovu transakciju");
        }
    }

    public void stampaj(int transakcija) {
        System.out.println(this.id);
        System.out.println("Priliv: " + transakcija);
        System.out.println("Racun sa: " + this.prilivOd.getImeIPrezime() + " - " + this.getPrilivOd().getBroj());
        System.out.println("Racun na: " + this.prilivNa.getImeIPrezime() + " - " + this.getPrilivNa().getBroj());
    }

    public void stampaj() {
        System.out.println(this.id);
        System.out.println("Racun sa: " + this.prilivOd.getImeIPrezime() + " - " + this.getPrilivOd().getBroj());
        System.out.println("Racun na: " + this.prilivNa.getImeIPrezime() + " - " + this.getPrilivNa().getBroj());
    }
}
