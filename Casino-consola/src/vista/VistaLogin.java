package vista;

import dominio.Jugador;

public interface VistaLogin {

    public void errorLogin();
    public void ingresar(Jugador u);
    public void habilitar(boolean b);
    
}
