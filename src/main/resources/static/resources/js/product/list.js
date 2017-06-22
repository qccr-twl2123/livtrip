$(function () {
    $("[data-toggle='popover']").popover({
        trigger:'manual',}).on("mouseenter", function () {
        var _this = this;
        $(this).popover("show");
        $(this).siblings(".popover").on("mouseleave", function () {
            $(_this).popover('hide');
        });
    }).on("mouseleave", function () {
        var _this = this;
        setTimeout(function () {
            if (!$(".popover:hover").length) {
                $(_this).popover("hide")
            }
        }, 100);
    });
});


var mapView = null;
var prev_infowindow =false;
function initizePittingMap(){
    var pids = $("#pids").html();
    var pidsArray = pids.split(",");
    mapView = document.getElementById("list_map");
    var lat = $("#" +pidsArray[0] + "_latitude").html();
    var lng = $("#" + pidsArray[0] + "_longitude").html();
    var myLatlng = new google.maps.LatLng(lat,lng);
    var myOptions = {
        zoom: 10,
        center: myLatlng,
        mapTypeId: google.maps.MapTypeId.ROADMAP,
        scaleControl : false,
        mapTypeControl : false,
        zoomControlOptions: {
            style: google.maps.ZoomControlStyle.BIG,
            position: google.maps.ControlPosition.LEFT_TOP
        }
    }
    map = new google.maps.Map(mapView, myOptions);
    setMarkers(map, pidsArray);
}

function setMarkers(map, pidsArray) {
    var shape = {
        coords: [1, 1, 1, 20, 18, 20, 18 , 1],
        type: 'poly'
    };
    for(var i=1; i<pidsArray.length; i++){
        var lat = $("#" +pidsArray[i-1] + "_latitude").html();
        var lng = $("#" + pidsArray[i-1] + "_longitude").html();
        var myLatLng = new google.maps.LatLng(lat, lng);
        var marker = new google.maps.Marker({
            position: myLatLng,
            map: map,
            icon:'https://raw.githubusercontent.com/Concept211/Google-Maps-Markers/master/images/marker_red'+(i)+'.png',
            shape: shape,
        });
        showinfomessage(marker, pidsArray[i-1]);
    }

}

function showinfomessage(marker,pid)
{
    var html = $("#" + pid + "_map_view").html();
    var infowindow = new google.maps.InfoWindow({
        content:html
    });
    google.maps.event.addListener(marker, 'click', function(event) {
        if(prev_infowindow){
            prev_infowindow.close();
        }
        prev_infowindow = infowindow;
        infowindow.open(map,marker);
    });

}


function showOrHideMap(){
    $("#map_container").toggle();
}

