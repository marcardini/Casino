package modelo;

import dominio.Juego;
import dominio.Jugador;
import dominio.ruleta.MesaRuleta;
import java.util.ArrayList;
import java.util.Observable;

public class Fachada extends Observable{

    private SistemaUsuario su = new SistemaUsuario();
    private SistemaJuego sj = new SistemaJuego();
    private SistemaMesaRuleta smr = new SistemaMesaRuleta();
    private static Fachada instancia = new Fachada();
    public static final int EVENTO_LOGUEADOS = 1;
    public static final int EVENTO_LOGIN = 2;
    public static final int EVENTO_NUMEROS = 3;
    public static final int EVENTO_LISTA_JUEGOS = 4;
    public static final int EVENTO_MESA_NUEVA = 5;
    public static final int EVENTO_NUEVO_INTEGRANTE_MESA = 6;

    private Fachada() {
    }
    
    public void agregarMesaRuleta(String nombreMesaRuleta, Jugador usuarioCreador){
        smr.crearMesaRuleta(nombreMesaRuleta, usuarioCreador);
    }
    
    public static Fachada getInstancia() {
        return instancia;
    }
    protected void avisar(Object evento){
        setChanged();
        notifyObservers(evento);
    }

    public void agregarJugador(Jugador u) {
        su.agregar(u);
    }
    
    public ArrayList<MesaRuleta> getListaMesasRuleta(){
        return smr.getListaMesas();
    }

    public Jugador login(String nom, String pass) {
        return su.login(nom, pass);
    }

    public void logout(Jugador u) {
        su.logout(u);
    }

    public ArrayList<Jugador> getLogueados() {
        return su.getLogueados();
    }
    
    public ArrayList<Juego> getListaJuegos(){
        return sj.getListaJuegos();
    }

//    public void deshabilitar() {
//        su.deshabilitar();
//    }
//
//    public void habilitar() {
//        su.habilitar();
//    }
//
//    public boolean isHabilitado() {
//        return su.isHabilitado();
//    }

    public ArrayList<Numero> getNumeros() {
        return su.getNumeros();
    }

    public void agregarNumero() {
        su.agregarNumero();
    }
    
}
