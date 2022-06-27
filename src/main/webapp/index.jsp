<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html >

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Склад</title>
    <link rel="stylesheet" href="${contextPath}/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/custom.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/Navigation-with-Button.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/Navigation-with-Button.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/fontawesome-all.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/fontawesome5-overrides.min.css">
</head>

<body id="page-top" style="background-color: rgb(123,123,123);"  onload="getLastActivePage('contentPage')">
<div class="border-dark shadow-lg d-flex d-xl-flex justify-content-center justify-content-xl-center" id="wrapper"
     style="background-color: rgb(77,77,77);">
    <nav
            class="navbar navbar-light text-monospace text-left shadow d-flex align-items-start ml-auto sidebar sidebar-dark accordion d-lg-block p-0 mycard-s my-2">
        <div class="container-fluid d-flex flex-column p-0 ">
            <a id="tasksList"
               class="navbar-brand d-flex justify-content-center align-items-center sidebar-brand m-11 nav-link active "
               onclick="navOnClick(this.id)" href="#">
                <div class="sidebar-brand-icon rotate-n-15"></div>
                <div class="sidebar-brand-text mx-0"></div>
                <img
                        class="border rounded img img-profile border-0 img-thumbnail my_left_m30px"
                        src="${contextPath}/resources/img/logo.png">
            </a>
            <ul class="nav navbar-nav text-white flex-fill align-self-end flex-wrap-reverse my_left_m30px"
                id="accordionSidebar" style="opacity: 9;font-size: 12px;">
                <li id="linkList" class="nav-item " role="presentation">
                    <a id="goodsList" class="nav-link active" onclick="navOnClick(this.id)" href="#"><img
                            class="rounded d-inline-flex img img-profile border-0 img-thumbnail"
                            style="width: 32px;height: 32px;opacity: 1;/*filter: blur(0px) hue-rotate(0deg) saturate(100%) sepia(0%);*/background-size: contain;background-repeat: no-repeat;padding: 0;padding-top: 0;background-color: rgb(99,99,99);"
                            src="${contextPath}/resources/img/icons8-handle-with-care.png" loading="auto">
                        <span>Товары</span></a>
                    <a id="supplyList" class="nav-link active" onclick="navOnClick(this.id)" href="#"><img
                            class="img img-profile border-0 img-thumbnail"
                            style="width: 32px;height: 32px;background-size: contain;background-repeat: no-repeat;padding: 0;padding-top: 0;background-color: rgb(99,99,99);"
                            src="${contextPath}/resources/img/icons8-delivery.png">
                        <span>Поступление на склад</span></a>
                    <a id="offloadList" class="nav-link active" onclick="navOnClick(this.id)" href="#"><img
                            class="img img-profile border-0 img-thumbnail"
                            style="width: 32px;height: 32px;background-repeat: no-repeat;background-size: contain;padding: 0;padding-top: 0;background-color: rgb(99,99,99);"
                            src="${contextPath}/resources/img/icons8-buy.png">
                        <span>Расход со склада</span></a>
                    <a id="movementsList" class="nav-link active" onclick="navOnClick(this.id)" href="#"><img
                            class="img img-profile border-0 img-thumbnail"
                            style="width: 32px;height: 32px;background-size: contain;background-repeat: round;padding: 0;padding-top: 0;background-color: rgb(99,99,99);"
                            src="${contextPath}/resources/img/icons8-grid-view.png">
                        <span>Внутренее перемещение</span></a>
                    <a id="earmarkedList" class="nav-link active" onclick="navOnClick(this.id)" href="#"><img
                            class="img img-profile border-0 img-thumbnail"
                            style="width: 32px;height: 32px;background-repeat: no-repeat;background-size: contain;padding: 0;padding-top: 0;background-color: rgb(99,99,99);"
                            src="${contextPath}/resources/img/icons8-data-pending.png">
                        <span>Резервирование</span></a>
                    <a id="counterpartiesList" class="nav-link active" onclick="navOnClick(this.id)" href="#"><img
                            class="img img-profile border-0 img-thumbnail"
                            style="width: 32px;height: 32px;background-repeat: no-repeat;background-size: contain;padding: 0;padding-top: 0;background-color: rgb(99,99,99);"
                            src="${contextPath}/resources/img/icons8-permanent-job.png">
                        <span>Контрагенты</span></a>
                    <a id="employeesList" class="nav-link active" onclick="navOnClick(this.id)" href="#"><img
                            class="img img-profile border-0 img-thumbnail"
                            style="width: 32px;height: 32px;background-repeat: no-repeat;background-size: contain;padding: 0;padding-top: 0;padding-right: 0;padding-bottom: 0;padding-left: 0;background-color: rgb(99,99,99);"
                            src="${contextPath}/resources/img/icons8-supplier.png">
                        <span>Сотрудники</span></a>
                    <a id="placementsList" class="nav-link active" onclick="navOnClick(this.id)" href="#"><img
                            class="img img-profile border-0 img-thumbnail"
                            style="width: 32px;height: 32px;background-size: contain;background-repeat: no-repeat;padding: 0;padding-top: 0;background-color: rgb(99,99,99);"
                            src="${contextPath}/resources/img/icons8-select-column.png">
                        <span>Места хранения</span></a>
                    <a id="reportsList" class="nav-link active" onclick="navOnClick(this.id)" href="#"><img
                            class="img img-profile border-0 img-thumbnail mw-100"
                            style="width: 32px;height: 32px;background-size: contain;background-repeat: no-repeat;padding: 0;padding-top: 0;background-color: rgb(99,99,99);"
                            src="${contextPath}/resources/img/icons8-increase.png">
                        <span>Отчеты</span></a>
                    <a id="settingsList" class="nav-link active" onclick="navOnClick(this.id)" href="#"><img
                            class="img img-profile border-0 img-thumbnail mw-100"
                            style="width: 32px;height: 32px;background-size: contain;background-repeat: no-repeat;padding: 0;padding-top: 0;background-color: rgb(99,99,99);"
                            src="${contextPath}/resources/img/icons8-administrative-tools.png">
                        <span>Настройки</span></a>
                </li>
            </ul>
            <div class="text-center d-none d-md-inline">
                <button class="btn rounded-circle border-0"
                        id="sidebarToggle" type="button"></button>
            </div>
        </div>
    </nav>
    <div class="d-flex flex-column" id="content-wrapper" style="background-color: rgb(77,77,77); overflow: hidden;">
        <div id="content">
            <nav class="navbar navbar-light navbar-expand shadow  topbar static-top mycard-s my-2">
                <div class="container-fluid">
                    <button class="btn btn-link bg-white d-md-none rounded-circle mr-3"
                            id="sidebarToggleTop" type="button"><i class="fas fa-bars bg-white"
                                                                   style="background-color: #ffffff;"></i></button>
                    <form
                            class="form-inline d-none d-sm-inline-block mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
                        <div class="input-group"><input class="bg-light form-control border-0 small" type="text">
                            <div class="input-group-append">
                                <button class="btn btn-primary py-0" type="button"><i
                                        class="fas fa-search"></i></button>
                            </div>
                        </div>
                    </form>
                    <ul class="nav navbar-nav flex-nowrap ml-auto">
                        <li class="nav-item dropdown d-sm-none no-arrow"><a class="dropdown-toggle nav-link"
                                                                            data-toggle="dropdown" aria-expanded="false"
                                                                            href="#"><i
                                class="fas fa-search"></i></a>
                            <div class="dropdown-menu dropdown-menu-right p-3 animated--grow-in" role="menu"
                                 aria-labelledby="searchDropdown">
                                <form class="form-inline mr-auto navbar-search w-100">
                                    <div class="input-group"><input class="bg-light form-control border-0 small"
                                                                    type="text" placeholder="Search for ...">
                                        <div class="input-group-append">
                                            <button class="btn btn-primary py-0"
                                                    type="button"><i class="fas fa-search"></i></button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </li>
                        <li class="nav-item dropdown no-arrow mx-1" role="presentation">
                            <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link"
                                                                       data-toggle="dropdown" aria-expanded="false"
                                                                       href="#"><span
                                    class="badge badge-danger badge-counter">3+</span><i
                                    class="fas fa-bell fa-fw"></i></a>
                                <div class="dropdown-menu dropdown-menu-right dropdown-list dropdown-menu-right animated--grow-in"
                                     role="menu">
                                    <h6 class="dropdown-header">alerts center</h6>
                                    <a class="d-flex align-items-center dropdown-item" href="#">
                                        <div class="mr-3">
                                            <div class="bg-primary icon-circle"><i
                                                    class="fas fa-file-alt text-white"></i></div>
                                        </div>
                                        <div><span class="small text-gray-500">December 12, 2019</span>
                                            <p>A new monthly report is ready to download!</p>
                                        </div>
                                    </a>
                                    <a class="d-flex align-items-center dropdown-item" href="#">
                                        <div class="mr-3">
                                            <div class="bg-success icon-circle"><i
                                                    class="fas fa-donate text-white"></i></div>
                                        </div>
                                        <div><span class="small text-gray-500">December 7, 2019</span>
                                            <p>$290.29 has been deposited into your account!</p>
                                        </div>
                                    </a>
                                    <a class="d-flex align-items-center dropdown-item" href="#">
                                        <div class="mr-3">
                                            <div class="bg-warning icon-circle"><i
                                                    class="fas fa-exclamation-triangle text-white"></i></div>
                                        </div>
                                        <div><span class="small text-gray-500">December 2, 2019</span>
                                            <p>Spending Alert: We've noticed unusually high spending for your
                                                account.</p>
                                        </div>
                                    </a><a class="text-center dropdown-item small text-gray-500" href="#">Show All
                                    Alerts</a>
                                </div>
                            </div>
                        </li>
                        <li class="nav-item dropdown no-arrow mx-1" role="presentation">
                            <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link"
                                                                       data-toggle="dropdown" aria-expanded="false"
                                                                       href="#"><i
                                    class="fas fa-envelope fa-fw"></i><span
                                    class="badge badge-danger badge-counter">7</span></a>
                                <div class="dropdown-menu dropdown-menu-right dropdown-list dropdown-menu-right animated--grow-in"
                                     role="menu">
                                    <h6 class="dropdown-header">alerts center</h6>
                                    <a class="d-flex align-items-center dropdown-item" href="#">
                                        <div class="dropdown-list-image mr-3"><img class="rounded-circle"
                                                                                   src="${contextPath}/resources/img/avatars/avatar4.jpeg">
                                            <div class="bg-success status-indicator"></div>
                                        </div>
                                        <div class="font-weight-bold">
                                            <div class="text-truncate"><span>Hi there! I am wondering if you can
                                                        help me with a problem I've been having.</span></div>
                                            <p class="small text-gray-500 mb-0">Emily Fowler - 58m</p>
                                        </div>
                                    </a>
                                    <a class="d-flex align-items-center dropdown-item" href="#">
                                        <div class="dropdown-list-image mr-3"><img class="rounded-circle"
                                                                                   src="${contextPath}/resources/img/avatars/avatar2.jpeg">
                                            <div class="status-indicator"></div>
                                        </div>
                                        <div class="font-weight-bold">
                                            <div class="text-truncate"><span>I have the photos that you ordered last
                                                        month!</span></div>
                                            <p class="small text-gray-500 mb-0">Jae Chun - 1d</p>
                                        </div>
                                    </a>
                                    <a class="d-flex align-items-center dropdown-item" href="#">
                                        <div class="dropdown-list-image mr-3"><img class="rounded-circle"
                                                                                   src="${contextPath}/resources/img/avatars/avatar3.jpeg">
                                            <div class="bg-warning status-indicator"></div>
                                        </div>
                                        <div class="font-weight-bold">
                                            <div class="text-truncate"><span>Last month's report looks great, I am
                                                        very happy with the progress so far, keep up the good
                                                        work!</span></div>
                                            <p class="small text-gray-500 mb-0">Morgan Alvarez - 2d</p>
                                        </div>
                                    </a>
                                    <a class="d-flex align-items-center dropdown-item" href="#">
                                        <div class="dropdown-list-image mr-3"><img class="rounded-circle"
                                                                                   src="${contextPath}/resources/img/avatars/avatar5.jpeg">
                                            <div class="bg-success status-indicator"></div>
                                        </div>
                                        <div class="font-weight-bold">
                                            <div class="text-truncate"><span>Am I a good boy? The reason I ask is
                                                        because someone told me that people say this to all dogs, even
                                                        if they aren't good...</span></div>
                                            <p class="small text-gray-500 mb-0">Chicken the Dog · 2w</p>
                                        </div>
                                    </a><a class="text-center dropdown-item small text-gray-500" href="#">Show All
                                    Alerts</a>
                                </div>
                            </div>
                            <div class="shadow dropdown-list dropdown-menu dropdown-menu-right"
                                 aria-labelledby="alertsDropdown"></div>
                        </li>
                        <div class="d-none d-sm-block topbar-divider"></div>
                        <li class="nav-item dropdown no-arrow" role="presentation">
                            <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link"
                                                                       data-toggle="dropdown" aria-expanded="false"
                                                                       href="#"><span
                                    class="d-none d-lg-inline mr-2 text-gray-600 small">Беседовська Тетяна
                                            Олександрівна</span><img class="border rounded-circle img-profile"
                                                                     src="${contextPath}/resources/img/avatars/avatar1.jpg"></a>
                                <div class="dropdown-menu shadow dropdown-menu-right animated--grow-in" role="menu">
                                    <a class="dropdown-item" role="presentation" href="#"><i
                                            class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Profile</a><a
                                        class="dropdown-item" role="presentation" href="#"><i
                                        class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Settings</a>
                                    <a class="dropdown-item" role="presentation" href="#"><i
                                            class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Activity
                                        log</a>
                                    <div class="dropdown-divider"></div>
                                    <a class="dropdown-item" role="presentation"
                                       href="${contextPath}/logout"><i
                                            class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Logout</a>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
            </nav>

            <!-- Тут будет iframe -->

            <iframe id="contentPage" class="iframe_child" width="100%" onchange="setLastActivePage(this.src);"
                    height="100%"
                    frameborder="0" scrollin="no" style="border:none;overflow:hidden;"></iframe>

        </div>
        <footer class="sticky-footer" style="color: #4d4d4d;">
            <div class="container my-auto">
                <div class="text-center my-auto copyright" style="color: rgb(99,99,99);">
                    <span>Copyright © kaudeveloper</span></div>
            </div>
        </footer>
    </div>
</div>
<script src="${contextPath}/resources/js/custom.js"></script>
<script src="${contextPath}/resources/js/jquery.min.js"></script>
<script src="${contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
<script src="${contextPath}/resources/js/bs-init.js"></script>
<script src="${contextPath}/resources/js/jquery.easing.js"></script>
<script src="${contextPath}/resources/js/theme.js"></script>
<script>
    function navOnClick(id) {

        document.getElementById("linkList").childNodes.forEach(function (item) {
            if (item !== null && item !== undefined) {
                if (item.style !== null && item.style !== undefined) {
                    item.style.color = 'white';
                }
            }
        });

        document.getElementById(id).style.color = 'yellow';
        document.getElementById("contentPage").src = '${contextPath}/' + id + ".jsp";
         setLastActivePage(document.getElementById("contentPage").src);
    }



    onLoadIndexPageSteNavState();



</script>

</body>

</html>