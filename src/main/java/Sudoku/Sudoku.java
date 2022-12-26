package Sudoku;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {

        //varijable

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int a; //broj polja
        int placeholderInt;
        System.out.print("Unesite broj polja a x a: ");
        a = scanner.nextInt();

        //lista svih brojeva
        ArrayList<Integer> sviBrojevi = new ArrayList<Integer>();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                sviBrojevi.add(i);

            }

        }
        //rasporedjivanje brojeva

        ArrayList<Integer> placeholder = new ArrayList<>(sviBrojevi);
        sviBrojevi.clear();

        for (int i = 0; i < a*a; i++) {
            placeholderInt = random.nextInt(placeholder.size());
            sviBrojevi.add(placeholder.get(placeholderInt));
            placeholder.remove(placeholderInt);

        }

        while (true){
            for (int i = 0; i < a; i++) {
                placeholder.add(sviBrojevi.get(i));

            }
        }
    }
}
