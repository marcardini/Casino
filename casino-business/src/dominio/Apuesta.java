package dominio;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Apuesta {
    
    private int id;
    private UnidadReceptoraDeJuego unidadReceptora;
    private Jugador jugador;
    private String fecha;
    private BigDecimal montoTotal;
    private boolean apuestaTerminada;
    
    public Apuesta(UnidadReceptoraDeJuego unidadReceptora, Jugador jugador, boolean terminada){
        this.unidadReceptora = unidadReceptora;
        this.jugador = jugador;
        this.fecha = this.ObtenerFechaHoraActual();
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
    
        private String ObtenerFechaHoraActual()
    {
        String retorno = "";
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        Date fecha = new Date();
        retorno = dateFormat.format(fecha);
        return retorno;
    }
 
}
