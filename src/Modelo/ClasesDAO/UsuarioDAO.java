
package Modelo.ClasesDAO;

import Modelo.Clases.Usuario;
import Modelo.Conexion.ConexionBD;
import java.sql.*;


public class UsuarioDAO {
    ConexionBD conexion = new ConexionBD();
    Connection con;
    
    public UsuarioDAO() throws SQLException{
        con = conexion.getConexion();
    }
    
    public boolean create(Usuario usuario) throws SQLException{
        PreparedStatement pSentencia = con.prepareStatement("INSERT INTO Usuario VALUES (?, ?, ?, ?)");
        
        pSentencia.setInt(1, usuario.getId());
        pSentencia.setString(2, usuario.getNombreUsuario());
        pSentencia.setString(3, usuario.getPassword());
        pSentencia.setString(4, usuario.getRol());
        
        int resultado = pSentencia.executeUpdate();
        
        return resultado != 0; 
        
    }
}
