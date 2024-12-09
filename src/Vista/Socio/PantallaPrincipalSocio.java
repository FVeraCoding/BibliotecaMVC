/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Socio;

import Modelo.Clases.Usuario;
import Vista.LoginVista;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Fernando
 */
public class PantallaPrincipalSocio extends javax.swing.JFrame {

    LoginVista login = new LoginVista();
    Usuario usuarioLogueado;

    public PantallaPrincipalSocio(Usuario usuarioLogueado) {
        initComponents();
        System.out.println(usuarioLogueado.toString());
        this.usuarioLogueado = usuarioLogueado;
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setFondoPantalla();
        this.setImageLabel(jLabelLogo, "/img/logo.png");
        this.setResizable(false);
    }
    
    private void setImageLabel(JLabel label, String ruta) {
    try {
        // Carga de la imagen desde la ruta proporcionada
        ImageIcon imagen = new ImageIcon(getClass().getResource(ruta));
        
        // Verificar si la imagen se ha cargado correctamente
        if (imagen.getIconWidth() == -1) {
            System.out.println("No se pudo cargar la imagen desde la ruta: " + ruta);
            return; // Salimos si la imagen no se cargó
        }

        // Obtener la imagen original
        Image img = imagen.getImage();

        // Redimensionar la imagen para que se ajuste al tamaño del JLabel
        Image imagenRedimensionada = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);

        // Crear un nuevo ImageIcon con la imagen redimensionada
        ImageIcon imagenRedimensionada2 = new ImageIcon(imagenRedimensionada);

        // Establecer el icono de la etiqueta
        label.setIcon(imagenRedimensionada2);
    } catch (Exception e) {
        e.printStackTrace(); // Imprimir cualquier excepción que ocurra
    }
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

        jLabelBienvenida = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuLibros = new javax.swing.JMenu();
        jMenuItemBuscarLibro = new javax.swing.JMenuItem();
        jMenuEventos = new javax.swing.JMenu();
        jMenuItemEventosBuscar = new javax.swing.JMenuItem();
        jMenuClub = new javax.swing.JMenu();
        jMenuItemVerClubs = new javax.swing.JMenuItem();
        jMenuReservas = new javax.swing.JMenu();
        jMenuItemVerReservas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelBienvenida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelBienvenida.setText("Bienvenido/a");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("a");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Biblioteca Oliveria");

        jMenuLibros.setText("Libros");

        jMenuItemBuscarLibro.setText("Buscar");
        jMenuItemBuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBuscarLibroActionPerformed(evt);
            }
        });
        jMenuLibros.add(jMenuItemBuscarLibro);

        jMenuBar1.add(jMenuLibros);

        jMenuEventos.setText("Eventos");

        jMenuItemEventosBuscar.setText("Buscar");
        jMenuItemEventosBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEventosBuscarActionPerformed(evt);
            }
        });
        jMenuEventos.add(jMenuItemEventosBuscar);

        jMenuBar1.add(jMenuEventos);

        jMenuClub.setText("Club de Lectura");

        jMenuItemVerClubs.setText("Ver Clubs");
        jMenuItemVerClubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVerClubsActionPerformed(evt);
            }
        });
        jMenuClub.add(jMenuItemVerClubs);

        jMenuBar1.add(jMenuClub);

        jMenuReservas.setText("Reservas");

        jMenuItemVerReservas.setText("Ver reservas");
        jMenuItemVerReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVerReservasActionPerformed(evt);
            }
        });
        jMenuReservas.add(jMenuItemVerReservas);

        jMenuBar1.add(jMenuReservas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabelBienvenida)))
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemBuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBuscarLibroActionPerformed
        try {
            BuscarLibrosVista buscarLibros = new BuscarLibrosVista(this.usuarioLogueado);
            buscarLibros.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PantallaPrincipalSocio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemBuscarLibroActionPerformed

    private void jMenuItemVerReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVerReservasActionPerformed
        try {
            MisReservasVista reservasVista = new MisReservasVista(usuarioLogueado);
            reservasVista.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PantallaPrincipalSocio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemVerReservasActionPerformed

    private void jMenuItemEventosBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEventosBuscarActionPerformed
        try {
            EventosVista eventos = new EventosVista(this.usuarioLogueado);
            eventos.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PantallaPrincipalSocio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemEventosBuscarActionPerformed

    private void jMenuItemVerClubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVerClubsActionPerformed
        try {
            ClubVista clubVista = new ClubVista(this.usuarioLogueado);
            clubVista.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PantallaPrincipalSocio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItemVerClubsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBienvenida;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuClub;
    private javax.swing.JMenu jMenuEventos;
    private javax.swing.JMenuItem jMenuItemBuscarLibro;
    private javax.swing.JMenuItem jMenuItemEventosBuscar;
    private javax.swing.JMenuItem jMenuItemVerClubs;
    private javax.swing.JMenuItem jMenuItemVerReservas;
    private javax.swing.JMenu jMenuLibros;
    private javax.swing.JMenu jMenuReservas;
    // End of variables declaration//GEN-END:variables
}
