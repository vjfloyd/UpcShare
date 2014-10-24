<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="utf-8">
  <title>ConfigurarMiCuenta</title>
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
                                                    <a href="MantenimientoUsuario.jsp">Configuracion</a>
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
						    <h3 class="panel-title"><center>Configuracion General de la Cuenta </center></h3>
						  </div>
						  <div class="panel-body">
						    <ul>
						    	<li><a> Cambiar Datos del Usuario </a></li>
						    	<li><a> Seguridad </a></li>
						    	<li><a> Privacidad </a></li>
						    	<li><a> Aplicaciones </a></li>
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
							  			<h4> Cambiar Datos del Usuario </h4>
							  		</center>
							  </div>
							  <div class="panel-body">
							  		<div class="row margen">
											<div class="row">
														<div class="col-sm-2">
														</div>
														<div class="col-sm-7">
                                                                                                                        <form action="ActualizarUsuarioController" method="post" class="form-horizontal" role="form">
																	  <div class="form-group form-group-lg">
																	    <label class="col-sm-6 control-label" for="formGroupInputLarge"> Usuario : </label>
																	   	 <div class="col-sm-6">
																	      <input class="form-control" name="txtUsuario" type="text" id="formGroupInputLarge" placeholder="Ingresar Usuario ">
																	    </div>
																	  </div>
																	  <div class="form-group form-group-lg">
																	    <label class="col-sm-6 control-label" for="formGroupInputLarge"> Mail  : </label>
																	    <div class="col-sm-6">
																	      <input class="form-control" name="txtEmail" type="text" id="formGroupInputLarge" placeholder=" Ingresar Mail ">
																	    </div>
																	  </div>
																	  <div class="form-group form-group-lg">
																	    <label class="col-sm-6 control-label" for="formGroupInputLarge"> Carrera :  </label>
																	    <div class="col-sm-6">
																	      <input class="form-control" name="txtCarrera" type="text" id="formGroupInputLarge" placeholder=" Ingresar Carrera">
																	    </div>
																	  </div>
																	  <div class="form-group form-group-lg">
																	    <label class="col-sm-6 control-label" for="formGroupInputLarge"> Nueva Contraseña  </label>
																	    <div class="col-sm-6">
																	      <input class="form-control" name="txtNewClave" type="text" id="formGroupInputLarge" placeholder=" Ingresar Curso">
																	    </div>
																	  </div>
                                                                                                                                           <center>
                                                                                                                                               
                                                                                                                                               <input type="submit" value="Actualizar Datos" />
                                                                                                                                               <!--
                                                                                                                                               <button type="submit" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
																	  			Actualizar Datos
																	  		</button>
                                                                                                                                               -->
																	  </center>
                                                                                                                             </form>  

																<!-- Button trigger modal -->
                                                                                                                                <!-- Modal -->
																<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
																  <div class="modal-dialog">
																    <div class="modal-content">
																      <div class="modal-header">
																        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
																        <h4 class="modal-title" id="myModalLabel">Confirmar Actualizacion de Datos</h4>
																      </div>
																      <div class="modal-body">
																         <label class="col-sm-6 control-label" for="formGroupInputLarge"> Contraseña Antigua  </label>
																         <input class="form-control" name="txtClaveAnt" type="text" id="formGroupInputLarge" placeholder=" Ingresar Curso">
																      </div>
																      <div class="modal-footer">
																        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
																        <button type="submit" class="btn btn-primary">Confirmar </button>
																      </div>
																    </div>
																  </div>
																</div>
                                                                                                                             
																
															
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
