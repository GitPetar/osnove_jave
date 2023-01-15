package p13_01_2023;

import java.util.ArrayList;

public class InstagramPost {
   private ArrayList<InstagramImage> slike;
   private String opis;

    public void dodajSliku(InstagramImage s) {
        slike.add(s);
    }
}
