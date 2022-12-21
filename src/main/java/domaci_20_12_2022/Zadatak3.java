package domaci_20_12_2022;

import java.util.Scanner;

//Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
//Primer izvrsenja 1:
//Unesite broj:1
//Unesite broj:2
//Unesite broj:0
//Unesite broj:2
//Kraj programa.
//(Objasnjenje: Kraj jer je uneto dve dvojke)
//
//Primer izvrsenja 1:
//Unesite broj:1
//Unesite broj:2
//Unesite broj:1
//Unesite broj:3
//Unesite broj:1
//Kraj programa.
//(Objasnjenje: Kraj jer je uneto tri jedinice)
public class Zadatak3 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean svetaIVeka = true;
        int broj;
        int jedinice = 0;
        int dvojke = 0;
        while (svetaIVeka) {
            System.out.print("Unesite broj: ");
            broj = s.nextInt();
            if (broj == 1) {
                jedinice++;
            }
            if (broj == 2) {
                dvojke++;
            }
            if (3 <= jedinice || 2 <= dvojke) {
                svetaIVeka = false;
            }
        }
        System.out.println("Kraj programa.");
    }

}
