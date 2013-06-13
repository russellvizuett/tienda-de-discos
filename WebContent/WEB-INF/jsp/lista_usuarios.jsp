<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${sessionScope.administrador==null}">
   <c:redirect url="/index.html"/>
</c:if>
<html>
	<head>
		<title>Administrar Usuarios</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/spacelab.css"/>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"/>
	</head>
	
	<body>
		<jsp:include page="/WEB-INF/jsp/navtab-admin.jsp"/>
		<h1 class="title">Usuarios Registrados</h1>
		
		<table id="tbl_usuarios" class="table table-striped">
				<tr>
					<td><strong>Nombre</strong></td>
					<td><strong>E-mail</strong></td>
					<td><strong>Telefono</strong></td>
					<td></td>
					<td><h4><a href="/Store/crear_usuario.html">+ Agregar Usuario</a></h4></td>
					<td></td>
				</tr>
			<c:forEach items="${usuarios}" var="usuario">
				<tr>
					<td>${usuario.nombre}</td>
					<td>${usuario.correo}</td>
					<td>${usuario.telefono}</td>
					<td><a href="detalle_usuario.html?id=${usuario.id}">Detalle Usuario</a></td>
					<td>
						<a class="btn btn-info" href="/Store/editar_usuario.html?id=${usuario.id}">
		          			<i class="icon-wrench icon-white"></i> Editar datos
		          		</a>
					</td>
					<td>
						<a class="btn btn-info" href="/Store/eliminar_usuario.html?id=${usuario.id}">
		          			<i class="icon-trash icon-white"></i> Eliminar Usuario
		          		</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		
	</body>
</html>