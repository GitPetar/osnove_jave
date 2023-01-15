package p13_01_2023;

//Zadatak
//
//Kreirati klasu Sastojak koja ima:
//naziv
//cenu
//gettere i settere
//konstruktore
//metodu za stampanje koja stampa  podatke u formatu:
//naziv - cena.din
//
//	Kreirati klasu Pasta koja ima:
//niz sastojaka
//metodu za dodavanje sastojka
//defaultni konstruktor
//metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//metodu za stampu koja stampa podatke u formatu:
//Pasta je sa sastojcima:
//naziv - cena.din
//naziv - cena.din
//naziv - cena.din
//Cena paste je cena.din
//
//
//(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.
//
//U glavnom programu kreirati objekte i testirati funkcionalnosti
public class Zadatak1 {
    public static void main(String[] args) {
        Pasta pasta = new Pasta();
        pasta.dodajSastojak(new Sastojak("Paradajz", 25));
        pasta.dodajSastojak(new Sastojak("Mleveno meso", 100));
        pasta.dodajSastojak(new Sastojak("Majonez", 60));
        pasta.dodajSastojak(new Sastojak("Kecap", 99));
        pasta.dodajSastojak(new Sastojak("Luk", 50));

        pasta.brisiSastojak("Majonez");

        pasta.stampaj();

        System.out.println("Ukupna cena paste je " + pasta.racunajCenu());
    }
}
