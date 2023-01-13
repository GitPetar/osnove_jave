package p12_01_2023;

import java.util.ArrayList;

//3.Zadatak
//Kreirati klasu Sastojak koja ima:
//naziv sastojka
//cenu
//gettere i settere
//konstuktore
//
//
//--U glavnom programu kreirati 3 sastojka.
// U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika. Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e
public class Zadatak4 {
    public static void main(String[] args) {
        ArrayList<Sastojak> sastojci = new ArrayList<>();
        sastojci.add(new Sastojak("Jabuka", 20));
        sastojci.add(new Sastojak("Kruska", 21));
        sastojci.add(new Sastojak("Banana", 31));

        for (int i = 0; i < sastojci.size(); i++) {
            System.out.print(sastojci.get(i).getNaziv() + " ");
            System.out.println(sastojci.get(i).getCena());

        }

    }
}
