
package Biblioteca;

import Modelo.Clases.Usuario;
import Modelo.ClasesDAO.UsuarioDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Aplicacion {
    public static void main(String[] args) {
        try {            
            UsuarioDAO u = new UsuarioDAO();
            
            Usuario us = new Usuario(1, "Martin", "1234", "Usuario");
            u.update(us);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
