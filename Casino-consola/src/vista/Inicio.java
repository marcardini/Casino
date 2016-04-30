package vista;

import modelo.Fachada;
import dominio.Jugador;
import java.math.BigDecimal;

public class Inicio {

    public static void main(String[] args) {
        cargarDatos();
        new Principal().setVisible(true);   
        
    }

    private static void cargarDatos() {
        Fachada f = Fachada.getInstancia();
        f.agregarJugador(new Jugador("admin","admin","Administrador",BigDecimal.valueOf(100000)));
        f.agregarJugador(new Jugador("a","a","Juan Perez",BigDecimal.ZERO));
        f.agregarJugador(new Jugador("b","b","Ana Gonzalez",BigDecimal.TEN));
        f.agregarJugador(new Jugador("c","c","Carlos Lopez",BigDecimal.valueOf(203010))); 
    }
    
}
