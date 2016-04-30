package controlador;

import vista.VistaNumeros;
import java.util.Observable;
import java.util.Observer;
import modelo.Fachada;
import modelo.Numero;
import dominio.Jugador;

public class ControladorNumeros implements Observer{
    
    private Fachada modelo = Fachada.getInstancia();
    private VistaNumeros vista;
    private Jugador usuario;

    public ControladorNumeros(VistaNumeros vista,Jugador u) {
        this.vista = vista;
        vista.mostrar(modelo.getNumeros());
        modelo.addObserver(this); //registro
        usuario = u;
    }

    @Override
    public void update(Observable o, Object arg) {
       if(arg.equals(Fachada.EVENTO_NUMEROS)){
            vista.mostrar(modelo.getNumeros());
       }
    }

    public void marcar(Numero n) {
        n.marcar(usuario);
    }
    
}
