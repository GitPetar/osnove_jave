package p20_1_2022;

import java.util.Scanner;

//za veabanje) Napisati pogram koji vrsi korkeciju zvuka. Korisnik unosi akcije “pojacaj” ili “smanji” ili “play”. Program radi dok korisnik ne unese play. Inicijalna jacina zvuka je 75.
//Pojacaj - akcije koja povecava jacinu zvuka za 10
//smanji - akcija koja smajnjuje jacinu zvuka za 10.
//Zvuk nakon nijedne akcije ne sme da spadne ispod nule ili da ode preko 100.
//Na kraju programa odstampati jacinu zvuka.
//
//Primer izvrsenja:
//Unesite akciju: pojacaj (iz 75 u 85)
//Unesite akciju: pojacaj ( iz 85 u 95)
//Unesite akciju: pojacaj (iz 95 u 100)
//Unesite akciju: smanji (iz 100 u 90)
//Unesite akciju: smanji (iz 90 u 80)
//Unesite akciju: play
//Jacina zvuka je 80.
public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String komanda = "";
        int zvuk = 75;
        while (!komanda.contains("play")) {
            System.out.print("Unesite akciju: ");
            komanda = s.next();
            if (komanda.contains("pojacaj")) {
                zvuk += 10;
                if (100 < zvuk) {
                    zvuk = 100;
                }
            }
            if (komanda.contains("smanji")) {
                zvuk -= 10;
                if (zvuk < 0) {
                    zvuk = 0;
                }
            }
        }
        System.out.println("Jacina zvuka je: " + zvuk);
    }

}

