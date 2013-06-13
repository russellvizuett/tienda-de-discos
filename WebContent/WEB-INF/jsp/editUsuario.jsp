<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${sessionScope.administrador==null&&sessionScope.usuario.id!=usuario.id}">
   <c:redirect url="/index.html"/>
</c:if>
<html>
	<head>
		<title>Editar Usuario</title>
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
		<form class="form-horizontal well" action="actualizar_usuario.html?id=${usuario.id}" method="post">
	        <fieldset>
	          <legend>Registro de nuevo Usuario</legend>
	          <div class="control-group">
	            <label class="control-label">Nombre</label>
	            <div class="controls">
	              <input type="text" class="input-xlarge" name="nombre" value="${usuario.nombre}">
	            </div>
	          </div>
	          <div class="control-group">
	            <label class="control-label">Edad</label>
	            <div class="controls">
	              <input type="text" class="input-xlarge" name="edad" value="${usuario.edad}">
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
	              <input type="text" class="input-xlarge" name="telefono" value="${usuario.telefono}">
	            </div>
	          </div>
	          <div class="control-group">
	            <label class="control-label">Direccion</label>
	            <div class="controls">
	              <input type="text" class="input-xlarge" name="ubicacion" value="${usuario.ubicacion}">
	            </div>
	          </div>
	          <div class="control-group">
	            <label class="control-label">E-mail</label>
	            <div class="controls">
	              <input type="text" class="input-xlarge" name="correo" value="${usuario.correo}">
	            </div>
	          </div>
	          <div class="control-group">
	            <label class="control-label">Password</label>
	            <div class="controls">
	              <input type="password" class="input-xlarge" name="password" value="${usuario.password}">
	            </div>
	          </div>
	          <div class="form-actions">
	            <button type="submit" class="btn btn-primary">Guardar</button>
	          </div>
	        </fieldset>
    	</form>
    	</div>
		
	</body>
</html>


