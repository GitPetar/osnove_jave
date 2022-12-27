package domaci_26_12_2022;

//Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//Primer izvrsenja:
//izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
//
//Napomena: Resiti bez koriscenja petlji.
public class Zadatak7 {
    public static void main(String[] args) {
        System.out.println(izmedju(25, 50));
    }

    public static int izmedju(int x, int y) {
        return y - 1 - x;
    }
}
