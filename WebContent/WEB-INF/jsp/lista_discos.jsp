 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:if test="${sessionScope.administrador==null}">
   <c:redirect url="/index.html"/>
</c:if>
<html>
	<head>
		<title>Administrar Discos</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/spacelab.css"/>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"/>
	</head>
	<body>
		<jsp:include page="/WEB-INF/jsp/navtab-admin.jsp" />
		
	  	<h1 class="title">Administrar Discos</h1>
	  		
		<div>
			<div class="busqueda">
			<form action="ver_discos.html" method="post">
				<input type="text" class="input-medium search-query" placeholder="type search" name="palabra">
				<button type="submit" class="btn btn-primary btn-small">
					<i class="icon-search icon-white"></i>
					Buscar
				</button><br>
				<input type="hidden" name="filtro" value="todo">
			</form>
		    </div>
		    
			<table id="tbl_discos" class="table table-striped">
					<tr>
						<td><h4><a href="/Store/crear_disco.html">+ Agregar Disco</a></h4></td>
						<td>DISCO</td>
						<td>ARTISTA</td>
						<td>GENERO</td>
						<td></td>
						<td></td>
						<td></td>
			  		    
					</tr>
				<c:forEach items="${discos}" var="disco">
					<tr>
						<td><img src="${pageContext.request.contextPath}/img/${disco.nombre_imagen}" class="caratula"></td>
						<td>${disco.nombre_disco}</td>
						<td>${disco.artista}</td>
						<td>${disco.genero}</td>
						<td><a href="detalle_disco.html?id=${disco.id}">Detalles</a></td>
						<td><a class="btn btn-info" href="editar_disco.html?id=${disco.id}"><i class="icon-wrench icon-white"></i> Editar</a></td>
						<td><a class="btn btn-info" href="eliminar_disco.html?id=${disco.id}"><i class=" icon-trash icon-white"></i> Eliminar</a></td>
					</tr>
				</c:forEach>
			</table>
			<c:if test='${fn:length(discos) eq 0 }'>
		  		<h2 class="title">No hay coincidencias</h2>
		  	</c:if> 
				 
		</div>	
	</body>
</html>