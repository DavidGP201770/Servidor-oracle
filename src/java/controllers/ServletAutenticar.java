/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import modelo.Conexion;
/**
 *
 * @author DUGPLPW7
 */
public class ServletAutenticar extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Pedimos los valores que envio el formulario y verificamos que sean correctos
        String login=request.getParameter("login");
        String password=request.getParameter("password");
        
        System.out.println("Los datos son: "+login+"El pswd "+password);
        try{
        Conexion.conectarse(login, password);
    //El servlet hace el ruteamiento como sigue
    RequestDispatcher despachador=request.getRequestDispatcher("/bienvenido.html");
    //El despachador la routea
    despachador.forward(request, response);
    
        }catch(Exception e){
            System.out.println("aasasasa"+e.getMessage());
        RequestDispatcher despachador=request.getRequestDispatcher("/error.html");
        despachador.forward(request, response);
        }
   
    }
}