<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${sessionScope.administrador==null&&sessionScope.usuario.id!=usuario.id}">
   <c:redirect url="/index.html"/>
</c:if>
<html>
	<head>
		<title>${usuario.nombre}</title>
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
		    <form class="form-horizontal well">
	        <fieldset>
	          <legend>Detalles de cuenta</legend>
	          
	          <div class="control-group">
	            <label class="control-label">Nombre</label>
	            <div class="controls">
	              <strong>${usuario.nombre}</strong>
	            </div>
	          </div>
	          <div class="control-group">
	            <label class="control-label">Edad</label>
	            <div class="controls">
	              <strong>${usuario.edad}</strong>
	            </div>
	          </div>
	          <div class="control-group">
	            <label class="control-label">Sexo</label>
	            <div class="controls">
	              <strong>${usuario.sexo}</strong>
	            </div>
	          </div>
	          <div class="control-group">
	            <label class="control-label">Telefono</label>
	            <div class="controls">
	              <strong>${usuario.telefono}</strong>
	            </div>
	          </div>
	          <div class="control-group">
	            <label class="control-label">Direccion</label>
	            <div class="controls">
	              <strong>${usuario.ubicacion}</strong>
	            </div>
	          </div>
	          <div class="control-group">
	            <label class="control-label">Compras:</label>
	            <div class="controls">
	              	<br>
	              	<ol>
		            	<c:forEach items="${compras}" var="compra">
							<li><strong>${compra}</strong></li>
						</c:forEach>
					</ol>
	            </div>
	          </div>
	          <div class="control-group">
	            <label class="control-label">Rentas:</label>
	            <div class="controls">
	              	<br>
	              	<ol>
		            	<c:forEach items="${rentas}" var="renta">
							<li><strong>${renta}</strong></li>
						</c:forEach>
					</ol>
	            </div>
	          </div>
	          <div class="control-group">
	            <label class="control-label">Total Gastos:</label>
	            <div class="controls">
	              <strong>$${usuario.gastos}.00</strong>
	            </div>
	          </div>
	          
	          <div class="form-actions">
	          		<a class="btn btn-info" href="editar_usuario.html?id=${usuario.id}">
	          			<i class="icon-wrench icon-white"></i> Editar datos
	          		</a>
			  	<c:if test='${sessionScope.administrador!=null}'>
	          		<a class="btn btn-info" href="eliminar_usuario.html?id=${usuario.id}">
	          			<i class="icon-trash icon-white"></i> Eliminar Usuario
	          		</a>
				</c:if>
	          </div>
	        </fieldset>
	        </form>
	     </div>		
	</body>
</html>


