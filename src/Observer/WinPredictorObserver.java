package Observer;

public class WinPredictorObserver implements Observer {
    @Override
    public void notifyMe(MatchEvent event) {
        //calculate the win precentage based on the new event data
        System.out.println("updating the win predictor");

    }
}
