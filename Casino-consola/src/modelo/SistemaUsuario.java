package modelo;

import dominio.Jugador;
import java.awt.Color;
import java.util.ArrayList;

public class SistemaUsuario {
    
    private ArrayList<Jugador> jugadores = new ArrayList();
    private ArrayList<Jugador> logueados = new ArrayList();
    private boolean habilitado=true;
    //Esto no deberia ir aqui
    private ArrayList<Numero> numeros = new ArrayList();

    public SistemaUsuario() {
        numeros.add(new Numero(0,Color.green));
        numeros.add(new Numero(1,Color.black));
        numeros.add(new Numero(2,Color.red));
        numeros.add(new Numero(3,Color.black));
        numeros.add(new Numero(4,Color.red));
    }

    public ArrayList<Numero> getNumeros() {
        return numeros;
    }
    
    public void agregar(Jugador u){
        jugadores.add(u);
    }
    
    public Jugador login(String nom,String pass){
        if(!habilitado) 
            return null;
        
        for(Jugador j:jugadores){
            if(j.getNombreUsuario().equalsIgnoreCase(nom) && j.getContrasenia().equals(pass)){
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

    public void deshabilitar() {
        habilitar(false);
    }
    public void habilitar() {
        habilitar(true);
    }

    private void habilitar(boolean b) {
        habilitado=b;
        Fachada.getInstancia().avisar(Fachada.EVENTO_LOGIN);
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void agregarNumero() {
        numeros.add(new Numero(numeros.size(),Color.BLUE));
        Fachada.getInstancia().avisar(Fachada.EVENTO_NUMEROS);
    }
      
}
