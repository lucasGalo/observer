package observa;

public class Main {

    public static void main(String[] args) {
        Receptor receptor = new Receptor();
        Listener listener =  new Listener();

        listener.addObserver(receptor);
        listener.start();
    }
}
