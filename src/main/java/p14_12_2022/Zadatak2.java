package p14_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int dan;
        int mesec;
        int godina;

        System.out.print("Unesite dan: ");
        dan = s.nextInt();
        System.out.print("Unesite mesec:");
        mesec = s.nextInt();
        System.out.print("Unesite godinu: ");
        godina = s.nextInt();

        System.out.println(dan + "." + mesec + "." + godina);
    }
}
