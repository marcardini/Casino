package vista;

public class PanelMesa extends javax.swing.JFrame {

    public PanelMesa() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboMesas = new javax.swing.JComboBox();
        btnEntrarMesa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreNuevaMesa = new javax.swing.JTextField();
        btnCrearMesa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(null);

        getContentPane().add(comboMesas);
        comboMesas.setBounds(190, 30, 160, 20);

        btnEntrarMesa.setText("Entrar");
        getContentPane().add(btnEntrarMesa);
        btnEntrarMesa.setBounds(160, 60, 73, 23);

        jLabel1.setText("Mesas en funcionamiento");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 30, 190, 20);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Crear nueva mesa");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 20, 150, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 60, 60, 14);
        jPanel1.add(txtNombreNuevaMesa);
        txtNombreNuevaMesa.setBounds(70, 60, 150, 20);

        btnCrearMesa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCrearMesa.setText("Crear");
        jPanel1.add(btnCrearMesa);
        btnCrearMesa.setBounds(210, 90, 73, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 120, 310, 160);

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearMesa;
    private javax.swing.JButton btnEntrarMesa;
    private javax.swing.JComboBox comboMesas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombreNuevaMesa;
    // End of variables declaration//GEN-END:variables
}
