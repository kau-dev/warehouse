function getParamValue(paramName) {
    var url = window.location.search.substring(1); //get rid of "?" in querystring
    var qArray = url.split('&'); //get key-value pairs
    for (var i = 0; i < qArray.length; i++) {
        var pArr = qArray[i].split('='); //split key and value
        if (pArr[0] == paramName)
            return pArr[1]; //return value
    }
}
function navOnClick(id,url) {

    document.getElementById("linkList").childNodes.forEach(function (item)
    //$("#linkList").childNodes.forEach(function (item)
    {
        if (item !== null && item !== undefined) {
            if (item.style !== null && item.style !== undefined) {
                item.style.color = 'white';
            }
        }
    });
    if (id.length>1) {
        document.getElementById(id).style.color = 'yellow';
    }
    $("#contentPage").load(url);
    setLastActivePage(url);
}

function reloadMyData(var_, idListName, url) {

    if (var_ == true | var_ == false) {
        $.post(url, dataToBeSent, function (i, field) {
            $("#" + idListName).empty();
            $.each(result, function (i, field) {
                var option = document.createElement("option");
                option.value = '(' + field.id + ') ' + field.name;
                option.setAttribute('data-id', field.id);

                $("#" + idListName).append(option);
            });
        }, "json");
    } else {
        $.getJSON(url, function (result) {
            $("#" + idListName).empty();
            $.each(result, function (i, field) {
                var option = document.createElement("option");
                option.value = '(' + field.id + ') ' + field.name;
                option.setAttribute('data-id', field.id);

                $("#" + idListName).append(option);
            });
        });
    }

}

function getLastActivePage(id_scr = '') {
    var page = getCookie('lastActivePage');
    if (page == "") {
        return "/tasksList.jsp";
    }
    if (id_scr != null | id_scr != '') {
        $("#contentPage").load(page);
    }
    return page;
}

function onLoadIndexPageSteNavState() {
    if (getNavState() == 'true') {
        maxNavState();
    } else {
        minNavState();
    }
}

function setLastActivePage(page) {
    setCookie('lastActivePage', page, 30);
    //console.log('contentDocument=' + document.getElementById('contentPage').contentDocument);
}

function setCookie(cname, cvalue, exdays) {
    const d = new Date();
    d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
    let expires = "expires=" + d.toUTCString();
    document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
}

function getCookie(cname) {
    let name = cname + "=";
    let decodedCookie = decodeURIComponent(document.cookie);
    let ca = decodedCookie.split(';');
    for (let i = 0; i < ca.length; i++) {
        let c = ca[i];
        while (c.charAt(0) == ' ') {
            c = c.substring(1);
        }
        if (c.indexOf(name) == 0) {
            return c.substring(name.length, c.length);
        }
    }
    return "";
}

function minNavState() {
    $("body").toggleClass("sidebar-toggled", true);
    $(".sidebar").toggleClass("toggled", true);
}

function maxNavState() {
    $("body").toggleClass("sidebar-toggled", false);
    $(".sidebar").toggleClass("toggled", false);
}

function getNavState() {
    var state = getCookie('NavState');
    if (state == null | state == "") {
        return true;
    }
    return state;
}

function setNavState() {
    var state = true;
    if ($("body").hasClass("sidebar-toggled")) {
        state = false;
    }
    setCookie('NavState', state, 30);
}


function myComboBoxAction(idInputText, idDropDown,idListName,url) {
// $(document).ready(function() {
    // On KeyUp...
    $("#" + idInputText).on("keyup", function () {
        // No results have been found yet
        let result_found = false;

        // All values typed in to lower case...
        var search_string = $(this).val().toLowerCase();
        reloadComboBoxData(idListName, url+"&name="+$(this).val()+"&pageSize=50");
        $("#" + idDropDown + " a").filter(function () {
            // Hide if it does not match
            $(this).toggle($(this).text().toLowerCase().indexOf(search_string) > -1);

            if ($(this).text().toLowerCase().indexOf(search_string) > -1) {
                // Results found
                //$("#no_search_results").hide();

                result_found = true;
            }

            // No results found
            if (!result_found) {
                //$("#no_search_results").show();
            }
        });
    });
// });
}

function reloadComboBoxData(idListName, url) {
    $.getJSON(url, function (result) {
        $("#" + idListName).empty();
        $.each(result, function (i, field) {
            var a = document.createElement("a");
            a.value = '(' + field.id + ') ' + field.name;
            a.setAttribute("id", idListName + "_item" + i);
            a.setAttribute('data-item-id', field.id);
            a.setAttribute("class", "dropdown-item searchable")
            a.setAttribute("href", "#");
            a.setAttribute('onclick', "setComboBox_SelectValue('dropDownTextSpan',this.id)");

            a.innerHTML = "(" + field.id + ") " + field.name;
            $("#" + idListName).append(a);
        });
    });
}

function setComboBox_SelectValue(idListName, idValue) {
    var selectedVal = $("#" + idValue);
    var sel_Cont = $("#" + idListName);
    sel_Cont.attr('data-item-id', selectedVal.attr('data-item-id'));
    sel_Cont.empty();
    sel_Cont.append(selectedVal[0].outerText);
}

