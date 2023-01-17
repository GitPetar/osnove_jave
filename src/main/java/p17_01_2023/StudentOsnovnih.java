package p17_01_2023;

public class StudentOsnovnih extends Student {
    public StudentOsnovnih(String imeIPrezime, String brojIndeksa, int godinaStudija) {
        super(imeIPrezime, brojIndeksa, godinaStudija);
    }

    @Override
    public int cenaSkolarine() {
        return 9000;
    }

    @Override
    public boolean naBudzetu() {
        if (this.godinaStudija < 5) {
            return true;
        }
        return false;
    }
}
