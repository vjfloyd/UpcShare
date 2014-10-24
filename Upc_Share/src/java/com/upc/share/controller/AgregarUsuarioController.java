package com.upc.share.controller;

import com.upc.share.dao.UsuarioDao;
import com.upc.share.modelo.Carrera;
import com.upc.share.modelo.TipoUsuario;
import com.upc.share.modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "AgregarUsuarioController", urlPatterns = {"/AgregarUsuarioController"})
public class AgregarUsuarioController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        String mensaje;
        
        UsuarioDao userDao = new UsuarioDao();
                try {
                     Usuario user = new Usuario();
                     TipoUsuario tuser = new TipoUsuario();
                     Carrera c = new Carrera();
                     
                     user.setApodo(request.getParameter("txtApodo"));
                     user.setClave(request.getParameter("txtClave"));
                     user.setCorreo(request.getParameter("txtEmail2"));
                     user.setNombre(request.getParameter("txtNombre"));
                     tuser.setIdTipoUsuario(2);
                     tuser.setDTipoUsuario("comun");
                     
                     c.setIdCarrera(2);
                     c.setDCarrera("Administracion");
                     user.setCarrera(c);
                     user.setTipoUsuario(tuser);
                    
//                    if (  request.getParameter("txtApodo")!= null &&
//                          request.getParameter("txtClave") != null &&
//                          request.getParameter("txtEmail2") != null &&
//                          request.getParameter("txtEmail2").equalsIgnoreCase(request.getParameter("txtEmail1"))
//                       )
//                    {
                        userDao.insertar(user);
                        mensaje = "Usuario Registrado!!!";
                    //}
                     
                } catch (Exception e) {
                    e.printStackTrace();
                    mensaje = "Ocurrrio un error " +e.getMessage();
                }
                response.sendRedirect("InicioRegistro.jsp?mensaje=" + mensaje);
    
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
