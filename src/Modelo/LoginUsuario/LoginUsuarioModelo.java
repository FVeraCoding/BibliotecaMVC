package Modelo.Login;

import Modelo.Clases.Usuario;
import Modelo.ClasesDAO.UsuarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;

public class LoginUsuarioModelo {

    public int verificarLogueo(Usuario usuarioLogueado) throws SQLException {

        UsuarioDAO uDAO = new UsuarioDAO();

        ArrayList<Usuario> usuarios = uDAO.obtenerTodos();

        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equalsIgnoreCase(usuarioLogueado.getNombreUsuario())
                    && usuario.getPassword().equals(usuarioLogueado.getPassword())) {

                
                
                switch (usuario.getRol()) {
                    case "Socio":
                        return 1;
                    case "Empleado":
                        return 2;
                    case "Administrador":
                        return 3;
                    default:
                        return -1;
                }          
            }
        }

        return -1;
    }

}
