package vista;

import controlador.ControladorListaMesas;
import controlador.ControladorListaUsuarios;
import controlador.ControladorMesaRuleta;
import controlador.ControladorNumeros;
import dominio.Juego;
import dominio.Jugador;
import dominio.ruleta.CasilleroRuleta;
import dominio.ruleta.MesaRuleta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;

public class DialogoElegirMesa extends javax.swing.JDialog implements IVistaListMesas, ActionListener{
    
    private ControladorListaMesas controladorListaMesas;
    private ControladorListaUsuarios controladorUsuarios;
    private ControladorNumeros controlador;
    private ControladorMesaRuleta controladorMesaRuleta;
    private Jugador usu;
    private JSplitPane split = new JSplitPane();
    
    public DialogoElegirMesa(java.awt.Frame parent, boolean modal, Jugador u, Juego juegoSeleccionado) {
        super(parent, modal);
        initComponents();
        controladorListaMesas = new ControladorListaMesas(this, u);
        controladorUsuarios = new ControladorListaUsuarios(u);
        usu = u;
    }
    
    @Override
    public void mostrar(ArrayList<MesaRuleta> listaMesas) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) comboMesas.getModel();
        model.removeAllElements();
        
        if(listaMesas.isEmpty())
            model.addElement("No hay mesas elegibles");
        
        else{
        //ArrayList<MesaRuleta> listaMesasControlada = new ArrayList();
        //listaMesasControlada = controladorListaMesas.controlarElegibles(listaMesas);
        
            for(MesaRuleta mesa : listaMesas){
                model.addElement(mesa.toString());
            }
        }
    }

    @Override
    public void mostrarMesa(MesaRuleta mesa) {
        new VistaNumerosV1(null, false, usu, mesa).setVisible(true);
    }

    @Override
    public void errorCreandoMesa() {
       JOptionPane.showMessageDialog(this, "No se pudo crear la nueva mesa");
    }
    
    @Override
    public void listaMesasVacias() {
       JOptionPane.showMessageDialog(this, "Debe crear una mesa");
    }
    
    @Override
    public void nombreInvalido() {
       JOptionPane.showMessageDialog(this, "Nombre inválido");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        BotonRuleta origen = (BotonRuleta) e.getSource();
        CasilleroRuleta c = origen.getNumero();
        controlador.marcar(c);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboMesas = new javax.swing.JComboBox();
        btnEntrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreMesa = new javax.swing.JTextField();
        btnCrearMesa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("En qué mesa desea jugar?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 40, 500, 70);

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mesas en funcionamiento");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 140, 240, 50);

        getContentPane().add(comboMesas);
        comboMesas.setBounds(250, 150, 250, 30);

        btnEntrar.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(360, 200, 140, 40);

        jLabel4.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        jLabel4.setText("Crear mesa");

        jLabel5.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel5.setText("Nombre");

        btnCrearMesa.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        btnCrearMesa.setText("Confirmar");
        btnCrearMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(23, 23, 23)
                                .addComponent(txtNombreMesa))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 125, Short.MAX_VALUE)
                                .addComponent(btnCrearMesa)))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombreMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearMesa)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 320, 300, 130);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home_750x500.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 750, 500);

        setBounds(0, 0, 766, 537);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        controladorUsuarios.logout();
    }//GEN-LAST:event_formWindowClosing

    private void btnCrearMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMesaActionPerformed
        MesaRuleta mesaNueva = controladorListaMesas.crearMesa(txtNombreMesa.getText(), usu);
        if(mesaNueva != null){
            dispose();
            new VistaNumerosV1(null, false,usu,mesaNueva).setVisible(true);
        }
    }//GEN-LAST:event_btnCrearMesaActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
       DefaultComboBoxModel model = (DefaultComboBoxModel) comboMesas.getModel();
       String nombreMesaSeleccionada = model.getSelectedItem().toString();
       MesaRuleta mesa = controladorListaMesas.buscarMesa(nombreMesaSeleccionada, usu);
       
       if(mesa != null){
            dispose();
            new VistaNumerosV1(null, false,usu,mesa).setVisible(true);
       }
    }//GEN-LAST:event_btnEntrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearMesa;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JComboBox comboMesas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombreMesa;
    // End of variables declaration//GEN-END:variables
}
