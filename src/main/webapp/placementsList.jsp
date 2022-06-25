<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html id="tasklist">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Dashboard - Brand</title>
    <link rel="stylesheet" href="${contextPath}/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/custom.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/Navigation-with-Button.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/Navigation-with-Button.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/fontawesome-all.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/fontawesome5-overrides.min.css">

    <style>

    </style>
</head>

<body id="tasklist1" style="background-color: rgb(77,77,77);">
    <div class="container-fluid">
        <div class="row">
            <div class="col d-xl-flex justify-content-xl-center align-items-xl-start"><span
                    class="d-xl-flex align-items-xl-start"
                    style="color: rgb(205,190,8);font-weight: bold;font-size: 24px;">Места хранения</span></div>
            <div class="col" style="max-width: 20%;">
                <div class="d-xl-flex justify-content-xl-end mb-4" style="margin: 0px;margin-top: 8px;">
                    <h6 class="mb-0"
                        style="font-size: 12px;color: rgb(255,255,255);font-style: normal;font-weight: bold;">Четверг
                        (июнь) 09.06.2022</h6>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col">
                <div class="card shadow mycard-s myCardContainer" style="color: rgb(255,255,255);">
                    <ul id="myUL">
                        <li class="list-group-item" style="background-color: rgb(99,99,99); display:inline-flexbox;">
                            <div class="caret">
                                <div class="warehouse"></div>
                                <div class="row align-items-center  flex">
                                    <div class="col mr-2">
                                        <h6 class="mb-0"><strong>Основной склад</strong></h6><span
                                            class="text-xs">Готовой продукции</span>
                                    </div>
                                    <div class="col mr-2">
                                        <h6 class="mb-0"><strong>Двигателя</strong></h6><span class="text-xs">5 - 3000
                                            кг</span>
                                    </div>
                                </div>
                            </div>
                            <ul class="list-group list-group-flush nested">
                                <li class="list-group-item">
                                    <div class="caret">
                                        <div class="sectors" style="margin-right:15px ;"></div>
                                        <div class="row align-items-center  flex">
                                            <div class="col mr-2">
                                                <h6 class="mb-0"><strong>Зона 1А</strong></h6><span
                                                    class="text-xs">Дайльний угол</span>
                                            </div>
                                            <div class="col mr-2">
                                                <h6 class="mb-0"><strong>Запас</strong></h6><span
                                                    class="text-xs">АИР</span>
                                            </div>
                                        </div>
                                    </div>
                                    <ul class="list-group list-group-flush nested">
                                        <li class="list-group-item">
                                            <div class="caret">
                                                <div class="place"></div>
                                                <div class="row align-items-center ">
                                                    <div class="col mr-2">
                                                        <h6 class="mb-0"><strong>Площадка АА1</strong></h6><span
                                                            class="text-xs">Навал</span>
                                                    </div>
                                                    <div class="col mr-2">
                                                        <h6 class="mb-0"><strong>для корпусов</strong></h6><span
                                                            class="text-xs">112,132,160</span>
                                                    </div>
                                                </div>
                                            </div>
                                        </li>
                                        <li class="list-group-item">
                                            <div class="caret">
                                                <div class="place"></div>
                                                <div class="row align-items-center ">
                                                    <div class="col mr-2">
                                                        <h6 class="mb-0"><strong>Площадка АА2</strong></h6><span
                                                            class="text-xs">Навал</span>
                                                    </div>
                                                    <div class="col mr-2">
                                                        <h6 class="mb-0"><strong>для корпусов</strong></h6><span
                                                            class="text-xs">100.112,132</span>
                                                    </div>
                                                </div>
                                            </div>
                                        </li>
                                    </ul>
                                </li>
                                <li class="list-group-item">
                                    <div class="caret">
                                        <div class="sectors" style="margin-right:15px ;"></div>
                                        <div class="row align-items-center  flex">
                                            <div class="col mr-2">
                                                <h6 class="mb-0"><strong>Зона 1B</strong></h6><span class="text-xs">С
                                                    боку</span>
                                            </div>
                                            <div class="col mr-2">
                                                <h6 class="mb-0"><strong>Запас</strong></h6><span
                                                    class="text-xs">АИМ</span>
                                            </div>
                                        </div>
                                    </div>
                                    <ul class="list-group list-group-flush nested">
                                        <li class="list-group-item ">
                                            <div class="caret">
                                                <div class="place"></div>
                                                <div class="row align-items-center ">
                                                    <div class="col mr-2">
                                                        <h6 class="mb-0"><strong>Площадка ВА1</strong></h6><span
                                                            class="text-xs">Навал</span>
                                                    </div>
                                                    <div class="col mr-2">
                                                        <h6 class="mb-0"><strong>для корпусов</strong></h6><span
                                                            class="text-xs">71,80,90</span>
                                                    </div>
                                                </div>
                                            </div>
                                        </li>
                                        <li class="list-group-item">
                                            <div class="caret">
                                                <div class="place"></div>
                                                <div class="row align-items-center">
                                                    <div class="col mr-2">
                                                        <h6 class="mb-0"><strong>Площадка BB2</strong></h6><span
                                                            class="text-xs">Навал</span>
                                                    </div>
                                                    <div class="col mr-2">
                                                        <h6 class="mb-0"><strong>для корпусов</strong></h6><span
                                                            class="text-xs">100.112,132</span>
                                                    </div>
                                                </div>
                                            </div>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <script>
        var toggler = document.getElementsByClassName("caret");
        var i;
        for (i = 0; i < toggler.length; i++) {
            toggler[i].addEventListener("click", function () {
                this.parentElement.querySelector(".nested").classList.toggle("active");
                this.classList.toggle("caret-down");
            });
        }
    </script>
<script src="${contextPath}/resources/js/custom.js"></script>
<script src="${contextPath}/resources/js/jquery.min.js"></script>
<script src="${contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
<script src="${contextPath}/resources/js/bs-init.js"></script>
<script src="${contextPath}/resources/js/jquery.easing.js"></script>
<script src="${contextPath}/resources/js/theme.js"></script>
</body>

</html>