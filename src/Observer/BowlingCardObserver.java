package Observer;

public class BowlingCardObserver implements Observer {
    @Override
    public void notifyMe(MatchEvent event) {
        System.out.println("updating the bowling card. Bat1" + event.getBat1Score() + "Bat2 " + event.getBat2Score());

    }
}
