<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=utf-8" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
  <head>
      <meta charset="utf-8">
      <title>Войти под своей учетной записью</title>
      <link rel="stylesheet" href="${contextPath}/resources/bootstrap/css/bootstrap.min.css">
          <link rel="stylesheet" href="${contextPath}/resources/css/custom.css">
  </head>

  <body>
  <div class="card mycard-s  align-items-center">
    <div class="mycard row">
      <form method="POST" action="${contextPath}/login" class="form-signin">
        <h2 class="form-heading">Вход</h2>

        <div class="form-group ${error != null ? 'has-error' : ''}">
            <span>${message}</span>
            <input name="username" type="text" class="form-control" placeholder="Username"
                   autofocus="true"/>
            <input name="password" type="password" class="form-control" placeholder="Password"/>
            <span>${error}</span>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

            <button class="btn btn-lg btn-primary btn-block" type="submit">Войти</button>
            <button class="btn btn-lg btn-primary btn-block"><a href="${contextPath}/registration">Создать учетную запись</a></button>
        </div>
      </form>
    </div>
  </div>
    <script src="${contextPath}/resources/js/jquery.min.js"></script>
    <script src="${contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
  </body>
</html>
