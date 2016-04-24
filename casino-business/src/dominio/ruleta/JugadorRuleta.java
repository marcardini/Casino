package dominio.ruleta;

import dominio.Jugador;
import dominio.UnidadReceptoraDeJuego;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;

public class JugadorRuleta extends Jugador{
    
    private ApuestaRuleta apuestaActual;
    private Color colorJuego;
    private boolean habilitadoApostar;
    
     public JugadorRuleta(String nombreUsuario, String nombre, String contrasenia, BigDecimal saldo)
    {
        super(nombreUsuario, nombre, contrasenia, saldo);
        this.habilitadoApostar = false;
        this.colorJuego = Color.GRAY;
    }

    public ApuestaRuleta getApuestaActual() {
        return apuestaActual;
    }
    
    public Color getColor() {
        return colorJuego;
    }
    
    public boolean isHabilitadoApostar() {
        return habilitadoApostar;
    }
    
    public void setColorJuego(Color colorJuego) {
        this.colorJuego = colorJuego;
    }
    
    public void setApuestaRuleta(ApuestaRuleta apuestaRuleta) {
        this.apuestaActual = apuestaRuleta;
    }

    public void setHabilitadoApostar(boolean habilitadoApostar) {
        this.habilitadoApostar = habilitadoApostar;
    }


    
}
