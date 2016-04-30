package vista;

import controlador.ControladorListaJuegos;
import controlador.ControladorListaUsuarios;
import dominio.Juego;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import modelo.Fachada;
import dominio.Jugador;

public class PanelJuegosV1 extends javax.swing.JDialog implements VistaListaJuegos{

    private ControladorListaJuegos controladorJuegos;
    private ControladorListaUsuarios controladorUsuarios;
    private Jugador usu;
    public PanelJuegosV1(java.awt.Frame parent, boolean modal, Jugador u) {
        super(parent, modal);
        initComponents();
        controladorJuegos = new ControladorListaJuegos(this);
        controladorUsuarios = new ControladorListaUsuarios(u);
        usu=u;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJugar = new javax.swing.JButton();
        comboJuegos = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar);
        btnJugar.setBounds(130, 200, 140, 40);

        getContentPane().add(comboJuegos);
        comboJuegos.setBounds(130, 110, 140, 20);

        setBounds(0, 0, 416, 338);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        controladorUsuarios.logout();
    }//GEN-LAST:event_formWindowClosing

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
       dispose();
        

       
       //Aca se debe llamar a seleccion y creacion de mesa de ruleta, no borrar error para no olvidarse
       //new PanelNumeros(null, false,usu).setVisible(true);
       





        
      
    }//GEN-LAST:event_btnJugarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JComboBox comboJuegos;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrar(ArrayList<Juego> listaJuegos) {
        //listaJuegos.setListData(listaJuegos.toArray());
        DefaultComboBoxModel model = (DefaultComboBoxModel) comboJuegos.getModel();
        model.removeAllElements();
        
        for(Juego juego : listaJuegos){
          model.addElement(juego.toString());
        }
    }
}
