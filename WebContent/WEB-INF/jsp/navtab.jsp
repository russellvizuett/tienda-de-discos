<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="navbar navbar-inverse">
    <div class="navbar-inner">
      <div class="container" style="width: auto;">
        <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </a>
        <a class="brand" href="/Store/">Russell Store</a>
        <div class="nav-collapse">
          <ul class="nav">
            <li><a href="/Store/">Home</a></li>
            <li><a href="/Store/buscar.html">Busqueda</a></li>
            <li><a href="/Store/contacto.html">Contacto</a></li> 
          </ul>
          
          <ul class="nav pull-right">
          <c:choose>
	  			<c:when test='${sessionScope.usuario.nombre!=null}'>
		        	<li><h4>${sessionScope.usuario.nombre}</h4></li>
		        	<li><a href="/Store/detalle_usuario.html?id=${sessionScope.usuario.id}">Detalle Cuenta</a></li>
		        	<li class="divider-vertical"></li>
		        	<li><a href="/Store/logout.html">Cerrar sesion</a></li>
  				</c:when>
	  			<c:when test='${sessionScope.usuario.nombre==null}'>
		            <li><a href="/Store/crear_usuario.html">Registrarse</a></li>
		            <li class="divider-vertical"></li>
		            <li class="login">
			            <form action="login.html" method="POST">
			          	<input type="text" class="input-medium" placeholder="Email" name="correo">
			          	<input type="password" class="input-medium" placeholder="Password" name="password">
			          	<button type="submit" class="btn">Login</button>
			        	</form>
		            </li>
		        </c:when>
		  </c:choose>
          </ul>
        </div><!-- /.nav-collapse -->
      </div>
    </div><!-- /navbar-inner -->
  </div>