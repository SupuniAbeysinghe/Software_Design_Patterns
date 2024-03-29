package Observer;

public class Type1Observer implements Observer {
    @Override
    public void notifyMe(String event) {
        System.out.println("Type 1 observer recieved event" + event);

    }
}
