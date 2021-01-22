package observa;

public class Receptor implements Observer {

    public void chegou(Evento ev) {
        System.out.println("Executar evento!");
        System.out.println("corpo evento");
        System.out.println("Finalizar evento");
    }
}
