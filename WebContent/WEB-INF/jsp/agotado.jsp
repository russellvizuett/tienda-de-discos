 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<title>Agotado</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/spacelab.css"/>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"/>
	</head>
	<body>
	<jsp:include page="/WEB-INF/jsp/navtab.jsp" />
	<h2 class="alert alert-warning">
		Lo sentimos el disco que solicitaste esta agotado para la ${agotado}.<br>
		<c:if test='${disponibilidad!=null&&disponibilidad!=""}'>
			<br>Estara disponible para la siguiente fecha: ${disponibilidad}
		</c:if>
	</h2>
	</body>
</html>