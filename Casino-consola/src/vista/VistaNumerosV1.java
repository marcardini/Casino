package vista;

import controlador.ControladorNumeros;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JSplitPane;
import modelo.Numero;
import dominio.Jugador;

public class VistaNumerosV1 extends javax.swing.JDialog implements VistaNumeros,ActionListener{

    private ControladorNumeros controlador;
    private JSplitPane split = new JSplitPane();
    
    public VistaNumerosV1(java.awt.Frame parent, boolean modal,Jugador u) {
        super(parent, modal);
        initComponents();
        split.setTopComponent(new PanelDatos());
        split.setOrientation(JSplitPane.VERTICAL_SPLIT);
        setContentPane(split);
        controlador = new ControladorNumeros(this,u);
        split.setDividerLocation(200);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBounds(0, 0, 416, 338);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void mostrar(ArrayList<Numero> numeros) {
        split.setBottomComponent(new PanelNumeros(numeros,this));
        validate(); //refrescar
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BotonRuleta origen = (BotonRuleta) e.getSource();
        Numero n = origen.getNumero();
        controlador.marcar(n);
        //JOptionPane.showMessageDialog(null,origen.getNumero().getValor() + "");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
