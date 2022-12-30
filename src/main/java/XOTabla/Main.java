package XOTabla;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XOTabla tabla = new XOTabla();
        tabla.setPolje(new ArrayList<Character>());

        tabla.pokreniIgru();
        tabla.stampaj();
    }
}
