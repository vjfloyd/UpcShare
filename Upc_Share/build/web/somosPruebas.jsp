<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Somos Pruebas en Verano </title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="">
	<!--link rel="stylesheet/less" href="less/bootstrap.less" type="text/css" /-->
	<!--link rel="stylesheet/less" href="less/responsive.less" type="text/css" /-->
	<!--script src="js/less-1.3.3.min.js"></script-->
	<!--append ‘#!watch’ to the browser URL, then refresh the page. -->
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css/widget-chat.css">
	<link href="css/style.css" rel="stylesheet">
        <script src="js/jquery-1.11.1.min.js"></script>
        
        
        
        <script type="text/javascript">
            $(document).ready(function()
            {
                $('#amostar').fadeOut(0);
                $('#elimina').click(function(){
                    
                    $('#aeliminar').hide(800);
                });
                
                $('#elimina2').click(function(){
                    
                    $('#aeliminar2').hide(800);
                });
                
                $('#elimina3').click(function(){
                    
                    $('#aeliminar3').hide(800);
                });
                
                $('#elimina4').click(function(){
                    
                    $('#aeliminar4').hide(800);
                });
                
                $('#botonmostrar').click(function(){
                    
                   
                    var $textoapostear = $('#txtPost').attr('text')
                    $('#amostar p').text($textoapostear);
                    $('#amostar').fadeIn(800);
                    
                });
            });
        </script>
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
					    <h3 class="panel-title">Mis Grupos</h3>
					  </div>
					  <div class="panel-body">
					    <ul>
					    	<li><a>Somos Pruebas en Verano</a></li>
					    	<li><a>Finanzas mazzZz Nah!</a></li>
					    	<li><a>Verano nomas</a></li>
					    </ul>
					  </div>
					</div>
					<div class="panel panel-default">
					  <div class="panel-heading">
					    <h3 class="panel-title">Integrantes
                                                <a data-toggle="modal" data-target="#modal"><span class="glyphicon glyphicon-plus pull-right"></span></a>
							<!-- Modal -->
                                                        <div class="modal fade"  id="modal" tabindex="-1" role="dialog" aria-labelledby="modallabel" aria-hidden="true">
                                                          <div class="modal-dialog">
                                                            <div class="modal-content">
                                                              <div class="modal-header">
                                                                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span></button>
                                                                <h4 class="modal-title">Agregar Miembro</h4>
                                                              </div>
                                                              <div class="modal-body">
                                                                <form role="form" action="" class="form-horizontal">
                                                                    <div class="form-group">
                                                                      <label for="txtTitulo" class="control-label col-xs-3">Usuario:</label>
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
                                            </h3>
					  </div>
					  <div class="panel-body">
					    <ul>
                                                <li><a>Gandalf El Gris</a></li>
                                                <li><a>Vj Floyd </a></li>
					    	<li><a>Renato Espinoza Carranza</a></li>
					    	<li><a>Victor Rojas Barboza</a></li>
					    	<li><a>Jose Carreño Castillo</a></li>
					    	<li><a>Gustavo Feijoo Oliveira</a></li>
					    	<li><a>Mauro Deledesma Julian</a></li>
					    	<li><a>Patricio Tam Pinillos</a></li>
					    	<li><a>Giuseppe Marotta Portal</a></li>
					    	<li><a>Yoshi Yazawa Chacón</a></li>
					    	<li><a>Bruno Porcella Santa María</a></li>
					    	<li><a>Vanessa Pimentel Vignes</a></li>
					    	<li><a>Priscila Espinoza Chocano</a></li>
					    	<li><a>Alvaro Pizarro Carranza</a></li>
					    	<li><a>Valeria Calderón Burga</a></li>
					    	<li><a>Juan Arias Dávalos</a></li>
					    	<li><a>Victor Olazo Kauffman</a></li>
					    	<li><a href="index.html">Rodolfo Zare Vega</a></li>
					    	<a href="index.html">Ver más...</a>
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
					    <h3 class="panel-title">Somos Pruebas en Verano!! </h3>
					  </div>
					  <div class="panel-body">
					  	<div class="row margen">
					  		<div class="col-xs-1"></div>
					  		<div class="col-xs-10 post">
					  			<!-- Nav tabs -->
								<ul class="nav nav-tabs" role="tablist">
								  <li class="active"><a href="#postear" role="tab" data-toggle="tab">Postear</a></li>
								  <li><a href="#subir-archivo" role="tab" data-toggle="tab">Subir archivo</a></li>
								</ul>

								<!-- Tab panes -->
								<div class="tab-content">
								  <div class="tab-pane active in fade" id="postear">
								  	<br/>
								  	<div class="form-group">
					  					<textarea name="" id="txtPost" rows="5" class="form-control noresize" placeholder="Escribe algo..."></textarea>
					  				</div>
                                                                        <div class="pull-right"><button type="button" class="btn btn-primary" id="botonmostrar">Postear</button></div>
								  </div>
								  <div class="tab-pane fade" id="subir-archivo">
								  	<br/>
								  	<div class="form-group">
					  					<textarea name="" id="txtPost" rows="5" class="form-control noresize" placeholder="Haz un comentario..."></textarea>
					  				</div>
					  				<div class="row clearfix">
					  					<div class="col-xs-9">
					  						<button type="button" class="btn btn-info">Examinar</button>&nbsp;&nbsp;No elegiste un archivo
					  					</div>
					  					<div class="col-xs-3">
					  						<button type="button" class="btn btn-primary pull-right">Subir</button>
					  					</div>
					  				</div>
					  				
								  </div>
								</div>	
					  		</div>
					  		<div class="col-xs-1"></div>
					  	</div>
                                              
                                              <div class="row margen" id="amostar">
					  		<div class="col-xs-1"></div>
					  		<div class="col-xs-10 post">

					  			<h4>
					  				<img src="img/vj.jpg" height="35" width="35"> Gandalf El blanco
                                                                        
                                                                        <button class="dropdown btn btn-pull-right">
											 <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-cog"></span><strong class="caret"></strong></a>
											<ul class="dropdown-menu">
												<li>
													<a href="#">Editar</a>
												</li>

												<li>
                                                                                                    <a href="#" id="elimina">Eliminar</a>
												</li>
												
											</ul>
										</button>
					  			</h4>
					  			<p></p>
					  		</div>
					  		<div class="col-xs-1"></div>
					  	</div>
                                              <div class="row margen" id="aeliminar">
					  		<div class="col-xs-1"></div>
					  		<div class="col-xs-10 post">

					  			<h4>
					  				<img src="img/vj.jpg" height="35" width="35"> Gandalf El Gris
                                                                        
                                                                        <button class="dropdown btn btn-pull-right">
											 <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-cog"></span><strong class="caret"></strong></a>
											<ul class="dropdown-menu">
												<li>
													<a href="#">Editar</a>
												</li>

												<li>
                                                                                                    <a href="#" id="elimina">Eliminar</a>
												</li>
												
											</ul>
										</button>
					  			</h4>
					  			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus maxime commodi provident, modi laboriosam quo id enim, voluptatem harum distinctio omnis qui? Expedita voluptate repudiandae quae officia ipsum dicta, dignissimos.</p>
					  		</div>
					  		<div class="col-xs-1"></div>
					  	</div>
					  	<div class="row margen" id="aeliminar2">
					  		<div class="col-xs-1"></div>
					  		<div class="col-xs-10 post">

					  			<h4>
					  				<img src="img/vj.jpg" height="35" width="35"> Gandalf El Gris
                                                                        
                                                                        <button class="dropdown btn btn-pull-right">
											 <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-cog"></span><strong class="caret"></strong></a>
											<ul class="dropdown-menu">
												<li>
													<a href="#">Editar</a>
												</li>

												<li>
                                                                                                    <a href="#" id="elimina2">Eliminar</a>
												</li>
												
											</ul>
										</button>
					  			</h4>
					  			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus maxime commodi provident, modi laboriosam quo id enim, voluptatem harum distinctio omnis qui? Expedita voluptate repudiandae quae officia ipsum dicta, dignissimos.</p>
					  		</div>
					  		<div class="col-xs-1"></div>
					  	</div>
                                              <div class="row margen" id="aeliminar3">
					  		<div class="col-xs-1"></div>
					  		<div class="col-xs-10 post">

					  			<h4>
					  				<img src="img/vj.jpg" height="35" width="35"> Gandalf El Gris
                                                                        
                                                                        <button class="dropdown btn btn-pull-right">
											 <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-cog"></span><strong class="caret"></strong></a>
											<ul class="dropdown-menu">
												<li>
													<a href="#">Editar</a>
												</li>

												<li>
                                                                                                    <a href="#" id="elimina3">Eliminar</a>
												</li>
												
											</ul>
										</button>
					  			</h4>
					  			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus maxime commodi provident, modi laboriosam quo id enim, voluptatem harum distinctio omnis qui? Expedita voluptate repudiandae quae officia ipsum dicta, dignissimos.</p>
					  		</div>
					  		<div class="col-xs-1"></div>
					  	</div>
                                              <div class="row margen" id="aeliminar4">
					  		<div class="col-xs-1"></div>
					  		<div class="col-xs-10 post">

					  			<h4>
					  				<img src="img/vj.jpg" height="35" width="35"> Gandalf El Gris
                                                                        
                                                                        <button class="dropdown btn btn-pull-right">
											 <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-cog"></span><strong class="caret"></strong></a>
											<ul class="dropdown-menu">
												<li>
													<a href="#">Editar</a>
												</li>

												<li>
                                                                                                    <a href="#" id="elimina4">Eliminar</a>
												</li>
												
											</ul>
										</button>
					  			</h4>
					  			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus maxime commodi provident, modi laboriosam quo id enim, voluptatem harum distinctio omnis qui? Expedita voluptate repudiandae quae officia ipsum dicta, dignissimos.</p>
					  		</div>
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
