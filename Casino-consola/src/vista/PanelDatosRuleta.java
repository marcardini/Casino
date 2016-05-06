package vista;

import controlador.ControladorMesaRuleta;
import dominio.Jugador;
import dominio.ruleta.CasilleroRuleta;
import dominio.ruleta.MesaRuleta;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class PanelDatosRuleta extends javax.swing.JDialog implements IVistaDatosRuleta{

    private ControladorMesaRuleta controladorMesaRuleta;
    private Jugador usu;
    private MesaRuleta mesa;
    
    public PanelDatosRuleta(){}
    
    public PanelDatosRuleta(java.awt.Frame parent, boolean modal, MesaRuleta mesaR, Jugador jugador, ArrayList<CasilleroRuleta> numeros,ActionListener actionListener) {
        super(parent, modal);
        initComponents();
        controladorMesaRuleta = new ControladorMesaRuleta(this, mesaR, jugador);
        usu=jugador;
        mesa = mesaR;
        mostrar(numeros, actionListener);
    }

    public void mostrar(ArrayList<CasilleroRuleta> numeros, ActionListener actionListener) {
        GridLayout disenio = new GridLayout(1, numeros.size());
        setLayout(disenio);
        for(CasilleroRuleta c:numeros){
            BotonRuleta b = new BotonRuleta(c.getNumeroEnMesa() + "");
            b.setBackground(c.getColorOriginal());
            b.setForeground(Color.white);
            b.addActionListener(actionListener);
            b.setNumero(c);
            Jugador u = c.getJugadorAposto();
            if(u == null) 
                b.setToolTipText("Sin marcar");
            else 
                b.setToolTipText(u.getNombreUsuario());
            add(b);
        }
    }
    
    @Override
    public void mostrar(MesaRuleta mesa, Jugador usu) {
        throw new NotImplementedException();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        lblApuesta = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        montoApuesta = new javax.swing.JSpinner();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnSalirJuego = new javax.swing.JMenu();
        btnSalirMesa = new javax.swing.JMenu();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home_750x500.jpg"))); // NOI18N

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblApuesta.setFont(new java.awt.Font("Leelawadee", 0, 16)); // NOI18N
        lblApuesta.setText("Apuesta");
        getContentPane().add(lblApuesta);
        lblApuesta.setBounds(20, 330, 70, 30);

        jButton3.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jButton3.setText("Repetir apuesta");
        getContentPane().add(jButton3);
        jButton3.setBounds(390, 330, 130, 30);

        jButton1.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jButton1.setText("Jugar");
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 330, 130, 30);
        getContentPane().add(montoApuesta);
        montoApuesta.setBounds(100, 330, 70, 30);

        btnSalirJuego.setText("Salir de juego");
        jMenuBar1.add(btnSalirJuego);

        btnSalirMesa.setText("Salir de mesa");
        jMenuBar1.add(btnSalirMesa);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 566, 464);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnSalirJuego;
    private javax.swing.JMenu btnSalirMesa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JLabel lblApuesta;
    private javax.swing.JSpinner montoApuesta;
    // End of variables declaration//GEN-END:variables

}
