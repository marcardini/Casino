package vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import dominio.Jugador;
import dominio.ruleta.CasilleroRuleta;

public class PanelNumeros extends javax.swing.JPanel {
    
    public PanelNumeros(ArrayList<CasilleroRuleta> lista,ActionListener al) {
        initComponents();
        mostrar(lista,al);
    }
    private void mostrar(ArrayList<CasilleroRuleta> lista,ActionListener al){
        GridLayout disenio = new GridLayout(3,lista.size());
        setLayout(disenio);
        for(CasilleroRuleta c : lista){
            BotonRuleta b = new BotonRuleta(c.getNumeroEnMesa() + "");
            b.setBackground(c.getColorOriginal());
            b.setForeground(Color.white);
            b.addActionListener(al);
            b.setNumero(c);
            Jugador u = c.getJugadorAposto();
            if(u == null){
                c.setJugadorAposto(u);
                //c.setNumeroEnMesa(b.getNumero());
                c.setColorAMostrar(c.getColorOriginal());
                b.setToolTipText("Sin marcar");
            }
            else{
                c.setColorAMostrar(u.getJugadorRuleta().getColor());
                b.setToolTipText(u.getNombreUsuario());
            }
            this.add(b);
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
