package domaci_17_01_2023;

public class AudioControl extends Control {
    private boolean zvukSePovecava;

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (zvukSePovecava) {
            videoPlayer.setJacinaZvuka(Math.min(videoPlayer.getJacinaZvuka() + 1, 100));
        } else {
            videoPlayer.setJacinaZvuka(Math.max(videoPlayer.getJacinaZvuka() - 1, 0));
        }
    }

    public AudioControl() {
    }

    public AudioControl(boolean zvukSePovecava) {
        this.zvukSePovecava = zvukSePovecava;
    }

    public void setZvukSePovecava(boolean zvukSePovecava) {
        this.zvukSePovecava = zvukSePovecava;
    }
}
