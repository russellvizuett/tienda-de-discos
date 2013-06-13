<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${sessionScope.administrador!=null||sessionScope.usuario!=null}">
   <c:redirect url="/index.html"/>
</c:if>
<html>
	<head>
		<title>Nuevo Usuario</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/spacelab.css"/>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"/>
	</head>
	
	<body>
		<c:if test="${sessionScope.administrador!=null}"> 
			<jsp:include page="/WEB-INF/jsp/navtab-admin.jsp" />
		</c:if>
		<c:if test="${sessionScope.administrador==null}">
			<jsp:include page="/WEB-INF/jsp/navtab.jsp" />
		</c:if>
		<div class="span10 offset1">
		<c:if test="${mensaje!=null}">
		<h3 class="alert alert-warning">${mensaje}</h3>
		</c:if>
		<form class="form-horizontal well" action="agregar_usuario.html" method="post">
	        <fieldset>	      
			  <legend>Si aun no tienes cuenta registrate</legend>
	          <div class="control-group">
	            <label class="control-label">Nombre</label>
	            <div class="controls">
	              <input type="text" class="input-xlarge" name="nombre">
	            </div>
	          </div>
	          <div class="control-group">
	            <label class="control-label">Edad</label>
	            <div class="controls">
	              <input type="text" class="input-xlarge" name="edad">
	            </div>
	          </div>
	          <div class="control-group">
	            <label class="control-label">Sexo</label>
	            <div class="controls">
	              <select id="select01" name="sexo">
	                <option>Masculino</option>
	                <option>Femenino</option>
	              </select>
	            </div>
	          </div>
	          <div class="control-group">
	            <label class="control-label">Telefono</label>
	            <div class="controls">
	              <input type="text" class="input-xlarge" name="telefono">
	            </div>
	          </div>
	          <div class="control-group">
	            <label class="control-label">Direccion</label>
	            <div class="controls">
	              <input type="text" class="input-xlarge" name="ubicacion">
	            </div>
	          </div>
	          <div class="control-group">
	            <label class="control-label">E-mail</label>
	            <div class="controls">
	              <input type="text" class="input-xlarge" name="correo">
	            </div>
	          </div>
	          <div class="control-group">
	            <label class="control-label">Password</label>
	            <div class="controls">
	              <input type="password" class="input-xlarge" name="password">
	            </div>
	          </div>
	          <div class="form-actions">
	            <button type="submit" class="btn btn-primary">Registrarse</button>
	          </div>
	        </fieldset>
    	</form>
    	</div>
		
	</body>
</html>

      
      
			






