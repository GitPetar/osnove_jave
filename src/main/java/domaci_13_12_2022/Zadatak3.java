package domaci_13_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        int z;
        int x;
        int y;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter x: ");
        x = s.nextInt();
        System.out.print("Enter y: ");
        y = s.nextInt();
        z = (x-y)*(x-y);
        System.out.println("Z = "+z);

    }
}
