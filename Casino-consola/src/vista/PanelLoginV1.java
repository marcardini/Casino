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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 30, 90, 30);

        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 90, 70, 20);
        getContentPane().add(usuario);
        usuario.setBounds(100, 30, 100, 30);
        getContentPane().add(password);
        password.setBounds(100, 80, 100, 30);

        login.setText("Ingresar");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(220, 80, 100, 30);

        setBounds(0, 0, 359, 185);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        controlador.login(usuario.getText(), password.getText());
    }//GEN-LAST:event_loginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
