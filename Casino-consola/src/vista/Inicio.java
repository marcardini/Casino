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
        f.agregarJugador(new Jugador("admin","Administrador","admin",BigDecimal.valueOf(100000)));
        f.agregarJugador(new Jugador("a","Juan Perez","a",BigDecimal.ZERO));
        f.agregarJugador(new Jugador("b","Ana Gonzalez","b",BigDecimal.TEN));
        f.agregarJugador(new Jugador("c","Carlos Lopez","c",BigDecimal.valueOf(203010))); 
    }
    
}
