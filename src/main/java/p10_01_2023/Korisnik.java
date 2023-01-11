package p10_01_2023;

//Kreirati klasu Korisnik koja ima
//ime
//prezime
//gettere i settere za ime i prezime
//konstuktore koje mislite da su vam potrebni
//metoda koja stampa u formatu:
//(ime) (prezime)
public class Korisnik {
    private String ime, prezime;

    public Korisnik() {
    }

    public Korisnik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

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

    public void print() {
        System.out.println(ime + " " + prezime);
    }
}
