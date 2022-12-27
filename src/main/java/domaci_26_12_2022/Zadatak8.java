package domaci_26_12_2022;

//(Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
public class Zadatak8 {
    public static void main(String[] args) {
        System.out.println("Najmanji broj od prosledjenih je "+min(100,101,-102));
    }

    public static int min(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else if (c <= a && c <= b) {
            return c;
        } else {
            return 0;
        }
    }
}
