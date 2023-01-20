package p19_01_2023;

import p17_01_2023.Pravougaonik;
import p17_01_2023.Figura;
import p17_01_2023.JednakostranicniTrougao;

import java.util.ArrayList;

//U glavnoj klasi kreirati niz od 5 figura (2 trougla, 3 pravougaonika) zatim sabrati sve povrsine i obime i za svaku
// figuru ispisati ponaosob
public class Zadatak1 {
public static void main(String[] args) {
    ArrayList<Figura> figure = new ArrayList<>();
    figure.add(new Pravougaonik(10, 20));
    figure.add(new Pravougaonik(20, 30));
    figure.add(new Pravougaonik(2, 5));
    figure.add(new JednakostranicniTrougao(15));
    figure.add(new JednakostranicniTrougao(10));
    double povrsinaZbir = 0;
    double obimZbir = 0;
    for (Figura figura : figure) {
        figura.print();
        povrsinaZbir += figura.povrsina();
        obimZbir += figura.obim();
    }
    System.out.println("Obim svih figura je " + obimZbir);
    System.out.println("Povrsina svih figura je " + povrsinaZbir);
}
}
