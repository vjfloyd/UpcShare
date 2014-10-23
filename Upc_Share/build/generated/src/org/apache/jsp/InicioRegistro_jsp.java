package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class InicioRegistro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Inicio Registrarse</title>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("  <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/widget-chat.css\">\n");
      out.write("  <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("  <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->\n");
      out.write("  <!--[if lt IE 9]>\n");
      out.write("  <script src=\"js/html5shiv.js\"></script>\n");
      out.write("  <![endif]-->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"js/scripts.js\"></script>\n");
      out.write("</head>\n");
      out.write("<header>\n");
      out.write("  <div class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("       <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\"> <span class=\"sr-only\">Toggle navigation</span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span></button> <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("      <img src=\"img/upc.png\" width=\"16\" height=\"16\">\n");
      out.write("       UPC Share</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      \n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        \n");
      out.write("       \n");
      out.write("\n");
      out.write("        <li class=\"hidden-sm hidden-md \">\n");
      out.write("          <a href=\"Log In.jsp\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-primary baja\">Ingresar</button>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("           <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-cog\"></span><strong class=\"caret\"></strong></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#\">Configuracion</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"divider\">\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#\">Salir</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</header>\n");
      out.write("<body>\n");
      out.write("  \n");
      out.write("   <div class=\"bg\"></div>\n");
      out.write("<div class=\"jumbotron\" >\n");
      out.write("  <div class=\"container\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("    <h1>UPC Share\n");
      out.write("    <img src=\"img/upc.png\" width=\"50\" height=\"50\">\n");
      out.write("    </h1>\n");
      out.write("    <p class=\"lead\">La red social de la UPC</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"row clearfix alinear\">\n");
      out.write("\n");
      out.write("            <form role=\"form\"  action=\"UsuarioController\" method=\"post\" >\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-8\">\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 xs-12\">\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"txtApodo\" id=\"InputName\" placeholder=\"Ingrese Usuario\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" name=\"txtClave\" id=\"InputName\" placeholder=\"Ingrese Contraseña\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"email\" class=\"form-control\" id=\"InputEmailFirst\" name=\"txtEmail1\" placeholder=\"Ingrese Correo Electrónico\" required>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"email\" class=\"form-control\" id=\"InputEmailSecond\" name=\"txtEmail2\" placeholder=\"Confirme Correo Electrónico\" required>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"txtNombre\" id=\"InputName\" placeholder=\"Ingrese Nombre\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"txtCarrera\" id=\"InputName\" placeholder=\"Ingrese Carrera\" required>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div>\n");
      out.write("                <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"Registrarse\" class=\"btn btn-info pull-right btn-lg btn-block\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write(" </div>\n");
      out.write("</div>\n");
      out.write("\n");
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
