package controlador;

import vista.IVistaLogin;
import java.util.Observable;
import java.util.Observer;
import modelo.Fachada;
import dominio.Jugador;

public class ControladorLogin implements Observer {
    
    private Fachada modelo = Fachada.getInstancia();
    private IVistaLogin vista;

    public ControladorLogin(IVistaLogin vista) {
        this.vista = vista;
        modelo.addObserver(this);
        //Esta en true para que siempre muestre el boton de iniciar sesion
        vista.habilitar(true);
    }
    
    public void login(String usr,String pass){
        Jugador u = modelo.login(usr, pass);
        if(u==null){
            vista.errorLogin();
        }else{
            vista.ingresar(u);
        }
    }

    @Override
    public void update(Observable o, Object evento) {
        if(evento.equals(Fachada.EVENTO_LOGIN)){
            //Esta en true para que siempre muestre el boton de iniciar sesion
            vista.habilitar(true);
        }
    }
    
}