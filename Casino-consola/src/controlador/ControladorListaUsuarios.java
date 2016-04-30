package controlador;

import vista.VistaListaUsuarios;
import java.util.Observable;
import java.util.Observer;
import modelo.Fachada;
import dominio.Jugador;

public class ControladorListaUsuarios implements Observer{
    
    private Fachada modelo = Fachada.getInstancia();
    private Jugador usuario;
    //private VistaListaUsuarios vista;

    public ControladorListaUsuarios(Jugador usuario) {
        modelo.addObserver(this);
        this.usuario = usuario;
       // vista = v;
       // vista.mostrar(modelo.getLogueados());
    }

    @Override
    public void update(Observable o, Object evento) {
       // if(evento.equals(Fachada.EVENTO_LOGUEADOS)){
        //    vista.mostrar(modelo.getLogueados());
       // }
    }
    public void logout(){
        modelo.logout(usuario);
        modelo.deleteObserver(this);
    }
    
}
