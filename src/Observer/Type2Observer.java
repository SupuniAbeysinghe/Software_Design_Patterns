package Observer;

public class Type2Observer implements Observer {
    @Override
    public void notifyMe(String event) {
        System.out.println("Type 2 observer recieved event" + event);

    }
}
