<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Editar Curso</title>
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
				<li class="hidden-sm hidden-md">
					<a href="#">Cursos</a>
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
			
			<div class="col-xs-12 col col-sm-12">
				<div class="row">
					<div class="panel panel-default">
						  <div class="panel-heading">
						    <h3 class="panel-title">Algoritmos Avanzados</h3>
						  </div>
						  
						  <div class="panel-body">


						  	<form role="form">

            
            <div class="col-lg-12 xs-12">
                
                <div class="form-group">
                    
                 
                        <input type="text" class="form-control" name="txtNombreCurso" id="InputName" placeholder="Ingrese Nombre del Curso" required>
                       
                    
                </div>
                
                
                <div class="form-group">
                    
                    
                        <input type="text" class="form-control" name="txtNumCreditos" id="InputName" placeholder="Ingrese numero de creditos" required>
                        
                   
                </div>

                <div class="form-group">
                    
                    
                        <input type="text" class="form-control" name="txtCiclo" id="InputName" placeholder="Ingrese ciclo" required>
                       
                   
                </div>

                <div class="form-group">
                    
                    
                        <input type="text" class="form-control" name="txtSeccion" id="InputName" placeholder="Ingrese seccion" required>
                       
                   
                </div>

                <div>
                <input type="submit" name="submit" id="submit" value="Cancelar" class="btn btn-danger pull-right btn-lg">
                <input type="submit" name="submit" id="submit" value="Aceptar" class="btn btn-info pull-right btn-lg">
            </div>
            </div>

            


        </form>
						  	
						  </div>
						</div>
				</div>
				
			</div>
			
	</div>
</body>
</html>
