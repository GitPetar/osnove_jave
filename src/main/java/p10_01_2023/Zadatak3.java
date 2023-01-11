package p10_01_2023;

import java.util.ArrayList;

//3.Zadatak
//Kreirati klasu Film koja ima:
//naziv filma
//iz koje godine je film
//konstruktore, gettere i settere
//metodu print koja stampa podatke u formatu
//naziv filma, godina
//
//
//Kreirati klasu Reziser koja ima:
//ime i prezime rezisera
//starost
//konstruktore, gettere i settere koji su potrebni
//metodu print koja stampa podatke u formatu
//ime prezime, starost.god
//
//U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda
public class Zadatak3 {
    public static void main(String[] args) {


        Film lordOfTheRings = new Film("Lord of the rings", 2000);
        lordOfTheRings.print();

        Reziser boban = new Reziser("Boban", 50);
        boban.getReziraniFilmovi().add(lordOfTheRings);
        boban.print();

        Film nekitamo = new Film();
        nekitamo.setIzGodine(1999);
        nekitamo.setNazivFilma("Neki tamo");
        nekitamo.print();

        Film nekitamo2 = new Film();
        nekitamo2.setIzGodine(2001);
        nekitamo2.setNazivFilma("Neki tamo 2");
        nekitamo2.print();

        Film nekitamo3 = new Film();
        nekitamo3.setIzGodine(2001);
        nekitamo3.setNazivFilma("Neki tamo 3");
        nekitamo3.print();

        Reziser milorad = new Reziser();
        milorad.setImeIPrezime("Milorad");
        milorad.setStarost(25);
        milorad.getReziraniFilmovi().add(nekitamo);
        milorad.getReziraniFilmovi().add(nekitamo2);
        milorad.getReziraniFilmovi().add(nekitamo3);
        milorad.print();
    }
}
