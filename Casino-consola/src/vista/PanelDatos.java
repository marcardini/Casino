package vista;

public class PanelDatos extends javax.swing.JPanel {

    public PanelDatos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<String>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jScrollPane1.setViewportView(jList1);

        add(jScrollPane1);
        jScrollPane1.setBounds(150, 80, 200, 140);

        jLabel1.setText("Apuesta");
        add(jLabel1);
        jLabel1.setBounds(60, 250, 70, 20);

        jButton1.setText("Jugar");
        add(jButton1);
        jButton1.setBounds(350, 250, 100, 30);

        jButton3.setText("Repetir apuesta");
        add(jButton3);
        jButton3.setBounds(200, 250, 130, 30);

        jButton4.setText("Salir de mesa");
        add(jButton4);
        jButton4.setBounds(10, 10, 170, 40);

        jButton5.setText("Cambiar de juego");
        add(jButton5);
        jButton5.setBounds(200, 10, 160, 40);
        add(jSpinner1);
        jSpinner1.setBounds(140, 250, 29, 20);

        jLabel2.setText("Jugadores en mesa");
        add(jLabel2);
        jLabel2.setBounds(160, 60, 170, 14);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
