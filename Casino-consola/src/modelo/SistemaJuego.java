package modelo;

import dominio.Juego;
import dominio.ruleta.JuegoRuleta;
import java.util.ArrayList;

public class SistemaJuego {
    
    private ArrayList<Juego> listaJuegos = new ArrayList();
    
    public SistemaJuego(){
        listaJuegos.add(new JuegoRuleta("Ruleta"));
        //agregar todos los juegos que se necesiten
        
    }

    public void setListaJuegos(ArrayList<Juego> listaJuegos) {
        this.listaJuegos = listaJuegos;
    }

    public ArrayList<Juego> getListaJuegos() {
        return listaJuegos;
    }
}
