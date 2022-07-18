<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=utf-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%@ page session="false" %>
<!DOCTYPE html>
<html  lang="ru">
<head>
    <meta charset="utf-8">
    <title>goods jsp</title>
    <link href="${contextPath}/resources/css/bootstrap.css" rel="stylesheet">

    <style>
        body {
            position: relative;
        }
        ul.nav-pills {
            top: 20px;
            position: fixed;
        }
        div.col-8 div {
            height: 500px;
        }
    </style>
</head>
<%--<body>--%>
<body data-spy="scroll" data-target="#myScrollspy" data-offset="1">
<%--<a href="../../index.jsp">Back to main menu</a>--%>
<%--<spring:message code="NotEmpty"/>--%>
<%--<spring:message code="NotEmpty"/>--%>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-9 col-8">
            <div id="section1" class="bg-success">
                <h1>Список товаров</h1>
<%--                <c:if test="${!empty listGoods}">--%>
                    <table class="table table-striped table-dark table-responsive">
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
                                <td><a href="/t_gooddata/${good.id}" target="_blank">${good.name}</a></td>
                                <td>${good.code}</td>
                                <td>${good.barcode}</td>
                                <td><a href="<c:url value='/edit/${good.id}'/>">Edit</a></td>
                                <td><a href="<c:url value='/remove/${good.id}'/>">Delete</a></td>
                            </tr>
                        </c:forEach>
                    </table>
<%--                </c:if>--%>
            </div>
        </div>
    </div>
</div>





<script src="${contextPath}/resources/js/bootstrap.js"></script>
</body>
</html>
