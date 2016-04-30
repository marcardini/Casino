package dominio.ruleta;

import dominio.Jugador;
import dominio.UnidadReceptoraDeJuego;
import java.awt.Color;
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
    
    private ArrayList<Jugador> listaJugadores = new ArrayList();
    
    public MesaRuleta(String nombre, Jugador usuarioCreador){
        super(usuarioCreador);
        this.nombre = nombre;
        this.coloresDisponiblesParaJugadores = new ArrayList<>();
        this.coloresDisponiblesParaJugadores.add(Color.YELLOW);
        this.coloresDisponiblesParaJugadores.add(Color.BLUE);
        this.coloresDisponiblesParaJugadores.add(Color.GREEN);
        this.coloresDisponiblesParaJugadores.add(Color.PINK);
        this.coloresDisponiblesParaJugadores.add(Color.ORANGE);
        this.coloresDisponiblesParaJugadores.add(Color.MAGENTA);
        this.coloresDisponiblesParaJugadores.add(Color.WHITE);
        this.coloresDisponiblesParaJugadores.add(Color.DARK_GRAY);
        JugadorRuleta jugadorRuleta = new JugadorRuleta(Color.YELLOW);
        usuarioCreador.setJugadorRuleta(jugadorRuleta);
        listaJugadores.add(usuarioCreador);
        this.coloresDisponiblesParaJugadores.remove(Color.YELLOW);
        this.numerosApostados = new ArrayList<>();
        
        /*Se agregan colores para evitar cambios y olvidos en caso de que la mesa pueda aceptar mas de 4 jugadores*/
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
        return "Mesa " + this.getNombre() + " Usuarios en mesa: " + listaJugadores.size();        
    }
    
    public boolean puedoAgregar(){
        if(listaJugadores.size() < 4){
            return true;
        }else{
            return false;
        }
        
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
    
    private Color asignarColorJugadorRuleta(){
        Color retorno = coloresDisponiblesParaJugadores.get(0);
        coloresDisponiblesParaJugadores.remove(0);
        return retorno;
    }

    private void devolverColor(Color colorJugador){
        coloresDisponiblesParaJugadores.add(colorJugador);
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
    
    public boolean agregarJugadorRuleta(Jugador jugadorMesaRuleta){
        
        if(this.puedoAgregar()){
            this.listaJugadores.add(jugadorMesaRuleta);
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
