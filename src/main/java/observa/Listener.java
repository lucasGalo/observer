package observa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Listener extends Thread{

    private List<Observer> observes = new ArrayList<>();

    public void addObserver(Observer observer){
        this.observes.add(observer);
    }

    @Override
    public void run() {

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Número:");
            int valor = scanner.nextInt();


            if(valor == 1){
                Evento event = new Evento(new Date());


                // Notifica os observadores
                for(Observer observer: this.observes){
                    observer.chegou(event);
                }
            }else{
                System.out.println("Nada!");
            }
        }
    }
}
