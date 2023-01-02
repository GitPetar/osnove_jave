package XOTabla2;

//Ova klasa sluzi da stavljam static metode u nju
public class GameLogic {
    //Metod koji sluzi da spreci crash usled pogresnog unosa
    //Vraca true ako je moguce pretvoriti string u integer, false ako ne
    public static boolean isInteger(String input) {
        try {
            int tempInt = Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isBetweenOrEqual(int min, int inputInt, int max) {
        if (inputInt <= max && min <= inputInt) {
            return true;
        }
        return false;
    }
}
