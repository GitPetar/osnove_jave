package p27_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

//1.Zad
////		Kreirati klasu Racun koja ima
////		broj racuna (npr: 840-23932-323)
////		ime i prezime vlasnika
////		stanje na racunu
////		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.
public class Zadatak1 {
    static ArrayList<Racun> racuni = new ArrayList<Racun>();

    public static void stampajRacune(ArrayList<Racun> racuni) {
        for (int i = 0; i < racuni.size(); i++) {
            System.out.println();
            System.out.println("User " + (i + 1));
            System.out.println(racuni.get(i).broj);
            System.out.println(racuni.get(i).imeIPrezime);
            System.out.println(racuni.get(i).stanje);
            System.out.println();
        }
    }

    public static void transakcija(Racun posiljalac, Racun primalac, int placeholder) {
        posiljalac.stanje -= placeholder;
        primalac.stanje += placeholder;

        System.out.println("Stanje nakon transakcije");
        System.out.println("Posiljalac: " + posiljalac.imeIPrezime + " " + posiljalac.broj + " stanje: " + posiljalac.stanje);
        System.out.println("Primalac: " + primalac.imeIPrezime + " " + primalac.broj + " stanje: " + primalac.stanje);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Racun racun1 = new Racun();
        racuni.add(racun1);
        Racun racun2 = new Racun();
        racuni.add(racun2);
        racun1.broj = "840-23932-323";
        racun1.imeIPrezime = "Petar Kotevski";
        racun1.stanje = 999999;

        racun2.broj = "840-23932-324";
        racun2.imeIPrezime = "Petor Kotuvski";
        racun2.stanje = 666666;

        stampajRacune(racuni);

        System.out.println("Posiljalac: " + racun1.imeIPrezime + " " + racun1.broj + " stanje: " + racun1.stanje);
        System.out.println("Primalac: " + racun2.imeIPrezime + " " + racun2.broj + " stanje: " + racun2.stanje);
        System.out.println();

        System.out.print("Unesite sumu za transakciju: ");
        int placeholder = scanner.nextInt();

        transakcija(racun1,racun2,placeholder);


    }
}
