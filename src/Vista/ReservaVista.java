package Vista;

import Modelo.Clases.Libro;

/**
 * Vista para gestionar la reserva de un libro.
 */
public class ReservaVista extends javax.swing.JFrame {

    private Libro libro;

    public ReservaVista(Libro libroSeleccionado) {
        this.libro = libroSeleccionado;
        initComponents();
                        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mostrarInformacionLibro();
    }

    private void mostrarInformacionLibro() {
        jLabelTitulo.setText(libro.getTitulo());
        jLabelAutor.setText(libro.getAutor());
        jLabelGenero.setText(libro.getGenero());
        jLabelISBN.setText(libro.getISBN());
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jLabelISBN = new javax.swing.JLabel();
        jButtonReservar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonReservar.setText("Confirmar Reserva");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelAutor)
                    .addComponent(jLabelGenero)
                    .addComponent(jLabelISBN)
                    .addComponent(jButtonReservar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jLabelAutor)
                .addGap(18, 18, 18)
                .addComponent(jLabelGenero)
                .addGap(18, 18, 18)
                .addComponent(jLabelISBN)
                .addGap(18, 18, 18)
                .addComponent(jButtonReservar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButtonReservarActionPerformed(java.awt.event.ActionEvent evt) {
        // Lógica para confirmar la reserva
        javax.swing.JOptionPane.showMessageDialog(this, "Libro reservado exitosamente.", "Reserva", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        this.dispose(); // Cierra la ventana tras reservar
    }

    private javax.swing.JButton jButtonReservar;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelISBN;
}
