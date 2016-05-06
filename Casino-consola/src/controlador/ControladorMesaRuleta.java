package controlador;

import dominio.Jugador;
import dominio.ruleta.MesaRuleta;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import modelo.Fachada;
import vista.IVistaDatosRuleta;
import vista.IVistaListMesas;

public class ControladorMesaRuleta implements Observer{

    private Fachada modelo = Fachada.getInstancia();
    private IVistaDatosRuleta vista;
    private Jugador usu;
    private MesaRuleta mesa;

    public ControladorMesaRuleta(IVistaDatosRuleta v, MesaRuleta mesa, Jugador usu) {
        modelo.addObserver(this);
        vista = v;
        vista.mostrar(mesa,usu);
    }

    @Override
    public void update(Observable o, Object evento) {
        if(evento.equals(Fachada.EVENTO_INICIO_JUEGO)){
            //Esta en true para que siempre muestre el boton de iniciar sesion
            vista.mostrar(mesa,usu);
        }
    }
   
}
