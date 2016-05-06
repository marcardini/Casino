package vista;

import dominio.ruleta.CasilleroRuleta;
import javax.swing.JButton;

public class BotonRuleta extends JButton{

    private CasilleroRuleta numero;

    public CasilleroRuleta getNumero() {
        return numero;
    }

    public void setNumero(CasilleroRuleta numero) {
        this.numero = numero;
    }
    
    public BotonRuleta(String text) {
        super(text);
    }


    
}
