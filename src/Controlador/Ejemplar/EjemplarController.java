
package Controlador.Ejemplar;

import Modelo.Clases.Ejemplar;
import Modelo.ClasesDAO.EjemplarDAO;
import Vista.BuscarLibrosVista;
import Vista.ReservarEjemplarVista;
import java.sql.SQLException;
import java.util.ArrayList;


public class EjemplarController {
    EjemplarDAO eDAO;
    BuscarLibrosVista vistaLibro;
    ReservarEjemplarVista vistaEjemplar;

    public EjemplarController(BuscarLibrosVista vistaLibros, ReservarEjemplarVista vistaEjemplar) throws SQLException {
        this.eDAO = new EjemplarDAO();
        this.vistaLibro = vistaLibros;
        this.vistaEjemplar = vistaEjemplar;
    }
    
    public void inicializarTabla() throws SQLException{
        ArrayList<Ejemplar> listaEjemplares = eDAO.obtenerEjemplaresPorLibro(vistaLibro.libroSeleccionado().getId());
        vistaEjemplar.actualizarTabla(listaEjemplares);
    }
    
    
}
