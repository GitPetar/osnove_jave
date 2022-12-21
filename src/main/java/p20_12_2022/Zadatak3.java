package p20_12_2022;

import java.util.Scanner;

//Zadatak
//Napisati program koji od korisnika ucitava brojeve sve dok ne unesu makar po jedan broj od 1 do 4.
//Primer:
//Unesite broj:1
//Unesite broj:2
//Unesite broj:2
//Unesite broj:3
//Unesite broj:0
//Unesite broj:5
//Unesite broj:3
//Unesite broj:4
//Kraj programa
//
//Objasnjenje: Od svakih 1, 2, 3 i 4 je unet po jedan.
public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int broj;
        while (counter1 == 0 || counter2 == 0 || counter3 == 0 || counter4 == 0) {
            System.out.print("Unesite broj: ");
            broj = s.nextInt();
            if (broj == 1) {
                counter1++;
            }
            if (broj == 2) {
                counter2++;
            }
            if (broj == 3) {
                counter3++;
            }
            if (broj == 4) {
                counter4++;
            }
        }
        System.out.println("Kraj programa.");
    }
}
