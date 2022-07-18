<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html id="tasklist">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Добро пожаловать</title>
    <link rel="stylesheet" href="${contextPath}/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/custom.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/Navigation-with-Button.css">
</head>

<body id="tasklist1" style="background-color: rgb(77,77,77);">
<div w3-include-html="/index.jsp"></div>
<div class="container-fluid card shadow mycard-s">
    <div class="row">
        <div class="col d-xl-flex justify-content-xl-center align-items-xl-start"><span
                class="d-xl-flex align-items-xl-start h1_"
                style="color: rgb(205,190,8);font-weight: bold;font-size: 24px;">Добро пожаловать</span></div>
    </div>
    <div class="row">
        <div class="col col-4 mx-auto text-center">
            <img class="myCardContainer img-fluid align-self-center"  src="https://upload.wikimedia.org/wikipedia/ru/0/04/%D0%9F%D0%BE%D1%81%D1%82%D0%B5%D1%80_%D1%84%D0%B8%D0%BB%D1%8C%D0%BC%D0%B0_%22%D0%94%D0%BE%D0%B1%D1%80%D0%BE_%D0%BF%D0%BE%D0%B6%D0%B0%D0%BB%D0%BE%D0%B2%D0%B0%D1%82%D1%8C%2C_%D0%B8%D0%BB%D0%B8_%D0%9F%D0%BE%D1%81%D1%82%D0%BE%D1%80%D0%BE%D0%BD%D0%BD%D0%B8%D0%BC_%D0%B2%D1%85%D0%BE%D0%B4_%D0%B2%D0%BE%D1%81%D0%BF%D1%80%D0%B5%D1%89%D1%91%D0%BD%22.jpg"></img>
        </div>
    </div>
</div>
<script src="${contextPath}/resources/js/jquery.min.js"></script>
<script src="${contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
<script src="${contextPath}/resources/js/bs-init.js"></script>
<script src="${contextPath}/resources/js/jquery.easing.js"></script>
<script src="${contextPath}/resources/js/theme.js"></script>

</body>

</html>