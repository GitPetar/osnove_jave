package XOTabla4;

import java.util.ArrayList;

public class XOTabla {
    private ArrayList<String> polje = new ArrayList<String>();
    private String winningLineX;
    private String winningLineO;
    private String imeXIgraca;
    private String imeOIgraca;
    private char naPotezu;
    private int brojRedova;

    public int getBrojRedova() {
        return brojRedova;
    }

    public void setBrojRedova(int brojRedova) {
        this.brojRedova = brojRedova;
    }

    public String getImeXIgraca() {
        return imeXIgraca;
    }

    public String getImeOIgraca() {
        return imeOIgraca;
    }

    public char getNaPotezu() {
        return naPotezu;
    }

    public void setImeXIgraca(String imeXIgraca) {
        this.imeXIgraca = imeXIgraca;
    }

    public void setImeOIgraca(String imeOIgraca) {
        this.imeOIgraca = imeOIgraca;
    }

    public void winningLine(int tempInt) {
        winningLineX = "";
        winningLineO = "";
        for (int i = 0; i < tempInt; i++) {
            winningLineX += 'X';
            winningLineO += 'O';
        }
    }

    public void pokreniIgru() {

        polje.clear();
        for (int i = 0; i < brojRedova * brojRedova; i++) {
            polje.add("" + (i + 1));
        }
        naPotezu = 'X';
    }

    public void stampaj() {
        System.out.print("|");
        for (int i = 0; i < polje.size(); i++) {
            if (i < 9 || !poljePrazno(i)) {
                System.out.print(" " + polje.get(i) + "|");
            } else {
                System.out.print("" + polje.get(i) + "|");
            }
            if ((i + 1) % brojRedova == 0) {
                System.out.println();
                if (i != (polje.size()) - 1) {
                    System.out.print("|");
                }
            }
        }
        System.out.println("Igrac X: " + imeXIgraca);
        System.out.println("Igrac O: " + imeOIgraca);
    }

    public boolean poljePrazno(int index) {
        if (GameLogic.isBetweenOrEqual(0, index, polje.size() - 1)) {
            if (!polje.get(index).equals("X") && !polje.get(index).equals("O")) {
                return true;
            }
        }
        return false;
    }

    public void zameniIgraca() {
        if (naPotezu == 'X') {
            naPotezu = 'O';
        } else {
            naPotezu = 'X';
        }
    }

    public void odigrajPotez(int index) {
        index -= 1;
        if (poljePrazno(index)) {
            if (naPotezu == 'X') {
                polje.set(index, "X");
            } else {
                polje.set(index, "O");
            }
            zameniIgraca();
        } else {
            System.out.println("Potez nije validan!");
        }
    }

    public boolean popunjenaTabla() {
        for (int i = 0; i < brojRedova * brojRedova; i++) {
            if (poljePrazno(i)) {
                return false;
            }
        }
        return true;

    }

    public char checkWinner() {
        //Proverava sve linije
        StringBuilder line1 = new StringBuilder(); // Horizontalno
        StringBuilder line2 = new StringBuilder(); // Vertikalno
        StringBuilder line3 = new StringBuilder(); // Dijagonalno \
        StringBuilder line4 = new StringBuilder(); // Dijagonalno /
        for (int i = 0; i < brojRedova; i++) {
            for (int j = 0; j < brojRedova; j++) {
                line1.append(polje.get(i * brojRedova + j));
                line2.append(polje.get(j * brojRedova + i));
                line3.append(polje.get(j * brojRedova + j));
                line4.append(polje.get(j * brojRedova + (brojRedova - j - 1)));
            }
        }
        if (line1.toString().contains(winningLineX) || line2.toString().contains(winningLineX) || line3.toString().contains(winningLineX) || line4.toString().contains(winningLineX)) {
            return 'X';
        }
        if (line1.toString().contains(winningLineO) || line2.toString().contains(winningLineO) || line3.toString().contains(winningLineO) || line4.toString().contains(winningLineO)) {
            return 'O';
        }
        return '0';
    }

    public void proglasiPobednika() {
        if (checkWinner() == 'X') {
            System.out.println("Pobednik je " + getImeXIgraca() + "!");
        }
        if (checkWinner() == 'O') {
            System.out.println("Pobednik je " + getImeOIgraca() + "!");
        }
        if (popunjenaTabla()) {
            System.out.println("Nereseno");
        }
        System.out.println();
        System.out.print("Jos jedna igra? y/n: ");
    }

    public int aiLogika() {
        String temp;
        // First, check if the AI can win in the next move
        for (int i = 0; i < polje.size(); i++) {
            if (poljePrazno(i)) {
                temp = polje.get(i);
                polje.set(i, "O");
                if (checkWinner() == 'O') {
                    polje.set(i, temp);
                    return i;
                }
                polje.set(i, temp);
            }
        }

        // If the AI can't win, then check if it needs to block the player from winning
        for (int i = 0; i < polje.size(); i++) {
            if (poljePrazno(i)) {
                temp = polje.get(i);
                polje.set(i, "X");
                if (checkWinner() == 'X') {
                    polje.set(i, temp);
                    return i;
                }
                polje.set(i, temp);
            }
        }

        // If the AI can't win and doesn't need to block, then play randomly
        int index = (int) (Math.random() * polje.size());
        return index;
    }
}
