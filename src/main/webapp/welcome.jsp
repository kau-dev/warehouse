<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>welcome jsp</title>
    <link href="${contextPath}/resources/css/bootstrap.css" rel="stylesheet">
    <nav class="navbar navbar-dark bg-dark">
        <!-- Navbar content -->
    </nav>
</head>
<body>

<div>
<%--<c:if test="${!empty listGoods}">--%>
    <table class="tg">
        <tr>
            <th width="80">ID</th>
            <th width="120">Title</th>
            <th width="120">Author</th>
            <th width="120">Price</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${listGoods}" var="good">
            <tr>
                <td>${good.id}</td>
                <td><a href="/gooddata/${good.id}" target="_blank">${good.barcode}</a></td>
                <td>${good.name}</td>
                <td>${good.code}</td>
                <td><a href="<c:url value='/edit/${good.id}'/>">Edit</a></td>
                <td><a href="<c:url value='/remove/${good.id}'/>">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
<%--</c:if>--%>
</div>
  <div class="container">
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <h2>Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a></h2>
    </c:if>
  </div>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
  <script src="${contextPath}/resources/js/bootstrap.js"></script>
</body>
</html>
