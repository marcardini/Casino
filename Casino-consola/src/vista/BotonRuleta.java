package vista;

import javax.swing.JButton;
import modelo.Numero;

public class BotonRuleta extends JButton{

    private Numero numero;
    public BotonRuleta(String text) {
        super(text);
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }
    
}
