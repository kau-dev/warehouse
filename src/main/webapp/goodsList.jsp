<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html style="overflow:scroll;">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Товары</title>
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
    <div class="container-fluid myCardContainer">
        <div class="row">
            <div class="col d-xl-flex justify-content-xl-center align-items-xl-start"><span
                    class="d-xl-flex align-items-xl-start h1_"
                    style="color: rgb(205,190,8);font-weight: bold;font-size: 24px;">Номенклатура</span></div>
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
                <div class="card shadow mycard-s" style="color: rgb(255,255,255);">
                    <ul id="myUL" class="my_work_container">
                        <li id="li1" class="list-group-item"
                            onclick="navOnClick(this.id)">
                            <div class="caret">
                                <div class="catalogroup"></div>
                                <div class="row align-items-center no-gutters flex">
                                    <div class="col mr-2">
                                        <h6 class="mb-0"><strong>Двигуни</strong></h6><span
                                            class="text-xs">Електродвигуни загально промислового призначення</span>
                                    </div>
                                    <div class="col mr-2">
                                        <h6 class="mb-0"><strong>Вага</strong></h6><span class="text-xs">5 - 3000
                                            кг</span>
                                    </div>
                                </div>
                            </div>
                            <ul class="list-group list-group-flush nested">
                                <li id="li2" class="list-group-item"
                                    onclick="navOnClick(this.id)">
                                    <div class="caret">
                                        <div class="catalogroup" style="margin-right:15px ;"></div>
                                        <div class="row align-items-center no-gutters flex">
                                            <div class="col mr-2">
                                                <h6 class="mb-0"><strong>Загальнопромислові серії АИР з короткозамкненим
                                                        ротором</strong></h6><span class="text-xs">Високо й
                                                    низькообертові</span>
                                            </div>
                                            <div class="col mr-2">
                                                <h6 class="mb-0"><strong>Кількістю полюсів</strong></h6><span
                                                    class="text-xs">2,
                                                    4, 6, 8, 10</span>
                                            </div>
                                        </div>
                                    </div>
                                    <ul class="list-group list-group-flush nested">
                                        <li id="li3" class="list-group-item caret"
                                            style="background-color: rgb(99,99,99);" >
                                            <a onclick="navOnClick('','/good.jsp?id=1')">
                                                <div class="noncatalogroup"></div>
                                                <div class="row align-items-center no-gutters">
                                                    <div class="col mr-2">
                                                        <h6 class="mb-0"><strong>Електродвигун АИР100L2-B3 IM1081
                                                                (лапы)</strong></h6>
                                                        <span class="text-xs">380 [В]</span>
                                                    </div>
                                                    <div class="col mr-2">
                                                        <h6 class="mb-0"><strong>Потужність</strong></h6><span
                                                            class="text-xs">5.5 кВт</span>
                                                    </div>
                                                </div>
                                            </a>
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

        function reloadTreeGoods(treeId){
            $.getJSON(url, function (result) {
                $("#" + treeId).empty();
                $.each(result, function (i, field) {
                    var a = document.createElement("a");
                    a.value = '(' + field.id + ') ' + field.name;
                    a.setAttribute("id", treeId + "_item" + i);
                    a.setAttribute('data-item-id', field.id);
                    a.setAttribute("class", "dropdown-item searchable")
                    a.setAttribute("href", "#");
                    a.setAttribute('onclick', "setComboBox_SelectValue('dropDownTextSpan',this.id)");

                    a.innerHTML = "(" + field.id + ") " + field.name;
                    $("#" + treeId).append(a);
                });
            });
        }

     //   reloadTreeGoods("myUL");
    </script>
<script src="${contextPath}/resources/js/custom.js"></script>
<script src="${contextPath}/resources/js/jquery.min.js"></script>
<script src="${contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
<script src="${contextPath}/resources/js/bs-init.js"></script>
<script src="${contextPath}/resources/js/jquery.easing.js"></script>
<script src="${contextPath}/resources/js/theme.js"></script>
</body>

</html>