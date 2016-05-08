package modelo;

import dominio.Juego;
import dominio.Jugador;
import dominio.ruleta.CasilleroRuleta;
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
    public static final int EVENTO_INICIO_JUEGO = 7;

    private Fachada() {}
    
    public MesaRuleta agregarMesaRuleta(String nombreMesaRuleta, Jugador usuarioCreador){
       MesaRuleta mesa =  smr.crearMesaRuleta(nombreMesaRuleta, usuarioCreador);
       return mesa;
    }
    
    public boolean agregarJugadorAMesa(MesaRuleta mesa, Jugador usu){
        return smr.agrgarJugadorMesaRuleta(usu, mesa);
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
        ArrayList<MesaRuleta> retorno = new ArrayList();
        ArrayList<MesaRuleta> lista = smr.getListaMesas();
        
        for(MesaRuleta mesa : lista){
            if(mesa.getListaJugadores().size() < 4)
                retorno.add(mesa);
        }
        return retorno;
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

    public ArrayList<CasilleroRuleta> getNumeros() {
        return smr.getNumeros();
    }

    public void agregarNumero() {
        smr.agregarNumero();
    }
    
}
