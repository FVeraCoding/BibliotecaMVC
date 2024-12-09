/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Empleado;

import Controlador.Empleado.ClubControllerEmp;
import Controlador.Empleado.EmpleadosController;
import Modelo.Clases.Club;
import java.awt.Image;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Fernando
 */
public class AddClubVista extends javax.swing.JFrame {

    ClubVistaEmp vista;
    ClubControllerEmp controladorClubs;
    EmpleadosController controladorEmpleados;

    public AddClubVista(ClubVistaEmp vista) throws SQLException {
        initComponents();
        this.vista = vista;
        controladorClubs = new ClubControllerEmp(vista);
        controladorEmpleados = new EmpleadosController(null, this);
        controladorEmpleados.rellenarCombobox(this.jComboBoxOrganizadorID);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldFecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonAñadir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxOrganizadorID = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Añadir Club");

        jLabel2.setText("Nombre");

        jLabel3.setText("Descripcion");

        jLabel4.setText("Fecha");

        jLabel5.setText("Empleado Gestor (id)");

        jButtonAñadir.setText("Añadir");
        jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirActionPerformed(evt);
            }
        });

        jLabel7.setText("(yyyy-mm-dd)");

        jComboBoxOrganizadorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOrganizadorIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAñadir)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jComboBoxOrganizadorID, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel7)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxOrganizadorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButtonAñadir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
        try {
            Club club = this.nuevoClub();
            controladorClubs.addClub(club);
            
        } catch (SQLException ex) {
            Logger.getLogger(AddClubVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAñadirActionPerformed


    private void jComboBoxOrganizadorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOrganizadorIDActionPerformed

    }//GEN-LAST:event_jComboBoxOrganizadorIDActionPerformed

    public Club nuevoClub() throws SQLException {

        try {
            String nombre = jTextFieldNombre.getText();
            String descripcion = jTextFieldDescripcion.getText();
            String fecha = jTextFieldFecha.getText();
            int organizadorID = (Integer) jComboBoxOrganizadorID.getSelectedItem();

            if (nombre.isEmpty() || descripcion.isEmpty() || fecha.isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Todos los campos deben estar completos.",
                        "Error de Validación",
                        JOptionPane.ERROR_MESSAGE);
                return null;
            }

            if (!fecha.matches("\\d{4}-\\d{2}-\\d{2}")) {
                JOptionPane.showMessageDialog(null,
                        "La fecha debe estar en formato 'yyyy-MM-dd'.",
                        "Error de Formato",
                        JOptionPane.ERROR_MESSAGE);
                return null;
            }

            Date year = convertirTextoADate(fecha);

            return new Club(nombre, descripcion, year, organizadorID);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Ha ocurrido un error inesperado: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }

    public java.sql.Date convertirTextoADate(String textoFecha) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date fechaUtil = formato.parse(textoFecha);
        return new java.sql.Date(fechaUtil.getTime());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JComboBox<String> jComboBoxOrganizadorID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}