package domaci_16_12_2022;

import java.util.Scanner;

//Napisati program koji za uneti broj x (smatrajte da korisnik unosi jednocifreni broj) ispisuje tablicu mnozenja za taj broj.
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int a = s.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));

        }

    }


}
