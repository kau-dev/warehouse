
function getParamValue(paramName) {
    var url = window.location.search.substring(1); //get rid of "?" in querystring
    var qArray = url.split('&'); //get key-value pairs
    for (var i = 0; i < qArray.length; i++) {
        var pArr = qArray[i].split('='); //split key and value
        if (pArr[0] == paramName)
            return pArr[1]; //return value
    }
}






function reloadMyData(var_, idListName, url) {
    $.getJSON(url, function (result) {
        $("#" + idListName).empty();
        $.each(result, function (i, field) {
            var option = document.createElement("option");
            option.value = '('+field.id+') '+ field.name;
            option.setAttribute('data-id', field.id);

            $("#" + idListName).append(option);
        });
    });
}

function getLastActivePage(id_scr=''){
    var page =getCookie('lastActivePage');
    console.log( 'id='+id_scr);
    console.log( 'lastActivePage='+page);
    if(page=="")
    {
        console.log("/tasksList.jsp");
        return "/tasksList.jsp";
    }

    if(id_scr!=null | id_scr!=''){
        document.getElementById(id_scr).src=page;
    }
    console.log( document.getElementById(id_scr).src);
    return page;
}

function setLastActivePage(page){
    setCookie('lastActivePage', page,30);
    console.log('contentDocument='+ document.getElementById('contentPage').contentDocument);
}

function setCookie(cname,cvalue,exdays) {
    const d = new Date();
    d.setTime(d.getTime() + (exdays*24*60*60*1000));
    let expires = "expires=" + d.toUTCString();
    document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
}

function getCookie(cname) {
    let name = cname + "=";
    let decodedCookie = decodeURIComponent(document.cookie);
    let ca = decodedCookie.split(';');
    for(let i = 0; i < ca.length; i++) {
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

function minNavState(){
    $("body").toggleClass("sidebar-toggled",true);
    $(".sidebar").toggleClass("toggled",true);
}
function maxNavState(){
    $("body").toggleClass("sidebar-toggled",false);
    $(".sidebar").toggleClass("toggled",false);
}

function getNavState(){
    var state =getCookie('NavState');
    if(state==null | state=="")
    {
        return true;
    }
    return state;
}

function setNavState(){
    var state = true;
  if  ($("body").hasClass("sidebar-toggled")){
      state = false;
  }
    setCookie('NavState', state,30);
}

function onLoadIndexPageSteNavState(){

    if (getNavState()=="true" ){
        if ($( window ).height()<$( window ).width()){
            maxNavState();
        }else{
            minNavState();
        }
    } else{
        minNavState();
    }
}