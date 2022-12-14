package p14_12_2022;

import java.util.Scanner;

public class Zadatak11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jacinazvuka = 75;
        String komanda;
        System.out.println("Dobrodosli na YouTube, trenutna jacina zvuka je 75.");
        System.out.println("Ako zelite da pojacate zvuk, upisite 'pojacaj'");
        System.out.println("Ako zelite da smanjite zvuk, upisite 'smanji'");
        System.out.println("Ako zelite da iskljucite zvuk, upisite 'mute'");
        for (int i = 0; i < 5; i++) {
            System.out.println("Upisite komandu za menjanje zvuka: ");
            komanda = s.next();
            if (komanda.equals("pojacaj")) {
                jacinazvuka = jacinazvuka + 10;
                if (jacinazvuka >= 0 && jacinazvuka <=100){
                }else if (jacinazvuka > 100) {
                    jacinazvuka = 100;
                } else if (jacinazvuka < 0) {
                    jacinazvuka = 0;
                }
                System.out.println("Trenutna jacina zvuka je " + jacinazvuka);
            } else if (komanda.equals("smanji")) {
                jacinazvuka = jacinazvuka - 10;
                if (jacinazvuka >= 0 && jacinazvuka <=100){
                }else if (jacinazvuka > 100) {
                    jacinazvuka = 100;
                } else if (jacinazvuka < 0) {
                    jacinazvuka = 0;
                }
                System.out.println("Trenutna jacina zvuka je " + jacinazvuka);
            } else if (komanda.equals("mute")) {
                jacinazvuka = 0;
                if (jacinazvuka >= 0 && jacinazvuka <=100){
                }else if (jacinazvuka > 100) {
                    jacinazvuka = 100;
                } else if (jacinazvuka < 0) {
                    jacinazvuka = 0;
                }
                System.out.println("Trenutna jacina zvuka je " + jacinazvuka);
            }


        }


    }
}
