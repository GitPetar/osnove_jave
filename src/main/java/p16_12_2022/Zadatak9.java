package p16_12_2022;
//Napisati program koji iscrtava timeline na youtube videu. Korisnik unosi duzinu videa u sekundama i trenutno vreme u videu, a program iscrtava timeline tako sto deo koji je pogledan iscrtava zvezdicama a ostatak sa crticama. Timeline je kontrola koja ima tacno 100 karaktera.
//        Primer izvrsenja:
//        Unesite duzinu videa (s): 203
//        Unesite trenutno vreme videa (s): 20
//        (Objasnjenje:Ako video ima 203s a mi smo na 20s, to znaci da je pogledano 9.85% videa (zaokruzicemo to na 9zvezdice ostatak do 100 su crtice)
//        *********-------------------------------------------------------------------------------------------

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int duzina;
        int trenutnoVreme;
        int procenat;

        System.out.println("Unesite duzinu videa (s): ");
        duzina = s.nextInt();
        System.out.println("Unesite trenutno vreme videa (s): ");
        trenutnoVreme = s.nextInt();
        procenat = (100 * trenutnoVreme) / duzina;

        for (int i = 1; i <= 100; i++) {
            if (i <= procenat) {
                System.out.print("*");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
        System.out.print((trenutnoVreme / 60) + ":");
        System.out.print((trenutnoVreme % 60) / 10);
        System.out.print((trenutnoVreme % 60) % 10);
        System.out.print(" / ");
        System.out.print((duzina / 60) + ":");
        System.out.print((duzina % 60) / 10);
        System.out.print((duzina % 60) % 10);
    }
}
