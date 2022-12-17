package domaci16_12_2022;
import java.util.Scanner;
//Napisati program koji simulira alarm. Alarm se ponavlja na svakih 5minuta narednih pola sata. Korisnik unosi sat i minut za koji zeli da navije alarm a program prikazuje vremena u kojima ce se alarm aktivirati
public class ZaVezbanje1 {
    static int sat;
    static int minut;
    static String vreme;
    public static void vreme() {
        if (minut >= 60) {
            minut = minut - 60;
            sat = sat + 1;
        }
        if (sat >= 24) {
            sat = sat - 24;
        }
        vreme = String.valueOf(sat/10)+String.valueOf(sat%10)+":"+String.valueOf(minut/10)+String.valueOf(minut%10);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite sat: ");
        sat = s.nextInt();
        System.out.println("Unesite minut: ");
        minut = s.nextInt();
        System.out.println("Aktivirace se u: ");
        for (int i = 0; i < 7; i++) {
            vreme();
            System.out.println(vreme);
            minut = minut + 5;


        }
    }
}
