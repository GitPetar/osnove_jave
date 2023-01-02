package XOTabla2;

import java.util.ArrayList;

public class XOTabla {
    private ArrayList<String> polje;
    private String winningLineX;
    private String winningLineO;
    private String imeXIgraca;
    private String imeOIgraca;
    private char naPotezu;
    private int brojPolja;

    public int getBrojPolja() {
        return brojPolja;
    }

    public void setBrojPolja(int brojPolja) {
        this.brojPolja = brojPolja;
    }

    public ArrayList<String> getPolje() {
        return polje;
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

    public void setPolje(ArrayList<String> polje) {
        this.polje = polje;
    }

    public void setImeXIgraca(String imeXIgraca) {
        this.imeXIgraca = imeXIgraca;
    }

    public void setImeOIgraca(String imeOIgraca) {
        this.imeOIgraca = imeOIgraca;
    }

    public void pokreniIgru() {
        winningLineX = "";
        winningLineO = "";
        polje.clear();
        for (int i = 0; i < brojPolja * brojPolja; i++) {
            polje.add("" + (i + 1));
        }
        for (int i = 0; i < brojPolja; i++) {
            winningLineX += 'X';
            winningLineO += 'O';
        }
        naPotezu = 'X';
    }

    public void stampaj() {
        System.out.print("|");
        for (int i = 0; i < brojPolja * brojPolja; i++) {
            if (i < 9 || !poljePrazno(i)) {
                System.out.print(" " + polje.get(i) + "|");
            } else {
                System.out.print("" + polje.get(i) + "|");
            }
            if ((i + 1) % brojPolja == 0) {
                System.out.println();
                if (i != (brojPolja * brojPolja) - 1) {
                    System.out.print("|");
                }
            }


        }
        System.out.println("Igrac X: " + imeXIgraca);
        System.out.println("Igrac O: " + imeOIgraca);
    }

    public boolean poljePrazno(int index) {
        if (!polje.get(index).equals("X") && !polje.get(index).equals("O")) {
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
            polje.set(index, "X");
        } else {
            polje.set(index, "O");
        }
    }

    public boolean popunjenaTabla() {
        for (int i = 0; i < brojPolja * brojPolja; i++) {
            if (poljePrazno(i)) {
                return false;
            }
        }
        return true;

    }

    public char checkWinner() {
        String line;
        for (int i = 0; i < brojPolja; i++) {
            line = "";
            for (int j = 0; j < brojPolja; j++) {
                line += polje.get((i * brojPolja) + j);
                if (line.equals(winningLineX)) {
                    return 'X';
                }
                if (line.equals(winningLineO)) {
                    return 'O';
                }
            }
        }
        for (int i = 0; i < brojPolja; i++) {
            line = "";
            for (int j = 0; j < brojPolja; j++) {
                line += polje.get(i + (j * brojPolja));
                if (line.equals(winningLineX)) {
                    return 'X';
                }
                if (line.equals(winningLineO)) {
                    return 'O';
                }
            }
        }
        line = "";
        for (int i = 0; i < brojPolja; i++) {
            line += polje.get(i * (brojPolja + 1));
            if (line.equals(winningLineX)) {
                return 'X';
            }
            if (line.equals(winningLineO)) {
                return 'O';
            }
        }
        line = "";
        for (int i = 0; i < brojPolja; i++) {
            line += polje.get((i + 1) * (brojPolja - 1));
            if (line.equals(winningLineX)) {
                return 'X';
            }
            if (line.equals(winningLineO)) {
                return 'O';
            }
        }

        return '0';
    }
}
