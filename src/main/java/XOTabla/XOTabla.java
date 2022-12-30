package XOTabla;

import java.util.ArrayList;

public class XOTabla {
    private ArrayList<Character> polje;
    private String imeXIgraca;
    private String imeOIgraca;
    private char naPotezu;

    public String getImeXIgraca() {
        return imeXIgraca;
    }

    public String getImeOIgraca() {
        return imeOIgraca;
    }

    public char getNaPotezu() {
        return naPotezu;
    }

    public void setPolje(ArrayList<Character> polje) {
        this.polje = polje;
    }

    public void setImeXIgraca(String imeXIgraca) {
        this.imeXIgraca = imeXIgraca;
    }

    public void setImeOIgraca(String imeOIgraca) {
        this.imeOIgraca = imeOIgraca;
    }

    public void pokreniIgru() {
        polje.clear();
        for (int i = 0; i < 9; i++) {
            polje.add(' ');
        }
        naPotezu = 'X';
    }

    public void stampaj() {
        System.out.print("|");
        for (int i = 0; i < 9; i++) {
            System.out.print("" + polje.get(i) + "|");
            if ((i + 1) % 3 == 0) {
                System.out.println();
                if (i != 8) {
                    System.out.print("|");
                }
            }


        }
        System.out.println("Igrac X: " + imeXIgraca);
        System.out.println("Igrac O: " + imeOIgraca);
    }

    public boolean poljePrazno(int index) {
        if (polje.get(index) == ' ') {
            return true;
        } else {
            return false;
        }
    }

    public void zameniIgraca() {
        if (naPotezu == 'X') {
            naPotezu = 'O';
        } else {
            naPotezu = 'X';
        }
    }

    public void odigrajPotez(int index) {
        if (naPotezu == 'X') {
            polje.set(index, 'X');
        } else {
            polje.set(index, 'O');
        }
    }

    public boolean popunjenaTabla() {
        for (int i = 0; i < 9; i++) {
            if (poljePrazno(i)) {
                return false;
            }
        }
        return true;

    }

    public boolean pobednikX() {
        if (polje.get(0) == 'X' && polje.get(1) == 'X' && polje.get(2) == 'X') {
            return true;
        }
        if (polje.get(3) == 'X' && polje.get(4) == 'X' && polje.get(5) == 'X') {
            return true;
        }
        if (polje.get(6) == 'X' && polje.get(7) == 'X' && polje.get(8) == 'X') {
            return true;
        }
        if (polje.get(0) == 'X' && polje.get(3) == 'X' && polje.get(6) == 'X') {
            return true;
        }
        if (polje.get(1) == 'X' && polje.get(4) == 'X' && polje.get(7) == 'X') {
            return true;
        }
        if (polje.get(2) == 'X' && polje.get(5) == 'X' && polje.get(8) == 'X') {
            return true;
        }
        if (polje.get(0) == 'X' && polje.get(4) == 'X' && polje.get(8) == 'X') {
            return true;
        }
        if (polje.get(2) == 'X' && polje.get(4) == 'X' && polje.get(6) == 'X') {
            return true;
        }
        return false;
    }

    public boolean pobednikO() {
        if (polje.get(0) == 'O' && polje.get(1) == 'O' && polje.get(2) == 'O') {
            return true;
        }
        if (polje.get(3) == 'O' && polje.get(4) == 'O' && polje.get(5) == 'O') {
            return true;
        }
        if (polje.get(6) == 'O' && polje.get(7) == 'O' && polje.get(8) == 'O') {
            return true;
        }
        if (polje.get(0) == 'O' && polje.get(3) == 'O' && polje.get(6) == 'O') {
            return true;
        }
        if (polje.get(1) == 'O' && polje.get(4) == 'O' && polje.get(7) == 'O') {
            return true;
        }
        if (polje.get(2) == 'O' && polje.get(5) == 'O' && polje.get(8) == 'O') {
            return true;
        }
        if (polje.get(0) == 'O' && polje.get(4) == 'O' && polje.get(8) == 'O') {
            return true;
        }
        if (polje.get(2) == 'O' && polje.get(4) == 'O' && polje.get(6) == 'O') {
            return true;
        }
        return false;
    }
}
