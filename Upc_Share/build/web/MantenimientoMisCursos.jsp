<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Algoritmos Avanzados (2014-02)</title>
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

  <!-- Fav and touch icons -->
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
							<a href="#"> Algoritmos Avanzados</a>
						</li>
						<li>
							<a href="#"> Inteligencia Artificial </a>
						</li>
					</ul>
				</li>
				<li class="hidden-sm hidden-md">
					<a href="#">Buscar Cursos</a>
				</li>
				<li>
					<a href="#"> Mis Grupos</a>
				</li>
				<li class="hidden-sm">
					<a href="#"> Buscar Profesores</a>
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
							<h3 class="panel-title">Algoritmos Avanzados (2014-2)</h3>
							<td><center><a href=""><img src="img/seguir.png" width="100px" height="25px"></a></center></td>
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
						    	<a data-toggle="modal" data-target="#modal"><li>Agregar Unidad...</li></a>




						    	<!-- Modal -->
						  			<div class="modal fade"  id="modal" tabindex="-1" role="dialog" aria-labelledby="modallabel" aria-hidden="true">
									  <div class="modal-dialog">
									    <div class="modal-content">
									      <div class="modal-header">
									        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span >Close</span></button>
									        <h4 class="modal-title">Agregar Unidad</h4>
									      </div>
									      <div class="modal-body">
									        <form role="form" action="" class="form-horizontal">
									            <div class="form-group">
									              <label for="txtTitulo" class="control-label col-xs-3">Nombre Unidad:</label>
									              <div class="col-xs-9"><input type="text" id="txtTitulo" class="form-control"></div>
									            </div>
									            
      										</form>
									      </div>
									      
									      <div class="modal-footer">
									        <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
									        
									        <button type="button" class="btn btn-success">Agregar</button>
									      </div>
									    </div><!-- /.modal-content -->
									  </div><!-- /.modal-dialog -->
									</div><!-- /.modal -->



						    </ul>
						  </div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-12">
						<div class="panel panel-default">
						  <div class="panel-heading">
						    <h3 class="panel-title">Profesor del Curso</h3>
						  </div>
						  <div class="panel-body">
								<div class="row">
						    		<div class="col-xs-12">
						    			<img class="img-responsive img-thumbnail" src="img/profesor.jpg">
						    		</div>
						    	</div>	
						    	<div class="row">
						    		<div class="col-xs-12">
										<h5 class="text-center">Juan Perez Ramirez</h5>
  										<center>
  											<input type="submit" name="submit" id="submit" value="Editar" class="btn btn-primary " href="MantenimientoProfesor.html">
						    			</center>
						    		</div>
										
						    	</div>	
						    	
						  </div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-xs-12 col col-sm-6">
				<div class="row">
					<div class="panel panel-default">
							
						  <div class="panel-heading">

						    <h3 class="panel-title">Anuncios

								<input type="submit" name="submit" id="submit" value="Editar" class="btn btn-primary pull-right btn-xs">
						    </h3>
						  </div>
						  <div class="panel-body">
						  	<ul class="list-group">
						  		<li class="list-group-item">
						  			<h4>
						  				IUASHnd<div class="dropdown">
										<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-cog"></span><strong class="caret"></strong></a>
										<ul class="dropdown-menu">
										<li>
										<a href="#">Eliminar Comentario</a>
										</li>
										<li>
										<a href="#">Banear Usuario</a>
										</li>
										</ul>
										</div>
									</h4>
						  			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet molestiae porro vero alias quis doloremque voluptates laborum tempore nobis consectetur, sed aspernatur cupiditate optio nemo, non aperiam earum neque illum.</p>
						  		</li>
						  		<li class="list-group-item">
						  			<h4>IUASHnd<div class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-cog"></span><strong class="caret"></strong></a>
									<ul class="dropdown-menu">
									<li>
									<a href="#">Eliminar Comentario</a>
									</li>
									<li>
									<a href="#">Banear Usuario</a>
									</li>
									</ul>
									</div></h4>
						  			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet molestiae porro vero alias quis doloremque voluptates laborum tempore nobis consectetur, sed aspernatur cupiditate optio nemo, non aperiam earum neque illum.</p>
						  		</li>
						  	</ul>
						  </div>
						</div>
				</div>
				<div class="row">
					<div class="panel panel-default">
						  <div class="panel-heading">
						    <h3 class="panel-title">Comentarios</h3>
						  </div>
						  <div class="panel-body">

						  <div class="row margen">
						  		<div class="col-xs-1"></div>
						  		<div class="col-xs-10 post">
						  			<div class="form-group">
						  				<textarea name="" id="txtPost" rows="5" class="form-control noresize" placeholder="Escribe algo..."></textarea>
						  			</div>
						  			<div class="pull-right"><button type="button" class="btn btn-primary">Postear</button></div>	
						  		</div>
						  		<div class="col-xs-1"></div>
						  	</div>
						  	<div class="row margen">
						  		<div class="col-xs-1"></div>
						  		<div class="col-xs-10 post">

						  			<h4>
						  				<img src="img/profile.jpg" height="35" width="35"> Renato Espinoza<div class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-cog"></span><strong class="caret"></strong></a>
									<ul class="dropdown-menu">
									<li>
									<a href="#">Eliminar Comentario</a>
									</li>
									<li>
									<a href="#">Banear Usuario</a>
									</li>
									</ul>
									</div>
						  			</h4>
						  			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus maxime commodi provident, modi laboriosam quo id enim, voluptatem harum distinctio omnis qui? Expedita voluptate repudiandae quae officia ipsum dicta, dignissimos.</p></div>
						  		<div class="col-xs-1"></div>
						  	</div>
						  	  	<div class="row margen">
						  		<div class="col-xs-1"></div>
						  		<div class="col-xs-10 post">
						  			<h4>
						  				<img src="img/profile.jpg" height="35" width="35"> Renato Espinoza<div class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-cog"></span><strong class="caret"></strong></a>
									<ul class="dropdown-menu">
									<li>
									<a href="#">Eliminar Comentario</a>
									</li>
									<li>
									<a href="#">Banear Usuario</a>
									</li>
									</ul>
									</div>
						  			</h4>
						  			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus maxime commodi provident, modi laboriosam quo id enim, voluptatem harum distinctio omnis qui? Expedita voluptate repudiandae quae officia ipsum dicta, dignissimos.</p></div>
						  		<div class="col-xs-1"></div>
						  	</div>
						  	  	<div class="row margen">
						  		<div class="col-xs-1"></div>
						  		<div class="col-xs-10 post">
						  			<h4>
						  				<img src="img/profile.jpg" height="35" width="35"> Renato Espinoza<div class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-cog"></span><strong class="caret"></strong></a>
									<ul class="dropdown-menu">
									<li>
									<a href="#">Eliminar Comentario</a>
									</li>
									<li>
									<a href="#">Banear Usuario</a>
									</li>
									</ul>
									</div>
						  			</h4>
						  			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus maxime commodi provident, modi laboriosam quo id enim, voluptatem harum distinctio omnis qui? Expedita voluptate repudiandae quae officia ipsum dicta, dignissimos.</p></div>
						  		<div class="col-xs-1"></div>
						  	</div>
						  	  	<div class="row margen">
						  		<div class="col-xs-1"></div>
						  		<div class="col-xs-10 post">
						  			<h4>
						  				<img src="img/profile.jpg" height="35" width="35"> Renato Espinoza<div class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-cog"></span><strong class="caret"></strong></a>
									<ul class="dropdown-menu">
									<li>
									<a href="#">Eliminar Comentario</a>
									</li>
									<li>
									<a href="#">Banear Usuario</a>
									</li>
									</ul>
									</div>
						  			</h4>
						  			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus maxime commodi provident, modi laboriosam quo id enim, voluptatem harum distinctio omnis qui? Expedita voluptate repudiandae quae officia ipsum dicta, dignissimos.</p></div>
						  		<div class="col-xs-1"></div>
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
		                                <h4>Amanna Seiar<div class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-cog"></span><strong class="caret"></strong></a>
									<ul class="dropdown-menu">
									<li>
									<a href="#">Eliminar Comentario</a>
									</li>
									<li>
									<a href="#">Banear Usuario</a>
									</li>
									</ul>
									</div></h4>
		                            </div>
		                            <hr />
		                            <div class="chat-widget-right">
		                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
		                           Lorem ipsum dolor sit amet, consectetur adipiscing elit.
		                            </div>
		                            <div class="chat-widget-name-right">
		                                <h4>Donim Cruseia<div class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-cog"></span><strong class="caret"></strong></a>
									<ul class="dropdown-menu">
									<li>
									<a href="#">Eliminar Comentario</a>
									</li>
									<li>
									<a href="#">Banear Usuario</a>
									</li>
									</ul>
									</div> </h4>
		                            </div>
		                            <hr />
		                            <div class="chat-widget-left">
		                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
		                           Lorem ipsum dolor sit amet, consectetur adipiscing elit.
		                            </div>
		                            <div class="chat-widget-name-left">
		                                <h4>Amanna Seiar<div class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-cog"></span><strong class="caret"></strong></a>
									<ul class="dropdown-menu">
									<li>
									<a href="#">Eliminar Comentario</a>
									</li>
									<li>
									<a href="#">Banear Usuario</a>
									</li>
									</ul>
									</div></h4>
		                            </div>
		                            <hr />
		                            <div class="chat-widget-right">
		                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
		                           Lorem ipsum dolor sit amet, consectetur adipiscing elit.
		                            </div>
		                            <div class="chat-widget-name-right">
		                                <h4>Donim Cruseia <div class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-cog"></span><strong class="caret"></strong></a>
									<ul class="dropdown-menu">
									<li>
									<a href="#">Eliminar Comentario</a>
									</li>
									<li>
									<a href="#">Banear Usuario</a>
									</li>
									</ul>
									</div></h4>
		                            </div>
		                        </div>
					</div>
				</div>
			</div>	
		</div>
	</div>
</body>
</html>

