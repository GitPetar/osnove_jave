package p14_12_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        String znakSto;
        int brojSto;
        String znakIgrac;
        int brojIgrac;
        Scanner s = new Scanner(System.in);
        System.out.println("Znak karte na stolu:");
        znakSto = s.next();
        System.out.println("Broj karte na stolu:");
        brojSto = s.nextInt();
        System.out.println("Znak karte koju zelis da odigras:");
        znakIgrac = s.next();
        System.out.println("Broj karte koju zelis da odigras:");
        brojIgrac = s.nextInt();

if (znakSto.equals(znakIgrac) || brojSto == brojIgrac) {
    System.out.println("Potez je validan");
} else {
    System.out.println("Potez nije validan");
}
    }
}
