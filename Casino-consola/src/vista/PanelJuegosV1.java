package vista;

import controlador.ControladorListaJuegos;
import controlador.ControladorListaUsuarios;
import dominio.ComboItem;
import dominio.Juego;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import dominio.Jugador;
import modelo.Fachada;

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
        lblTotalApostado = new javax.swing.JLabel();
        lblTotalCobrado = new javax.swing.JLabel();
        totalApostadoGeneral = new javax.swing.JLabel();
        totalCobradoGeneral = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totalApostado = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        totalCobrado = new javax.swing.JLabel();
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
        btnJugar.setBounds(450, 350, 140, 40);

        comboJuegos.setMaximumSize(new java.awt.Dimension(100, 20));
        comboJuegos.setMinimumSize(new java.awt.Dimension(100, 20));
        comboJuegos.setPreferredSize(new java.awt.Dimension(100, 20));
        comboJuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJuegosActionPerformed(evt);
            }
        });
        getContentPane().add(comboJuegos);
        comboJuegos.setBounds(330, 280, 260, 40);

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Elegir juego");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 40));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 280, 150, 40);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 0, 0);

        lblTotalApostado.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        lblTotalApostado.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalApostado.setText("Total apostado");
        getContentPane().add(lblTotalApostado);
        lblTotalApostado.setBounds(300, 50, 140, 20);

        lblTotalCobrado.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        lblTotalCobrado.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalCobrado.setText("Total cobrado");
        getContentPane().add(lblTotalCobrado);
        lblTotalCobrado.setBounds(500, 50, 140, 20);

        totalApostadoGeneral.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        totalApostadoGeneral.setForeground(new java.awt.Color(255, 255, 255));
        totalApostadoGeneral.setText("$");
        getContentPane().add(totalApostadoGeneral);
        totalApostadoGeneral.setBounds(300, 130, 120, 20);

        totalCobradoGeneral.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        totalCobradoGeneral.setForeground(new java.awt.Color(255, 255, 255));
        totalCobradoGeneral.setText("$");
        getContentPane().add(totalCobradoGeneral);
        totalCobradoGeneral.setBounds(500, 130, 120, 20);

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MIS NÚMEROS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 90, 130, 20);

        totalApostado.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        totalApostado.setForeground(new java.awt.Color(255, 255, 255));
        totalApostado.setText("$");
        getContentPane().add(totalApostado);
        totalApostado.setBounds(500, 90, 120, 20);

        jLabel9.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ESTADÍSTICAS GENERALES");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 130, 230, 20);

        totalCobrado.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        totalCobrado.setForeground(new java.awt.Color(255, 255, 255));
        totalCobrado.setText("$");
        getContentPane().add(totalCobrado);
        totalCobrado.setBounds(300, 90, 120, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home_750x500.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 750, 500);

        setBounds(0, 0, 767, 538);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        controladorUsuarios.logout();
    }//GEN-LAST:event_formWindowClosing

    @Override
    public void mostrar(ArrayList<Juego> listaJuegos) {
      
        DefaultComboBoxModel model = (DefaultComboBoxModel) comboJuegos.getModel();
        model.removeAllElements();
        
        for(Juego juego : listaJuegos){
            
            if(juego.getNombre().equalsIgnoreCase("RULETA")){
                int cantMesasEnActividad = Fachada.getInstancia().getListaMesasRuleta().size();
                String mensajeCantMesas = Integer.toString(cantMesasEnActividad);
                ComboItem item = new ComboItem(juego, mensajeCantMesas);
                model.addElement(item);
            }else{
                ComboItem item = new ComboItem(juego, "0 mesas en actividad");
                model.addElement(item);
            }
        }
    }
    
    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
       DefaultComboBoxModel model = (DefaultComboBoxModel) comboJuegos.getModel();
       Object ob = model.getSelectedItem();
       ComboItem item = (ComboItem)ob;
       Juego juegoSeleccionado = (Juego)item.getObject();
       dispose();
       
       new DialogoElegirMesa(null,false,usu,juegoSeleccionado).setVisible(true);
    }//GEN-LAST:event_btnJugarActionPerformed

    private void comboJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJuegosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboJuegosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JComboBox comboJuegos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTotalApostado;
    private javax.swing.JLabel lblTotalCobrado;
    private javax.swing.JLabel totalApostado;
    private javax.swing.JLabel totalApostadoGeneral;
    private javax.swing.JLabel totalCobrado;
    private javax.swing.JLabel totalCobradoGeneral;
    // End of variables declaration//GEN-END:variables

}
