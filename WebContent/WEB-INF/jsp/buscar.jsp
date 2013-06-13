 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
	<head>
		<title>Busqueda</title>
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
		<div>
			<div class="busqueda">
			<form action="buscar.html" method="post">
				<input type="text" class="input-medium search-query" placeholder="type search" name="palabra">
				<button type="submit" class="btn btn-primary btn-small">
					Buscar
				</button><br>
				<input type="radio" name="filtro" value="todo" checked><strong>Todo</strong>
				<input type="radio" name="filtro" value="nombre_disco"><strong>Discos</strong>
				<input type="radio" name="filtro" value="artista"><strong>Artistas</strong>
				<input type="radio" name="filtro" value="genero"><strong>Generos</strong>
				
			</form>
		    </div>
		    
			<table id="tbl_busqueda" class="table table-striped">
					<tr>
						<td></td>
						<td>DISCO</td>
						<td>ARTISTA</td>
						<td>GENERO</td>
						<td></td>
						<td></td>
			  		    <c:if test='${sessionScope.administrador==null}'>
				        	<td></td>
		  			  	</c:if>
					</tr>
				<c:forEach items="${discos}" var="disco">
					<tr>
						<td><img src="${pageContext.request.contextPath}/img/${disco.nombre_imagen}" class="caratula"></td>
						<td>${disco.nombre_disco}</td>
						<td>${disco.artista}</td>
						<td>${disco.genero}</td>
						<td><a href="detalle_disco.html?id=${disco.id}">Detalles</a></td>
			  			<c:if test='${sessionScope.administrador!=null}'>
							<td><a class="btn btn-info" href="recomendar.html?id=${disco.id}"><i class="icon-plus icon-white"></i> Agregar a lista</a></td>
		  				</c:if>
			  			<c:if test='${sessionScope.administrador==null}'>
			  				<td>
			  					<div class="boton-compra-busqueda">
									<a class="btn btn-primary" href="comprar_disco.html?id=${disco.id}&usuario=${usuario.id}">
										<i class="icon-shopping-cart icon-white"></i>
										 Comprar
									</a>
									<span class="precio">$${disco.precio_compra}.00 </span>
	          					</div>
			  				</td>
			  				<td>
			  					<div class="boton-compra-busqueda">
					          		<a class="btn btn-primary" href="rentar_disco.html?id=${disco.id}&usuario=${usuario.id}">
					          			<i class="icon-shopping-cart icon-white"></i>
					          			 Rentar
					          		</a>
					          		<span class="precio">$${disco.precio_renta}.00</span>
	          					</div>
			  				</td>
				        </c:if>
					</tr>
				</c:forEach>
			</table>
		  	<c:if test='${fn:length(discos) eq 0 }'>
		  		<h2 class="title">Lo sentimos tu busqueda no produjo ningun resultado</h2>
		  	</c:if>
		</div>	
	</body>
</html>