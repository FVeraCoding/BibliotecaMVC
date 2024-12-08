
package Controlador.Empleado;

import Modelo.Clases.Ejemplar;
import Modelo.ClasesDAO.EjemplarDAO;
import Vista.Empleado.BuscarLibrosVistaEmp;
import Vista.Empleado.ReservarEjemplarVistaEmp;
import Vista.Socio.BuscarLibrosVista;
import Vista.Socio.ReservarEjemplarVista;
import java.sql.SQLException;
import java.util.ArrayList;


public class EjemplarControllerEmp {
    EjemplarDAO eDAO;
    BuscarLibrosVistaEmp vistaLibro;
    ReservarEjemplarVistaEmp vistaEjemplar;

    public EjemplarControllerEmp(BuscarLibrosVistaEmp vistaLibros, ReservarEjemplarVistaEmp vistaEjemplar) throws SQLException {
        this.eDAO = new EjemplarDAO();
        this.vistaLibro = vistaLibros;
        this.vistaEjemplar = vistaEjemplar;
    }
    
    public void inicializarTabla() throws SQLException{
        ArrayList<Ejemplar> listaEjemplares = eDAO.obtenerEjemplaresPorLibro(vistaLibro.libroSeleccionado().getId());
        vistaEjemplar.actualizarTabla(listaEjemplares);
    }
    
    
}
