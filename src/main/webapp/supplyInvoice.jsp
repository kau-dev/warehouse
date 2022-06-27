<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html id="tasklist" style="overflow:scroll;">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
  <title>Поступление на склад</title>
    <link rel="stylesheet" href="${contextPath}/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/custom.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/Navigation-with-Button.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/Navigation-with-Button.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/fontawesome-all.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/fonts/fontawesome5-overrides.min.css">
</head>

<body style="background-color: rgb(77,77,77);">
  <div class="flex-column" id="content-wrapper" style="background-color: rgb(77,77,77);">
    <div id="content" style="color: rgb(77,77,77);">
      <div class="card mycard-s">
        <div class="card-body d-inline">
          <h3 class="dark-white">
            Поступление на склад № 53423 от 11.11.2002
            </h3>
            <div class="col d-flex flex-column flex-shrink-1 flex-fill" style="margin-left: -30px;margin-right: -30px;">
              <div class="row flex-column flex-sm-column flex-md-column flex-lg-column"
                style="min-height: 300px;background-color: rgb(99,99,99);">
                <div class="col" style="color: rgb(95,95,95);">
                  <div
                    class="row d-flex flex-column mt-auto flex-sm-column flex-md-column flex-lg-column flex-xl-column">
                    <div class="col">
                      <div class="row d-flex flex-column flex-xl-row">
                        <div class="col" style="max-width:200px;">
                          <div class="input-group text-break inputText" id="fio">
                            <div class="input-group-prepend text-monospace d-flex input-group-addon"><span
                                class="input-group-text d-none d-lg-block">id</span></div>
                            <input class="form-control flex-fill rounded-right rounded-left" type="text"
                              data-toggle="tooltip" data-bs-tooltip="" value="123324"
                              style="min-width:100px; margin-left: -4px;" title="id">
                          </div>
                        </div>
                        <div class="col" style="max-width:200px;">
                          <div class="input-group text-break inputText" id="birthday">
                            <div class="input-group-prepend text-monospace input-group-addon"><span
                                class="input-group-text d-none d-lg-block">Номер</span></div>
                            <input class="form-control rounded-right rounded-left" type="text" data-bs-tooltip=""
                              style="margin-left: -4px;" title="Номер" value="53423">
                            <div class="input-group-append"></div>
                            <!--														<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal"></button>      -->
                          </div>
                        </div>
                        <div class="col col-xs" style="max-width: 280px;">
                          <div class="input-group text-break inputText" id="birthdaydate">
                            <div class="input-group-prepend text-monospace input-group-addon"><span
                                class="input-group-text d-none d-lg-block">Создан</span></div>
                            <input class="form-control rounded-right rounded-left" type="date" data-toggle="tooltip"
                              id="passport_date" autocomplete="off" style="min-width: 140px;margin-left: -4px;"
                              title="Создан" value="2002-11-11">
                            <div class="input-group-append"></div>
                          </div>
                        </div>
                        <div class="col col-xs" style="max-width: 700px;">
                          <div class="input-group text-break inputText" id="birthday">
                            <div class="input-group-prepend text-monospace input-group-addon"><span
                                class="input-group-text d-none d-lg-block">Номер документа поставщика</span></div>
                            <input class="form-control rounded-right rounded-left" type="text" data-bs-tooltip=""
                              style="margin-left: -4px; max-width: 150px" title="Номер документа поставщика"
                              value="53423">
                            <div class=" text-monospace input-group-addon" style="margin-left: 10px "><span
                                class="input-group-text d-none d-lg-block">от</span></div>
                            <input class="form-control rounded-right rounded-left" type="date" data-toggle="tooltip"
                              id="passport_date" autocomplete="off" style="min-width: 150px; max-width: 200px;margin-left: -4px;"
                              title="Создан" value="2002-11-11">
                          </div>
                        </div>
                        <div class="col" style="max-width: 320px">
                          <div class="input-group text-break inputText" id="social_num">
                            <div class="input-group-prepend text-monospace input-group-addon"><span
                                class="input-group-text d-none d-lg-block">id внешней БД</span></div>
                            <input class="form-control rounded-right rounded-left" type="number" data-toggle="tooltip"
                              data-bs-tooltip="" value="56465463322" inputmode="numeric" autocomplete="off"
                              style="margin-left: -4px;" title="Номер соц. страхования">
                            <div class="input-group-append"></div>
                          </div>
                        </div>
                      </div>
                      <div class="row flex-column flex-sm-column flex-md-column flex-lg-column flex-xl-row">
                        <div class="col flex-column flex-sm-column flex-md-column flex-lg-column flex-xl-column">
                          <div class="input-group text-break inputText" id="position">
                            <div class="input-group-prepend text-monospace input-group-addon"><span
                                class="input-group-text d-none d-lg-block">Контрагент</span></div>
                            <input class="form-control flex-fill rounded-right rounded-left" type="text"
                              data-toggle="tooltip" data-bs-tooltip="" value="ТОВ КИИВСЬКИЙ ВЕНТИЛЯЦИЙНИЙ ЗАВОД"
                              style="margin-left: -4px;" title="Контрагент">
                            <div class="input-group-append">
                              <!--														<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal"></button>-->
                            </div>
                          </div>
                        </div>
                        <div class="col" style="max-width: 500px">
                          <div class="input-group text-break inputText" id="office">
                            <div class="input-group-prepend text-monospace input-group-addon"><span
                                class="input-group-text d-none d-lg-block">Артикул документа</span></div>
                            <input class="form-control rounded-right rounded-left" type="text" data-toggle="tooltip"
                              data-bs-tooltip="" style="margin-left: -4px;" value="DNPR-SUP-032453322" title="Артикул">
                            <div class="input-group-append">
                            </div>
                          </div>
                        </div>
                      </div>
                      <div
                        class="row d-flex flex-column flex-grow-1 flex-shrink-1 flex-fill justify-content-start align-items-start align-content-start flex-wrap flex-sm-column flex-md-column flex-lg-column flex-xl-row col-xs">
                        <div class="col col-xs" style="max-width: 470px;">
                          <div class="input-group text-break inputText" id="passport_ser">
                            <div class="input-group-prepend text-monospace input-group-addon"><span
                                class="input-group-text d-none d-lg-block">Склад</span></div>
                            <input class="form-control rounded-right rounded-left" type="text" data-toggle="tooltip"
                              data-bs-tooltip="" value="Основной" autocomplete="off" maxlength="12" minlength="2"
                              style="margin-left: -4px;min-width: 88px;" title="Склад">
                            <div class="input-group-append">
                              <button class="btn btn-primary fa fa-times d-none d-lg-block" type="icon"
                                style="background-color: rgb(77,77,77);"></button>
                            </div>
                          </div>
                        </div>
                        <div class="col col-sm" style="max-width: 294px;">
                          <div class="input-group text-break inputText" id="passport_num">
                            <div class="input-group-prepend text-monospace input-group-addon"><span
                                class="input-group-text d-none d-lg-block">Статус</span></div>
                            <input class="form-control rounded-right rounded-left" data-toggle="tooltip"
                              data-bs-tooltip="" style="margin-left: -4px;" value="Оформление" title="Статус">
                          </div>
                        </div>
                      </div>
                      <div class="container-fluid" style="margin-top: 20px">
                        <ul id="clothingnav1" class="nav nav-tabs" role="tablist">
                          <li class="nav-item"> <a class="nav-link active" href="#home1" id="hometab1" role="tab"
                              data-toggle="tab" aria-controls="home" aria-expanded="true">Товары</a> </li>
                          <li class="nav-item"> <a class="nav-link" href="#paneTwo1" role="tab" id="hatstab1"
                              data-toggle="tab" aria-controls="hats">Дополнительно</a> </li>
                          <!-- Dropdown -->
                          <!--
                      <li class="nav-item dropdown"> <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Печать </a>
                        <div class="dropdown-menu"> <a class="dropdown-item" href="#tabDropDownOne1" role="tab" id="dropdownshoestab1" data-toggle="tab" aria-controls="dropdownShoes">Dropdown Link 1</a> <a class="dropdown-item" href="#tabDropDownTwo1" role="tab" id="dropdownbootstab1" data-toggle="tab" aria-controls="dropdownBoots">Dropdown Link 2</a> </div>
                      </li>
