package vista;

public class PanelDatos extends javax.swing.JPanel {

    public PanelDatos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstJugadoresMesa = new javax.swing.JList<String>();
        lblApuesta = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnSalirMesa = new javax.swing.JButton();
        btnCambiarJuego = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();

        setLayout(null);

        jScrollPane1.setViewportView(lstJugadoresMesa);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 550, 40);

        lblApuesta.setText("Apuesta");
        add(lblApuesta);
        lblApuesta.setBounds(50, 360, 70, 20);

        jButton1.setText("Jugar");
        add(jButton1);
        jButton1.setBounds(410, 360, 100, 30);

        jButton3.setText("Repetir apuesta");
        add(jButton3);
        jButton3.setBounds(220, 360, 130, 30);

        btnSalirMesa.setText("Salir de mesa");
        add(btnSalirMesa);
        btnSalirMesa.setBounds(10, 10, 170, 40);

        btnCambiarJuego.setText("Cambiar de juego");
        add(btnCambiarJuego);
        btnCambiarJuego.setBounds(200, 10, 160, 40);
        add(jSpinner1);
        jSpinner1.setBounds(130, 360, 29, 20);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarJuego;
    private javax.swing.JButton btnSalirMesa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblApuesta;
    private javax.swing.JList<String> lstJugadoresMesa;
    // End of variables declaration//GEN-END:variables
}
