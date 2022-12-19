package p19_1_2022;
//Napisati program koji pronalazi 7 stepen broja 2. Koristeci FOR petlju
//Izvrsenje:
//2 na stepen 7 je 128
public class Zadatak3 {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i <=7 ; i++) {
            a = 2*a;

        }
        System.out.println("2 na stepen 7 je "+a);
    }
}
