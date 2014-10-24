/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.upc.share.controller;

import com.upc.share.dao.UsuarioDao;
import com.upc.share.modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vj
 */
@WebServlet(name = "ActualizarUsuarioController", urlPatterns = {"/ActualizarUsuarioController"})
public class ActualizarUsuarioController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String mensaje = "";
            String claveAnt ="";
            
            List<Usuario>  listUser = new ArrayList<Usuario>();
            UsuarioDao userDao = new UsuarioDao();
        try {
                listUser = userDao.listar();
                Usuario user   = new Usuario();
                
                
                for (Usuario usuario : listUser) {
                    if( request.getParameter("txtUsuario").equalsIgnoreCase(usuario.getApodo())){
                        user.setIdUsuario( usuario.getIdUsuario() );
                        claveAnt = usuario.getClave();
                    }
                }
//                if (request.getParameter("txtClaveAnt").equalsIgnoreCase(claveAnt )) {
//                    user.setApodo( request.getParameter("txtUsuario") );
//                    user.setClave( request.getParameter("txtNewClave"));
//                    user.setCorreo( request.getParameter("txtEmail"));
//                    userDao.actualizar(user);
//                    mensaje="DatosActualizados";
//                }
                   user.setApodo( request.getParameter("txtUsuario") );
                   user.setClave( request.getParameter("txtNewClave"));
                   user.setCorreo( request.getParameter("txtEmail"));
                   userDao.actualizar(user);
                    mensaje="DatosActualizados";
               
            } catch (Exception e) {
                e.printStackTrace();
                mensaje = "Error"+ e.getMessage();
                
        }
        response.sendRedirect("MantenimientoUsuario.jsp?mensaje="+mensaje);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
