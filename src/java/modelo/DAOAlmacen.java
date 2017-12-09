/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DUGPLPW7
 */
import java.sql.*;
public class DAOAlmacen {
    public void guardar(int id, String ubicacion) throws ClassNotFoundException, SQLException{
    
        Connection con=Conexion.conectarse("system","system");
     CallableStatement callate=con.prepareCall("{call guardar_almacen(?,?)");
        callate.registerOutParameter(1,id);
        callate.setString(2,"juan");
        
      
        callate.execute();
        
    }
}
