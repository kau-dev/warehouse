<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=utf-8" %>
<%@ page session="false" %>

<html lang="en">
<head>
  <title>good data page</title>


</head>
<body>
<h1>Good Details</h1>

<table class="tg">
  <tr>
    <th width="80">ID</th>
    <th width="120">Title</th>
    <th width="120">Author</th>
    <th width="120">Price</th>
  </tr>
  <tr>
    <td>${good.id}</td>
    <td>${good.name}</td>
    <td>${good.code}</td>
    <td>${good.barcode}</td>
  </tr>
  <c:out value="${good.name}" />
</table>
</body>
</html>