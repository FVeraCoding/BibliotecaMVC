package Modelo.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/Biblioteca";
    private static final String USER = "root"; 
    private static final String PASSWORD = "1234";

    public static Connection getConexion() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}