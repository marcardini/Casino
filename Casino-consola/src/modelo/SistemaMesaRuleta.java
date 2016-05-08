package modelo;

import dominio.Jugador;
import dominio.ruleta.CasilleroRuleta;
import dominio.ruleta.MesaRuleta;
import java.awt.Color;
import java.util.ArrayList;

public class SistemaMesaRuleta {
  
    private ArrayList<MesaRuleta> listaMesas = new ArrayList();

    private ArrayList<CasilleroRuleta> numeros = new ArrayList();
    
    private Color[] colores = {Color.GREEN, Color.RED, Color.BLACK, Color.RED, Color.BLACK, Color.RED, Color.BLACK,Color.RED, 
        Color.BLACK,Color.RED, Color.BLACK, Color.BLACK, Color.RED, Color.BLACK, Color.RED,Color.BLACK, Color.RED,Color.BLACK, 
        Color.RED, Color.RED, Color.BLACK, Color.RED, Color.BLACK,Color.RED, Color.BLACK,Color.RED, Color.BLACK, Color.RED, 
        Color.BLACK, Color.BLACK, Color.RED, Color.BLACK, Color.RED, Color.BLACK, Color.RED, Color.RED
    };

    public SistemaMesaRuleta() {
        
    }
    
    public ArrayList<CasilleroRuleta> getNumeros() {
        return numeros;
    }
    
    public MesaRuleta crearMesaRuleta(String nombreMesa, Jugador creadorMesa) {
        Jugador nuevoJugador = new Jugador(creadorMesa.getNombre(), null, null, creadorMesa.getSaldo());
        MesaRuleta mesa = new MesaRuleta(nombreMesa, nuevoJugador);
        this.listaMesas.add(mesa);
        Fachada.getInstancia().avisar(Fachada.EVENTO_MESA_NUEVA);
        return mesa;
    }

    public boolean agrgarJugadorMesaRuleta(Jugador jugadorMesaRuleta, MesaRuleta mesaJugador){
        if(mesaJugador.agregarJugadorRuleta(jugadorMesaRuleta))
            return true;
        else
            return false;
    }

    public void agregarNumero(){
        numeros.add(new CasilleroRuleta(numeros.size(), colores[numeros.size()]));
        Fachada.getInstancia().avisar(Fachada.EVENTO_NUMEROS);
    }
    
    public void setListaMesas(ArrayList<MesaRuleta> listaMesas) {
        this.listaMesas = listaMesas;
    }

    public ArrayList<MesaRuleta> getListaMesas() {
        return listaMesas;
    }
  
}
