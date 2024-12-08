package Controlador.Reservas;

import Modelo.Clases.Reserva;
import Modelo.ClasesDAO.ReservaDAO;
import Vista.ReservarEjemplarVista;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ReservasController {

    ReservaDAO reDAO;
    ReservarEjemplarVista vista;

    public ReservasController(ReservarEjemplarVista vista) throws SQLException {
        reDAO = new ReservaDAO();
        this.vista = vista;
    }

    public void crearReserva() throws SQLException {
        int idSocio = vista.getUsuarioLogueado().getId();
        System.out.println(idSocio);
        int idEjemplar = vista.ejemplarSeleccionado().getId();

        if (!vista.ejemplarSeleccionado().getEstado().equals("Reservado")) {
            reDAO.create(idSocio, idEjemplar);

            vista.ejemplarSeleccionado().setEstado("Reservado");
            vista.getTableModel().fireTableDataChanged();
            JOptionPane.showMessageDialog(vista, "Reserva realizada con éxito.");
        } else {
            JOptionPane.showMessageDialog(vista, "Este ejemplar ya ha sido reservado.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

}
