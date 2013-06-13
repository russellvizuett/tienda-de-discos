 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${sessionScope.administrador==null}">
   <c:redirect url="/index.html"/>
</c:if>
<html>
	<head>
		<title>Nuevo CD/DVD</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/spacelab.css"/>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"/>
	</head>
	
	<body>
	<jsp:include page="/WEB-INF/jsp/navtab-admin.jsp" />	
	
		<div class="span10 offset1">
		<form id="crear_disco" class="form-horizontal well" action="agregar_disco.html" method="post" enctype="multipart/form-data">
        <fieldset>
          <legend>Agregar un nuevo CD/DVD</legend>
          <div class="control-group">
            <label class="control-label">Nombre</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="1">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">Artista</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="2">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">Genero</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="3">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">Existencia para compra</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="4">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">Existencia para renta</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="5">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">Lista de canciones</label>
            <div class="controls lista">
              <input type="text" class="input-xlarge cancion">
              <a class="add">+</a>
              <input id="lista-canciones" type="hidden" name="6">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">Precio Compra</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="7">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">Precio Renta</label>
            <div class="controls">
              <input type="text" class="input-xlarge" name="8">
              <input type="hidden" name="9" value="no">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="fileInput">Imagen CD/DVD</label>
            <div class="controls">
              <input class="input-file" type="file" name="imagen">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="fileInput">Demo .mp3</label>
            <div class="controls">
              <input class="input-file" type="file" name="demo">
            </div>
          </div>
          <div class="form-actions">
            <button type="submit" class="btn btn-primary">Guardar</button>
          </div>
        </fieldset>
      </form>
      </div>
	<script src="${pageContext.request.contextPath}/js/jquery-1.9.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/crearDisco.js"></script>
	<script src="${pageContext.request.contextPath}/js/jquery.validate.min.js"></script>
	</body>
</html>
	