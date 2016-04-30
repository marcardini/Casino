
package modelo;

import dominio.Jugador;
import dominio.ruleta.JugadorRuleta;
import dominio.ruleta.MesaRuleta;
import java.math.BigDecimal;
import java.util.ArrayList;

public class SistemaMesaRuleta {
    private ArrayList<MesaRuleta> listaMesas = new ArrayList();

    public SistemaMesaRuleta() {
        
    }
    
    public void crearMesaRuleta(String nombreMesa, Jugador creadorMesa) {
        
        Jugador nuevoJugador = new Jugador(creadorMesa.getNombre(), null, null, creadorMesa.getSaldo());
        listaMesas.add(new MesaRuleta(nombreMesa, nuevoJugador));
        
    }
    public ArrayList<MesaRuleta> getListaMesas() {
        return listaMesas;
    }

    public boolean agrgarJugadorMesaRuleta(Jugador jugadorMesaRuleta, MesaRuleta mesaJugador){
       
            if(mesaJugador.agregarJugadorRuleta(jugadorMesaRuleta)){
                return true;
            }else{
                return false;
            }
            
        
    
    }
    
    public void setListaMesas(ArrayList<MesaRuleta> listaMesas) {
        this.listaMesas = listaMesas;
    }
    
    
    
}
