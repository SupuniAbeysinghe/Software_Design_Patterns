package Observer;

public class MatchEvent {
    private int currentover;
    private int delivary;
    private int bat1Score;
    private int bat2Score;

    private String bowlerName;

    public String getBowlerName() {
        return bowlerName;
    }

    public void setBowlerName(String bowlerName) {
        this.bowlerName = bowlerName;
    }
//add all other properties


    public int getCurrentover() {
        return currentover;
    }

    public void setCurrentover(int currentover) {
        this.currentover = currentover;
    }

    public int getDelivary() {
        return delivary;
    }

    public void setDelivary(int delivary) {
        this.delivary = delivary;
    }

    public int getBat1Score() {
        return bat1Score;
    }

    public void setBat1Score(int bat1Score) {
        this.bat1Score = bat1Score;
    }

    public int getBat2Score() {
        return bat2Score;
    }

    public void setBat2Score(int bat2Score) {
        this.bat2Score = bat2Score;
    }
}
