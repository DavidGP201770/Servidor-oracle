/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.DAOAlmacen;

/**
 *
 * @author DUGPLPW7
 */
public class ServletGuardarAlmacen extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");    
            PrintWriter salida= response.getWriter();    
            DAOAlmacen dao = new DAOAlmacen();
        try {
            dao.guardar(Integer.parseInt(request.getParameter("id")), 
            request.getParameter("ubicacion"));
            salida.println("Almacen guardado con éxito!!!");
        } catch (Exception ex) {
            salida.println(ex.getMessage());
        }
    }
}