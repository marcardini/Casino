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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(500, 300));
        getContentPane().setLayout(null);

        crear.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        crear.setText("Ingresar al sitio");
        crear.setBorder(null);
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        getContentPane().add(crear);
        crear.setBounds(160, 100, 160, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/get_in.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 300));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -30, 500, 310);

        jLabel3.setPreferredSize(new java.awt.Dimension(500, 300));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 500, 300);

        setBounds(0, 0, 510, 313);
    }// </editor-fold>//GEN-END:initComponents

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        new PanelLoginV1(this,false).setVisible(true);
    }//GEN-LAST:event_crearActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
