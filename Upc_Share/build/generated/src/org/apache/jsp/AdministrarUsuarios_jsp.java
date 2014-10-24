package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.upc.share.dao.UsuarioDao;
import java.util.ArrayList;
import java.util.List;
import com.upc.share.modelo.Usuario;

public final class AdministrarUsuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    String mensaje = request.getParameter("mensaje")==null?"":request.getParameter("mensaje");
   
        List<Usuario> listaUsuario = new ArrayList<Usuario>();
        UsuarioDao userDao = new UsuarioDao();
        
        try{
            listaUsuario = userDao.listar();
            
        }catch(Exception ex)
        {
            mensaje = "Ocurrio un error: " + ex.getMessage();
            ex.printStackTrace();
           
        }



      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <title> Administrar Usuarios</title>\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <meta name=\"description\" content=\"\">\r\n");
      out.write("  <meta name=\"author\" content=\"\">\r\n");
      out.write("\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/widget-chat.css\">\r\n");
      out.write("\t<link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("  <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->\r\n");
      out.write("  <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("  <![endif]-->  \r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/scripts.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<header>\r\n");
      out.write("\t<div class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\"> <span class=\"sr-only\">Toggle navigation</span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span></button> <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("\t\t\t<img src=\"img/upc.png\" width=\"16\" height=\"16\">\r\n");
      out.write("\t\t\t UPC Share</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Mis Cursos<strong class=\"caret\"></strong></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"CursoAlgoritmos.jsp\">Sistemas Operativos</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"CursoAlgoritmos.jsp\"> Algoritmos Avanzados</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"CursoAlgoritmos.jsp\"> Inteligencia Artificial </a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"hidden-sm hidden-md\">\r\n");
      out.write("\t\t\t\t\t<a href=\"BuscarCursos.jsp\">Buscar Cursos</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"MisGrupos.jsp\"> Mis Grupos</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"hidden-sm\">\r\n");
      out.write("\t\t\t\t\t<a href=\"BuscarProfesores.jsp\"> Buscar Profesores</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<form class=\"navbar-form navbar-right\" role=\"search\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default\"><span class=\"glyphicon glyphicon-search\"></span></button>\r\n");
      out.write("                                        </form>  \r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t<span class=\"glyphicon glyphicon-user\"></span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"hidden-sm hidden-md\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">Perfil</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-cog\"></span><strong class=\"caret\"></strong></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Configuracion</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\">\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Salir</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</header>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row clearfix alinear\">\r\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-3\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t    <h3 class=\"panel-title\"><center> Adminisitrar Cuentas de Usuario </center></h3>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t    <ul>\r\n");
      out.write("\t\t\t\t\t\t    \t<li><a> Eliminar </a></li>\r\n");
      out.write("\t\t\t\t\t\t    \t<li><a> Lista  </a></li>\r\n");
      out.write("\t\t\t\t\t\t    \t<li><a> Banear </a></li>\r\n");
      out.write("\t\t\t\t\t\t    \t<li><a> Privilegios </a></li>\r\n");
      out.write("\t\t\t\t\t\t    </ul>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t  \t\t<center>\r\n");
      out.write("\t\t\t\t\t\t\t  \t\t\t<h4> Listar </h4>\r\n");
      out.write("\t\t\t\t\t\t\t  \t\t</center>\r\n");
      out.write("\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t  \t\t<div class=\"row margen\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("                                                                                            <div class=\"col-sm-1\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table class=\"table table-hover table-striped\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<thead class=\"tabla-titulo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t#\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCodigo\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tUsuario\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCorreo\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    Carrera\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNombre\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("                                                                                                                                                                ");

                                                                                                                                                                    for( Usuario u : listaUsuario )
                                                                                                                                                                    {
                                                                                                                                                                
      out.write("\r\n");
      out.write("                                                                                                                                                                <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <td>  </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <td> ");
      out.print(  u.getIdUsuario() );
      out.write("</td>\r\n");
      out.write("                                                                                                                                                                          <td> ");
      out.print(  u.getApodo() );
      out.write("</td>\r\n");
      out.write("                                                                                                                                                                          <td> ");
      out.print(  u.getCorreo() );
      out.write("</td>\r\n");
      out.write("                                                                                                                                                                          <td>  carrera  </td>\r\n");
      out.write("                                                                                                                                                                          <td> ");
      out.print(  u.getNombre() );
      out.write("</td>\r\n");
      out.write("                                                                                                                                                                          \r\n");
      out.write("                                                                                                                                                                          \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("                                                                                                                                                                ");

                                                                                                                                                                    }
                                                                                                                                                                        
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<hr/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t  \t\r\n");
      out.write("\t\t\t\t\t\t </div>\t \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col col-sm-3\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel panel-info chat-widget-main\">\r\n");
      out.write("\t\t                        <div class=\"panel-heading\">\r\n");
      out.write("\t\t                            <h5>RECENT CHAT HISTORY</h5>\r\n");
      out.write("\t\t                        </div>\r\n");
      out.write("\t\t                        <div class=\"panel-body\">\r\n");
      out.write("\t\t                            <div class=\"chat-widget-left\">\r\n");
      out.write("\t\t                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n");
      out.write("\t\t                           Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n");
      out.write("\t\t                            </div>\r\n");
      out.write("\t\t                            <div class=\"chat-widget-name-left\">\r\n");
      out.write("\t\t                                <h4>Amanna Seiar</h4>\r\n");
      out.write("\t\t                            </div>\r\n");
      out.write("\t\t                            <hr />\r\n");
      out.write("\t\t                            <div class=\"chat-widget-right\">\r\n");
      out.write("\t\t                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n");
      out.write("\t\t                           Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n");
      out.write("\t\t                            </div>\r\n");
      out.write("\t\t                            <div class=\"chat-widget-name-right\">\r\n");
      out.write("\t\t                                <h4>Donim Cruseia </h4>\r\n");
      out.write("\t\t                            </div>\r\n");
      out.write("\t\t                            <hr />\r\n");
      out.write("\t\t                            <div class=\"chat-widget-left\">\r\n");
      out.write("\t\t                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n");
      out.write("\t\t                           Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n");
      out.write("\t\t                            </div>\r\n");
      out.write("\t\t                            <div class=\"chat-widget-name-left\">\r\n");
      out.write("\t\t                                <h4>Amanna Seiar</h4>\r\n");
      out.write("\t\t                            </div>\r\n");
      out.write("\t\t                            <hr />\r\n");
      out.write("\t\t                            <div class=\"chat-widget-right\">\r\n");
      out.write("\t\t                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n");
      out.write("\t\t                           Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n");
      out.write("\t\t                            </div>\r\n");
      out.write("\t\t                            <div class=\"chat-widget-name-right\">\r\n");
      out.write("\t\t                                <h4>Donim Cruseia </h4>\r\n");
      out.write("\t\t                            </div>\r\n");
      out.write("\r\n");
      out.write("\t\t                        </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t  \t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t  \t\r\n");
      out.write("\t\t\t\t\t\t </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
