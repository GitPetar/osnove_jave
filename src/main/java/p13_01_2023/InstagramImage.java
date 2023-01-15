package p13_01_2023;

import java.util.ArrayList;

public class InstagramImage {
   private ArrayList<InstagramTag> tagovi;
   private int xDimenzijaSlike, yDimenzijaSlike;
   private String link;

    public void dodajTag(InstagramTag t) {
        tagovi.add(t);
    }
}
