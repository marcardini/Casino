package vista;

import modelo.Fachada;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        crear.setText("Crear Login");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        getContentPane().add(crear);
        crear.setBounds(80, 40, 230, 80);

        setBounds(0, 0, 418, 202);
    }// </editor-fold>//GEN-END:initComponents

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        new PanelLoginV1(this,false).setVisible(true);
    }//GEN-LAST:event_crearActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crear;
    // End of variables declaration//GEN-END:variables
}
