package Modelo.LoginUsuario;

import Modelo.Clases.Usuario;
import Modelo.ClasesDAO.UsuarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;

public class LoginUsuarioModelo {

    public boolean verificarLogueo(Usuario usuarioLogueado) throws SQLException {

        UsuarioDAO uDAO = new UsuarioDAO();

        ArrayList<Usuario> usuarios = uDAO.obtenerTodos();

        boolean autenticado = false; // Bandera para verificar si la autenticación fue exitosa

        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equalsIgnoreCase(usuarioLogueado.getNombreUsuario())
                    && usuario.getPassword().equals(usuarioLogueado.getPassword())) {

                autenticado = true;
                return true;
            }
        }

        return false;
    }

}
