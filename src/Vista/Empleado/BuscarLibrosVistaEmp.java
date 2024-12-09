/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Empleado;

import Controlador.Empleado.LibrosControllerEmp;
import Vista.Socio.*;
import Modelo.Clases.Libro;
import Modelo.Clases.Usuario;
import Modelo.TableModels.LibroTableModel;
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
public class BuscarLibrosVistaEmp extends javax.swing.JFrame {

    private TableRowSorter<LibroTableModel> sorter;
    LibrosControllerEmp controlador = new LibrosControllerEmp(this);
    Usuario usuarioLogueado;

    public BuscarLibrosVistaEmp(Usuario usuarioLogueado) throws SQLException {
        initComponents();
        controlador.inicializarTabla();
        this.usuarioLogueado = usuarioLogueado;
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setFondoPantalla();
        this.setResizable(false);
    }

    private void setFondoPantalla() {
    // Carga la imagen de fondo desde el archivo
    ImageIcon fondo = new ImageIcon(getClass().getResource("/fondo.jpg"));

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLibros = new javax.swing.JTable();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jButtonAñadirLibro = new javax.swing.JButton();
        jButtonEliminarLibro = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Autor", "Editorial", "Genero", "ISBN", "Año "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableLibros.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTableLibros);
        jTableLibros.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jTextFieldBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBusquedaActionPerformed(evt);
            }
        });

        jLabel1.setText("Introduce el título");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Búsqueda de Libros");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonAñadirLibro.setText("Añadir Libro");
        jButtonAñadirLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirLibroActionPerformed(evt);
            }
        });

        jButtonEliminarLibro.setText("Eliminar Libro");
        jButtonEliminarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarLibroActionPerformed(evt);
            }
        });

        jButton1.setText("Ver ejemplares");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonBuscar)))
                        .addGap(0, 142, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAñadirLibro)
                .addGap(18, 18, 18)
                .addComponent(jButtonEliminarLibro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAñadirLibro)
                    .addComponent(jButtonEliminarLibro)
                    .addComponent(jButton1))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaActionPerformed
        
    }//GEN-LAST:event_jTextFieldBusquedaActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed

        String textoBusqueda = jTextFieldBusqueda.getText();

        if (sorter != null) {
            if (textoBusqueda.isEmpty()) {
                sorter.setRowFilter(null);
            } else {
                sorter.setRowFilter(javax.swing.RowFilter.regexFilter("(?i)" + textoBusqueda, 0));
            }
        }

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonEliminarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarLibroActionPerformed
        try {
            controlador.eliminarLibroSeleccionado();
            controlador.inicializarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(BuscarLibrosVistaEmp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEliminarLibroActionPerformed

    private void jButtonAñadirLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirLibroActionPerformed
        try {
            AddLibroVista addLibro = new AddLibroVista(this);
            addLibro.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarLibrosVistaEmp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAñadirLibroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        libroSeleccionado();
        try {
            ReservarEjemplarVistaEmp ejemplarVista = new ReservarEjemplarVistaEmp(libroSeleccionado().getId(), this, this.usuarioLogueado);
            ejemplarVista.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarLibrosVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public Libro libroSeleccionado() {
    int selectedRow = jTableLibros.getSelectedRow();

    if (selectedRow != -1) {
        // Obtener el libro seleccionado
        Libro libroSeleccionado = ((LibroTableModel) jTableLibros.getModel()).getLibroEnFila(selectedRow);
        
        System.out.println(libroSeleccionado.toString()); 
        
        return libroSeleccionado;  // Devolver el libro seleccionado
    } else {
        // Mostrar un mensaje si no hay libro seleccionado
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un libro primero.");
        return null;  // Devolver null si no hay libro seleccionado
    }
}


    public void actualizarTabla(ArrayList<Libro> listaLibros) {
        LibroTableModel tableModel = new LibroTableModel(listaLibros);
        jTableLibros.setModel(tableModel);

        this.sorter = new TableRowSorter<>(tableModel);
        jTableLibros.setRowSorter(sorter);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAñadirLibro;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminarLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLibros;
    private javax.swing.JTextField jTextFieldBusqueda;
    // End of variables declaration//GEN-END:variables
}
