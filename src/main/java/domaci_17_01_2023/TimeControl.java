package domaci_17_01_2023;

public class TimeControl extends Control {

    private boolean forward;

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (this.forward) {
            videoPlayer.setTrenutnoVreme(Math.min(videoPlayer.getTrenutnoVreme() + 15, videoPlayer.getDuzina()));

        } else {
            videoPlayer.setTrenutnoVreme(Math.max(videoPlayer.getTrenutnoVreme() - 15, 0));
        }
    }

    public TimeControl() {
    }

    public TimeControl(boolean forward) {
        this.forward = forward;
    }

    public void setForward(boolean forward) {
        this.forward = forward;
    }
}
