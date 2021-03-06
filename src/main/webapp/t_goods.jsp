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
<spring:message code="NotEmpty"/>
<div class="container-fluid">
    <div class="row">
        <nav class="col-sm-3 col-4" id="myScrollspy">
            <ul class="nav nav-pills flex-column">
                <li class="nav-item">
                    <a class="nav-link active" href="#section1">Section 1</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#section2">Section 2</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#section3">Section 3</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#">Section 4</a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="#section41">Link 1</a>
                        <a class="dropdown-item" href="#section42">Link 2</a>
                    </div>
                </li>
            </ul>
        </nav>
        <div class="col-sm-9 col-8">
            <div id="section1" class="bg-success">
                <h1>???????????? ??????????????</h1>
                <c:if test="${!empty listGoods}">
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
                                <td><a href="/gooddata/${good.id}" target="_blank">${good.name}</a></td>
                                <td>${good.code}</td>
                                <td>${good.barcode}</td>
                                <td><a href="<c:url value='/edit/${good.id}'/>">Edit</a></td>
                                <td><a href="<c:url value='/remove/${good.id}'/>">Delete</a></td>
                            </tr>
                        </c:forEach>
                    </table>
                </c:if>
            </div>
            <div id="section2" class="bg-warning">
                <h1>Section 2</h1>
                <p>Try to scroll this section and look at the navigation list while scrolling!</p>
            </div>
            <div id="section3" class="bg-secondary">
                <h1>Section 3</h1>
                <p>Try to scroll this section and look at the navigation list while scrolling!</p>
            </div>
            <div id="section41" class="bg-danger">
                <h1>Section 4-1</h1>
                <p>Try to scroll this section and look at the navigation list while scrolling!</p>
            </div>
            <div id="section42" class="bg-info">
                <h1>Section 4-2</h1>
                <p>Try to scroll this section and look at the navigation list while scrolling!</p>
            </div>
        </div>
    </div>
</div>





<script src="${contextPath}/resources/js/bootstrap.js"></script>
</body>
</html>
