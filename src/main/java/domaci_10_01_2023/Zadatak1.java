package domaci_10_01_2023;

//Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//(ime autora) (prezime autora)
//
//Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)
//
//	U glavnom programu napraviti vise autora sa vise knjiga.
public class Zadatak1 {
    public static void main(String[] args) {

        Autor petar = new Autor("Petar Kotevski");
        Knjiga knjiga = new Knjiga("12345", "Kako sam savladao Javu u jednom danu", 2023, petar);
        knjiga.print();
    }
}
