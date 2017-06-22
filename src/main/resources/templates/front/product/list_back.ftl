[#escape x as x?html]
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css"/>
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src='http://maps.google.cn/maps/api/js?key=AIzaSyDY0kkJiTPVd2U7aTOAwhc9ySH6oHxOIYM' type="text/javascript"></script>
    <script src="${base}/resources/js/product/list.js"></script>
    <script src="${base}/resources/js/page.js"></script>
    <link rel="stylesheet" href="${base}/resources/style/style.css"/>

</head>
<body onload="initizePittingMap()">
<nav class="navbar navbar-default navbar-fix-top" role="navigation" style="margin:0px;">
    <div class="container" >
        <div class="navbar-header">
            <a class="navbar-brand" href="#"><img src="resources/images/agoda-logo.png" height="30" style="margin:0px; padding:0px;"/></a>
        </div>
        <div>
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="#">注册</a></li>
                <li><a href="#">登录</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        货币
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="#"><i class="fa fa-dollar"></i>&nbsp;&nbsp;美元</a></li>
                        <li><a href="#"><i class="fa fa-cny"></i>&nbsp;&nbsp;人民币</a></li>
                        <li><a href="#"><i class="fa fa-eur"></i>&nbsp;&nbsp;欧元</a></li>

                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>


<div class="container-fluid" style=" height:65px; background-color:#515B62;line-height:65px; vertical-align:middle;">
    <div class="container">
        <!--搜索框 start-->
        <form class="form-inline" role="form" >
            <div class="form-group">
                <input type="text" class="form-control" style="width:350px" id="name" placeholder="目的地">
            </div>

            <div class="input-group">
                <input type="text" class="form-control" id="checkIn" placeholder="入住时间"/>
                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
            </div>
            <div class="input-group">
                <input type="text" class="form-control" id="checkOut" placeholder="退房时间"/>
                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
            </div>
            <div class="input-group">
                <input type="text" class="form-control" id="name" placeholder="1间客房 2成人 0 儿童"/>
                <span class="input-group-addon"><i class="fa fa-angle-down"></i></span>
            </div>

            <button type="submit" class="btn btn-info" style="width:130px;">搜索</button>
        </form>
        <!--搜索框 end-->
    </div>
</div>

<div class="container" style="margin-top:20px; ">
    <div class="list_left">
        <div class="panel panel-info">
            <div class="panel-heading">
                <h3 class="panel-title">高级搜索</h3>
            </div>
            <div class="panel-body">

                <dl style="margin-top:10px;">
                    <dt class="filter_title"><i class="fa fa-hand-o-right" id="filter_title_ico"></i>您的预算</dt>
                    <dd>
                        <p class="filter_item"><span style="float:right">4</span><i class="fa fa-square-o"></i> 每晚300元以内</p>
                        <p class="filter_item"><span style="float:right">14</span><i class="fa fa-check-square"></i> 每晚300元以内</p>
                        <p class="filter_item"><span style="float:right">42</span><i class="fa fa-square-o"></i> 每晚300元以内</p>
                    </dd>
                    <dt class="filter_title"><i class="fa fa-hand-o-right" id="filter_title_ico"></i>您的预算</dt>
                    <dd>
                        <p class="filter_item"><span style="float:right">4</span><i class="fa fa-square-o"></i> 每晚300元以内</p>
                        <p class="filter_item"><span style="float:right">14</span><i class="fa fa-check-square"></i> 每晚300元以内</p>
                        <p class="filter_item"><span style="float:right">42</span><i class="fa fa-square-o"></i> 每晚300元以内</p>
                    </dd>
                    <dt class="filter_title"><i class="fa fa-hand-o-right" id="filter_title_ico"></i>您的预算</dt>
                    <dd>
                        <p class="filter_item"><span style="float:right">4</span><i class="fa fa-square-o"></i> 每晚300元以内</p>
                        <p class="filter_item"><span style="float:right">14</span><i class="fa fa-check-square"></i> 每晚300元以内</p>
                        <p class="filter_item"><span style="float:right">42</span><i class="fa fa-square-o"></i> 每晚300元以内</p>
                    </dd>
                    <dt class="filter_title"><i class="fa fa-hand-o-right" id="filter_title_ico"></i>您的预算</dt>
                    <dd>
                        <p class="filter_item"><span style="float:right">4</span><i class="fa fa-square-o"></i> 每晚300元以内</p>
                        <p class="filter_item"><span style="float:right">14</span><i class="fa fa-check-square"></i> 每晚300元以内</p>
                        <p class="filter_item"><span style="float:right">42</span><i class="fa fa-square-o"></i> 每晚300元以内</p>
                    </dd>
                    <dt class="filter_title"><i class="fa fa-hand-o-right" id="filter_title_ico"></i>您的预算</dt>
                    <dd>
                        <p class="filter_item"><span style="float:right">4</span><i class="fa fa-square-o"></i> 每晚300元以内</p>
                        <p class="filter_item"><span style="float:right">14</span><i class="fa fa-check-square"></i> 每晚300元以内</p>
                        <p class="filter_item"><span style="float:right">42</span><i class="fa fa-square-o"></i> 每晚300元以内</p>
                    </dd>
                    <dt class="filter_title"><i class="fa fa-hand-o-right" id="filter_title_ico"></i>您的预算</dt>
                    <dd>
                        <p class="filter_item"><span style="float:right">4</span><i class="fa fa-square-o"></i> 每晚300元以内</p>
                        <p class="filter_item"><span style="float:right">14</span><i class="fa fa-check-square"></i> 每晚300元以内</p>
                        <p class="filter_item"><span style="float:right">42</span><i class="fa fa-square-o"></i> 每晚300元以内</p>
                    </dd>
                    <dt class="filter_title"><i class="fa fa-hand-o-right" id="filter_title_ico"></i>您的预算</dt>
                    <dd>
                        <p class="filter_item"><span style="float:right">4</span><i class="fa fa-square-o"></i> 每晚300元以内</p>
                        <p class="filter_item"><span style="float:right">14</span><i class="fa fa-check-square"></i> 每晚300元以内</p>
                        <p class="filter_item"><span style="float:right">42</span><i class="fa fa-square-o"></i> 每晚300元以内</p>
                    </dd>

                </dl>
            </div>
        </div>

    </div>
    <div class="list_right">
        <div  class="filter_summary">
            <div class="filter_summary_left">香港：${page.total}家酒店住宿可供预订</div>
            <div class="filter_summary_right" ><a id="view_map" class="view_map" href="#" onclick="showOrHideMap();"><i class="fa fa-map-o"></i>&nbsp;切换地图</a></div>
        </div>
        <ul class="filter_sort">
            <li>排序:</li>
            <li><span id="review" data-html="true" data-container="body" data-toggle="popover" data-placement="bottom"
                      data-content="<p><a href='www.baidu.com'>从低到高</a></p><p><a href='www.baidu.com'>从低到高</a></p>">
			<a href="#">评分</a>&nbsp;<i class="fa fa-caret-down"></i></span></li>
            <li><span id="level" data-html="true" data-container="body" data-toggle="popover" data-placement="bottom"
                      data-content="<p><a href='www.baidu.com'>从低到高</a></p><p><a href='www.baidu.com'>从低到高</a></p>">
			<a href="#">星级</a>&nbsp;<i class="fa fa-caret-down"></i></span></li>
            <li><span id="level" data-html="true" data-container="body" data-toggle="popover" data-placement="bottom"
                      data-content="<p><a href='www.baidu.com'>从低到高</a></p><p><a href='www.baidu.com'>从低到高</a></p>">
			<a href="#">价格</a>&nbsp;<i class="fa fa-caret-down"></i></span></li>
            <li><span id="level" data-html="true" data-container="body" data-toggle="popover" data-placement="bottom"
                      data-content="<p><a href='www.baidu.com'>从低到高</a></p><p><a href='www.baidu.com'>从低到高</a></p>">
			<a href="#">设施</a>&nbsp;<i class="fa fa-caret-down"></i></span></li>

        </ul>
        <div class="product_list_map" id="map_container">

        </div>
        <div id="pids" style="display:none;">${pids}</div>
        <div style="display:none;">
            [#list page.list as product]
                <div id="${product.id}_latitude" style="display: none">${product.latitude}</div>
                <div id="${product.id}_longitude" style="display: none">${product.longitude}</div>
                <div id="${product.id}_map_view" style="width:185px;height:80px;text-align:left; display:none">
                    ${product.address}<br>${product.city}<br>${product.state} ${product.country}
                </div>
            [/#list]
        </div>

        <ul class="product_list">
            [#list page.list as product]
            <li>
                <div class="product_left"><img src="${product.thumb}"  class="product_image"/></div>
                <div class="product_right">
                    <h3 class="hotel_title_link_url">
                        <a href="">${product.name}</a>&nbsp;
                        [#if product.isBest == 1]
                            <i class="fa fa-thumbs-o-up" style="color:#FB7F49"/>
                        [/#if]
                    </h3>
                    <p style="color:#FB7F49; margin-top:5px;" >
                       ${product.starLevelText}
                    </p>
                    <p class="hotel_location">
                        <i class="fa fa-plane"></i>&nbsp;${product.address}
                    </p>
                    <p class="sheshi">
                        <i class="fa fa-wifi"></i>
                        <i class="fa fa-wheelchair"></i>
                        <i class="fa fa-plug"></i>
                    </p>
                    <div class="hotel_price_area">
                        <p class="lowest_price">每晚低至 <span><i class="fa fa-dollar"></i>${product.salePrice}</span></p>
                        <p class="booking_policy">免费取消,即刻确认</p>
                        <p class="user_room_area"><a class="available_room_link" href="http://www.baidu.com">查看剩余${product.rooms}间房&nbsp;<i class="fa fa-angle-right"></i></a></p>
                    </div>
                </div>
            </li>
            [/#list]
        </ul>
        <form id="listForm" action="list.jhtml" method="post" class="sui-form form-horizontal">
        [@pagination pageNumber = page.pageNum totalPages = page.total]
            [#include "pagination.ftl"/]
        [/@pagination]
        </form>
    </div>
</div>

<div class="container-fluid" style="background-color:#EEEEEE; margin-top:30px;">
    <div style="margin:0px; padding:0px; height:300px;"></div>
</div>

</body>
</html>
[/#escape]