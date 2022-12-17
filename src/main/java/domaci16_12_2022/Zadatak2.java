package domaci16_12_2022;

//Napisati program koji stampa 25 _ (donjih crta), pritom na svaku 5. iteraciju odstampa i novi red. Zadatak resiti pomocu FOR petlje.
//        Primer izvrsenja:
public class Zadatak2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++) {
            System.out.print("_ ");
            if (i % 5 == 0) {
                System.out.println();
            }

        }

    }

}

