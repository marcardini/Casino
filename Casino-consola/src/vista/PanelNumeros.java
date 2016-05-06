package vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Numero;
import dominio.Jugador;

public class PanelNumeros extends javax.swing.JPanel {
    
    public PanelNumeros(ArrayList<Numero> lista,ActionListener al) {
        initComponents();
        mostrar(lista,al);
    }
    private void mostrar(ArrayList<Numero> lista,ActionListener al){
        GridLayout disenio = new GridLayout(1,lista.size());
        setLayout(disenio);
        for(Numero n:lista){
            BotonRuleta b = new BotonRuleta(n.getValor() + "");
            b.setBackground(n.getColor());
            b.setForeground(Color.white);
            b.addActionListener(al);
            //b.setNumero(n);
            Jugador u = n.getUsuario();
            if(u==null) b.setToolTipText("Sin marcar");
            else b.setToolTipText(u.getNombreUsuario());
            add(b);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
