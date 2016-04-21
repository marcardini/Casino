package dominio;

import DateTimeProcessors.DateTimeProcessors;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Ronda extends Apuesta {
    
    DateTimeProcessors fechaHoraUtil;
    
    private int id;
    private MesaRuleta mesa;
    private Jugador jugador;
    private String fecha;
    private BigDecimal monto;
    private List<CasilleroRuleta> detalleApuesta;
    private boolean apuestaTerminada;
    
    public Ronda(){}
    
    public Ronda(MesaRuleta mesa, Jugador jugador, BigDecimal monto, List<CasilleroRuleta> detalleApuesta)
    {
        this.mesa = mesa;
        this.jugador = jugador;
        this.fecha = fechaHoraUtil.ObtenerFechaHoraActual();
        this.monto = monto;
        this.detalleApuesta = detalleApuesta;
        this.apuestaTerminada = false;
    }
    
    public Ronda(MesaRuleta mesa, Jugador jugador, BigDecimal monto, List<CasilleroRuleta> detalleApuesta, boolean finalizo)
    {
        this.mesa = mesa;
        this.jugador = jugador;
        this.fecha = fechaHoraUtil.ObtenerFechaHoraActual();
        this.monto = monto;
        this.detalleApuesta = detalleApuesta;
        this.apuestaTerminada = finalizo;
    }

    @Override
    public boolean equals(Object other) {
	if (!(other instanceof Ronda))
            return false;
        Ronda that = (Ronda) other;
	return  this.getJugador().equals(that.getJugador()) 
                && this.getMonto() == that.getMonto() && this.getFecha().equals(that.getFecha());
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.mesa);
        hash = 97 * hash + Objects.hashCode(this.jugador);
        hash = 97 * hash + Objects.hashCode(this.fecha);
        hash = 97 * hash + Objects.hashCode(this.monto);
        return hash;
    }

    @Override
    public String toString() {
        String terminada = "No";
        if(apuestaTerminada == true)
            terminada = "Si";
        return "Id: " + this.id + " - Mesa: " + this.mesa + " - Jugador: " + this.jugador.getNombre()
                + " - Fecha: " + this.getFecha() + " - Monto($) " + this.monto + ". Terminada: " + terminada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public MesaRuleta getMesa() {
        return mesa;
    }
     
    public void setMesa(MesaRuleta mesa) {
        this.mesa = mesa;
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

    public BigDecimal getMonto() {
        return monto;
    }
    
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }
    
    public List<CasilleroRuleta> getDetalleApuesta() {
        return detalleApuesta;
    }

    public void setDetalleApuesta(List<CasilleroRuleta> detalleApuesta) {
        this.detalleApuesta = detalleApuesta;
    }

    public boolean isFinalizoApuesta() {
        return apuestaTerminada;
    }
    
    public void setFinalizoApuesta(boolean finalizoApuesta) {
        this.apuestaTerminada = finalizoApuesta;
    }
 
}
