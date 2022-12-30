package PrviJavaTest;
//Zadatak (Grananja)
//Napisati program koji za dve unete osobe ispisuje koja je starija. Za svaku osobu se od  podataka unosi ime, godina, mesec i dan rodjenja. Na kraju programa ispisati koja je osoba starija.
//
//Primer izvrsenja 1:
//Unesite ime prve osobe: Pera
//Unesite godinu rodjenja prve osobe: 1998
//Unesite mesec rodjenja prve osobe: 10
//Unesite dan rodjenja prve osobe: 21
//Unesite ime druge osobe: Mika
//Unesite godinu rodjenja druge osobe: 1999
//Unesite mesec rodjenja druge osobe: 12
//Unesite dan rodjenja druge osobe: 15
//Pera je stariji.
//
//Primer izvrsenja 2:
//Unesite ime prve osobe: Pera
//Unesite godinu rodjenja prve osobe: 1998
//Unesite mesec rodjenja prve osobe: 10
//Unesite dan rodjenja prve osobe: 21
//Unesite ime druge osobe: Mika
//Unesite godinu rodjenja druge osobe: 1998
//Unesite mesec rodjenja druge osobe: 12
//Unesite dan rodjenja druge osobe: 15
//Pera je stariji.
//
//Primer izvrsenja 3:
//Unesite ime prve osobe: Pera
//Unesite godinu rodjenja prve osobe: 1998
//Unesite mesec rodjenja prve osobe: 10
//Unesite dan rodjenja prve osobe: 21
//Unesite ime druge osobe: Mika
//Unesite godinu rodjenja druge osobe: 1998
//Unesite mesec rodjenja druge osobe: 10
//Unesite dan rodjenja druge osobe: 15
//Mika je stariji.
//
//
//
//
//
//
//Primer izvrsenja 4:
//Unesite ime prve osobe: Pera
//Unesite godinu rodjenja prve osobe: 1998
//Unesite mesec rodjenja prve osobe: 10
//Unesite dan rodjenja prve osobe: 21
//Unesite ime druge osobe: Mika
//Unesite godinu rodjenja druge osobe: 1998
//Unesite mesec rodjenja druge osobe: 10
//Unesite dan rodjenja druge osobe: 21
//Iste su starosti.

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String imePrveOsobe;
        int godinaRodjenjaPrveOsobe;
        int mesecRodjenjaPrveOsobe;
        int danRodjenjaPrveOsobe;

        String imeDrugeOsobe;
        int godinaRodjenjaDrugeOsobe;
        int mesecRodjenjaDrugeOsobe;
        int danRodjenjaDrugeOsobe;

        System.out.print("Unesite ime prve osobe: ");
        imePrveOsobe = scanner.next();
        System.out.print("Unesite godinu rodjenja prve osobe: ");
        godinaRodjenjaPrveOsobe = scanner.nextInt();
        System.out.print("Unesite mesec rodjenja prve osobe: ");
        mesecRodjenjaPrveOsobe = scanner.nextInt();
        System.out.print("Unesite dan rodjenja prve osobe: ");
        danRodjenjaPrveOsobe = scanner.nextInt();

        System.out.print("Unesite ime Druge osobe: ");
        imeDrugeOsobe = scanner.next();
        System.out.print("Unesite godinu rodjenja Druge osobe: ");
        godinaRodjenjaDrugeOsobe = scanner.nextInt();
        System.out.print("Unesite mesec rodjenja Druge osobe: ");
        mesecRodjenjaDrugeOsobe = scanner.nextInt();
        System.out.print("Unesite dan rodjenja Druge osobe: ");
        danRodjenjaDrugeOsobe = scanner.nextInt();

        if (godinaRodjenjaPrveOsobe < godinaRodjenjaDrugeOsobe) {
            System.out.println(imePrveOsobe + " je stariji.");
        } else if (godinaRodjenjaDrugeOsobe < godinaRodjenjaPrveOsobe) {
            System.out.println(imeDrugeOsobe + " je stariji.");
        } else if (mesecRodjenjaPrveOsobe < mesecRodjenjaDrugeOsobe) {
            System.out.println(imePrveOsobe + " je stariji.");
        } else if (mesecRodjenjaDrugeOsobe < mesecRodjenjaPrveOsobe) {
            System.out.println(imeDrugeOsobe + " je stariji.");
        } else if (danRodjenjaPrveOsobe < danRodjenjaDrugeOsobe) {
            System.out.println(imePrveOsobe + " je stariji.");
        } else if (danRodjenjaDrugeOsobe < danRodjenjaPrveOsobe) {
            System.out.println(imeDrugeOsobe + " je stariji.");
        } else {
            System.out.println("Iste su starosti");
        }
    }
}
