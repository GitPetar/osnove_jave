package p29_12_2022;
//Kreirati klasu Student koja ima:
//ime
//prezime
//broj indeksa (int)
//da li je na budzetu
//gettere i settere za sve atributge
public class Student {
    String ime;
    String prezime;
    int brojIndeksa;
    boolean naBudzetu;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public boolean isNaBudzetu() {
        return naBudzetu;
    }

    public void setNaBudzetu(boolean naBudzetu) {
        this.naBudzetu = naBudzetu;
    }
}
