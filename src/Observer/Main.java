package Observer;

public class Main {
    public static void main(String[] args) {
        Observer winPredictor = new WinPredictorObserver();
        Observer battingCard = new BattingCardObserver();
        Observer bowlingCard = new BowlingCardObserver();
        Observer records = new RecordObserver();


        Subject subject = new Subject();
        subject.registerObserver(winPredictor);
        subject.registerObserver(battingCard);
        subject.registerObserver(bowlingCard);
        subject.registerObserver(records);

        MatchEvent event1 = new MatchEvent();
        event1.setBowlerName("Malinga");
        event1.setBat1Score(100);
        event1.setBat2Score(50);

        subject.notifyAllObservers(event1);

        subject.removeObserver(winPredictor);

        subject.notifyAllObservers(event1);


    }
}
