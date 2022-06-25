<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html id="tasklist">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>&quot;</title>
    <link rel="stylesheet" href="${contextPath}/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/custom.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/Navigation-with-Button.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/Navigation-with-Button.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/fontawesome-all.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/fontawesome5-overrides.min.css">

</head>

<body style="background-color: rgb(77,77,77);">

    <!--            <div id="content" style="color: rgb(77,77,77);margin-left: -14px;">-->
    <div class="card mycard-s" id="content">
        <div class="card-body col-10" id="content">
            <div class="col d-flex flex-column flex-shrink-1 flex-fill" style="margin-left: -30px;margin-right: -30px;">
                <div class="row flex-column flex-sm-column flex-md-column flex-lg-column"
                    style="min-height: 300px;background-color: rgb(99,99,99);">
                    <div class="col" style="color: rgb(95,95,95);">
                        <div
                            class="row d-flex flex-column mt-auto flex-sm-column flex-md-column flex-lg-column flex-xl-column">
                            <div class="col" style="height: 220px;width: 220px;max-height: 220px;max-width: 220px;"><img
                                    class="rounded" src="${contextPath}/resources/img/conterparty_logo.png"
                                    style="min-width: 200px;min-height: 200px;max-width: 200px;max-height: 200px;margin-top: 5px;"
                                    loading="lazy"></div>

                            <div class="col">
                                <div class="row d-flex flex-column flex-xl-row">
                                    <div class="col">
                                        <div class="input-group text-break inputText" id="fio">
                                            <div class="input-group-prepend text-monospace d-flex input-group-addon">
                                                <span class="input-group-text d-none d-lg-block">id</span>
                                            </div><input class="form-control flex-fill rounded-right rounded-left"
                                                type="text" data-toggle="tooltip" data-bs-tooltip="" value="43324"
                                                style="min-width: 25px;margin-left: -4px;" title="id">
                                        </div>
                                    </div>
                                    <div class="col">
                                        <div class="input-group text-break inputText" id="birthday">
                                            <div class="input-group-prepend text-monospace input-group-addon"><span
                                                    class="input-group-text d-none d-lg-block">В программе</span></div>
                                            <input class="form-control rounded-right rounded-left" type="text"
                                                data-bs-tooltip="" style="margin-left: -4px;" title="В программе"
                                                value="ТОВ  &quot;ДЕЛЛ УКРАЇНА&quot;">
                                            <div class="input-group-append"></div>
                                            <!--														<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal"></button>      -->
                                        </div>
                                    </div>
                                </div>
                                <div class="row flex-column flex-sm-column flex-md-column flex-lg-column flex-xl-row">
                                    <div
                                        class="col flex-column flex-sm-column flex-md-column flex-lg-column flex-xl-column">
                                        <div class="input-group text-break inputText" id="position">
                                            <div class="input-group-prepend text-monospace input-group-addon"><span
                                                    class="input-group-text d-none d-lg-block">Наименование</span></div>
                                            <input class="form-control flex-fill rounded-right rounded-left" type="text"
                                                data-toggle="tooltip" data-bs-tooltip=""
                                                value="Товариство з обмеженою відповідальністю  &quot;ДЕЛЛ УКРАЇНА&quot;"
                                                style="margin-left: -4px;" title="Наименование">
                                            <div class="input-group-append">
                                                <!--														<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal"></button>-->
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col" style="max-width: 350px;">
                                        <div class="input-group text-break inputText" id="office">
                                            <div class="input-group-prepend text-monospace input-group-addon"><span
                                                    class="input-group-text d-none d-lg-block">Страна регистрации</span>
                                            </div><input class="form-control rounded-right rounded-left" type="text"
                                                data-toggle="tooltip" data-bs-tooltip="" style="margin-left: -4px;"
                                                value="Украина" title="Страна регистрации">
                                        </div>
                                    </div>
                                </div>
                                <div
                                    class="row d-flex flex-column flex-sm-column flex-md-column flex-lg-column flex-xl-row">
                                    <div class="col" style="max-width: 350px;">
                                        <div class="input-group text-break inputText" id="tin">
                                            <div class="input-group-prepend text-monospace input-group-addon"><span
                                                    class="input-group-text d-none d-lg-block">код по ЕГРПОУ</span>
                                            </div><input class="form-control flex-fill rounded-right rounded-left"
                                                type="text" value="98765432345633" autocomplete="off" inputmode="text"
                                                style="margin-left: -4px;" title="код по ЕГРПОУ">
                                            <div class="input-group-append"></div>
                                        </div>
                                    </div>
                                    <div class="col col-xs" style="max-width: 300px;">
                                        <div class="input-group text-break inputText" id="passport_ser">
                                            <div class="input-group-prepend text-monospace input-group-addon"><span
                                                    class="input-group-text d-none d-lg-block">ИНН</span></div><input
                                                class="form-control rounded-right rounded-left" type="text"
                                                data-toggle="tooltip" data-bs-tooltip="" value="122456783332"
                                                autocomplete="off" maxlength="12" minlength="12"
                                                style="margin-left: -4px;min-width: 88px;" title="ИНН">
                                            <div class="input-group-append"><button
                                                    class="btn btn-primary fa fa-times d-none d-lg-block" type="icon"
                                                    style="background-color: rgb(77,77,77);"></button></div>
                                        </div>
                                    </div>
                                    <div class="col" style="max-width: 350px;">
                                        <div class="input-group text-break inputText" id="social_num">
                                            <div class="input-group-prepend text-monospace input-group-addon"><span
                                                    class="input-group-text d-none d-lg-block">id внешней БД</span>
                                            </div><input class="form-control rounded-right rounded-left" type="number"
                                                data-toggle="tooltip" data-bs-tooltip="" value="4553534"
                                                inputmode="numeric" autocomplete="off" style="margin-left: -4px;"
                                                title="Номер соц. страхования">
                                            <div class="input-group-append"></div>
                                        </div>
                                    </div>
                                    <div class="col" style="max-width: 350px;">
                                        <div class="input-group text-break inputText" id="createDate">
                                            <div class="input-group-prepend text-monospace input-group-addon"><span
                                                    class="input-group-text d-none d-lg-block">Создан</span></div>
                                            <input class="form-control rounded-right rounded-left" type="date"
                                                data-toggle="tooltip" id="passport_date" autocomplete="off"
                                                style="min-width: 140px;margin-left: -4px;" title="Создан"
                                                value="2002-11-11">
                                        </div>
                                    </div>
                                </div>
                                <div class="row flex-column flex-sm-column flex-md-column flex-lg-column flex-xl-row">
                                    <div class="col flex-row flex-sm-row flex-md-row flex-lg-row flex-xl-row">
                                        <div class="input-group text-break inputText" style="max-width: 700px;"
                                            id="passport_num">
                                            <div class="input-group-prepend text-monospace input-group-addon"><span
                                                    class="input-group-text d-none d-lg-block">Ответственный
                                                    сотрудник</span></div><input
                                                class="form-control rounded-right rounded-left" type="text"
                                                data-toggle="tooltip" data-bs-tooltip="" style="margin-left: -4px;"
                                                value="Беседовська Тетяна Олександрівна"
                                                title="Ответственный сотрудник">
                                            <div class="input-group-append "></div>
                                            <button type="button" class="btn btn-primary d-none d-lg-block"
                                                data-toggle="modal" data-target="#exampleModal"></button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
        <!--        </div>-->


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
                <iframe src="employeesList.html" class="parent"></iframe>
            </div>
        </div>
    </div>
</div>
<style>
    .parent {
        background-color: rgb(77, 77, 77);
        border: none;
        min-width: 98%;
        /*width: 100%;*/
        height: 100%;
        position: relative;
        white-space: nowrap;
        overflow: hidden;
        display: block;
    }
</style>

</html>