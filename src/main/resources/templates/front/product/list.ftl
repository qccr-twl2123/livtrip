<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>list</title>
    <link rel="stylesheet" href="resources/style/public.css"/>
    <link rel="stylesheet" href="http://g.alicdn.com/sui/sui3/0.0.2/old/css/icons.min.css"/>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="http://g.alicdn.com/sui/sui3/0.0.18/css/sui.min.css">
    <script type="text/javascript" src="http://g.alicdn.com/sj/lib/jquery/dist/jquery.min.js"></script>
    <script type="text/javascript" src="http://g.alicdn.com/sui/sui3/0.0.18/js/sui.min.js"></script>
    <script src='http://maps.google.cn/maps/api/js?key=AIzaSyAjNbgkCbR5VzzBw2VsJagYKBASIJoa2iw' type="text/javascript"></script>
    <script src="resources/js/page.js"></script>
    <script src="resources/js/product/list.js"></script>
    <script>
        (adsbygoogle = window.adsbygoogle || []).push({
            google_ad_client: "ca-pub-3237101361515251",
            enable_page_level_ads: true
        });
    </script>
    <script>
    (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
                (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
            m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
    })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

    ga('create', 'UA-100338539-1', 'auto');
    ga('send', 'pageview');

   </script>
</head>

<body onload="initizePittingMap();">
<#include  "nav.ftl"/>
<#include  "search.ftl"/>

<div class="container">
    <div class="breadcrumb_list">
        ${destinationName} 地区 共 <font color="#FF0000">${page.total}</font> 家酒店  当前 ${page.pageNum}/${page.pages} 页
    </div>
</div>
<div class="container">
    <div class="product_list">
        <div id="pids" style="display:none;">${pids}</div>
        <div style="display:none;">
            <#if page.list??>
                <#list page.list as product>
                    <div id="${product.id}_latitude" style="display: none">${product.latitude}</div>
                    <div id="${product.id}_longitude" style="display: none">${product.longitude}</div>
                    <div id="${product.id}_map_view" style="width:185px;height:80px;text-align:left; display:none">
                    ${product.address}<br>${product.city}<br>${product.state} ${product.country}
                    </div>
                </#list>
            </#if>
        </div>
        <ul>
            <#list page.list as product>
            <li>
                <div class="product_item_left">
                    <img src="${product.thumb!}" />
                </div>
                <div class="product_item_right">
                    <h3 style="font-size: 14px">
                        <img src="https://raw.githubusercontent.com/Concept211/Google-Maps-Markers/master/images/marker_red${product_index + 1}.png"/>
                        &nbsp;${product.name!}
                    </h3>
                    <p style="color:#FB7F49;" >
                        <i class="fa  fa-star"></i>
                        <i class="fa  fa-star"></i>
                        <i class="fa  fa-star"></i>
                        <i class="fa  fa-star-half-full"></i>
                    </p>
                    <p style="margin:0px; font-size:15px;">
                        <i class="fa fa-map-marker"></i>&nbsp;
                        ${product.address!}
                    </p>
                    <div class="hotel_price_area">
                        <p class="lowest_price">
                            每晚低至 <span><i class="fa fa-dollar"></i>
                             ${product.minAvgNightPrice!}</span>
                        </p>
                        <p class="booking_policy">免费取消,即刻确认</p>
                        <p class="user_room_area">
                            <button type="button"
                                    onclick="window.location.href='detail.do?productId=${product.id!}&destination=${destination!}&checkIn=${checkIn!}&checkOut=${checkOut}&peopleNum=${peopleNum!}'" class="btn btn-primary">选择客房>></button>
                        </p>
                    </div>
                </div>
            </li>
            </#list>
        </ul>

        <form id="listForm" action="list.jhtml" method="post" class="sui-form form-horizontal">
            <input type="hidden" name="destinationName" value="${destinationName}"/>
            <input type="hidden" name="destination" value="${destination}"/>
            <input type="hidden" name="checkIn" value="${checkIn}"/>
            <input type="hidden" name="checkOut" value="${checkOut}"/>
            <input type="hidden" name="peopleNum" value="${peopleNum}"/>
                <#include "pagination.ftl"/>
        </form>
    </div>

    <div class="product_map" >
        <div class="panel panel-info" >
            <div class="panel-heading"><i class="fa fa-map-o" style="color: #FF8247;"></i>&nbsp; 地图展示</div>
            <div class="panel-body" id="list_map" style="height: 490px;" >
            </div>
        </div>
        <div class="panel panel-info" style="height: 90px;">
            <div class="panel-heading"><i class="fa fa-money" style="color: #FF8247;"></i>&nbsp; Best Price Guaranteed</div>
            <div class="panel-body">
                Find cheaper? We'll refund twice the difference.
            </div>
        </div>
        <div class="panel panel-info" style="height: 90px;">
            <div class="panel-heading"><i class="fa fa-phone" style="color: #FF8247;"></i>&nbsp; Have any questions?</div>
            <div class="panel-body">
                Please feel free to contact our support 24x7<br/>
                +1 347 897 0100
            </div>
        </div>
        <div class="panel panel-info" style="height: 90px;">
            <div class="panel-heading"><i class="fa fa-hand-o-right" style="color: #FF8247;"></i>&nbsp; Notify me when price drops</div>
            <div class="panel-body">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="your email?" aria-describedby="basic-addon2">
                    <span class="input-group-addon" id="basic-addon2">submit</span>
                </div>

            </div>
        </div>
        <div class="panel panel-info" style="height: 350px;">
            <div class="panel-heading"><i class="fa fa-hand-o-right" style="color: #FF8247;"></i>&nbsp; Why Livtrip?</div>
            <div class="panel-body">
                <dl>
                    <dt>We get you the lowest prices</dt>
                    <dd>Exclusive last-minute prices backed by our Best Price Guarantee policy.</dd>
                    <dt style="margin-top:10px; ">More experiences than anybody else</dt>
                    <dd>We work with our partners to get the largest selection of spontaneous experiences in your city.</dd>
                    <dt style="margin-top:10px; ">24/7 concierge</dt>
                    <dd>Spontaneity needs convenience and our team of experts available around the clock ensure just that.</dd>
                    <dt style="margin-top:10px; ">Verified reviews & photos</dt>
                    <dd>Our guest reviews and photography team ensure you have a great time without any worry.</dd>
                </dl>
            </div>
        </div>
    </div>
</div>

<div class="container-fluid" style=" margin-top:10px;background:#EEEEEE; height:300px; ">
    <div class="footer">

    </div>
</div>
</body>
</html>


