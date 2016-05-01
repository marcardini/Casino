package dominio.ruleta;

import dominio.Juego;

public class JuegoRuleta extends Juego{
    
    public JuegoRuleta(String nombre){
        super(nombre);
    }
    
    @Override
    public String toString() {
        return super.getNombre().toUpperCase() + " (" + super.getUnidadesReceptorasDeJuego().size() + " mesas en actividad)";
    }
}
