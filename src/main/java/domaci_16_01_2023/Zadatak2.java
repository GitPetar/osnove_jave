package domaci_16_01_2023;

import java.util.ArrayList;
import java.util.Scanner;

//Zadatak
//Kreirati klasu Karton koja ima:
//tip kartona (crveni, zuti)
//konstuktore za koje mislite da ce vam trebati
//gettere i settere za karton
//
//Kreirati klasu Osoba koja ima:
//ime i prezime
//jmbg
//godinu rodjenja
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere
//metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
//
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//niz kartona
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu dodaj karton, gde se dodaje karton u niz
//metodu koja vraca broj zutih kartona
//metodu koja vraca broj crvenih kartona
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//
//U glavnom programu kreirati igraca i dodati mu nekoliko kartona.
public class Zadatak2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Igrac> igraci = new ArrayList<>();
        ArrayList<Trener> treneri = new ArrayList<>();
        String input;
        int tempInt;

        System.out.print("Koliko igraca u timu zelite? ");
        tempInt = scanner.nextInt();
        for (int i = 0; i < tempInt; i++) {
            System.out.print("Ime i prezime: ");
            igraci.add(new Igrac());
            igraci.get(i).setImeIPrezime(scanner.next());
            System.out.print("Jmbg: ");
            igraci.get(i).setJmbg(scanner.next());
            System.out.print("Godina Rodjenja: ");
            igraci.get(i).setGodinaRodjenja(scanner.nextInt());
            System.out.print("Broj: ");
            igraci.get(i).setBroj(scanner.nextInt());
            System.out.print("Pozicija: ");
            igraci.get(i).setPozicija(scanner.next());
            System.out.print("Da li je igrac kapiten? da/ne ");
            input = scanner.next();
            if (input.equals("da")) {
                igraci.get(i).setKapiten(true);
            }
            System.out.print("A da mu damo neki karton? da/ne ");
            input = scanner.next();
            if (input.equals("da")) {
                System.out.print("crveni/zuti ");
                igraci.get(i).dodajKarton(scanner.next());
            }
        }

        System.out.print("Koliko trenera u timu zelite? ");
        tempInt = scanner.nextInt();
        for (int i = 0; i < tempInt; i++) {
            System.out.print("Ime i prezime: ");
            treneri.add(new Trener());
            treneri.get(i).setImeIPrezime(scanner.next());
            System.out.print("Jmbg: ");
            treneri.get(i).setJmbg(scanner.next());
            System.out.print("Godina Rodjenja: ");
            treneri.get(i).setGodinaRodjenja(scanner.nextInt());
            System.out.print("Godine iskustva: ");
            treneri.get(i).setGodineIskustva(scanner.nextInt());
            System.out.print("Kakav je ovo trener? ");
            treneri.get(i).setTip(scanner.next());

        }
        System.out.println("Treneri: ");
        for (Trener t : treneri
        ) {
            t.stampaj();

        }
        System.out.println();
        System.out.println("Igraci: ");
        for (Igrac i : igraci
        ) {
            i.stampaj();

        }
    }
}
