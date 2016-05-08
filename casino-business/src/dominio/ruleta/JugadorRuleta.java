package dominio.ruleta;

import java.awt.Color;
import java.math.BigDecimal;

public class JugadorRuleta{
    
    private ApuestaRuleta apuestaActual;
    private Color colorJuego;
    private boolean habilitadoApostar;
    
     public JugadorRuleta(Color colorAsignado)
    {
        this.habilitadoApostar = false;
        this.colorJuego = colorAsignado;
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
