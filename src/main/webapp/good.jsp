<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html id="tasklist">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Товар</title>
    <link rel="stylesheet" href="${contextPath}/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/custom.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/Navigation-with-Button.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/Navigation-with-Button.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/fontawesome-all.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/fontawesome5-overrides.min.css">
</head>

<body style="background-color: rgb(77,77,77);">
    <div class="flex-column " id="content-wrapper" style="background-color: rgb(77,77,77);">
        <div id="content" style="color: rgb(77,77,77);">
            <div class="card mycard-s" >
                <div class="card-body d-inline" >
                    <div class="col d-flex flex-column flex-shrink-1 flex-fill myCardContainer">
                        <div class=" flex-column flex-sm-column flex-md-column flex-lg-column"
                            style="min-height: 300px;background-color: rgb(99,99,99);">
                            <div class="col" style="color: rgb(95,95,95);">
                                <div
                                    class=" d-flex flex-column mt-auto flex-sm-column flex-md-column flex-lg-column flex-xl-column">
                                    <div class="col"
                                        style="height: 220rem;width: 220rem;max-height: 220rem;max-width: 220rem;"><img
                                            class="rounded" src="resources/img/АИР.png"
                                            style="min-width: 200px;min-height: 200px;max-width: 200px;max-height: 200px;margin-top: 5px;"
                                            loading="lazy"></div>
                                    <div class="col"></div>
                                    <div class="col">
                                        <div class=" d-flex flex-column flex-xl-row">
                                            <div class="col">
                                                <div class="input-group text-break inputText" id="fio">
                                                    <div
                                                        class="input-group-prepend text-monospace d-flex input-group-addon">
                                                        <span class="input-group-text d-none d-lg-block">id</span>
                                                    </div>
                                                    <input class="form-control flex-fill rounded-right rounded-left"
                                                        type="text" data-toggle="tooltip" data-bs-tooltip=""
                                                        value="123324" style="min-width: 25px;margin-left: -4px;"
                                                        title="id">
                                                </div>
                                            </div>
                                            <div class="col">
                                                <div class="input-group text-break inputText" id="birthday">
                                                    <div class="input-group-prepend text-monospace input-group-addon">
                                                        <span class="input-group-text d-none d-lg-block">Группа</span>
                                                    </div><input class="form-control rounded-right rounded-left"
                                                        type="text" data-bs-tooltip="" style="margin-left: -4px;"
                                                        title="Группа"
                                                        value="Загальнопромислові серії АИР з короткозамкненим ротором">
                                                    <div class="input-group-append"></div>
                                                    <button type="button" class="btn btn-primary" data-toggle="modal"
                                                        data-target="#exampleModal"></button>
                                                </div>
                                            </div>
                                        </div>
                                        <div
                                            class=" flex-column flex-sm-column flex-md-column flex-lg-column flex-xl-row">
                                            <div
                                                class="col flex-column flex-sm-column flex-md-column flex-lg-column flex-xl-column">
                                                <div class="input-group text-break inputText" id="position">
                                                    <div class="input-group-prepend text-monospace input-group-addon">
                                                        <span
                                                            class="input-group-text d-none d-lg-block">Наименование</span>
                                                    </div><input
                                                        class="form-control flex-fill rounded-right rounded-left"
                                                        type="text" data-toggle="tooltip" data-bs-tooltip=""
                                                        value="Електродвигун АИР100L2-B3 IM1081 (лапы)"
                                                        style="margin-left: -4px;" title="Наименование">
                                                </div>
                                            </div>
                                            <div class="col">
                                                <div class="input-group text-break inputText" id="office">
                                                    <div class="input-group-prepend text-monospace input-group-addon">
                                                        <span class="input-group-text d-none d-lg-block">Артикул</span>
                                                    </div><input class="form-control rounded-right rounded-left"
                                                        type="text" data-toggle="tooltip" data-bs-tooltip=""
                                                        style="margin-left: -4px;" value="DNPR-032453322"
                                                        title="Артикул">
                                                    <div class="input-group-append">
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                        <div
                                            class=" d-flex flex-column flex-grow-1 flex-shrink-1 flex-fill justify-content-start align-items-start align-content-start flex-wrap flex-sm-column flex-md-column flex-lg-column flex-xl-row col-xs">
                                            <div class="col col-xs" style="max-width: 470px;">
                                                <div class="input-group text-break inputText" id="passport_ser">
                                                    <div class="input-group-prepend text-monospace input-group-addon">
                                                        <span class="input-group-text d-none d-lg-block">Единицы
                                                            измерения</span>
                                                    </div><input class="form-control rounded-right rounded-left"
                                                        type="text" data-toggle="tooltip" data-bs-tooltip="" value="шт"
                                                        autocomplete="off" maxlength="12" minlength="2"
                                                        style="margin-left: -4px;min-width: 88px;"
                                                        title="Единицы измерения">
                                                    <div class="input-group-append"><button
                                                            class="btn btn-primary fa fa-times d-none d-lg-block"
                                                            type="icon"
                                                            style="background-color: rgb(77,77,77);"></button></div>
                                                </div>
                                            </div>
                                            <div class="col col-sm" style="max-width: 294px;">
                                                <div class="input-group text-break inputText" id="passport_num">
                                                    <div class="input-group-prepend text-monospace input-group-addon">
                                                        <span class="input-group-text d-none d-lg-block">Вес</span>
                                                    </div><input class="form-control rounded-right rounded-left"
                                                        type="number" data-toggle="tooltip" data-bs-tooltip=""
                                                        style="margin-left: -4px;" value="123456" title="Вес">
                                                    <div class="input-group-append"></div>
                                                </div>
                                            </div>
                                            <div class="col col-xs" style="max-width: 308px;">
                                                <div class="input-group text-break inputText" id="birthdaydate">
                                                    <div class="input-group-prepend text-monospace input-group-addon">
                                                        <span class="input-group-text d-none d-lg-block">Создан</span>
                                                    </div><input class="form-control rounded-right rounded-left"
                                                        type="date" data-toggle="tooltip" id="passport_date"
                                                        autocomplete="off" style="min-width: 140px;margin-left: -4px;"
                                                        title="Создан" value="2002-11-11">
                                                    <div class="input-group-append"></div>
                                                </div>
                                            </div>
                                            <div class="col">
                                                <div class="input-group text-break inputText" id="social_num">
                                                    <div class="input-group-prepend text-monospace input-group-addon">
                                                        <span class="input-group-text d-none d-lg-block">id внешней
                                                            БД</span>
                                                    </div><input class="form-control rounded-right rounded-left"
                                                        type="number" data-toggle="tooltip" data-bs-tooltip=""
                                                        value="5646546332322" inputmode="numeric" autocomplete="off"
                                                        style="margin-left: -4px;" title="Номер соц. страхования">
                                                    <div class="input-group-append"></div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div></div>
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
<!-- Modal -->
<div align="center" class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog col d-xl-flex justify-content-xl-center parent" role="document">
        <div class="modal-content parent">
            <div class="parent" class="modal-body">
                <iframe id="myIframe" src="goodsList.html" class="parent"></iframe>
            </div>
        </div>
    </div>
</div>
<style>
    .parent {
        border: none;
        max-width: 1800px;
        width: 100%;
        height: 100%;
        position: relative;
        white-space: nowrap;
        overflow: hidden;
        display: block;
        margin: 0 auto;
        display: block;
    }
</style>
<script>
    // let myIframe = document.getElementById("myIframe");
    // let url_string = "goodsList.html";
    // let width = "400";
    // let height = "200";
    // let geo = "ua";
    //
    // let adsURL = url_string + "?geo=" + geo + "&size=" + width + "x" + height;
    // console.log(adsURL);
    // myIframe.src = adsURL;
</script>

</html>