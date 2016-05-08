package dominio.ruleta;

import dominio.Apuesta;
import dominio.Jugador;
import dominio.UnidadReceptoraDeJuego;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ApuestaRuleta extends Apuesta{
    
    private List<CasilleroRuleta> detalleApuesta;
    
    public ApuestaRuleta(UnidadReceptoraDeJuego unidadReceptora, Jugador jugador, boolean terminada)
    {
        super(unidadReceptora, jugador, terminada);
        this.detalleApuesta = new ArrayList<>();
    }
    
    @Override
    public boolean equals(Object other) {
	if (!(other instanceof Apuesta))
            return false;
        Apuesta that = (Apuesta) other;
	return this.getUnidadReceptoraDeJuego().equals(that.getUnidadReceptoraDeJuego()) 
                && this.getJugador().equals(that.getJugador()) 
                && this.getFecha().equals(that.getFecha());
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(super.getUnidadReceptoraDeJuego());
        hash = 97 * hash + Objects.hashCode(this.getJugador());
        hash = 97 * hash + Objects.hashCode(this.getFecha());
        return hash;
    }

    @Override
    public String toString() {
        String terminada = "No";
        if(super.isFinalizoApuesta() == true)
            terminada = "Si";
        return "Id: " + super.getId() + " - Unidad: " + super.getUnidadReceptoraDeJuego() 
                + " - Jugador: " + super.getJugador().getNombre()
                + " - Fecha: " + this.getFecha() + " - Monto($) " + super.getMontoTotal() 
                + ". Terminada: " + terminada;
    }
    public List<CasilleroRuleta> getDetalleApuesta() {
        return detalleApuesta;
    }

    public void setDetalleApuesta(List<CasilleroRuleta> detalleApuesta) {
        this.detalleApuesta = detalleApuesta;
    }
    
}
