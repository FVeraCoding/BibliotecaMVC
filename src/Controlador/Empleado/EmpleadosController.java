package Controlador.Empleado;

import Modelo.Clases.Empleado;
import Modelo.ClasesDAO.EmpleadoDAO;
import Vista.Empleado.AddEventoVista;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class EmpleadosController {

    EmpleadoDAO eDAO;
    AddEventoVista vistaEventos;

    public EmpleadosController(AddEventoVista vistaEventos) throws SQLException {
        this.eDAO = new EmpleadoDAO();
        this.vistaEventos = vistaEventos;
    }

    public void inicializarTabla() throws SQLException {
        ArrayList<Empleado> listaEmpleados = eDAO.obtenerTodos();
    }

    public void rellenarCombobox(JComboBox combo) throws SQLException {
        ArrayList<Empleado> listaEmpleados = eDAO.obtenerTodos();

        for (Empleado empleado : listaEmpleados) {
            combo.addItem(empleado.getId());
        }

    }

}
