function loadMap(){
    var map = null;
    var lat = $("#lat").html();
    var lng = $("#lng").html();

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
    map = new google.maps.Map(document.getElementById("map"), myOptions);
    setMarkers(map, lat, lng);
}

function setMarkers(map, lat,lng) {
    var myLatLng = new google.maps.LatLng(lat, lng);
    var marker = new google.maps.Marker({
        position: myLatLng,
        map: map,
        icon:'https://raw.githubusercontent.com/Concept211/Google-Maps-Markers/master/images/marker_red.png',
        title: "香港酒店",
    });
    showinfomessage(marker,map);
}
var prev_infowindow =false;
function showinfomessage(marker, map)
{
    var html = $("#address_text").html();
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


