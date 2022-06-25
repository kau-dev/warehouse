<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=utf-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%@ page session="false" %>
<!doctype html>

<head>
    <meta charset="utf8">
    <script src="${contextPath}/resources/js/jquery.min.js"></script>
  

    <title>Adding options to a select element using jQuery?</title>
</head>

<body>
    <h1 style="color: green">GeeksForGeeks</h1>
    <b>Adding options to a select element using jQuery?</b>
    <p>
        Select one from the given options:

        <datalist id="select1">
            <!--<select> -->
            <option value="free">Free</option>
            <option value="basic">Basic</option>
        </datalist>
        <!--</select> -->
        <input list="select1" id="select1-choice" name="select1-choice" />
    </p>
    <p>Click the button below to add one option to the select box.</p>
    <button onclick="reloadMyData(this.value,'select1','/api/good/get-all')">Add option</button>

    <script>
        reloadMyData(this.value,'select1','/api/good/get-all');

        function reloadMyData(var_,idListName,url) {
            $.getJSON(url, function (result) {
                $("#"+ idListName).empty();
                $.each(result, function (i, field) {
                    $("#"+ idListName).append(new Option(field.name, field.id));
                });
            });
        }


    </script>
</body>

</html>
