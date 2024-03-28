package Singleton;

public class Main {
    public static void main(String[] args) {
        Clipboard clipboard1 = Clipboard.getInstance();
        Clipboard clipboard2 = Clipboard.getInstance();


        clipboard1.copy("hello world");

        clipboard2.copy("Foo bar");
        System.out.println(clipboard1.paste());
        System.out.println(clipboard2.paste());
    }
}