-->
                        </ul>
                        <!-- Content Panel -->
                        <div id="clothingnavcontent1" class="tab-content">
                          <div role="tabpanel" class="tab-pane fade show active mycard" id="home1"
                            aria-labelledby="hometab1">
                            <p>
                            <table class="mytable">
                              <div class="row" style="padding-left:15px; padding-bottom: 10px;">
                                <div class="btn-toolbar" role="toolbar">
                                  <div class="btn-group mr-1" role="group">
                                    <button type="button" class="btn btn-secondary">Добавить</button>
                                  </div>
                                  <div class="btn-group mr-2" role="group">
                                    <button type="button" class="btn btn-secondary">Найти</button>
                                  </div>
                                  <div class="btn-group mr-2" role="group">
                                    <button type="button" class="btn btn-secondary">Загрузить из файла</button>
                                  </div>
                                  <div class="btn-group mr-2" role="group">
                                    <button type="button" class="btn btn-secondary">Найти по штрихкоду</button>
                                  </div>
                                </div>
                              </div>
                              <tbody class="mytable">
                                <tr class="mytable">
                                  <th class="mytd" style="width:50px; margin-left:10px;" scope="col">N</th>
                                  <th class="mytd" style="width:75%; margin-left:10px;" scope="col">Наименование</th>
                                  <th class="mytd" style="width:10%; margin-left:10px;" scope="col">Количество</th>
                                  <th class="mytd" style="width:10%; margin-left:10px;" scope="col">Ед.</th>
                                </tr>
                                <tr class="mytable">
                                  <td><label style="width:50px; margin-left:10px;">1</label></td>
                                  <td><input type="text" id="gooditem" list="selectgoods"
                                      style="background-color:rgba(99,99,99,1.00);border: 0px; width: 100%; color: white;">
                                  </td>
                                  <td><input type="number" min="0" max="999999999" id="qtyitem"
                                      style="background-color:rgba(99,99,99,1.00);border: 0px; width: 100%; color: white;">
                                  </td>
                                  <td><input type="text" id="typeitem"
                                      style="background-color:rgba(99,99,99,1.00);border: 0px; width: 100%; color: white;">
                                  </td>
                                </tr>
                                <tr class="mytable">
                                  <td><label style="width:50px; margin-left:10px;">Итого</label></td>
                                  <td>&nbsp;</td>
                                  <td>&nbsp;</td>
                                  <td>&nbsp;</td>
                                </tr>
                              </tbody>                                
                            </table>
                                    <datalist id="selectgoods">
                                    </datalist>
                            </p>
                          </div>
                          <div role="tabpanel" class="tab-pane fade" id="paneTwo1" aria-labelledby="hatstab1">
                            <p>Content 2</p>
                          </div>
                          <div role="tabpanel" class="tab-pane fade" id="tabDropDownOne1"
                            aria-labelledby="dropdownshoestab1">
                            <p>Dropdown content#1</p>
                          </div>
                          <div role="tabpanel" class="tab-pane fade" id="tabDropDownTwo1"
                            aria-labelledby="dropdownbootstab1">
                            <p>Dropdown content#2</p>
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
        <iframe src="goodsList.html" class="parent"></iframe>
      </div>
    </div>
  </div>
</div>
<script>
       reloadMyData(this.value,'selectgoods','/api/good/get-all');
    </script>
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

</html>