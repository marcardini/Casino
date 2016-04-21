package dominio;

import java.math.BigDecimal;
import java.util.Objects;

public class Jugador {
    
    private int id;
    private String nombreUsuario;
    private String nombre;
    private String contrasenia;
    private MesaRuleta mesaActual;
    private BigDecimal saldo;
    private Color colorJuego;
    private boolean habilitadoApostar;
    private Apuesta apuestaActual;
    private EstadisticasJugador estadisticasJugador;

    public Jugador(){}
    
    public Jugador(String nombreUsuario, String nombre, String contrasenia)
    {
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.saldo = BigDecimal.ZERO;
        this.colorJuego = Color.INACTIVO;
        this.habilitadoApostar = false;
        this.estadisticasJugador = new EstadisticasJugador();
    }
    
    public Jugador(String nombreUsuario, String nombre, String contrasenia, BigDecimal saldo)
    {
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.saldo = saldo;
        this.colorJuego = Color.INACTIVO;
        this.habilitadoApostar = false;
        this.estadisticasJugador = new EstadisticasJugador();
    }
    
    public Jugador(String nombreUsuario, String nombre, String contrasenia, MesaRuleta mesa)
    {
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.mesaActual = mesa;
        this.saldo = BigDecimal.ZERO;
        this.colorJuego = Color.INACTIVO;
        this.habilitadoApostar = false;
        this.estadisticasJugador = new EstadisticasJugador();
    }
    
    public Jugador(String nombreUsuario, String nombre, String contrasenia, BigDecimal saldo, MesaRuleta mesa)
    {
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.saldo = saldo;
        this.mesaActual = mesa;
        this.colorJuego = Color.INACTIVO;
        this.habilitadoApostar = false;
        this.estadisticasJugador = new EstadisticasJugador();
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

    public MesaRuleta getMesaActual() {
        return mesaActual;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Color getColorJuego() {
        return colorJuego;
    }

    public boolean isHabilitadoApostar() {
        return habilitadoApostar;
    }

    public Apuesta getApuestaActual() {
        return apuestaActual;
    }

    public EstadisticasJugador getEstadisticasJugador() {
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

    public void setMesaActual(MesaRuleta mesaActual) {
        this.mesaActual = mesaActual;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void setColorJuego(Color colorJuego) {
        this.colorJuego = colorJuego;
    }

    public void setHabilitadoApostar(boolean habilitadoApostar) {
        this.habilitadoApostar = habilitadoApostar;
    }

    public void setApuestaActual(Apuesta apuestaActual) {
        this.apuestaActual = apuestaActual;
    }

    public void setEstadisticasJugador(EstadisticasJugador estadisticasJugador) {
        this.estadisticasJugador = estadisticasJugador;
    }

}