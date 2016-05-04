package controlador;

import dominio.Jugador;
import dominio.ruleta.MesaRuleta;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import modelo.Fachada;
import vista.IVistaListMesas;

public class ControladorMesaRuleta implements Observer{

    private Fachada modelo = Fachada.getInstancia();
    private IVistaListMesas vista;
    private Jugador usu;

    @SuppressWarnings("static-access")
    public ControladorMesaRuleta(IVistaListMesas v, Jugador usu) {
        ArrayList<MesaRuleta> listaMesasRuleta = this.getListaMesasRuleta(usu);
        modelo.addObserver(this);
        vista = v;
        vista.mostrar(listaMesasRuleta);
    }
    
    @Override
    public void update(Observable o, Object evento) {
        if(evento.equals(Fachada.EVENTO_MESA_NUEVA)){
            vista.mostrar(modelo.getListaMesasRuleta());
        }
    }
 
    public static ArrayList<MesaRuleta> getListaMesasRuleta(Jugador usuario){
        ArrayList<MesaRuleta> retorno = new ArrayList();
        retorno.add(new MesaRuleta("Prueba", usuario));
        return retorno;
    }
}
