 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${sessionScope.administrador==null}">
   <c:redirect url="/index.html"/>
</c:if>
<html>
	<head>
		<title>Administrar Recomendados</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/spacelab.css"/>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"/>
	</head>
	
	<body>
	<jsp:include page="/WEB-INF/jsp/navtab-admin.jsp" />
		<div class="busqueda">
			<form action="buscar.html" method="post">
				<input type="text" class="input-medium search-query" placeholder="type search" name="palabra">
				<button type="submit" class="btn btn-primary btn-small">
					<i class="icon-search icon-white"></i>
					Agregar +
				</button><br>
				<input type="radio" name="filtro" value="todo" checked><strong>Todo</strong>
				<input type="radio" name="filtro" value="nombre_disco"><strong>Discos</strong>
				<input type="radio" name="filtro" value="artista"><strong>Artistas</strong>
				<input type="radio" name="filtro" value="genero"><strong>Generos</strong>
				
			</form>
		</div>
		<table id="tbl_recomendados" class="table table-striped">
				<tr>
					<td></td>
					<td>DISCO</td>
					<td>ARTISTA</td>
					<td>GENERO</td>
					<td></td>
				</tr>
			<c:forEach items="${discos}" var="disco">
				<tr>
					<td><img src="${pageContext.request.contextPath}/img/${disco.nombre_imagen}" class="caratula"></td>
					<td>${disco.nombre_disco}</td>
					<td>${disco.artista}</td>
					<td>${disco.genero}</td>
		        	<td><a href="desrecomendar.html?id=${disco.id}">Quitar de lista</a></td>
				</tr>
			</c:forEach>
		</table>	
	
		
	</body>
</html>