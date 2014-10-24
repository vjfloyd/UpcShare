<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Inicio Registrarse</title>
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
      
      <ul class="nav navbar-nav navbar-right">
        
       

        <li class="hidden-sm hidden-md ">
          <a href="Log In.jsp">
            <button type="button" class="btn btn-primary baja">Ingresar</button>
          </a>
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
  
   <div class="bg"></div>
<div class="jumbotron" >
  <div class="container">
  

    <h1>UPC Share
    <img src="img/upc.png" width="50" height="50">
    </h1>
    <p class="lead">La red social de la UPC</p>


    <div class="row clearfix alinear">

            <form role="form"  action="AgregarUsuarioController" method="post" >

            <div class="col-lg-8">
              
            </div>
            <div class="col-lg-4 xs-12">
                
                <div class="form-group">
                        <input type="text" class="form-control" name="txtApodo" id="InputName" placeholder="Ingrese Usuario" required>
                </div>
                <div class="form-group">
                        <input type="password" class="form-control" name="txtClave" id="InputName" placeholder="Ingrese Contraseña" required>
                </div>
                <div class="form-group">
                    <input type="email" class="form-control" id="InputEmailFirst" name="txtEmail1" placeholder="Ingrese Correo Electrónico" required>
                </div>

                <div class="form-group">
                    <input type="email" class="form-control" id="InputEmailSecond" name="txtEmail2" placeholder="Confirme Correo Electrónico" required>
                </div>
                
                <div class="form-group">
                        <input type="text" class="form-control" name="txtNombre" id="InputName" placeholder="Ingrese Nombre" required>
                </div>
                <div class="form-group">
                        <input type="text" class="form-control" name="txtCarrera" id="InputName" placeholder="Ingrese Carrera" required>
                </div>
                
                
                <div>
                <input type="submit" name="submit" id="submit" value="Registrarse" class="btn btn-info pull-right btn-lg btn-block">
                </div>
            </div>

            


        </form>
    </div>
 </div>
</div>

</body>
</html>