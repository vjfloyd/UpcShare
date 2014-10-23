<%@page import="com.upc.share.dao.UsuarioDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.upc.share.modelo.Usuario"%>

<%
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


%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="utf-8">
  <title> Administrar Usuarios</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="">
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css/widget-chat.css">
	<link href="css/style.css" rel="stylesheet">
  <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
  <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
  <![endif]-->  
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/scripts.js"></script>
</head>
<header>
	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="navbar-header">
			 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="#">
			<img src="img/upc.png" width="16" height="16">
			 UPC Share</a>
		</div>
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li class="dropdown">
					 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Mis Cursos<strong class="caret"></strong></a>
					<ul class="dropdown-menu">
						<li>
							<a href="CursoAlgoritmos.jsp">Sistemas Operativos</a>
						</li>
						<li>
							<a href="CursoAlgoritmos.jsp"> Algoritmos Avanzados</a>
						</li>
						<li>
							<a href="CursoAlgoritmos.jsp"> Inteligencia Artificial </a>
						</li>
					</ul>
				</li>
				<li class="hidden-sm hidden-md">
					<a href="BuscarCursos.jsp">Buscar Cursos</a>
				</li>
				<li>
					<a href="MisGrupos.jsp"> Mis Grupos</a>
				</li>
				<li class="hidden-sm">
					<a href="BuscarProfesores.jsp"> Buscar Profesores</a>
				</li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li>
					<form class="navbar-form navbar-right" role="search">
						<div class="form-group">
							<input type="text" class="form-control">
						</div>
						<button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
                                        </form>  
				</li>
				<li>
					<a href="#">
					<span class="glyphicon glyphicon-user"></span>
					</a>
				</li>
				<li class="hidden-sm hidden-md">
					<a href="#">Perfil</a>
				</li>
				<li class="dropdown">
					 <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-cog"></span><strong class="caret"></strong></a>
					<ul class="dropdown-menu">
						<li>
							<a href="#">Configuracion</a>
						</li>
						<li class="divider">
						</li>
						<li>
							<a href="#">Salir</a>
						</li>
					</ul>
				</li>
			</ul>

		</div>
	</div>
</header>
<body>
	<div class="container">
		<div class="row clearfix alinear">
			<div class="col-xs-12 col-sm-3">
				<div class="row">
					<div class="col-xs-12">
						<div class="panel panel-default">
						  <div class="panel-heading">
						    <h3 class="panel-title"><center> Adminisitrar Cuentas de Usuario </center></h3>
						  </div>
						  <div class="panel-body">
						    <ul>
						    	<li><a> Eliminar </a></li>
						    	<li><a> Lista  </a></li>
						    	<li><a> Banear </a></li>
						    	<li><a> Privilegios </a></li>
						    </ul>
						  </div>
						</div>
					</div>
				</div>
			</div>
				<div class="col-xs-12 col col-sm-6">
					<div class="row">
						<div class="panel panel-default">
							  <div class="panel-heading">
							  		<center>
							  			<h4> Relación de Usuarios </h4>
							  		</center>
							  </div>
							  <div class="panel-body">
							  		<div class="row margen">
											<div class="row">
                                                                                            <div class="col-sm-1"> </div>
														<div class="col-sm-10">
																	<table class="table table-hover table-striped">
																		<thead class="tabla-titulo">
																		
																				<th>
																					#
																				</th>															
																				<th>
																					Codigo
																				</th>
																				

																				<th>
																					Usuario
																				</th>
																				<th>
																					Correo
																				</th>
																				<th>
																				    Carrera			
																				</th>
																				<th>
																					Nombre
																				</th>


																			
																		</thead>

																		<tbody>
                                                                                                                                                                <%
                                                                                                                                                                    for( Usuario u : listaUsuario )
                                                                                                                                                                    {
                                                                                                                                                                %>
                                                                                                                                                                <tr>
																					  <td>  </td>
																					  <td> <%=  u.getIdUsuario() %></td>
                                                                                                                                                                          <td> <%=  u.getApodo() %></td>
                                                                                                                                                                          <td> <%=  u.getCorreo() %></td>
                                                                                                                                                                          <td>  carrera  </td>
                                                                                                                                                                          <td> <%=  u.getNombre() %></td>
                                                                                                                                                                          
                                                                                                                                                                          
																					     
																				</tr>

                                                                                                                                                                <%
                                                                                                                                                                    }
                                                                                                                                                                        %>

																		 		
																		</tbody>
																				
																				
																				
																	</table>

														</div>
														<div class="col-sm-2">
														</div>
											</div>
											<hr/>
											
														
							  		</div>
							  </div>
							
						  	
						 </div>	 
				</div>
			</div>	



				<div class="col-xs-12 col col-sm-3">



				<div class="row">
					<div class="col-xs-12">
						<div class="panel panel-info chat-widget-main">
		                        <div class="panel-heading">
		                            <h5>RECENT CHAT HISTORY</h5>
		                        </div>
		                        <div class="panel-body">
		                            <div class="chat-widget-left">
		                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
		                           Lorem ipsum dolor sit amet, consectetur adipiscing elit.
		                            </div>
		                            <div class="chat-widget-name-left">
		                                <h4>Amanna Seiar</h4>
		                            </div>
		                            <hr />
		                            <div class="chat-widget-right">
		                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
		                           Lorem ipsum dolor sit amet, consectetur adipiscing elit.
		                            </div>
		                            <div class="chat-widget-name-right">
		                                <h4>Donim Cruseia </h4>
		                            </div>
		                            <hr />
		                            <div class="chat-widget-left">
		                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
		                           Lorem ipsum dolor sit amet, consectetur adipiscing elit.
		                            </div>
		                            <div class="chat-widget-name-left">
		                                <h4>Amanna Seiar</h4>
		                            </div>
		                            <hr />
		                            <div class="chat-widget-right">
		                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
		                           Lorem ipsum dolor sit amet, consectetur adipiscing elit.
		                            </div>
		                            <div class="chat-widget-name-right">
		                                <h4>Donim Cruseia </h4>
		                            </div>

		                        </div>
					</div>
				</div>
			</div>


			
							  				
							  		</div>
							  </div>
							
						  	
						 </div>
</body>
</html>
