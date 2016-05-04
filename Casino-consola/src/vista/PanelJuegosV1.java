package vista;

import controlador.ControladorListaJuegos;
import controlador.ControladorListaUsuarios;
import dominio.Juego;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import modelo.Fachada;
import dominio.Jugador;

public class PanelJuegosV1 extends javax.swing.JDialog implements IVistaListaJuegos{

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

        jPanel1 = new javax.swing.JPanel();
        btnJugar = new javax.swing.JButton();
        comboJuegos = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        btnJugar.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar);
        btnJugar.setBounds(380, 410, 140, 40);

        comboJuegos.setMaximumSize(new java.awt.Dimension(100, 20));
        comboJuegos.setMinimumSize(new java.awt.Dimension(100, 20));
        comboJuegos.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(comboJuegos);
        comboJuegos.setBounds(340, 350, 220, 30);

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Elegir juego");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 40));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 340, 150, 40);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 0, 0);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estadisticas_ejemplo_transparent2.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 40, 580, 290);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home_750x500.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 750, 500);

        setBounds(0, 0, 767, 538);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        controladorUsuarios.logout();
    }//GEN-LAST:event_formWindowClosing

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
       dispose();
        new DialogoElegirMesa(null,false,usu).setVisible(true);

    }//GEN-LAST:event_btnJugarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JComboBox comboJuegos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrar(ArrayList<Juego> listaJuegos) {
        
        DefaultComboBoxModel model = (DefaultComboBoxModel) comboJuegos.getModel();
        model.removeAllElements();
        
        for(Juego juego : listaJuegos){
          model.addElement(juego.toString());
        }
    }
}
