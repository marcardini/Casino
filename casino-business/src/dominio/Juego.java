package dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Juego {
    
    int id;
    private String nombre; 
    private List<UnidadReceptoraDeJuego> unidadesReceptorasDeJuego;
   
    public Juego(){}
    
    public Juego(String nombre){
        this.nombre = nombre;
        this.unidadesReceptorasDeJuego = new ArrayList<UnidadReceptoraDeJuego>();
    }
    
    public Juego(String nombre, List<UnidadReceptoraDeJuego> listaUnidadesReceptoras){
        this.nombre = nombre;
        this.unidadesReceptorasDeJuego = listaUnidadesReceptoras;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Juego))
            return false;
        Juego that = (Juego) other;
	return this.getNombre().equalsIgnoreCase(that.getNombre());
    }

    @Override
    public String toString() {
        return this.nombre.toUpperCase();
    }
    
    public boolean Validar(){
        return this.nombre != null && !this.nombre.isEmpty();
    }
    
    public int getId() {
        return id;
    }

    public List<UnidadReceptoraDeJuego> getUnidadesReceptorasDeJuego() {
        return unidadesReceptorasDeJuego;
    }

    public String getNombre() {
        return nombre;
    } 
    
    public void setId(int id) {
        this.id = id;
    }
    
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
    public void setUnidadesReceptorasDeJuego(List<UnidadReceptoraDeJuego> unidadesReceptorasDeJuego) {
        this.unidadesReceptorasDeJuego = unidadesReceptorasDeJuego;
    }
    
}
