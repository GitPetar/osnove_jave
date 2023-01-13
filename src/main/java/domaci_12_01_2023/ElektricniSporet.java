package domaci_12_01_2023;

public class ElektricniSporet {
    String marka;
    int garancija = 5, maxUkljucenihRingli = 4;

    Ringla goreLevo, goreDesno, doleLevo, doleDesno;

    public ElektricniSporet(String marka, int garancija, int maxUkljucenihRingli, Ringla goreLevo, Ringla goreDesno, Ringla doleLevo, Ringla doleDesno) {
        this.marka = marka;
        this.garancija = garancija;
        this.maxUkljucenihRingli = maxUkljucenihRingli;
        if (maxUkljucenihRingli > 4) {
            this.maxUkljucenihRingli = 4;
        } else if (maxUkljucenihRingli < 1) {
            this.maxUkljucenihRingli = 1;
        }
        this.goreLevo = goreLevo;
        this.goreDesno = goreDesno;
        this.doleLevo = doleLevo;
        this.doleDesno = doleDesno;
    }

    public String getMarka() {
        return marka;
    }

    public int getGarancija() {
        return garancija;
    }

    public int getMaxUkljucenihRingli() {
        return maxUkljucenihRingli;
    }

    public Ringla getGoreLevo() {
        return goreLevo;
    }

    public Ringla getGoreDesno() {
        return goreDesno;
    }

    public Ringla getDoleLevo() {
        return doleLevo;
    }

    public Ringla getDoleDesno() {
        return doleDesno;
    }

    public void pojacaj(int naPoziciji) {
        switch (naPoziciji) {
            case 1:
                this.goreLevo.pojacajRinglu();
                break;
            case 2:
                this.goreDesno.pojacajRinglu();
                break;
            case 3:
                this.doleLevo.pojacajRinglu();
                break;
            case 4:
                this.doleDesno.pojacajRinglu();
                break;
            default:
                System.out.println("Ta ringla ne postoji");
        }
        int counter = 0;
        if (!this.goreLevo.ringlaJeIskljucena()) {
            counter++;
        }
        if (!this.goreDesno.ringlaJeIskljucena()) {
            counter++;
        }
        if (!this.doleLevo.ringlaJeIskljucena()) {
            counter++;
        }
        if (!this.doleDesno.ringlaJeIskljucena()) {
            counter++;
        }
        if (this.maxUkljucenihRingli < counter) {
            for (int i = 1; i <= 4; i++) {
                this.iskluci(i);
            }
            counter = 0;
            pojacaj(naPoziciji);
        }
    }

    public void iskluci(int naPoziciji) {
        switch (naPoziciji) {
            case 1:
                this.goreLevo.iskljuciRinglu();
                break;
            case 2:
                this.goreDesno.iskljuciRinglu();
                break;
            case 3:
                this.doleLevo.iskljuciRinglu();
                break;
            case 4:
                this.doleDesno.iskljuciRinglu();
                break;
            default:
                System.out.println("Ta ringla ne postoji");
        }
    }

    public int ukupnaPotrosnja(double vreme) {
        return this.goreLevo.potrosenaStruja(vreme) + this.goreDesno.potrosenaStruja(vreme) + this.doleLevo.potrosenaStruja(vreme) + this.doleDesno.potrosenaStruja(vreme);
    }

    public void stampaj() {
        System.out.println(this.marka + " - " + this.garancija + " godina garancije");
        System.out.println("Gore levo: ");
        this.goreLevo.stampaj();
        System.out.println("Gore desno:");
        this.goreDesno.stampaj();
        System.out.println("Dole levo: ");
        this.doleLevo.stampaj();
        System.out.println("Dole desno: ");
        this.doleDesno.stampaj();
    }
}
