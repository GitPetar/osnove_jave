package p10_01_2023;

//opis
//korisnik (referenca na korisnika koji je kreirao post)
//konstrukore koje mislite da su vam potrebni
//metoda print, stampa u formatu:
//(ime) (prezime)
//(opis post-a)
public class FacebookPost {
    String opis;
    Korisnik korisnik = new Korisnik();

    public FacebookPost(String opis) {
        this.opis = opis;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public void print() {
        System.out.println(korisnik.getIme() + " " +korisnik.getPrezime() );
        System.out.println(opis);
    }
}
