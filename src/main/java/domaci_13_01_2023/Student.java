package domaci_13_01_2023;

import java.util.ArrayList;
import java.util.Random;

public class Student {
    private String brojIndeksa, imeIPrezime, tipStudija;
    private ArrayList<Ispit> ispiti;

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getimeIPrezime() {
        return imeIPrezime;
    }

    public void setimeIPrezime(String imeIPrezime) {
        imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspit() {
        return this.ispiti;
    }

    public void generateRandom(String imeIPrezime) {
        this.ispiti = new ArrayList<>();
        Random random = new Random();
        this.brojIndeksa = String.valueOf(random.nextInt(2147483647));
        this.imeIPrezime = imeIPrezime;
        for (int i = 0; i < random.nextInt(5) + 6; i++) {
            this.ispiti.add(new Ispit());
            this.ispiti.get(i).generateRandom();
        }
        switch (random.nextInt(3) + 1) {
            case 1:
                this.tipStudija = "Osnovne";
                break;
            case 2:
                this.tipStudija = "Master";
                break;
            case 3:
                this.tipStudija = "Doktorske";
                break;
            default:
                System.out.println("Error");
        }
    }

    public void dodajIspit(Ispit predmet) {
        this.ispiti.add(predmet);
    }

    public int prosek() {
        int counter = 0;
        int suma = 0;
        for (Ispit ispit : this.ispiti
        ) {
            if (ispit.polozen()) {
                counter++;
                suma += ispit.getOcena();
            }

        }
        return suma / counter;
    }

    public void stampaj() {
        System.out.println(this.brojIndeksa + " - " + this.imeIPrezime + " - " + this.tipStudija + " studije");
        System.out.println("Predmeti: ");
        for (Ispit ispit : this.ispiti
        ) {
            ispit.stampaj();

        }
        System.out.println("Prosecna ocena: " + this.prosek());
    }

}
