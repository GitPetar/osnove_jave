package domaci_13_01_2023;

import java.util.Random;

public class Ispit {
    private String naziv, imeIPrezimeProfesora;
    private int ocena;
    private static int counter = 1;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getImeIPrezimeProfesora() {
        return imeIPrezimeProfesora;
    }

    public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public void generateRandom() {
        Random random = new Random();
        this.ocena = random.nextInt(6) + 5;
        this.imeIPrezimeProfesora = "Profesor " + counter;
        this.naziv = "Predmet " + counter;
        counter++;
    }

    public boolean polozen() {
        if (this.ocena > 5) {
            return true;
        }
        return false;
    }

    public void stampaj() {
        System.out.println(this.naziv + " - " + this.imeIPrezimeProfesora + " - ocena: " + this.ocena);
    }
}
