<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html id="tasklist" style="overflow:scroll;">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">	
    <title>Контрагенты</title>
    <link rel="stylesheet" href="${contextPath}/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/custom.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/Navigation-with-Button.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/Navigation-with-Button.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/fontawesome-all.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/fontawesome5-overrides.min.css">
</head>

<body id="tasklist1" style="background-color: rgb(77,77,77);">
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
                    <ul class="list-group list-group-flush">

                        <li class="list-group-item " style="background-color: rgb(99,99,99);">
                            <a class="textContainer " href="${contextPath}/counterparty.jsp">
                                <div class="row align-items-center no-gutters ">
                                    <div class="counterpartyLTD"></div>
                                    <div class="col mr-2">
                                        <h6 class="mb-0"><strong>ТОВ &quot;ДЕЛЛ УКРАЇНА&quot;</strong></h6>
                                        <span class="text-xs"></span>
                                    </div>
                                    <div class="col mr-2">
                                        <h6 class="mb-0"><strong>Контактное лицо</strong></h6>
                                        <span class="text-xs">Контактная информация</span>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="list-group-item " style="background-color: rgb(99,99,99);">
                            <div class="row align-items-center no-gutters">
                                <div class="counterpartyLTD"></div>
                                <div class="col mr-2">
                                    <h6 class="mb-0"><strong>ТОВ КИИВСЬКИЙ ВЕНТИЛЯЦИЙНИЙ ЗАВОД</strong></h6><span
                                        class="text-xs"></span>
                                </div>
                                <div class="col mr-2">
                                    <h6 class="mb-0"><strong>Контактное лицо</strong></h6><span
                                        class="text-xs">Контактная информация </span>
                                </div>
                            </div>
                        </li>
                        <li class="list-group-item " style="background-color: rgb(99,99,99);">
                            <div class="row align-items-center no-gutters">
                                <div class="counterpartySelfEmpl"></div>
                                <div class="col mr-2">
                                    <h6 class="mb-0"><strong>ФОП Правдивий О.В.</strong></h6><span
                                        class="text-xs"></span>
                                </div>
                                <div class="col mr-2">
                                    <h6 class="mb-0"><strong>Контактное лицо</strong></h6><span
                                        class="text-xs">Контактная информация</span>
                                </div>
                            </div>
                        </li>
                        <li class="list-group-item " style="background-color: rgb(99,99,99);">
                            <div class="row align-items-center no-gutters">
                                <div class="counterpartyPersonal"></div>
                                <div class="col mr-2">
                                    <h6 class="mb-0"><strong>Нікітін Олег Олексійович</strong></h6><span
                                        class="text-xs"></span>
                                </div>
                                <div class="col mr-2">
                                    <h6 class="mb-0"><strong></strong></h6><span class="text-xs">Контактная
                                        информация</span>
                                </div>
                            </div>
                        </li>
                        <li class="list-group-item " style="background-color: rgb(99,99,99);">
                            <div class="row align-items-center no-gutters">
                                <div class="counterpartyLTD"></div>
                                <div class="col mr-2">
                                    <h6 class="mb-0"><strong>ТОВ "КЕРНЕЛ-ТРЕЙД"</strong></h6><span
                                        class="text-xs"></span>
                                </div>
                                <div class="col mr-2">
                                    <h6 class="mb-0"><strong>Контактное лицо</strong></h6><span
                                        class="text-xs">контактное лицо</span>
                                </div>
                            </div>
                        </li>
                        <li class="list-group-item " style="background-color: rgb(99,99,99);">
                            <div class="row align-items-center no-gutters">
                                <div class="counterpartyLTD"></div>
                                <div class="col mr-2">
                                    <h6 class="mb-0"><strong>ТОВ"ТЕРМОКОМ ВК"</strong></h6><span class="text-xs"></span>
                                </div>
                                <div class="col mr-2">
                                    <h6 class="mb-0"><strong>Контактное лицо</strong></h6><span
                                        class="text-xs">Контактная информация</span>
                                </div>
                            </div>
                        </li>
                        <li class="list-group-item " style="background-color: rgb(99,99,99);">
                            <div class="row align-items-center no-gutters">
                                <div class="counterpartyPersonal"></div>
                                <div class="col mr-2">
                                    <h6 class="mb-0"><strong>Микитенко В. В.</strong></h6><span class="text-xs"></span>
                                </div>
                                <div class="col mr-2">
                                    <h6 class="mb-0"><strong></strong></h6><span class="text-xs">Контактная
                                        информация</span>
                                </div>
                            </div>
                        </li>

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
</body>

</html>