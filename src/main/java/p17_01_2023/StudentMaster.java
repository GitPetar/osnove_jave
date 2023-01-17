package p17_01_2023;

public class StudentMaster extends Student {

    public StudentMaster(String imeIPrezime, String brojIndeksa, int godinaStudija) {
        super(imeIPrezime, brojIndeksa, godinaStudija);
    }

    @Override
    public int cenaSkolarine() {
        return 100000;
    }

    @Override
    public boolean naBudzetu() {
        if (this.godinaStudija < 2) {
            return true;
        }
        return false;
    }
}
