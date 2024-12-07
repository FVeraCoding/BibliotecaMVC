/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.SQLException;


public class main {

    public static void main(String[] args) throws SQLException {
        ConexionBD conexion = new ConexionBD();
        
        Connection con = conexion.getConexion();
        
        
    }
    
}
