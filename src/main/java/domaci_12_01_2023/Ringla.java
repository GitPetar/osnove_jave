package domaci_12_01_2023;

public class Ringla {
    private String tip;
    private int jacina = 0;
    private double jacinaGrejaca;

    public int getJacina() {
        return jacina;
    }

    public Ringla(String tip, double jacinaGrejaca) {
        this.tip = tip;
        this.jacinaGrejaca = jacinaGrejaca;
    }

    private int najvecaJacina() {
        if (this.tip.equals("obicna")) {
            return 3;
        } else if (this.tip.equals("ekspres")) {
            return 12;
        }
        System.out.println("Error, nepoznat tip ringle!");
        return 0;
    }

    public void pojacajRinglu() {
        if (this.najvecaJacina() != this.jacina) {
            this.jacina += 1;
            return;
        }
        System.out.println("Sta radis to!? Ringla je vec podesena na najjace!");
    }

    public void iskljuciRinglu() {
        this.jacina = 0;
    }

    public boolean ringlaJeIskljucena() {
        if (this.jacina == 0) {
            return true;
        }
        return false;
    }

    public int potrosenaStruja(double vreme) {
        return (int) (100 / this.najvecaJacina() * this.jacina * this.jacinaGrejaca * vreme);
    }

    public void stampaj() {
        if (this.ringlaJeIskljucena()) {
            System.out.println("Ringla je iskljucena.");
        } else {
            System.out.println("Ringla je ukljucena.");
        }
        System.out.println("Tip ringle: " + this.tip);
        System.out.println("Jacina: " + this.jacina);
        System.out.println("Grejac: " + this.jacinaGrejaca + "kW");
    }

}
