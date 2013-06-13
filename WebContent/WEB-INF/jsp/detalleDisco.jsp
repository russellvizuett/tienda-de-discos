<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>${disco.nombre_disco}</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/spacelab.css"/>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"/>
		<script src="${pageContext.request.contextPath}/js/audiojs/audio.min.js"></script>
	</head>
	
	<body>
		<c:if test="${sessionScope.administrador!=null}"> 
			<jsp:include page="/WEB-INF/jsp/navtab-admin.jsp" />
		</c:if>
		<c:if test="${sessionScope.administrador==null}">
			<jsp:include page="/WEB-INF/jsp/navtab.jsp" />
		</c:if>
		<div class="span10 offset1">
		<form class="form-horizontal well">
        <fieldset>
          <legend>Detalles del Disco "${disco.nombre_disco}"</legend>
          <div class="control-group">
            <label class="control-label"></label>
            <div class="controls">
              <img class="caratula" src="${pageContext.request.contextPath}/img/${disco.nombre_imagen}">
          	</div>
          </div>
          <div class="control-group">
            <label class="control-label">Artista</label>
            <div class="controls">
              <strong>${disco.artista}</strong>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">Genero</label>
            <div class="controls">
              <strong>${disco.genero}</strong>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label">Pistas:</label>
            <div class="controls">
              	<br>
              	<ol>
	            	<c:forEach items="${tracklist}" var="pista">
						<li><strong>${pista}</strong></li>
					</c:forEach>
				</ol>
            </div>
          </div>
          <c:if test="${disco.demo!=null}">
	          <div class="control-group">
	            <label class="control-label">Demo:</label>
	            <div class="controls">
	              <audio src="${pageContext.request.contextPath}/mp3/${disco.demo}" preload="auto"></audio>
	            </div>
	          </div>
          </c:if>
          <div class="form-actions">
	          <c:if test="${sessionScope.administrador!=null}">
	          	 <a class="btn btn-info" href="recomendar.html?id=${disco.id}"><i class="icon-plus icon-white"></i> Recomendar</a>
	          	 <a class="btn btn-info" href="editar_disco.html?id=${disco.id}"><i class="icon-wrench icon-white"></i> Editar</a> 
				 <a class="btn btn-info" href="eliminar_disco.html?id=${disco.id}"><i class=" icon-trash icon-white"></i> Eliminar</a>
			  </c:if>
			  
			  <c:if test="${sessionScope.administrador==null}">
				
	          	<div class="boton-compra">
					<a class="btn btn-primary" href="comprar_disco.html?id=${disco.id}&usuario=${usuario.id}">
						<i class="icon-shopping-cart icon-white"></i>
						 Comprar
					</a>
					<span class="precio">$${disco.precio_compra}.00 </span>
	          	</div>
	          	<div class="boton-compra">
	          		<a class="btn btn-primary" href="rentar_disco.html?id=${disco.id}&usuario=${usuario.id}">
	          			<i class="icon-shopping-cart icon-white"></i>
	          			Rentar
	          		</a>
	          		<span class="precio">$${disco.precio_renta}.00</span>
	          	</div>
			  </c:if>
		  </div>
      </fieldset>
      </form>
      </div>
	  <script>
		  audiojs.events.ready(function() {
		    var as = audiojs.createAll();
		  });
		</script>
	</body>
</html>


