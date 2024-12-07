
package Controlador.Login;

import Modelo.Clases.Usuario;
import Modelo.LoginUsuario.LoginUsuarioModelo;
import Vista.LoginVista;
import java.sql.SQLException;


public class LoginUsuarioController {
    LoginVista lv = new LoginVista();
    LoginUsuarioModelo lm = new LoginUsuarioModelo();
    
    public void loginUsuario() throws SQLException{
        Usuario usuarioLogueado = lv.usuarioLogueado();
        
        
        if(lm.verificarLogueo(usuarioLogueado)){
            lv.abrirPantallaUsuario();
        }else{
            lv.mensajeError();
        }
       
        
    }
}
