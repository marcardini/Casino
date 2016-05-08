package modelo;

import dominio.Jugador;
import java.util.ArrayList;

public class SistemaUsuario {
    
    private ArrayList<Jugador> jugadores = new ArrayList();
    private ArrayList<Jugador> logueados = new ArrayList();

    public SistemaUsuario() { }

    public void agregar(Jugador u){
        jugadores.add(u);
    }
    
    public Jugador login(String nom,String pass){
        
        for(Jugador j:jugadores){
            if(j.getNombreUsuario().equalsIgnoreCase(nom) && j.getContrasenia().equals(pass) && !logueados.contains(j)){
                logueados.add(j);
                Fachada.getInstancia().avisar(Fachada.EVENTO_LOGUEADOS);
                return j;
            }
        }
        return null;
    }
    
    public void logout(Jugador u){
        logueados.remove(u);
        Fachada.getInstancia().avisar(Fachada.EVENTO_LOGUEADOS);
    }

    public ArrayList<Jugador> getLogueados() {
        return logueados;
    }
      
}
