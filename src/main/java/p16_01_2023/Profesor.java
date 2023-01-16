package p16_01_2023;

public class Profesor extends Osoba {
    private String predaje;
    private double plata;

    public Profesor(String imeIPrezime, String jmbg, String predaje, int plata) {
        super(imeIPrezime, jmbg);
        this.predaje = predaje;
        this.plata = plata;
    }

    public void povecajPlatu(double procenat) {
        this.plata = this.plata * (procenat + 1);
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Predaje: " + predaje + " plata: " + plata + "RSD");
    }

}
