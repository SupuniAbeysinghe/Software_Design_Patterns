package Observer;

public class BattingCardObserver implements Observer {
    @Override
    public void notifyMe(MatchEvent event) {
        System.out.println("updating the batting card. Bat1" + event.getBat1Score() + "Bat2 " + event.getBat2Score());

    }
}
