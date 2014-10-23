<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Log In</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
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

    <div class="container ">
        <div class="row clearfix alinear">

            <form role="form">
            <div class="col-xs-4"></div>
            <div class="col-lg-4">
                
                
                <div class="form-group">
                    <label for="InputName">Usuario</label>
                    <div class="input-group">
                        <input type="text" class="form-control" name="InputName" id="InputName" placeholder="Ingrese Usuario" required>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="InputClave">Contraseña</label>
                    <div class="input-group">
                        <input type="password" class="form-control" id="InputClave" name="InputClave" placeholder="Ingrese Contraseña" required>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
                </div>

  
                <a href="index.jsp">
                  <input href="index.jsp"  name="submit" id="submit" value="Ingresar" class="btn btn-info pull-right">
                </a>
              </div>


              <div class="col-xs-4"></div>
               
                
            


            </form>
       </div>
        
    </div>


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>