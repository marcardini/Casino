package controlador;

import dominio.Jugador;
import dominio.ruleta.JuegoRuleta;
import dominio.ruleta.MesaRuleta;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import modelo.Fachada;
import vista.IVistaListMesas;

public class ControladorListaMesas implements Observer {
    
    private Fachada modelo = Fachada.getInstancia();
    private IVistaListMesas vistaListaMesa;
    private Jugador usu;
    
    public ControladorListaMesas(IVistaListMesas v, Jugador usu){
        ArrayList<MesaRuleta> listaMesasRuleta = this.getListaMesasRuleta();
        modelo.addObserver(this);
        vistaListaMesa = v;
        vistaListaMesa.mostrar(listaMesasRuleta);
    }
    
    @Override
    public void update(Observable o, Object evento) {
        if(evento.equals(Fachada.EVENTO_MESA_NUEVA))
            vistaListaMesa.mostrar(modelo.getListaMesasRuleta());
    }
 
    public static ArrayList<MesaRuleta> getListaMesasRuleta(){
      return Fachada.getInstancia().getListaMesasRuleta();
    }
    
    public MesaRuleta crearMesa(String nombreNuevaMesa, Jugador usuarioCreador){
        if(!nombreNuevaMesa.equals(""))
            return Fachada.getInstancia().agregarMesaRuleta(nombreNuevaMesa, usuarioCreador);
        else
            vistaListaMesa.nombreInvalido();
        return null;
    }
    
    public MesaRuleta buscarMesa (String nombreMesaSeleccionada, Jugador usu){
        if(!nombreMesaSeleccionada.equals("No hay mesas elegibles")){
            String nombreRealMesa = recortarMensajePagina(nombreMesaSeleccionada);
            for(MesaRuleta iterator : modelo.getListaMesasRuleta()){
                if(iterator.getNombre().equals(nombreRealMesa)){
                    Fachada.getInstancia().agregarJugadorAMesa(iterator, usu);
                    //iterator.getListaJugadores().add(usu);
                    return iterator;
                }
            }
        }
        vistaListaMesa.listaMesasVacias();
        return null;
    }
    
    public ArrayList<MesaRuleta> controlarElegibles(ArrayList<MesaRuleta> listaOriginal){
        ArrayList<MesaRuleta> retorno = new ArrayList();
        
        for(MesaRuleta mesa : listaOriginal){
            if(mesa.getListaJugadores().size() < 4)
                retorno.add(mesa);
        }
        return retorno;
    }

    private String recortarMensajePagina(String nombreMesaSeleccionada){
        String nombreReal = nombreMesaSeleccionada.substring(5,nombreMesaSeleccionada.length()-26);
        
        return nombreReal;
    }
}
