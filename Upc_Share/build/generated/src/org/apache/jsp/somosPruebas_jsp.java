package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class somosPruebas_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <title>Somos Pruebas en Verano </title>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("\t<!--link rel=\"stylesheet/less\" href=\"less/bootstrap.less\" type=\"text/css\" /-->\n");
      out.write("\t<!--link rel=\"stylesheet/less\" href=\"less/responsive.less\" type=\"text/css\" /-->\n");
      out.write("\t<!--script src=\"js/less-1.3.3.min.js\"></script-->\n");
      out.write("\t<!--append ‘#!watch’ to the browser URL, then refresh the page. -->\n");
      out.write("\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/widget-chat.css\">\n");
      out.write("\t<link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function()\n");
      out.write("            {\n");
      out.write("                $('#amostar').fadeOut(0);\n");
      out.write("                $('#elimina').click(function(){\n");
      out.write("                    \n");
      out.write("                    $('#aeliminar').hide(800);\n");
      out.write("                });\n");
      out.write("                \n");
      out.write("                $('#elimina2').click(function(){\n");
      out.write("                    \n");
      out.write("                    $('#aeliminar2').hide(800);\n");
      out.write("                });\n");
      out.write("                \n");
      out.write("                $('#elimina3').click(function(){\n");
      out.write("                    \n");
      out.write("                    $('#aeliminar3').hide(800);\n");
      out.write("                });\n");
      out.write("                \n");
      out.write("                $('#elimina4').click(function(){\n");
      out.write("                    \n");
      out.write("                    $('#aeliminar4').hide(800);\n");
      out.write("                });\n");
      out.write("                \n");
      out.write("                $('#botonmostrar').click(function(){\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                    var $textoapostear = $('#txtPost').attr('text')\n");
      out.write("                    $('#amostar p').text($textoapostear);\n");
      out.write("                    $('#amostar').fadeIn(800);\n");
      out.write("                    \n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("  <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->\n");
      out.write("  <!--[if lt IE 9]>\n");
      out.write("    <script src=\"js/html5shiv.js\"></script>\n");
      out.write("  <![endif]-->\n");
      out.write("\n");
      out.write("  <!-- Fav and touch icons -->\n");
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
      out.write("\t\t\t\t\t\t\t<a href=\"CursoAlgoritmos.jsp\">Sistemas Operativos</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"CursoAlgoritmos.jsp\"> Algoritmos Avanzados</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"CursoAlgoritmos.jsp\"> Inteligencia Artificial </a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li class=\"hidden-sm hidden-md\">\n");
      out.write("\t\t\t\t\t<a href=\"BuscarCursos.jsp\">Buscar Cursos</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"MisGrupos.jsp\"> Mis Grupos</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li class=\"hidden-sm\">\n");
      out.write("\t\t\t\t\t<a href=\"BuscarProfesores.jsp\"> Buscar Profesores</a>\n");
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
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-xs-12\">\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t  <div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t    <h3 class=\"panel-title\">Mis Grupos</h3>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t  <div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t    <ul>\n");
      out.write("\t\t\t\t\t    \t<li><a>Somos Pruebas en Verano</a></li>\n");
      out.write("\t\t\t\t\t    \t<li><a>Finanzas mazzZz Nah!</a></li>\n");
      out.write("\t\t\t\t\t    \t<li><a>Verano nomas</a></li>\n");
      out.write("\t\t\t\t\t    </ul>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t  <div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t    <h3 class=\"panel-title\">Integrantes\n");
      out.write("                                                <a data-toggle=\"modal\" data-target=\"#modal\"><span class=\"glyphicon glyphicon-plus pull-right\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t<!-- Modal -->\n");
      out.write("                                                        <div class=\"modal fade\"  id=\"modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"modallabel\" aria-hidden=\"true\">\n");
      out.write("                                                          <div class=\"modal-dialog\">\n");
      out.write("                                                            <div class=\"modal-content\">\n");
      out.write("                                                              <div class=\"modal-header\">\n");
      out.write("                                                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                                                                <h4 class=\"modal-title\">Agregar Miembro</h4>\n");
      out.write("                                                              </div>\n");
      out.write("                                                              <div class=\"modal-body\">\n");
      out.write("                                                                <form role=\"form\" action=\"\" class=\"form-horizontal\">\n");
      out.write("                                                                    <div class=\"form-group\">\n");
      out.write("                                                                      <label for=\"txtTitulo\" class=\"control-label col-xs-3\">Usuario:</label>\n");
      out.write("                                                                      <div class=\"col-xs-9\"><input type=\"text\" id=\"txtTitulo\" class=\"form-control\"></div>\n");
      out.write("                                                                    </div>\n");
      out.write("\n");
      out.write("                                                                </form>\n");
      out.write("                                                              </div>\n");
      out.write("\n");
      out.write("                                                              <div class=\"modal-footer\">\n");
      out.write("                                                                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Cancelar</button>\n");
      out.write("\n");
      out.write("                                                                <button type=\"button\" class=\"btn btn-success\">Agregar</button>\n");
      out.write("                                                              </div>\n");
      out.write("                                                            </div><!-- /.modal-content -->\n");
      out.write("                                                          </div><!-- /.modal-dialog -->\n");
      out.write("                                                        </div><!-- /.modal -->\n");
      out.write("                                            </h3>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t  <div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t    <ul>\n");
      out.write("                                                <li><a>Gandalf El Gris</a></li>\n");
      out.write("                                                <li><a>Vj Floyd </a></li>\n");
      out.write("\t\t\t\t\t    \t<li><a>Renato Espinoza Carranza</a></li>\n");
      out.write("\t\t\t\t\t    \t<li><a>Victor Rojas Barboza</a></li>\n");
      out.write("\t\t\t\t\t    \t<li><a>Jose Carreño Castillo</a></li>\n");
      out.write("\t\t\t\t\t    \t<li><a>Gustavo Feijoo Oliveira</a></li>\n");
      out.write("\t\t\t\t\t    \t<li><a>Mauro Deledesma Julian</a></li>\n");
      out.write("\t\t\t\t\t    \t<li><a>Patricio Tam Pinillos</a></li>\n");
      out.write("\t\t\t\t\t    \t<li><a>Giuseppe Marotta Portal</a></li>\n");
      out.write("\t\t\t\t\t    \t<li><a>Yoshi Yazawa Chacón</a></li>\n");
      out.write("\t\t\t\t\t    \t<li><a>Bruno Porcella Santa María</a></li>\n");
      out.write("\t\t\t\t\t    \t<li><a>Vanessa Pimentel Vignes</a></li>\n");
      out.write("\t\t\t\t\t    \t<li><a>Priscila Espinoza Chocano</a></li>\n");
      out.write("\t\t\t\t\t    \t<li><a>Alvaro Pizarro Carranza</a></li>\n");
      out.write("\t\t\t\t\t    \t<li><a>Valeria Calderón Burga</a></li>\n");
      out.write("\t\t\t\t\t    \t<li><a>Juan Arias Dávalos</a></li>\n");
      out.write("\t\t\t\t\t    \t<li><a>Victor Olazo Kauffman</a></li>\n");
      out.write("\t\t\t\t\t    \t<li><a href=\"index.html\">Rodolfo Zare Vega</a></li>\n");
      out.write("\t\t\t\t\t    \t<a href=\"index.html\">Ver más...</a>\n");
      out.write("\t\t\t\t\t    </ul>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-xs-12 col col-sm-6\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t  <div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t    <h3 class=\"panel-title\">Somos Pruebas en Verano!! </h3>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t  <div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t  \t<div class=\"row margen\">\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-10 post\">\n");
      out.write("\t\t\t\t\t  \t\t\t<!-- Nav tabs -->\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"nav nav-tabs\" role=\"tablist\">\n");
      out.write("\t\t\t\t\t\t\t\t  <li class=\"active\"><a href=\"#postear\" role=\"tab\" data-toggle=\"tab\">Postear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t  <li><a href=\"#subir-archivo\" role=\"tab\" data-toggle=\"tab\">Subir archivo</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Tab panes -->\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"tab-content\">\n");
      out.write("\t\t\t\t\t\t\t\t  <div class=\"tab-pane active in fade\" id=\"postear\">\n");
      out.write("\t\t\t\t\t\t\t\t  \t<br/>\n");
      out.write("\t\t\t\t\t\t\t\t  \t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t  \t\t\t\t\t<textarea name=\"\" id=\"txtPost\" rows=\"5\" class=\"form-control noresize\" placeholder=\"Escribe algo...\"></textarea>\n");
      out.write("\t\t\t\t\t  \t\t\t\t</div>\n");
      out.write("                                                                        <div class=\"pull-right\"><button type=\"button\" class=\"btn btn-primary\" id=\"botonmostrar\">Postear</button></div>\n");
      out.write("\t\t\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t\t\t  <div class=\"tab-pane fade\" id=\"subir-archivo\">\n");
      out.write("\t\t\t\t\t\t\t\t  \t<br/>\n");
      out.write("\t\t\t\t\t\t\t\t  \t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t  \t\t\t\t\t<textarea name=\"\" id=\"txtPost\" rows=\"5\" class=\"form-control noresize\" placeholder=\"Haz un comentario...\"></textarea>\n");
      out.write("\t\t\t\t\t  \t\t\t\t</div>\n");
      out.write("\t\t\t\t\t  \t\t\t\t<div class=\"row clearfix\">\n");
      out.write("\t\t\t\t\t  \t\t\t\t\t<div class=\"col-xs-9\">\n");
      out.write("\t\t\t\t\t  \t\t\t\t\t\t<button type=\"button\" class=\"btn btn-info\">Examinar</button>&nbsp;&nbsp;No elegiste un archivo\n");
      out.write("\t\t\t\t\t  \t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t  \t\t\t\t\t<div class=\"col-xs-3\">\n");
      out.write("\t\t\t\t\t  \t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary pull-right\">Subir</button>\n");
      out.write("\t\t\t\t\t  \t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t  \t\t\t\t</div>\n");
      out.write("\t\t\t\t\t  \t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t  \t\t</div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t</div>\n");
      out.write("                                              \n");
      out.write("                                              <div class=\"row margen\" id=\"amostar\">\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-10 post\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t  \t\t\t<h4>\n");
      out.write("\t\t\t\t\t  \t\t\t\t<img src=\"img/vj.jpg\" height=\"35\" width=\"35\"> Gandalf El blanco\n");
      out.write("                                                                        \n");
      out.write("                                                                        <button class=\"dropdown btn btn-pull-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-cog\"></span><strong class=\"caret\"></strong></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">Editar</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("                                                                                                    <a href=\"#\" id=\"elimina\">Eliminar</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t  \t\t\t</h4>\n");
      out.write("\t\t\t\t\t  \t\t\t<p></p>\n");
      out.write("\t\t\t\t\t  \t\t</div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t</div>\n");
      out.write("                                              <div class=\"row margen\" id=\"aeliminar\">\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-10 post\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t  \t\t\t<h4>\n");
      out.write("\t\t\t\t\t  \t\t\t\t<img src=\"img/vj.jpg\" height=\"35\" width=\"35\"> Gandalf El Gris\n");
      out.write("                                                                        \n");
      out.write("                                                                        <button class=\"dropdown btn btn-pull-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-cog\"></span><strong class=\"caret\"></strong></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">Editar</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("                                                                                                    <a href=\"#\" id=\"elimina\">Eliminar</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t  \t\t\t</h4>\n");
      out.write("\t\t\t\t\t  \t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus maxime commodi provident, modi laboriosam quo id enim, voluptatem harum distinctio omnis qui? Expedita voluptate repudiandae quae officia ipsum dicta, dignissimos.</p>\n");
      out.write("\t\t\t\t\t  \t\t</div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t</div>\n");
      out.write("\t\t\t\t\t  \t<div class=\"row margen\" id=\"aeliminar2\">\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-10 post\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t  \t\t\t<h4>\n");
      out.write("\t\t\t\t\t  \t\t\t\t<img src=\"img/vj.jpg\" height=\"35\" width=\"35\"> Gandalf El Gris\n");
      out.write("                                                                        \n");
      out.write("                                                                        <button class=\"dropdown btn btn-pull-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-cog\"></span><strong class=\"caret\"></strong></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">Editar</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("                                                                                                    <a href=\"#\" id=\"elimina2\">Eliminar</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t  \t\t\t</h4>\n");
      out.write("\t\t\t\t\t  \t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus maxime commodi provident, modi laboriosam quo id enim, voluptatem harum distinctio omnis qui? Expedita voluptate repudiandae quae officia ipsum dicta, dignissimos.</p>\n");
      out.write("\t\t\t\t\t  \t\t</div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t</div>\n");
      out.write("                                              <div class=\"row margen\" id=\"aeliminar3\">\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-10 post\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t  \t\t\t<h4>\n");
      out.write("\t\t\t\t\t  \t\t\t\t<img src=\"img/vj.jpg\" height=\"35\" width=\"35\"> Gandalf El Gris\n");
      out.write("                                                                        \n");
      out.write("                                                                        <button class=\"dropdown btn btn-pull-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-cog\"></span><strong class=\"caret\"></strong></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">Editar</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("                                                                                                    <a href=\"#\" id=\"elimina3\">Eliminar</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t  \t\t\t</h4>\n");
      out.write("\t\t\t\t\t  \t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus maxime commodi provident, modi laboriosam quo id enim, voluptatem harum distinctio omnis qui? Expedita voluptate repudiandae quae officia ipsum dicta, dignissimos.</p>\n");
      out.write("\t\t\t\t\t  \t\t</div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t</div>\n");
      out.write("                                              <div class=\"row margen\" id=\"aeliminar4\">\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-10 post\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t  \t\t\t<h4>\n");
      out.write("\t\t\t\t\t  \t\t\t\t<img src=\"img/vj.jpg\" height=\"35\" width=\"35\"> Gandalf El Gris\n");
      out.write("                                                                        \n");
      out.write("                                                                        <button class=\"dropdown btn btn-pull-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-cog\"></span><strong class=\"caret\"></strong></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">Editar</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("                                                                                                    <a href=\"#\" id=\"elimina4\">Eliminar</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t  \t\t\t</h4>\n");
      out.write("\t\t\t\t\t  \t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus maxime commodi provident, modi laboriosam quo id enim, voluptatem harum distinctio omnis qui? Expedita voluptate repudiandae quae officia ipsum dicta, dignissimos.</p>\n");
      out.write("\t\t\t\t\t  \t\t</div>\n");
      out.write("\t\t\t\t\t  \t\t<div class=\"col-xs-1\"></div>\n");
      out.write("\t\t\t\t\t  \t</div>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-xs-12 col col-sm-3\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-xs-12\">\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-info chat-widget-main\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h5>RECENT CHAT HISTORY</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"chat-widget-left\">\n");
      out.write("                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                           Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"chat-widget-name-left\">\n");
      out.write("                                <h4>Amanna Seiar</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <hr />\n");
      out.write("                            <div class=\"chat-widget-right\">\n");
      out.write("                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                           Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"chat-widget-name-right\">\n");
      out.write("                                <h4>Donim Cruseia </h4>\n");
      out.write("                            </div>\n");
      out.write("                            <hr />\n");
      out.write("                            <div class=\"chat-widget-left\">\n");
      out.write("                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                           Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"chat-widget-name-left\">\n");
      out.write("                                <h4>Amanna Seiar</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <hr />\n");
      out.write("                            <div class=\"chat-widget-right\">\n");
      out.write("                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                           Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"chat-widget-name-right\">\n");
      out.write("                                <h4>Donim Cruseia </h4>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
