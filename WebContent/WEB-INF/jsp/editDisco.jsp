<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${sessionScope.administrador==null}">
   <c:redirect url="/index.html"/>
</c:if>
<html>
	<head>
		<title>${disco.nombre_disco}</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/spacelab.css"/>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"/>
	</head>
	
	<body>
		<jsp:include page="/WEB-INF/jsp/navtab-admin.jsp" />
		<div class="span10 offset1">
		<form class="form-horizontal well" action="actualizar_disco.html?id=${disco.id}" method="post">
        <fieldset>
          <legend>Actualizar CD/DVD</legend>
          <div class="control-group">
            <label class="control-label">Nombre</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="nombre_disco" value="${disco.nombre_disco}">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">Artista</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="artista" value="${disco.artista}">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">Genero</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="genero" value="${disco.genero}">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">Existencia para compra</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="existentes_compra" value="${disco.existentes_compra}">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">Disponibilidad compra</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="disponible_compra" value="${disco.disponible_compra}">
              <p class="help-block">Si hay 0 discos en existencia su estatus es agotado. Puede establecer una fecha en la que estara disponible</p>
            </div>
          </div>
          
          <div class="control-group">
            <label class="control-label">Existencia para renta</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="existentes_renta" value="${disco.existentes_renta}">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">Disponibilidad renta</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="disponible_renta" value="${disco.disponible_renta}">
              <p class="help-block">Si hay 0 discos en existencia su estatus es agotado. Puede establecer una fecha en la que estara disponible</p>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">Precio Compra</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="precio_compra" value="${disco.precio_compra}">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">Precio Renta</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="precio_renta" value="${disco.precio_renta}">
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