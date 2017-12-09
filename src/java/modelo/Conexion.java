/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.*;

public class Conexion 
{
    public static Connection conectarse(String login, String password) throws ClassNotFoundException, SQLException
    {
        
        Connection con=null;
        
        //paso 1 escribir la url de conexion
        String url="jdbc:oracle:thin:@localhost:1521:xe";
      
        //paso 2 cargado del driver
        Class.forName("oracle.jdbc.OracleDriver");
        //paso 3 nos autenticamos
        con=DriverManager.getConnection(url, login, password);
            System.out.println("Conectadito");
        
        return con;
    }
}
