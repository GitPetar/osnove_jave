package domaci_14_12_2022;

import java.util.Scanner;

//6. (Za vezbanje)Napisati program koji ucitava 4 broja (a,b,c,d) i formira string p (p ima startni deo #) tako sto negativne brojeve lepi sa leve strane a pozitivne i nulu sa desne.
public class Zadatak6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        String p = "#";
        System.out.println("Unesite a: ");
        n = s.nextInt();
        if (n < 0) {
            p = n + " " + p;
        } else {
            p = p + " " + n;
        }
        System.out.println(p);
        System.out.println("Unesite b: ");
        n = s.nextInt();
        if (n < 0) {
            p = n + " " + p;
        } else {
            p = p + " " + n;
        }
        System.out.println(p);
        System.out.println("Unesite c: ");
        n = s.nextInt();
        if (n < 0) {
            p = n + " " + p;
        } else {
            p = p + " " + n;
        }
        System.out.println(p);
        System.out.println("Unesite d: ");
        n = s.nextInt();
        if (n < 0) {
            p = n + " " + p;
        } else {
            p = p + " " + n;
        }
        System.out.println(p);

    }
}
