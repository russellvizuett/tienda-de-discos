<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Russell's Store</title>
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
		<h1 class="title">Recomendamos</h1>
		
		<a class="prev"><= prev</a>
		<a class="next">next =></a>		
		<ol>
			<c:forEach items="${discos}" var="disco">
		    	<li>
		    		<a href="/Store/detalle_disco.html?id=${disco.id}">
		    			<img src="${pageContext.request.contextPath}/img/${disco.nombre_imagen}">
		    		</a>
		    	</li>
		    </c:forEach>
		</ol>
	    <div class="busqueda">
			<form action="buscar.html" method="post">
				<input type="text" class="input-medium search-query" placeholder="type search" name="palabra">
				<input type="hidden" name="filtro" value="todo">
				<button type="submit" class="btn btn-primary btn-small">
					<i class="icon-search icon-white"></i>
					Buscar
				</button>
			</form>
		</div>
	    <script src="${pageContext.request.contextPath}/js/jquery-1.9.1.min.js"></script>
	    <script src="${pageContext.request.contextPath}/js/jquery.roundabout.min.js"></script>
	    <script>
		   $(document).ready(function() {
		      $('ol').roundabout({
		    	  autoplay: true,
		    	  autoplayDuration: 2300,
		          btnNext: ".next",
		          btnPrev: ".prev",
		          duration: 900
		      });
		   });
		</script>
		<jsp:include page="/WEB-INF/jsp/noticias.jsp" />
	</body>
</html>