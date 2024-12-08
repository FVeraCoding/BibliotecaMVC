/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Ejemplar.EjemplarController;
import Controlador.Reservas.ReservasController;
import Modelo.Clases.Ejemplar;
import Modelo.Clases.Usuario;
import Tablemodels.EjemplarTableModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Fernando
 */
public class ReservarEjemplarVista extends javax.swing.JFrame {

    private TableRowSorter<EjemplarTableModel> sorter;
    private BuscarLibrosVista vistaLibros;
    private EjemplarController controladorEjemplares;
    private ReservasController controladorReserva;
    private Usuario usuarioLogueado;
    private EjemplarTableModel tableModel;

    public ReservarEjemplarVista(int idLibro, BuscarLibrosVista vistaLibros, Usuario usuarioLogueado) throws SQLException {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.vistaLibros = vistaLibros;
        controladorEjemplares = new EjemplarController(vistaLibros, this);
        controladorEjemplares.inicializarTabla();
        controladorReserva = new ReservasController(this);
        this.jLabelTitulo.setText("Ejemplares de: " + vistaLibros.libroSeleccionado().getTitulo());
        this.usuarioLogueado = usuarioLogueado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEjemplares = new javax.swing.JTable();
        jButtonReservar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTableEjemplares.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableEjemplares);

        jButtonReservar.setText("Reserva");
        jButtonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jButtonReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonReservar)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservarActionPerformed
        try {
            controladorReserva.crearReserva();
            
        } catch (SQLException ex) {
            Logger.getLogger(ReservarEjemplarVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonReservarActionPerformed

    public void actualizarTabla(ArrayList<Ejemplar> listaEjemplares) throws SQLException {
        tableModel = new EjemplarTableModel(listaEjemplares);
        jTableEjemplares.setModel(tableModel);

        this.sorter = new TableRowSorter<>(tableModel);
        jTableEjemplares.setRowSorter(sorter);
    }

    public Ejemplar ejemplarSeleccionado() {
        int selectedRow = jTableEjemplares.getSelectedRow();

        if (selectedRow != -1) {
            // Obtener el libro seleccionado
            Ejemplar ejemplarSeleccionado = ((EjemplarTableModel) jTableEjemplares.getModel()).getEjemplarEnFila(selectedRow);

            System.out.println(ejemplarSeleccionado.toString());

            return ejemplarSeleccionado;  // Devolver el libro seleccionado
        } else {
            // Mostrar un mensaje si no hay libro seleccionado
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un libro primero.");
            return null;  // Devolver null si no hay libro seleccionado
        }

    }

    public Usuario getUsuarioLogueado() {
        return usuarioLogueado;
    }

    public EjemplarTableModel getTableModel() {
        return tableModel;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonReservar;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEjemplares;
    // End of variables declaration//GEN-END:variables
}
