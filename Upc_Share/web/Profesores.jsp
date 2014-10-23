<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>Profesor</title>
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
							<a href="cursoAlgoritmos.jsp"> Algoritmos Avanzados</a>
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
					    <h3 class="panel-title">Profesor</h3>
						
						
													
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
					    		</div>


					    	</div>

					    	<div class="row">
					    	<div class="col-xs-12">
					    		
								   <div class="progress">
									  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
									    
									  </div>
                                                                       
                                                                           <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
									    
									  </div>
									</div>

		                           

		                            <div class="btn-group pull-right">
                                                <button type="button" class="btn btn-default"><span class="glyphicon glyphicon-thumbs-up"></span>&nbsp;40</button>

			                            <button type="button" class="btn btn-default"><span class="glyphicon glyphicon-thumbs-down"></span>&nbsp;60</button>
		                            </div>
	                            </div>
					    	</div>	
					    	
					  </div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-12">	
				</div>
			</div>
			<div class="row">
				<div class="col-xs-12">
					<div class="panel panel-default">
					  <div class="panel-heading">
					    <h3 class="panel-title">Cursos del Profesor</h3>
					  </div>
					  <div class="panel-body">
					    <ul>
                                                <a href=""><li>Algoritmos Avanzados</li></a>
					    	<a><li>Base de Datos</li></a>
					    	<a><li>Inteligencia Artificial</li></a>
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
					  				<img src="img/profile.jpg" height="35" width="35"> Renato Espinoza
					  			</h4>
					  			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus maxime commodi provident, modi laboriosam quo id enim, voluptatem harum distinctio omnis qui? Expedita voluptate repudiandae quae officia ipsum dicta, dignissimos.</p></div>
					  		<div class="col-xs-1"></div>
					  	</div>
					  	
					  	  	<div class="row margen">
					  		<div class="col-xs-1"></div>
					  		<div class="col-xs-10 post">

					  			<h4>
					  				<img src="img/profile.jpg" height="35" width="35"> Renato Espinoza
					  			</h4>
					  			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus maxime commodi provident, modi laboriosam quo id enim, voluptatem harum distinctio omnis qui? Expedita voluptate repudiandae quae officia ipsum dicta, dignissimos.</p></div>
					  		<div class="col-xs-1"></div>
					  	</div>
					  	  	<div class="row margen">
					  		<div class="col-xs-1"></div>
					  		<div class="col-xs-10 post">
					  			<h4>
					  				<img src="img/profile.jpg" height="35" width="35"> Renato Espinoza
					  			</h4>
					  			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus maxime commodi provident, modi laboriosam quo id enim, voluptatem harum distinctio omnis qui? Expedita voluptate repudiandae quae officia ipsum dicta, dignissimos.</p></div>
					  		<div class="col-xs-1"></div>
					  	</div>
					  	  	<div class="row margen">
					  		<div class="col-xs-1"></div>
					  		<div class="col-xs-10 post">

					  			<h4>
					  				<img src="img/profile.jpg" height="35" width="35"> Renato Espinoza
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
