package vista;

import controlador.ControladorLogin;
import javax.swing.JOptionPane;
import dominio.Jugador;

public class PanelLoginV1 extends javax.swing.JDialog implements VistaLogin {

    private ControladorLogin controlador;
    
    public PanelLoginV1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        controlador = new ControladorLogin(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(null);
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 80, 60, 30);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 140, 80, 20);
        getContentPane().add(usuario);
        usuario.setBounds(110, 80, 100, 30);
        getContentPane().add(password);
        password.setBounds(110, 130, 100, 30);

        login.setText("Ingresar");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(110, 200, 100, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/homeLogo.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(500, 300));
        jLabel3.setMinimumSize(new java.awt.Dimension(500, 300));
        jLabel3.setPreferredSize(new java.awt.Dimension(500, 300));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 500, 300);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(460, 0, 34, 14);

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(460, 10, 34, 14);

        setBounds(0, 0, 516, 340);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        controlador.login(usuario.getText(), password.getText());
    }//GEN-LAST:event_loginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton login;
    private javax.swing.JTextField password;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

    @Override
    public void errorLogin() {
        JOptionPane.showMessageDialog(this, "Login incorrecto");
    }

    @Override
    public void ingresar(Jugador u) {
        dispose();
        new PanelJuegosV1(null,false,u).setVisible(true);
        //new VistaNumerosV1(null, false,u).setVisible(true); --> llamada a panel de ruleta
    }

    @Override
    public void habilitar(boolean b) {
     login.setEnabled(b);
    }

    
}
