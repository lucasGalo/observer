package observa;

import java.util.Date;

public class Evento {

    private final Date horaDaChegada;

    public Evento(Date horaDaChegada) {
        this.horaDaChegada = horaDaChegada;
    }

    public Date getHoraDaChegada() {
        return horaDaChegada;
    }
}
