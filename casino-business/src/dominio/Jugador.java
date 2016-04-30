package dominio;

import dominio.ruleta.JugadorRuleta;
import java.math.BigDecimal;
import java.util.Objects;

public class Jugador {
    
    private int id;
    private String nombreUsuario;
    private String nombre;
    private String contrasenia;
    private UnidadReceptoraDeJuego unidadReceptoraDeJuegoActual;
    private BigDecimal saldo;
    private Estadistica estadisticasJugador;
    private JugadorRuleta jugadorRuleta;
    
    public Jugador(){}
        
    public Jugador(String nombreUsuario, String nombre, String contrasenia, BigDecimal saldo)
    {
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.saldo = saldo;
        this.estadisticasJugador = new Estadistica();
    }
    
    public boolean ValidarNombre(String nombre)
    {
        return this.nombre != null && !this.nombre.isEmpty();
    }
    
    public boolean ValidarContrasenia(String contrasenia)
    {
        return contrasenia != null && !contrasenia.isEmpty() && contrasenia.length() >= 6;  
    }
    
    public boolean Validar()
    {
        return ValidarNombre(this.nombre) && ValidarNombre(this.nombreUsuario) 
                && ValidarContrasenia(this.contrasenia);
    }
    
    public void RetirarApuestaActualEIrse()
    {
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.nombreUsuario);
        return hash;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Jugador))
            return false;
        Jugador that = (Jugador) other;
	return this.getNombreUsuario().equalsIgnoreCase(that.getNombreUsuario());
    }
    
    @Override
    public String toString() {
        return this.nombreUsuario + ". Nombre real: " + this.nombre;
    }
    
    public int getId() {
        return id;
    }
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public UnidadReceptoraDeJuego getUnidadReceptoraDeJuegoActual() {
        return unidadReceptoraDeJuegoActual;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Estadistica getEstadisticasJugador() {
        return estadisticasJugador;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setUnidadReceptoraDeJuegoActual(UnidadReceptoraDeJuego unidadReceptoraDeJuegoActual) {
        this.unidadReceptoraDeJuegoActual = unidadReceptoraDeJuegoActual;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void setEstadisticasJugador(Estadistica estadisticasJugador) {
        this.estadisticasJugador = estadisticasJugador;
    }

    public JugadorRuleta getJugadorRuleta() {
        return jugadorRuleta;
    }

    public void setJugadorRuleta(JugadorRuleta jugadorRuleta) {
        this.jugadorRuleta = jugadorRuleta;
    }
    
    
    
}