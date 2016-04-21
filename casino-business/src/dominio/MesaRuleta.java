package dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MesaRuleta extends UnidadReceptoraDeJuego{
    
    /* Podrán repetirse los nombre de las mesas, porque se prioriza la facilidad y rapidez con la que
    el usuario debe comenzar a jugar. La captación del usuario es el foco. Por eso se trabaja con 
    una clave compuesta de nombre, usuarioCreador y fecha. */
    
    private String nombre;
    private List<Integer> numerosApostados;
    private List<Color> coloresDisponiblesParaJugadores;
    private int ultimoNumeroSortado;
    
    private Jugador[] arrayJugadores = new Jugador[3];
    
    public MesaRuleta(String nombre, Jugador usuarioCreador){
        super(usuarioCreador);
        this.nombre = nombre;
        arrayJugadores[0] = usuarioCreador;
        this.coloresDisponiblesParaJugadores = new ArrayList<>();
        this.coloresDisponiblesParaJugadores.add(Color.AMARILLO);
        this.coloresDisponiblesParaJugadores.add(Color.AZUL);
        this.coloresDisponiblesParaJugadores.add(Color.MARRON);
        this.coloresDisponiblesParaJugadores.add(Color.ROSADO);
        this.numerosApostados = new ArrayList<>();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + Objects.hashCode(super.getUsuarioCreador());
        hash = 47 * hash + Objects.hashCode(super.getFechaCreacion());
        return hash;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof MesaRuleta))
            return false;
        MesaRuleta that = (MesaRuleta) other;
	return this.getNombre().equalsIgnoreCase(that.getNombre())
                && this.getFechaCreacion().equals(that.getFechaCreacion())
                && this.getUsuarioCreador().equals(that.getUsuarioCreador());
    }
    
    @Override
    public String toString() {
        return "Mesa " + this.getNombre() + ". Creada por " + this.getUsuarioCreador() 
                + " el día " + this.getFechaCreacion();
    }
    
    public boolean Validar(){
        return this.nombre != null && !this.nombre.isEmpty();
    }

    
    public String getNombre() {
        return nombre;
    }

    public List<Integer> getNumerosApostados() {
        return numerosApostados;
    }

    public List<Color> getColoresDisponiblesParaJugadores() {
        return coloresDisponiblesParaJugadores;
    }

    public int getUltimoNumeroSortado() {
        return ultimoNumeroSortado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumerosApostados(List<Integer> numerosApostados) {
        this.numerosApostados = numerosApostados;
    }

    public void setColoresDisponiblesParaJugadores(List<Color> coloresDisponiblesParaJugadores) {
        this.coloresDisponiblesParaJugadores = coloresDisponiblesParaJugadores;
    }

    public void setUltimoNumeroSortado(int ultimoNumeroSortado) {
        this.ultimoNumeroSortado = ultimoNumeroSortado;
    }
    
    public Jugador[] getArrayJugadores() {
        return arrayJugadores;
    }

    public void setArrayJugadores(Jugador[] arrayJugadores) {
        this.arrayJugadores = arrayJugadores;
    }
    
}
