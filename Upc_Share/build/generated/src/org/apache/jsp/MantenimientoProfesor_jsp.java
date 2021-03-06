package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MantenimientoProfesor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<title>Profesor</title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<meta name=\"description\" content=\"\">\n");
      out.write("\t<meta name=\"author\" content=\"\">\n");
      out.write("\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/widget-chat.css\">\n");
      out.write("\t<link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("\t<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\t<script src=\"js/html5shiv.js\"></script>\n");
      out.write("\t<![endif]-->\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/scripts.js\"></script>\n");
      out.write("</head>\n");
      out.write("<header>\n");
      out.write("\t<div class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\"> <span class=\"sr-only\">Toggle navigation</span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span></button> <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("\t\t\t<img src=\"img/upc.png\" width=\"16\" height=\"16\">\n");
      out.write("\t\t\t UPC Share</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Mis Cursos<strong class=\"caret\"></strong></a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Sistemas Operativos</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"> Algoritmos Avanzados</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"> Inteligencia Artificial </a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li class=\"hidden-sm hidden-md\">\n");
      out.write("\t\t\t\t\t<a href=\"#\">Buscar Cursos</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\"> Mis Grupos</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li class=\"hidden-sm\">\n");
      out.write("\t\t\t\t\t<a href=\"#\"> Buscar Profesores</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<form class=\"navbar-form navbar-right\" role=\"search\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default\"><span class=\"glyphicon glyphicon-search\"></span></button>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t<span class=\"glyphicon glyphicon-user\"></span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li class=\"hidden-sm hidden-md\">\n");
      out.write("\t\t\t\t\t<a href=\"#\">Perfil</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-cog\"></span><strong class=\"caret\"></strong></a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Configuracion</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\">\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Salir</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</header>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"row clearfix alinear\">\n");
      out.write("\t\t<div class=\"col-xs-12 col-sm-3\">\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-xs-12\">\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t  <div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t    <h3 class=\"panel-title\">Profesor\t </h3>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t  <div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"col-xs-12\">\n");
      out.write("\t\t\t\t\t    \t\t\t\n");
      out.write("\t\t\t\t\t    \t\t\t<img class=\"img-responsive img-thumbnail\" src=\"img/profesor.jpg\">\n");
      out.write("\t\t\t\t\t    \t\t\t\n");
      out.write("\t\t\t\t\t    \t\t</div>\n");
      out.write("\t\t\t\t\t    \t</div>\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t    \t<div class=\"row\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"text-center\">Juan Perez Ramirez <div class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-cog\"></span><strong class=\"caret\"></strong></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">Eliminar </a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a data-toggle=\"modal\" data-target=\"#qwerty\">Editar </a>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- Modal -->\n");
      out.write("\t\t\t\t\t\t  \t\t\t<div class=\"modal fade\"  id=\"qwerty\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t\t\t\t\t\t\t\t  <div class=\"modal-dialog\">\n");
      out.write("\t\t\t\t\t\t\t\t\t    <div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t      <div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t\t\t\t        <button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">&times;</span><span >Close</span></button>\n");
      out.write("\t\t\t\t\t\t\t\t\t        <h4 class=\"modal-title\">Subir Archivo</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t      </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t      <div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t        <form role=\"form\" action=\"\" class=\"form-horizontal\">\n");
      out.write("\t\t\t\t\t\t\t\t\t            <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t              <label for=\"txtTitulo\" class=\"control-label col-xs-3\">Título:</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t              <div class=\"col-xs-9\"><input type=\"text\" id=\"txtTitulo\" class=\"form-control\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t            </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t            <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t              <label for=\"txtDescripcion\" class=\"control-label col-xs-3\">Descripción:</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t              <div class=\"col-xs-9\"><textarea id=\"txtDescripcion\" rows=\"3\" class=\"form-control  noresize\"></textarea></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t            </div>\n");
      out.write("      \t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t      </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t      <div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t      \t<div class=\"col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t\t              <div class=\"col-xs-3\">\n");
      out.write("\t\t\t\t\t\t\t\t              \t<button class=\"btn btn-info pull-right\">Examinar</button>\n");
      out.write("\t\t\t\t\t\t\t\t              </div>\n");
      out.write("\t\t\t\t\t\t\t\t              <div class=\"col-xs-9\">\n");
      out.write("\t\t\t\t\t\t\t\t              \t<h5>ruta/del/archivo.zip</h5>\n");
      out.write("\t\t\t\t\t\t\t\t              </div>\n");
      out.write("\t\t\t\t\t\t\t\t            </div>\n");
      out.write("\t\t\t\t\t\t\t              </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t      <div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t\t\t\t\t        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t        <button type=\"button\" class=\"btn btn-primary\">Examinar</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t        <button type=\"button\" class=\"btn btn-success\">Save changes</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t      </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t    </div><!-- /.modal-content -->\n");
      out.write("\t\t\t\t\t\t\t\t\t  </div><!-- /.modal-dialog -->\n");
      out.write("\t\t\t\t\t\t\t\t\t</div><!-- /.modal -->\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> </h5>\n");
      out.write("\t\t\t\t\t    \t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t    \t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t    \t<div class=\"row\">\n");
      out.write("\t\t\t\t\t    \t<div class=\"col-xs-12\">\n");
      out.write("\t\t\t\t\t    \t\t\n");
      out.write("\t\t\t\t\t\t\t\t   <div class=\"progress\">\n");
      out.write("\t\t\t\t\t\t\t\t\t  <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"40\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 40%\">\n");
      out.write("\t\t\t\t\t\t\t\t\t    150\n");
      out.write("\t\t\t\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t                           <div class=\"progress\">\n");
      out.write("\t\t\t\t\t\t\t\t\t  <div class=\"progress-bar progress-bar-danger\" role=\"progressbar\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 80%\">\n");
      out.write("\t\t\t\t\t\t\t\t\t    327\n");
      out.write("\t\t\t\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t                            <div class=\"btn-group pull-right\">\n");
      out.write("\t\t\t                            <button type=\"button\" class=\"btn btn-default\"><span class=\"glyphicon glyphicon-thumbs-up\"></span></button>\n");
      out.write("\n");
      out.write("\t\t\t                            <button type=\"button\" class=\"btn btn-default\"><span class=\"glyphicon glyphicon-thumbs-down\"></span></button>\n");
      out.write("\t\t                            </div>\n");
      out.write("\t                            </div>\n");
      out.write("\t\t\t\t\t    \t</div>\t\n");
      out.write("\t\t\t\t\t    \t\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-xs-12\">\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-xs-12\">\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t  <div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t    <h3 class=\"panel-title\">Cursos del Profesor</h3>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t  <div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t    <ul>\n");
      out.write("\t\t\t\t\t    \t<a><li>Algoritmos Avanzados</li></a>\n");
      out.write("\t\t\t\t\t    \t<a><li>Base de Datos</li></a>\n");
      out.write("\t\t\t\t\t    \t<a><li>Inteligencia Artificial</li></a>\n");
      out.write("\t\t\t\t\t    \t<a ><li>Agregar Curso...</li></a>\n");
      out.write("\t\t\t\t\t    </ul>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-xs-12 col col-sm-6\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t  <div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t    <h3 class=\"panel-title\">Comentarios</h3>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t  <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t  <div class=\"row margen\">\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-10 post\">\n");
      out.write("\t\t\t\t\t  \t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t  \t\t\t\t<textarea name=\"\" id=\"txtPost\" rows=\"5\" class=\"form-control noresize\" placeholder=\"Escribe algo...\"></textarea>\n");
      out.write("\t\t\t\t\t  \t\t\t</div>\n");
      out.write("\t\t\t\t\t  \t\t\t<div class=\"pull-right\"><button type=\"button\" class=\"btn btn-primary\">Postear</button></div>\t\n");
      out.write("\t\t\t\t\t  \t\t</div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t</div>\n");
      out.write("\t\t\t\t\t  \t<div class=\"row margen\">\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-10 post\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t  \t\t\t<h4>\n");
      out.write("\t\t\t\t\t  \t\t\t\t<img src=\"img/profile.jpg\" height=\"35\" width=\"35\"> Renato Espinoza \n");
      out.write("\t\t\t\t\t  \t\t\t\t<div class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-cog\"></span><strong class=\"caret\"></strong></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Eliminar Comentario</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Banear Usuario</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t  \t\t\t</h4>\n");
      out.write("\t\t\t\t\t  \t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus maxime commodi provident, modi laboriosam quo id enim, voluptatem harum distinctio omnis qui? Expedita voluptate repudiandae quae officia ipsum dicta, dignissimos.</p></div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t</div>\n");
      out.write("\t\t\t\t\t  \t\n");
      out.write("\t\t\t\t\t  \t  \t<div class=\"row margen\">\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-10 post\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t  \t\t\t<h4>\n");
      out.write("\t\t\t\t\t  \t\t\t\t<img src=\"img/profile.jpg\" height=\"35\" width=\"35\"> Renato Espinoza\n");
      out.write("\t\t\t\t\t  \t\t\t\t<div class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-cog\"></span><strong class=\"caret\"></strong></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Eliminar Comentario</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Banear Usuario</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t  \t\t\t</h4>\n");
      out.write("\t\t\t\t\t  \t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus maxime commodi provident, modi laboriosam quo id enim, voluptatem harum distinctio omnis qui? Expedita voluptate repudiandae quae officia ipsum dicta, dignissimos.</p></div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t</div>\n");
      out.write("\t\t\t\t\t  \t  \t<div class=\"row margen\">\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-10 post\">\n");
      out.write("\t\t\t\t\t  \t\t\t<h4>\n");
      out.write("\t\t\t\t\t  \t\t\t\t<img src=\"img/profile.jpg\" height=\"35\" width=\"35\"> Renato Espinoza\n");
      out.write("\t\t\t\t\t  \t\t\t\t<div class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-cog\"></span><strong class=\"caret\"></strong></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Eliminar Comentario</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Banear Usuario</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t  \t\t\t</h4>\n");
      out.write("\t\t\t\t\t  \t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus maxime commodi provident, modi laboriosam quo id enim, voluptatem harum distinctio omnis qui? Expedita voluptate repudiandae quae officia ipsum dicta, dignissimos.</p></div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t</div>\n");
      out.write("\t\t\t\t\t  \t  \t<div class=\"row margen\">\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-10 post\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t  \t\t\t<h4>\n");
      out.write("\t\t\t\t\t  \t\t\t\t<img src=\"img/profile.jpg\" height=\"35\" width=\"35\"> Renato Espinoza\n");
      out.write("\t\t\t\t\t  \t\t\t\t<div class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-cog\"></span><strong class=\"caret\"></strong></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Eliminar Comentario</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Banear Usuario</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t  \t\t\t</h4>\n");
      out.write("\t\t\t\t\t  \t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus maxime commodi provident, modi laboriosam quo id enim, voluptatem harum distinctio omnis qui? Expedita voluptate repudiandae quae officia ipsum dicta, dignissimos.</p></div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t</div>\n");
      out.write("\t\t\t\t\t  </div>\t\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-xs-12 col col-sm-3\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-xs-12\">\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-info chat-widget-main\">\n");
      out.write("\t                        <div class=\"panel-heading\">\n");
      out.write("\t                            <h5>RECENT CHAT HISTORY</h5>\n");
      out.write("\t                        </div>\n");
      out.write("\t                        <div class=\"panel-body\">\n");
      out.write("\t                            <div class=\"chat-widget-left\">\n");
      out.write("\t                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("\t                           Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("\t                            </div>\n");
      out.write("\t                            <div class=\"chat-widget-name-left\">\n");
      out.write("\t                                <h4>Amanna Seiar\n");
      out.write("\t                                <div class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-cog\"></span><strong class=\"caret\"></strong></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Eliminar Comentario</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Banear Usuario</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div></h4>\n");
      out.write("\t                            </div>\n");
      out.write("\t                            <hr />\n");
      out.write("\t                            <div class=\"chat-widget-right\">\n");
      out.write("\t                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("\t                           Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("\t                            </div>\n");
      out.write("\t                            <div class=\"chat-widget-name-right\">\n");
      out.write("\t                                <h4>Donim Cruseia\n");
      out.write("\t                                <div class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-cog\"></span><strong class=\"caret\"></strong></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Eliminar Comentario</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Banear Usuario</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> </h4>\n");
      out.write("\t                            </div>\n");
      out.write("\t                            <hr />\n");
      out.write("\t                            <div class=\"chat-widget-left\">\n");
      out.write("\t                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("\t                           Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("\t                            </div>\n");
      out.write("\t                            <div class=\"chat-widget-name-left\">\n");
      out.write("\t                                <h4>Amanna Seiar\n");
      out.write("\t                                <div class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-cog\"></span><strong class=\"caret\"></strong></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Eliminar Comentario</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Banear Usuario</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div></h4>\n");
      out.write("\t                            </div>\n");
      out.write("\t                            <hr />\n");
      out.write("\t                            <div class=\"chat-widget-right\">\n");
      out.write("\t                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("\t                           Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("\t                            </div>\n");
      out.write("\t                            <div class=\"chat-widget-name-right\">\n");
      out.write("\t                                <h4>Donim Cruseia \n");
      out.write("\t                                <div class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-cog\"></span><strong class=\"caret\"></strong></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Eliminar Comentario</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Banear Usuario</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div></h4>\n");
      out.write("\t                            </div>\n");
      out.write("\t                        </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
