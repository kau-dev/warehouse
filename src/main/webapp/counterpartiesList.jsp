<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%--<!DOCTYPE html>--%>
<%--<html id="tasklist" style="overflow:scroll;">--%>

<%--<head>--%>
<%--    <meta charset="utf-8">--%>
<%--    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">	--%>
<%--    <title>Контрагенты</title>--%>
    <link rel="stylesheet" href="${contextPath}/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/custom.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/Navigation-with-Button.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/Navigation-with-Button.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/fontawesome-all.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/fontawesome5-overrides.min.css">
<%--</head>--%>

<%--<body style="background-color: rgb(77,77,77);">--%>
    <div class="container-fluid myCardContainer">
        <div class="row">
            <div class="col d-xl-flex justify-content-xl-center align-items-xl-start"><span
                    class="d-xl-flex align-items-xl-start h1_"
                    style="color: rgb(205,190,8);font-weight: bold;font-size: 24px;">Контрагенты</span></div>
            <div class="col" style="max-width: 20%;">
                <div class="d-xl-flex justify-content-xl-end mb-4" style="margin: 0px;margin-top: 8px;">
                    <h1 class="mb-0"
                        style="font-size: 12px;color: rgb(255,255,255);font-style: normal;font-weight: bold;">Четверг
                        (июнь) 09.06.2022</h1>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col">
                <div class="card shadow mycard-s" style="color: rgb(255,255,255);">
                    <ul id="listCounterparty" class="list-group list-group-flush">
                    </ul>
                </div>
            </div>
        </div>
    </div>
<script src="${contextPath}/resources/js/custom.js"></script>
<script src="${contextPath}/resources/js/jquery.min.js"></script>
<script src="${contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
<script src="${contextPath}/resources/js/bs-init.js"></script>
<script src="${contextPath}/resources/js/jquery.easing.js"></script>
<script src="${contextPath}/resources/js/theme.js"></script>
    <script>
        loadList();
        function loadList(){

            $.getJSON('${contextPath}'+'/api/counterparty/get-all', function (result) {
                $("#idListName").empty();
                $.each(result, function (i, field) {
//лево
                    var strong_left = document.createElement("strong");
                    strong_left.innerHTML=field.name;
                    var span_left = document.createElement("span");
                    span_left.setAttribute("class","text-xs");
                    var h6_left = document.createElement("h6");
                    h6_left.setAttribute("class","mb-0");
                    h6_left.append(strong_left);

                    var div_leftCol = document.createElement("div");
                    div_leftCol.setAttribute("class","col mr-2");
                    div_leftCol.append(h6_left);
                    div_leftCol.append(span_left);
//право
                    var strong_right = document.createElement("strong");
                    strong_right.innerHTML=field.name;
                    var span_right = document.createElement("span");
                    span_right.setAttribute("class","text-xs");
                    var h6_right = document.createElement("h6");
                    h6_right.setAttribute("class","mb-0");
                    h6_right.append(span_right);

                    var div_rightCol = document.createElement("div");
                    div_rightCol.setAttribute("class","col mr-2");
                    div_rightCol.append(h6_right);
                    div_rightCol.append(span_right);
//иконка
                    var div_formC = document.createElement("div");
                    div_formC.setAttribute("class","counterpartyLTD");
//4 поля и иконка внутри ссылки
                    var div_1 = document.createElement("div");
                    div_1.setAttribute("class","row align-items-center no-gutters");
                    div_1.append(div_formC);
                    div_1.append(div_leftCol);
                    div_1.append(div_rightCol);
//ссылка
                    var a_ = document.createElement("a");
                    a_.setAttribute("class","textContainer");
                    a_.setAttribute("href","#");
                    a_.setAttribute("onclick",'navOnClick("","${contextPath}/counterparty.jsp?id='+field.id+'");');
                    a_.append(div_1);
//строка
                    var li_ = document.createElement("li");
                    li_.setAttribute("class","list-group-item");
                    li_.setAttribute("style","background-color: rgb(99,99,99);");
                    li_.append(a_);
                    $("#listCounterparty").append(li_);
                });
            });
        };
    </script>

<%--</body>--%>

<%--</html>--%>