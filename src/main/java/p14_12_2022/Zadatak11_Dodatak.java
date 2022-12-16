package p14_12_2022;

public class Zadatak11_Dodatak {
    public static int jacinazvuka = 75;

    public static void pojacaj() {
        jacinazvuka = jacinazvuka + 10;
        if (jacinazvuka >= 0 && jacinazvuka <= 100) {
        } else if (jacinazvuka > 100) {
            jacinazvuka = 100;
        } else if (jacinazvuka < 0) {
            jacinazvuka = 0;
        }
        System.out.println("Trenutna jacina zvuka je " + jacinazvuka);

    }
    public static void smanji() {jacinazvuka = jacinazvuka - 10;
        if (jacinazvuka >= 0 && jacinazvuka <=100){
        }else if (jacinazvuka > 100) {
            jacinazvuka = 100;
        } else if (jacinazvuka < 0) {
            jacinazvuka = 0;
        }
        System.out.println("Trenutna jacina zvuka je " + jacinazvuka);}
    public static void mute() {jacinazvuka = 0;
        if (jacinazvuka >= 0 && jacinazvuka <= 100) {
        } else if (jacinazvuka > 100) {
            jacinazvuka = 100;
        } else if (jacinazvuka < 0) {
            jacinazvuka = 0;
        }
        System.out.println("Trenutna jacina zvuka je " + jacinazvuka);}

}


