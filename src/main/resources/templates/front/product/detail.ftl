[#escape x as x?html]
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>${hotelDetail.name}-${hotelDetail.keywords}</title>
    <link rel="stylesheet" href="${base}/resources/style/public.css"/>
    <link rel="stylesheet" href="http://g.alicdn.com/sui/sui3/0.0.2/old/css/icons.min.css"/>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="http://g.alicdn.com/sui/sui3/0.0.18/css/sui.min.css">
    <script type="text/javascript" src="http://g.alicdn.com/sj/lib/jquery/dist/jquery.min.js"></script>
    <script type="text/javascript" src="http://g.alicdn.com/sui/sui3/0.0.18/js/sui.min.js"></script>
    <script src='http://maps.google.cn/maps/api/js?key=AIzaSyAjNbgkCbR5VzzBw2VsJagYKBASIJoa2iw' type="text/javascript"></script>
    <script src="${base}/resources/js/product/detail.js"></script>
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

<body onload="loadMap()">
<div id="address_text" style="display: none">${hotelDetail.address}</div>
<div id="lat" style="display:none">${hotelDetail.latitude}</div>
<div id="lng" style="display:none">${hotelDetail.longitude}</div>
<input type="hidden" name="hotelId" id="hotelId" value="${hotelDetail.hotelId}"/>
<input type="hidden" name="checkIn" id="checkIn" value="${productQuery.checkIn}"/>
<input type="hidden" name="checkOut" id="checkOut" value="${productQuery.checkOut}"/>
<input type="hidden" name="peopleNum" id="peopleNum" value="${productQuery.peopleNum}"/>
    [#include  "nav.ftl"/]
<div class="container">
    <ol class="breadcrumb" style="margin:0px;">
        <li><a href="http://www.livtrip.com">Index</a></li>
        <li><a href="#">${hotelDetail.cityName}</a></li>
        <li class="active">${hotelDetail.name}</li>
    </ol>
    <div class="base_info">
        <ul>
            <li style="width:25%;">
                <img src="${hotelDetail.thumb}" width="280px" height="100%;" class="border-radius-3"/>
            </li>
            <li style="width:47%;">
                <h3 style="color:#82B5CD; margin:0px; font-size: 14px">${hotelDetail.name}&nbsp;
                    [#if hotelDetail.isBest == 1]
                        <i class="fa fa-thumbs-o-up" style="color:#FB7F49"></i>
                    [/#if]
                </h3>
                <p style="color:#FB7F49;" >
                    <i class="fa  fa-star"></i>
                    <i class="fa  fa-star"></i>
                    <i class="fa  fa-star"></i>
                    <i class="fa  fa-star-half-full"></i>
                </p>
                <p style="margin:0px; font-size:15px;">
                    <i class="fa fa-map-marker"></i>&nbsp;
                    ${hotelDetail.address}
                </p>
                <div class="hotel_pics_box">
                    <ul >
                        [#list hotelDetail.hotelImageVOList as image]
                            [#if image_index > 7]
                                [#break ]
                            [/#if]
                            <li><img  src="${image.path}"/></li>
                        [/#list]
                    </ul>
                </div>
            </li>
            <li style="width:25%;">
                <p class="text-right" style="font-size:22px; color:#FF0000; font-weight:bold; height:50px;">$ ${hotelDetail.minAvgNightPrice} 起</p>
                <div class="small_map" id="small_map"></div>
            </li>
        </ul>
    </div>
</div>

<div class="container">
    <div class="detail_left">
        <div class="panel panel-info">
            <div class="panel-heading">酒店预订</div>
            <div class="panel-body">
                <div style="margin:10px 0px; padding:0px; border:1px solid #d1d1d1; height:60px; border-radius:5px; text-align:center">
                    <form id="idForm" class="form-inline"  style="margin:15px auto; padding:0px;">
                        <input type="hidden" name="hotelId" value="${hotelDetail.hotelId}"/>
                        <div class="form-group input-daterange" data-toggle="datepicker" >
                            <input type="text" name="checkIn" value="${hotelDetail.checkIn}" id="checkIn" class="form-control input-date" placeholder="checkIn"  /> -
                            <input type="text" name="checkOut" value="${hotelDetail.checkOut}" id="checkOut" class="form-control input-date" placeholder="checkOut" />
                        </div>
                        <div class="form-group">
                            <select class="form-control" style="width:100px" name="peopleNum">
                                <option value="1" selected="selected">1 customer</option>
                                <option value="2">2 customer</option>
                                <option value="3">3 customer</option>
                                <option value="4">4 customer</option>
                                <option value="5">5 customer</option>
                                <option value="6">6 customer</option>
                                <option value="7">7 customer</option>
                                <option value="8">8 customer</option>
                            </select>
                        </div>
                        <button type="button" onclick="submitForm();" class="btn btn-danger" style="width:120px">Search</button>
                    </form>
                </div>
                <table class="table table-bordered">
                    <tr>
                        <th>RoomType</th>
                        <th style="text-align: center">AvgNight Price</th>
                        <th style="text-align: center">Tax</th>
                        <th style="text-align: center">policy</th>
                        <th></th>
                    </tr>

                    [#list hotelDetail.roomTypeList as roomType]
                        [#if roomType.isAvailable == true]
                        <tr>
                            <td style="max-width:300px;">
                            ${roomType.name}
                           </td>
                            <td  style=" text-align:center; vertical-align:middle;">
                              $ ${roomType.occupancies.occupancy[0].avrNightPrice}
                            </td>
                            <td  style=" text-align:center; vertical-align:middle;">
                                $ ${roomType.occupancies.occupancy[0].taxPublish}
                            </td>
                            <td  style="text-align:center; vertical-align:middle;">policy</td>
                            <td style="min-width:60px; text-align:center; vertical-align:middle;">
                                <button type="button" onclick="gotoBookingOne(${roomType.roomId});" class="btn btn-primary">Book</button></td>
                        </tr>
                        [/#if]
                    [/#list]

                </table>
            </div>
        </div>
        <div class="panel panel-info">
            <div class="panel-heading">酒店介绍</div>
            <div class="panel-body">
                ${hotelDetail.description}
                <br/>
                [#list hotelDetail.hotelDescriptionVOList as description]
                <h4>${description.category}</h4>
                <p class="text-justify">
                    ${description.value}
                </p>
                [/#list]
            </div>
        </div>

        <div class="panel panel-info">
            <div class="panel-heading">酒店政策</div>
            <div class="panel-body">
                幼儿0-1岁：在不加床的情况下，可免费入住。请注意，如果使用婴儿床可能需要支付额外费用。
                儿童2-12岁：在不加床的情况下可免费入住。
                * 12岁以上的旅客入住此酒店将按照成 customer标准收费。
                * 加床政策根据您所选定的客房而有所不同。
            </div>
        </div>
        <div class="panel panel-info">
            <div class="panel-heading">地理位置</div>
            <div class="panel-body">
                <div class="large_map" id="large_map"></div>
            </div>
        </div>
    </div>
    <div class="detail_right">
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
        <div class="panel panel-info" style="height: 380px;">
            <div class="panel-heading"><i class="fa fa-paper-plane" style="color: #FF8247;"></i>&nbsp; Why Livtrip?</div>
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
[/#escape]