package vista;

public class PanelMesa extends javax.swing.JFrame {

    public PanelMesa() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblNombreNuevaMesa = new javax.swing.JLabel();
        txtNombreNuevaMesa = new javax.swing.JTextField();
        btnCrearNuevaMesa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(null);

        jComboBox1.setMinimumSize(new java.awt.Dimension(100, 20));
        jComboBox1.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(250, 130, 220, 30);

        jButton1.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jButton1.setText("Entrar");
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 190, 140, 40);

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mesas en funcionamiento");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 130, 230, 20);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Crear mesa");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 10, 140, 29);

        lblNombreNuevaMesa.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        lblNombreNuevaMesa.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreNuevaMesa.setText("Nombre");
        jPanel1.add(lblNombreNuevaMesa);
        lblNombreNuevaMesa.setBounds(20, 60, 90, 20);

        txtNombreNuevaMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreNuevaMesaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreNuevaMesa);
        txtNombreNuevaMesa.setBounds(100, 60, 140, 20);

        btnCrearNuevaMesa.setFont(new java.awt.Font("Leelawadee", 0, 16)); // NOI18N
        btnCrearNuevaMesa.setText("Crear");
        jPanel1.add(btnCrearNuevaMesa);
        btnCrearNuevaMesa.setBounds(130, 110, 73, 29);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/roulette_new_table.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 390, 160);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(90, 300, 390, 160);

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("En que mesa desea jugar?");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 50, 470, 44);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home_750x500.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 750, 500);

        setBounds(0, 0, 767, 538);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreNuevaMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreNuevaMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreNuevaMesaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearNuevaMesa;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNombreNuevaMesa;
    private javax.swing.JTextField txtNombreNuevaMesa;
    // End of variables declaration//GEN-END:variables
}
