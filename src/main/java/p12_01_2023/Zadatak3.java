package p12_01_2023;

import java.util.ArrayList;

//3.Zadatak (Za vezbanje)
//Kreirati klasu ViberKorisnik koja ima:
//ime i prezime
//broj telefona
//da li je trenutno aktivan (boolean)
//gettere, settere, konstuktore
//
//Kreirati klasu ViberPoruka koja ima:
//tekst poruke
//vreme kad je poslata poruka
//korisnika koji je poslao poruku
//korisnika kome je poslata poruka
//gettere i setere i konstuktore
//rekaciju na poruku
//metodu prikazi koja stampa podatke o poruci u formatu:
//From: [Ime i prezime korisnika] * Active Now ili Not Active - at [vreme kad je poslata]
//To: [Ime i prezime korisnika kome je poslata]
//[Tekst poruke] : [reakcija] from [korisnik koji je reagovao]
//
//POMOC: Trebace vam provera da li reakcija postoji to pravite u if-u
//if (this.reakcija != null)
//
//Kreirati klasu ViberReakcija koja ima:
//emoji (moze da bude sunglases, heart, smile, like ili sad)
//korisnika koji je reagovao
//U mainu kreirati nekoliko poruka izmedju dva korisnika i postavite nekoliko reakcija na poruke.
public class Zadatak3 {
    public static void main(String[] args) {

        ViberKorisnik petar = new ViberKorisnik("Petar Kotevski", "0645591736", true, new ViberReakcija());
        ViberKorisnik pjotr = new ViberKorisnik("Pjotr Kutovski", "6371955460", false, new ViberReakcija());

        ArrayList<ViberPoruka> poruke = new ArrayList<>();
        poruke.add(new ViberPoruka("desibe", "20:20", petar, pjotr));
        poruke.add(new ViberPoruka("evesam", "20:21", pjotr, petar));
        poruke.add(new ViberPoruka("sta ima novo?", "20:23", petar, pjotr));
        poruke.add(new ViberPoruka("evo nista.", "20:24", pjotr, petar));
        poruke.add(new ViberPoruka("Aj cao.", "20:25", petar, pjotr));
        poruke.add(new ViberPoruka("Prijatno.", "20:26", pjotr, petar));


        for (int i = 0; i < poruke.size(); i++) {
            poruke.get(i).prikazi();
        }
    }
}
