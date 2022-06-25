function getParamValue(paramName) {
    var url = window.location.search.substring(1); //get rid of "?" in querystring
    var qArray = url.split('&'); //get key-value pairs
    for (var i = 0; i < qArray.length; i++) {
        var pArr = qArray[i].split('='); //split key and value
        if (pArr[0] == paramName)
            return pArr[1]; //return value
    }
}

$(document).ready(function () {
    $('[data-bs-tooltip]').tooltip();
});





function reloadMyData(var_, idListName, url) {
    $.getJSON(url, function (result) {
        $("#" + idListName).empty();
        $.each(result, function (i, field) {
            $("#" + idListName).append(new Option(field.name, field.id));
        });
    });
}