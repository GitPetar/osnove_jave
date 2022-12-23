package domaci_21_12_2022;

import java.util.Scanner;

//Napisati metodu koja simulira download fajla. Fajl je tekstualnog tipa. Na pocetku programa korisnik unosi velicinu fajla (broj karaktera koji se skida) a zatim se sa tastature unosi niz spojenih karaktera (simulacija skinutog bloka) i ispisuje se napredak skidanja.
//Program radi dok se ne skine ceo fajl. Na kraju programa stampa se sadrzaj skinutog fajla.
public class Dodatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int velicina;
        int skinuto = 0;
        String blok;
        String fajl = "";
        System.out.print("Unesite velicinu fajla: ");
        velicina = s.nextInt();

        while (skinuto < velicina) {
            System.out.print("Unesite blok: ");
            blok = s.next();
            if (blok.length() + fajl.length() > velicina) {
            } else {
                fajl = fajl + blok;
                skinuto += blok.length();
                System.out.println("Downloaded " + ((skinuto * 100) / velicina) + "%");
            }
        }
        System.out.println("Sadrzaj skinutog fajla: " + fajl);
    }

}
