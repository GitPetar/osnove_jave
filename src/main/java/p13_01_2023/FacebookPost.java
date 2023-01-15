package p13_01_2023;

import java.util.ArrayList;

public class FacebookPost {
   private String imeIPrezime, tekst;
   private ArrayList<Reakcija> reakcije;

    public FacebookPost() {
        this.reakcije = new ArrayList<>();
    }

    public FacebookPost(String imeIPrezime, String tekst) {
        this.imeIPrezime = imeIPrezime;
        this.tekst = tekst;
        this.reakcije = new ArrayList<>();
    }

    public void reaguj(String reakcija, String imeIPrezime) {
        for (int i = 0; i < this.reakcije.size(); i++) {
            if (this.reakcije.get(i).getImeIPrezime().equals(imeIPrezime)) {
                this.reakcije.remove(i);
            }
        }
        this.reakcije.add(new Reakcija(reakcija, imeIPrezime));
    }

    private int brojReakcijeTipa(String tip) {
        int counter = 0;
        for (Reakcija reakcija : this.reakcije
        ) {
            if (reakcija.getTipReakcije().equals(tip)) {
                counter++;
            }
        }
        return counter;
    }
    public void stampaj(){
        System.out.println(this.imeIPrezime);
        System.out.println(this.tekst);
        System.out.println("Smajli "+brojReakcijeTipa("smajli")+" | Like "+brojReakcijeTipa("like")+" | Srce "+brojReakcijeTipa("srce"));
    }
}
