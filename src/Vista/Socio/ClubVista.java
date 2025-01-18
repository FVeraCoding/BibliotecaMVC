/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Socio;

import Controlador.Socio.ClubController;
import Modelo.Clases.Club;
import Modelo.Clases.Usuario;
import Modelo.TableModels.ClubTableModel;
import java.awt.Image;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Fernando
 */
public class ClubVista extends javax.swing.JFrame {

    private TableRowSorter<ClubTableModel> sorter;
    private ClubController controlador;
    Usuario usuarioLogueado;

    public ClubVista(Usuario usuarioLogueado) throws SQLException {
        initComponents();
        this.usuarioLogueado = usuarioLogueado;
        controlador = new ClubController(this);
        controlador.inicializarTabla();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setFondoPantalla();
        this.setResizable(false);
    }
    
    private void setFondoPantalla() {
    // Carga la imagen de fondo desde el archivo
    ImageIcon fondo = new ImageIcon(getClass().getResource("/img/fondo.jpg"));

    // Obtenemos la imagen original
    Image img = fondo.getImage();

    // Redimensionamos la imagen para que se ajuste al tamaño del JFrame manteniendo la proporción
    Image fondoRedimensionado = img.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);

    // Creamos un nuevo ImageIcon con la imagen redimensionada
    ImageIcon fondoRedimensionadoIcon = new ImageIcon(fondoRedimensionado);

    // Creamos un JLabel que contiene la imagen redimensionada
    JLabel fondoLabel = new JLabel(fondoRedimensionadoIcon);

    // Configuramos el JLabel al tamaño del JFrame
    fondoLabel.setSize(this.getWidth(), this.getHeight());

    // Agregamos el JLabel al JPanel del JFrame
    this.getContentPane().add(fondoLabel);

    // Para que los otros componentes aparezcan encima del fondo, ajustamos el layout
    this.getContentPane().setLayout(null);  // Desactivar el layout automático para colocar manualmente
}


    public void actualizarTabla(ArrayList<Club> listaClubs) throws SQLException {
        ClubTableModel tableModel = new ClubTableModel(listaClubs);
        jTableClubs.setModel(tableModel);

        this.sorter = new TableRowSorter<>(tableModel);
        jTableClubs.setRowSorter(sorter);
    }

    public Club clubSeleccionado() {
        int selectedRow = jTableClubs.getSelectedRow();

        if (selectedRow != -1) {
            Club clubSeleccionado = ((ClubTableModel) jTableClubs.getModel()).getClubEnFila(selectedRow);

            return clubSeleccionado;
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un club primero.");
            return null;
        }
    }

    public Usuario getUsuarioLogueado() {
        return usuarioLogueado;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClubs = new javax.swing.JTable();
        jButtonVerIntegrantes = new javax.swing.JButton();
        jButtonUnirse = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Clubs de lectura");

        jTableClubs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableClubs);

        jButtonVerIntegrantes.setText("Ver Integrantes");
        jButtonVerIntegrantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerIntegrantesActionPerformed(evt);
            }
        });

        jButtonUnirse.setText("Unirme");
        jButtonUnirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUnirseActionPerformed(evt);
            }
        });

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonVerIntegrantes)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonUnirse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonVolver))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUnirse)
                    .addComponent(jButtonVerIntegrantes)
                    .addComponent(jButtonVolver))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerIntegrantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerIntegrantesActionPerformed
        try {
            IntegrantesClubVista integrantesVista = new IntegrantesClubVista(this.clubSeleccionado().getId());
            integrantesVista.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ClubVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonVerIntegrantesActionPerformed

    private void jButtonUnirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUnirseActionPerformed
        try {
            controlador.modificarClub();
        } catch (SQLException ex) {
            Logger.getLogger(ClubVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonUnirseActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonUnirse;
    private javax.swing.JButton jButtonVerIntegrantes;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClubs;
    // End of variables declaration//GEN-END:variables

}
