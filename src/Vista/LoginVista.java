/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Vista.Empleado.PantallaPrincipalEmpleado;
import Vista.Socio.PantallaPrincipalSocio;
import Controlador.LoginUsuarioController;
import Modelo.Clases.Usuario;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Fernando
 */
public class LoginVista extends javax.swing.JFrame {

    LoginUsuarioController controlador;

    /**
     * Creates new form LoginVista
     */
    public LoginVista() {
        initComponents();
        controlador = new LoginUsuarioController(this);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setFondoPantalla();

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


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldLoginUsuario = new javax.swing.JTextField();
        jButtonLoginEntrar = new javax.swing.JButton();
        jLabelInicioSesion = new javax.swing.JLabel();
        jPasswordFieldLogin = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonLoginEntrar.setText("Entrar");
        jButtonLoginEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginEntrarActionPerformed(evt);
            }
        });

        jLabelInicioSesion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelInicioSesion.setText("Iniciar Sesión");

        jPasswordFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldLoginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218))
                    .addComponent(jButtonLoginEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInicioSesion))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelInicioSesion)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jButtonLoginEntrar)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginEntrarActionPerformed

        try {
            controlador.loginUsuario();

        } catch (SQLException ex) {
            Logger.getLogger(LoginVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonLoginEntrarActionPerformed

    public Usuario usuarioLogueado() {
        Usuario usuario = new Usuario(jTextFieldLoginUsuario.getText(), jPasswordFieldLogin.getText());
        return usuario;
    }

    public void abrirPantallaSocio(Usuario usuario) {
        PantallaPrincipalSocio pantalla = new PantallaPrincipalSocio(usuario);
        pantalla.setVisible(true);
    }

    public void abrirPantallaEmpleado(Usuario usuario) {
        PantallaPrincipalEmpleado pantalla = new PantallaPrincipalEmpleado(usuario);
        pantalla.setVisible(true);
    }

    

    public void mensajeError() {
        javax.swing.JOptionPane.showMessageDialog(this, "Nombre de usuario o contraseña incorrectos.", "Error de autenticación", javax.swing.JOptionPane.ERROR_MESSAGE);
    }

    private void jPasswordFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
                    System.out.println("Versión de Java: " + System.getProperty("java.version"));

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LoginVista.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(LoginVista.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(LoginVista.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(LoginVista.class.getName()).log(Level.SEVERE, null, ex);
                }
                new LoginVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLoginEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelInicioSesion;
    private javax.swing.JPasswordField jPasswordFieldLogin;
    private javax.swing.JTextField jTextFieldLoginUsuario;
    // End of variables declaration//GEN-END:variables
}
