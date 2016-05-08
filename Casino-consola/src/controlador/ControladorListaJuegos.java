package controlador;

import vista.IVistaListaJuegos;
import dominio.Juego;
import dominio.ruleta.JuegoRuleta;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import modelo.Fachada;

public class ControladorListaJuegos implements Observer{
    
    private Fachada modelo = Fachada.getInstancia();
    private IVistaListaJuegos vista;
    private ArrayList<Juego> listaJuegos;
    
    @Override
    public void update(Observable o, Object arg) {
       //en caso de creacion de juegos dinamica implementar
    }

    public ControladorListaJuegos(IVistaListaJuegos v) {
        modelo.addObserver(this);
        vista = v;
        vista.mostrar(modelo.getListaJuegos());
        listaJuegos = new ArrayList();
        
        listaJuegos.add(new JuegoRuleta("Ruleta"));
    }

    public ArrayList<Juego> getListaJuegos() {
        return listaJuegos;
    }
    

    
    
}
