package dominio;

import DateTimeProcessors.DateTimeProcessors;
import java.math.BigDecimal;

public abstract class Apuesta {
    
    DateTimeProcessors fechaHoraUtil;
    
    private int id;
    private UnidadReceptoraDeJuego unidadReceptora;
    private Jugador jugador;
    private String fecha;
    private BigDecimal montoTotal;
    private boolean apuestaTerminada;
    
    public Apuesta(UnidadReceptoraDeJuego unidadReceptora, Jugador jugador, boolean terminada){
        this.unidadReceptora = unidadReceptora;
        this.jugador = jugador;
        this.fecha = fechaHoraUtil.ObtenerFechaHoraActual();
        this.apuestaTerminada = terminada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public UnidadReceptoraDeJuego getUnidadReceptoraDeJuego() {
        return unidadReceptora;
    }
     
    public void setUnidadReceptoraDeJuego(UnidadReceptoraDeJuego unidadReceptora) {
        this.unidadReceptora = unidadReceptora;
    }
    
    public Jugador getJugador() {
        return jugador;
    }
    
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getMontoTotal() {
        return montoTotal;
    }
    
    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    public boolean isFinalizoApuesta() {
        return apuestaTerminada;
    }
    
    public void setFinalizoApuesta(boolean finalizoApuesta) {
        this.apuestaTerminada = finalizoApuesta;
    }
 
}
