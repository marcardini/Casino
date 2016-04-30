package modelo;

import dominio.Jugador;
import java.awt.Color;

public class Numero {
    
    private int valor;
    private Color color;
    private Jugador usuario;

    public Jugador getUsuario() {
        return usuario;
    }

    public Numero(int valor, Color color) {
        this.valor = valor;
        this.color = color;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void marcar(Jugador u) {
        if(usuario == null){//Solo le asigno un color si el numero no fue apostado antes
            color = Color.MAGENTA;
            usuario = u;
            Fachada.getInstancia().avisar(Fachada.EVENTO_NUMEROS);
        }
        else if(u == usuario){ //si el usuario que clickeo, es el mismo que habia apostado a ese numero, es que esta retirando la apuesta. Lo pongo en null al usuario y le seteo el color original
            usuario = null;
            color = Color.RED;//O negro. En este ejemplo no guardamos el color del tablero y el del jugador si esta apostado. En el obligatorio va el original del tablero
            Fachada.getInstancia().avisar(Fachada.EVENTO_NUMEROS);
        }
    }

    @Override
    public String toString() {
        String u = "Sin marcar";
        if(usuario != null)
            u = usuario.getNombreUsuario();
        return "Numero{" + "valor=" + valor + ", usuario=" + u + '}';
    }
    
    
}
