package dominio;

import java.util.List;

public class Casino {
    
    private int id;
    private List<Jugador> listaJugadoresRegistrados;

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public List<Jugador> getListaJugadoresRegistrados() {
        return listaJugadoresRegistrados;
    }
    
    public void setListaJugadoresRegistrados(List<Jugador> listaJugadoresRegistrados) {
        this.listaJugadoresRegistrados = listaJugadoresRegistrados;
    }

}
