package Controlador.Login;

import Modelo.Clases.Usuario;
import Modelo.Login.LoginUsuarioModelo;
import Vista.LoginVista;
import java.sql.SQLException;

public class LoginUsuarioController {

    LoginVista loginVista;
    LoginUsuarioModelo loginUsuarioModelo;
    int idUsuarioLogueado;

    public LoginUsuarioController(LoginVista lv) {
        this.loginVista = lv;
        this.loginUsuarioModelo = new LoginUsuarioModelo();
    }

    public void loginUsuario() throws SQLException {
        Usuario usuarioLogueado = loginVista.usuarioLogueado();
        if (loginUsuarioModelo.verificarLogueo(usuarioLogueado) == 1) {
            loginVista.abrirPantallaSocio();
        } else if (loginUsuarioModelo.verificarLogueo(usuarioLogueado) == 2) {
            loginVista.abrirPantallaEmpleado();
        } else if (loginUsuarioModelo.verificarLogueo(usuarioLogueado) == 3) {
            loginVista.abrirPantallaAdministrador();
        } else {
            loginVista.mensajeError();
        }
    }
}
