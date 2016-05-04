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

    @Override
    public void update(Observable o, Object arg) {
       //en caso de creacion de juegos dinamica implementar
    }

    public ControladorListaJuegos(IVistaListaJuegos v) {
        modelo.addObserver(this);
        vista = v;
        vista.mostrar(modelo.getListaJuegos());
    }
    
    public static ArrayList<Juego> getListaJuegos(){
        ArrayList<Juego> retorno = new ArrayList();
        
        retorno.add(new JuegoRuleta("Ruleta"));
        
        return retorno;
    }
    
    
}
