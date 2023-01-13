package domaci_12_01_2023;

import java.util.ArrayList;

public class ZeleniKarton {

    private String imeIPrezime, brojIndeksa, nazivPredmeta, imeIPrezimeProfesora;
    private int ocena;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
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

    public boolean ispitPolizen() {
        if (5 < ocena) {
            return true;
        }
        return false;
    }

    public void stampaj() {
        System.out.println(nazivPredmeta + ", ocena " + ocena);
        System.out.println("Student: " + imeIPrezime + ", broj indexa: " + brojIndeksa);
        System.out.println("Profesor: " + imeIPrezimeProfesora);
    }
}
