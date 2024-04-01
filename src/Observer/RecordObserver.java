package Observer;

public class RecordObserver implements Observer {
    @Override
    public void notifyMe(MatchEvent event) {

        //check whether any new records available
        //if so add those to database
        System.out.println("updating the records observer. ");

    }
}
