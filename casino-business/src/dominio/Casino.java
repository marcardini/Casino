package dominio;

import java.util.List;

public class Casino {
    
    private int id;
    private List<Jugador> listaJugadoresRegistrados;
    private Estadistica estadisticasTodosLosJuegos;

    public Casino(List<Jugador> listaJugadores){
        this.listaJugadoresRegistrados = listaJugadores;
    }
    
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
    
    public Estadistica getEstadisticasTodosLosJuegos() {
        return estadisticasTodosLosJuegos;
    }
    
    public void setEstadisticasTodosLosJuegos(Estadistica estadisticasTodosLosJuegos) {
        this.estadisticasTodosLosJuegos = estadisticasTodosLosJuegos;
    }
   
}
