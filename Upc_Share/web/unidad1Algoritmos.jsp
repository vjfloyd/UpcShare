<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>Algoritmos Avanzados</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="">
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css/widget-chat.css">
	<link href="css/style.css" rel="stylesheet">
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
							<a href="#">Sistemas Operativos</a>
						</li>
						<li>
							<a href="CursoAlgoritmos.jsp"> Algoritmos Avanzados</a>
						</li>
						<li>
							<a href="#"> Inteligencia Artificial </a>
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
						    <h3 class="panel-title">Algoritmos Avanzados</h3>
						  </div>
						  <div class="panel-body">
						    <ul>
						    	<li><a>Anuncios</a></li>
						    	<li><a>Informacion General</a></li>
						    	<li><a>Profesor del Curso</a></li>
						    </ul>
						  </div>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-xs-12">
						<div class="panel panel-default">
						  <div class="panel-heading">
						    <h3 class="panel-title">Archivos</h3>
						  </div>
						  <div class="panel-body">
						    <ul>
						    	<a><li>Unidad 1: Introduccion a grafos</li></a>
						    	<a><li>Unidad 2: Backtracking</li></a>
						    	<a><li>Unidad 3: Fuerza Bruta</li></a>
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
						    <h2 class="panel-title tamano-letras-20">Unidad 1: Introducción a Grafos</h2>
						  </div>
						  <div class="panel-body">
						  	<div class="row">
						  		<div class="col-xs-12">
						  			<!-- Button trigger modal -->
									<button class="btn btn-primary margen pull-right" data-toggle="modal" data-target="#myModal">
										<span class="glyphicon glyphicon-cloud-upload"></span>
									  Subir Archivo
									</button>

									<!-- Modal -->
						  			<div class="modal fade"  id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
									  <div class="modal-dialog">
									    <div class="modal-content">
									      <div class="modal-header">
									        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
									        <h4 class="modal-title">Subir Archivo</h4>
									      </div>
									      <div class="modal-body">
									        <form role="form" action="" class="form-horizontal">
									            <div class="form-group">
									              <label for="txtTitulo" class="control-label col-xs-3">Título:</label>
									              <div class="col-xs-9"><input type="text" id="txtTitulo" class="form-control"></div>
									            </div>
									            <div class="form-group">
									              <label for="txtDescripcion" class="control-label col-xs-3">Descripción:</label>
									              <div class="col-xs-9"><textarea id="txtDescripcion" rows="3" class="form-control  noresize"></textarea></div>
									            </div>
      										</form>
									      </div>
									      <div class="row">
									      	<div class="col-xs-12">
								              <div class="col-xs-3">
								              	<button class="btn btn-info pull-right">Examinar</button>
								              </div>
								              <div class="col-xs-9">
								              	<h5>ruta/del/archivo.zip</h5>
								              </div>
								            </div>
							              </div>
									      <div class="modal-footer">
									        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
									        <button type="button" class="btn btn-success">Guardar</button>
									      </div>
									    </div><!-- /.modal-content -->
									  </div><!-- /.modal-dialog -->
									</div><!-- /.modal -->

						  		</div>

						  	</div>
						  	<div class="row">
							  	<div class="col-xs-12">
							  		<table class="table table-hover table-responsive table-striped table-bordered tamano-letra-20">
							  			<tr>
							  				<td class="col-xs-1 "><span class="glyphicon glyphicon-floppy-save"></span></td>
							  				<td class="col-xs-11">Archivo 1</td>
							  			</tr>

							  			<tr>
							  				<td class="col-xs-1"><span class="glyphicon glyphicon-floppy-save"></span></td>
							  				<td class="col-xs-11">Archivo 2</td>
							  			</tr>

							  			<tr>
							  				<td class="col-xs-1"><span class="glyphicon glyphicon-floppy-save"></span></td>
							  				<td class="col-xs-11">Archivo 3</td>
							  			</tr>

							  			<tr>
							  				<td class="col-xs-1"><span class="glyphicon glyphicon-floppy-save"></span></td>
							  				<td class="col-xs-11">Archivo 4</td>
							  			</tr>
							  		</table>

							  	</div>
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
</body>
</html>
