package domaci_13_01_2023;

import java.util.ArrayList;
import java.util.Random;

public class Kombinacija {
    private String id;
    private ArrayList<Integer> niz;

    public Kombinacija(String id, int x1, int x2, int x3, int x4, int x5, int x6, int x7) {
        this.niz = new ArrayList<>();
        this.niz.add(x1);
        this.niz.add(x2);
        this.niz.add(x3);
        this.niz.add(x4);
        this.niz.add(x5);
        this.niz.add(x6);
        this.niz.add(x7);
        this.id = id;
    }

    public Kombinacija() {
        niz = new ArrayList<>();
        Random random = new Random();
        int tempInt;
        while (niz.size() < 7) {
            tempInt = random.nextInt(39) + 1;
            if (!niz.contains(tempInt)) {
                niz.add(tempInt);
            }
        }
        id = String.valueOf(random.nextInt(2147483647));
    }

    public String getId() {
        return id;
    }

    public boolean daLiJeIstaKombinacija(Kombinacija k) {
        for (int i = 0; i < this.niz.size(); i++) {
            if (this.niz.get(i) != k.niz.get(i)) {
                return false;
            }
        }
        return true;
    }

    public void stampaj() {
        System.out.println("ID: " + id);
        System.out.print("brojevi: " + this.niz.get(0));
        for (int i = 1; i < this.niz.size(); i++) {
            System.out.print(", " + niz.get(i));
        }

    }
}
