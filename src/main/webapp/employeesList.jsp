<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html id="tasklist" style="overflow:scroll;">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Сотрудники</title>
    <link rel="stylesheet" href="${contextPath}/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/custom.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/Navigation-with-Button.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/Navigation-with-Button.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/fontawesome-all.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/fontawesome5-overrides.min.css">
</head>

<body id="tasklist1" style="background-color: rgb(77,77,77);">
    <div class="container-fluid  card mycard-s">

        <div class="d-flex flex-column " id="content-wrapper">
            <div id="content">
                <div class="container-fluid myCardContainer">
                    <div class="" style="background-color: rgb(99,99,99);">
                        <div class="card-header py-3 " style="background-color: rgb(99,99,99);">
                            <p class="m-0 font-weight-bold" style="font-size: 24px;color: #e1be08;">Сотрудники</p>
                        </div>
                        <div class="card-body">
                            <div class="row ">
                                <div class="col mycard-s">
                                    <div class="btn-toolbar d-flex flex-shrink-1 flex-fill">
                                        <div class="btn-group d-inline-flex flex-column flex-grow-1 flex-fill justify-content-start flex-wrap flex-sm-column flex-md-column flex-lg-row flex-xl-row btn-group-sm"
                                            role="group"><button class="btn btn-primary border rounded border-dark"
                                                type="button"
                                                style="background-color: rgb(99,99,99);">Добавить</button><button
                                                class="btn btn-primary border rounded border-dark" type="button"
                                                style="background-color: rgb(99,99,99);margin-left: 4px;">Найти по
                                                штрих-коду</button>
                                            <button class="btn btn-primary border rounded border-dark" type="button"
                                                style="background-color: rgb(99,99,99);margin-left: 4px;">Установить
                                                отбор</button><button class="btn btn-primary border rounded border-dark"
                                                type="button"
                                                style="background-color: rgb(99,99,99);margin-left: 4px;">Очистить
                                                отбор</button><button class="btn btn-primary border rounded border-dark"
                                                type="button"
                                                style="background-color: rgb(99,99,99);margin-left: 4px;">Настроить
                                                список</button>
                                        </div>
                                    </div>
                                </div>
                                <div class="col d-xl-flex justify-content-xl-start align-items-xl-center mycard-s btn-group-sm"
                                    style="margin-bottom: 10px;">
                                    <div
                                        class="btn-toolbar d-inline-flex flex-column flex-grow-1 flex-shrink-1 flex-fill justify-content-start flex-wrap">
                                        <div class="btn-group d-flex d-xl-flex flex-column flex-shrink-1 flex-fill justify-content-start flex-sm-column flex-md-column flex-lg-row flex-xl-row justify-content-xl-center btn-group-sm"
                                            role="group"><button
                                                class="btn btn-primary border rounded border-dark fa fa-times"
                                                type="icon"
                                                style="background-color: rgb(99,99,99);">&nbsp;<br>&gt;2000.01.01<br></button><button
                                                class="btn btn-primary border rounded border-dark fa fa-times"
                                                type="icon"
                                                style="background-color: rgb(99,99,99);margin-left: 4px;">&nbsp;<br>&gt;20<br></button>
                                        </div>
                                    </div><i class="fa fa-times"></i>
                                </div>
                            </div>
                            <div class="table-responsive text-monospace text-white d-flex flex-column flex-grow-1 table-sm"
                                id="dataTable" role="grid" aria-describedby="dataTable_info">
                                <table class="table dataTable my-0" id="dataTable">
                                    <thead>
                                        <tr class="table td">
                                            <th>ФИО<i class="fa fa-sort-alpha-asc startdate_sort"
                                                    style="margin-left: 10px;"></i></th>
                                            <th>Должность<i class="fa fa-sort-alpha-asc startdate_sort"
                                                    style="margin-left: 10px;"></i></th>
                                            <th class="td">Подразделение (склад)<i
                                                    class="fa fa-sort-alpha-asc startdate_sort"
                                                    style="margin-left: 10px;"></i></th>
                                            <th class="td" style="margin-left: 10px;" href="">Возраст<i
                                                    class="fa fa-sort-alpha-asc startdate_sort"
                                                    style="margin-left: 10px;"></i></th>
                                            <th caption="Airi Satou">Принят на работу<i
                                                    class="fa fa-sort-alpha-asc startdate_sort"
                                                    style="margin-left: 10px;"></i></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="text-white">
                                            <td>
                                                <a href="${contextPath}/employee.jsp">
                                                    <div caption="Airi Satou" style="color: rgb(255,255,255);"><img
                                                            class="rounded-circle mr-2" width="30" height="30"
                                                            src="${contextPath}/resources/img/avatars/avatar1.jpg"><span>Беседовська
                                                            Тетяна Олександрівна</span></div>
                                                </a>
                                            </td>
                                            <td href="${contextPath}/employee.jsp">Accountant</td>
                                            <td>Tokyo</td>
                                            <td>33</td>
                                            <td>2008/11/28</td>
                                        </tr>
                                        <tr class="text-white">
                                            <td><img class="rounded-circle mr-2" width="30" height="30"
                                                    src="${contextPath}/resources/img/avatars/avatar2.jpeg">Angelica Ramos</td>
                                            <td>Chief Executive Officer(CEO)</td>
                                            <td>London</td>
                                            <td>47</td>
                                            <td>2009/10/09<br></td>
                                        </tr>
                                        <tr class="text-white">
                                            <td><img class="rounded-circle mr-2" width="30" height="30"
                                                    src="${contextPath}/resources/img/avatars/avatar3.jpeg">Ashton Cox</td>
                                            <td>Junior Technical Author</td>
                                            <td>San Francisco</td>
                                            <td>66</td>
                                            <td>2009/01/12<br></td>
                                        </tr>
                                        <tr class="text-white">
                                            <td><img class="rounded-circle mr-2" width="30" height="30"
                                                    src="${contextPath}/resources/img/avatars/avatar4.jpeg">Bradley Greer</td>
                                            <td>Software Engineer</td>
                                            <td>London</td>
                                            <td>41</td>
                                            <td>2012/10/13<br></td>
                                        </tr>
                                        <tr class="text-white">
                                            <td><img class="rounded-circle mr-2" width="30" height="30"
                                                    src="${contextPath}/resources/img/avatars/avatar5.jpeg">Brenden Wagner</td>
                                            <td>Software Engineer</td>
                                            <td>San Francisco</td>
                                            <td>28</td>
                                            <td>2011/06/07<br></td>
                                        </tr>
                                        <tr class="text-white">
                                            <td><img class="rounded-circle mr-2" width="30" height="30"
                                                    src="assets/img/avatars/avatar1.jpeg">Brielle Williamson</td>
                                            <td>Integration Specialist</td>
                                            <td>New York</td>
                                            <td>61</td>
                                            <td>2012/12/02<br></td>
                                        </tr>
                                        <tr class="text-white">
                                            <td><img class="rounded-circle mr-2" width="30" height="30"
                                                    src="${contextPath}/resources/img/avatars/avatar2.jpeg">Bruno Nash<br></td>
                                            <td>Software Engineer</td>
                                            <td>London</td>
                                            <td>38</td>
                                            <td>2011/05/03<br></td>
                                        </tr>
                                        <tr class="text-white">
                                            <td><img class="rounded-circle mr-2" width="30" height="30"
                                                    src="${contextPath}/resources/img/avatars/avatar3.jpeg">Caesar Vance</td>
                                            <td>Pre-Sales Support</td>
                                            <td>New York</td>
                                            <td>21</td>
                                            <td>2011/12/12<br></td>
                                        </tr>
                                        <tr class="text-white">
                                            <td><img class="rounded-circle mr-2" width="30" height="30"
                                                    src="${contextPath}/resources/img/avatars/avatar4.jpeg">Cara Stevens</td>
                                            <td>Sales Assistant</td>
                                            <td>New York</td>
                                            <td>46</td>
                                            <td>2011/12/06<br></td>
                                        </tr>
                                        <tr class="text-white">
                                            <td><img class="rounded-circle mr-2" width="30" height="30"
                                                    src="${contextPath}/resources/img/avatars/avatar5.jpeg">Cedric Kelly</td>
                                            <td>Senior JavaScript Developer</td>
                                            <td>Edinburgh</td>
                                            <td>22</td>
                                            <td>2012/03/29<br></td>
                                        </tr>
                                    </tbody>
                                    <tfoot>
                                        <tr style="color: rgb(205,190,8);">
                                            <td><strong>ФИО</strong></td>
                                            <td><strong>Должность</strong></td>
                                            <td><strong>Подразделение (склад)</strong></td>
                                            <td><strong>Возраст</strong></td>
                                            <td><strong>Принят на работу</strong></td>
                                        </tr>
                                    </tfoot>
                                </table>
                            </div>
                            <div class="row" style="margin-top: 10px;">
                                <div class="col-md-6 text-nowrap">
                                    <div id="dataTable_length" class="dataTables_length" aria-controls="dataTable">
                                        <label style="color: #ffffff;">Показать<select
                                                class="form-control form-control-sm custom-select custom-select-sm"
                                                style="margin-left: 3px;">
                                                <option value="10" selected="">10</option>
                                                <option value="25">25</option>
                                                <option value="50">50</option>
                                                <option value="100">100</option>
                                            </select>&nbsp;</label>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <nav
                                        class="d-lg-flex justify-content-lg-end dataTables_paginate paging_simple_numbers">
                                        <ul class="pagination">
                                            <li class="page-item disabled"><a class="page-link" href="#"
                                                    aria-label="Previous"><span aria-hidden="true">«</span></a></li>
                                            <li class="page-item active"><a class="page-link" href="#">1</a></li>
                                            <li class="page-item"><a class="page-link" href="#">2</a></li>
                                            <li class="page-item"><a class="page-link" href="#">3</a></li>
                                            <li class="page-item"><a class="page-link" href="#" aria-label="Next"><span
                                                        aria-hidden="true">»</span></a></li>
                                        </ul>
                                    </nav>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div></div>
            </div>
            <footer class="sticky-footer" style="color: #4d4d4d;">
                <div class="container my-auto">
                    <div class="text-center my-auto copyright" style="color: rgb(99,99,99);"><span>Copyright ©
                            kaudeveloper</span></div>
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
</body>

</html>