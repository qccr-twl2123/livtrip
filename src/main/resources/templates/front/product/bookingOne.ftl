[#escape x as x?html]
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>预定页面</title>
    <link rel="stylesheet" href="style/public.css"/>
    <link rel="stylesheet" href="http://g.alicdn.com/sui/sui3/0.0.2/old/css/icons.min.css"/>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="http://g.alicdn.com/sui/sui3/0.0.18/css/sui.min.css">
    <script type="text/javascript" src="http://g.alicdn.com/sj/lib/jquery/dist/jquery.min.js"></script>
    <script type="text/javascript" src="http://g.alicdn.com/sui/sui3/0.0.18/js/sui.min.js"></script>
    <script src='http://maps.google.cn/maps/api/js?key=AIzaSyDY0kkJiTPVd2U7aTOAwhc9ySH6oHxOIYM' type="text/javascript"></script>
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

<body>
<nav class="navbar navbar-default">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">LivTrip</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">美东</a></li>
                <li><a href="#">美西</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">景区 <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#">黄石公园</a></li>
                        <li><a href="#">自由女神像</a></li>
                        <li><a href="#">夏威夷</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Separated link</a></li>

                    </ul>
                </li>
            </ul>

            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">注册</a></li>
                <li><a href="#">登录</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>

<div class="container">
    <div class="steps">
        <div class="wrap col-md-5">
            <div class="current">
                <label><span class="round">1</span><span>填写入住信息</span></label><i class="triangle-right-bg"></i><i class="triangle-right"></i>
            </div>
        </div>
        <div class="wrap col-md-4">
            <div class="todo">
                <label><span class="round">2</span><span>填写支付信息</span></label><i class="triangle-right-bg"></i><i class="triangle-right"></i>
            </div>
        </div>
        <div class="wrap col-md-3">
            <div class="todo">
                <label><span class="round">3</span><span>预定成功</span></label>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-8">
            <div class="panel panel-info">
                <div class="panel-heading">
                    <h3 class="panel-title">预定信息</h3>
                </div>
                <div class="panel-body">
                    <table class="table table-bordered" >
                        <tr>
                            <td style="width:15%;">入住日期</td>
                            <td>${checkIn} ~ ${checkOut}</td>
                        </tr>
                        <tr>
                            <td>房间数量</td>
                            <td>1间房</td>
                        </tr>
                        <tr>
                            <td>房型</td>
                            <td>标间</td>
                        </tr>
                        <tr>
                            <td>入住时间</td>
                            <td>12:00 AM</td>
                        </tr>
                        <tr>
                            <td>退房时间</td>
                            <td>3:00 PM</td>
                        </tr>
                    </table>
                </div>
            </div>
            <div class="panel panel-info">
                <div class="panel-heading">
                    <h3 class="panel-title">联系信息</h3>
                </div>
                <div class="panel-body">
                    <table class="table table-bordered" >
                        <tr>
                            <td>姓名</td>
                            <td><input type="text"  name=""/></td>
                        </tr>
                        <tr>
                            <td style="width:15%;">邮箱</td>
                            <td><input type="text" name=""/>&nbsp;预定成功后会邮件通知</td>
                        </tr>
                        <tr>
                            <td>手机号</td>
                            <td><input type="text" name=""/></td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="panel panel-info">
                <div class="panel-heading">
                    <h3 class="panel-title">您的选择</h3>
                </div>
                <div class="panel-body">
                    <table style="margin-bottom: 15px;">
                        <tr>
                            <td><img src="${hotel.thumb}" style="margin:0px;width:100px;height:100px; border-radius:3px;"></td>
                            <td style="vertical-align: top; margin:0px;padding: 0px 5px;">
                                <h6 style="margin: 0px;">${hotel.name}</h6>
                                <p style="margin:0px; font-size:12px;"><i class="fa fa-map-marker" style="color: #ff0000;"></i>&nbsp;${hotel.location.address}</p>

                            </td>
                        </tr>
                    </table>
                    <p><strong>房型:</strong> ${roomName}</p>
                    <p><strong>含税:</strong> $ ${tax}</p>
                    <p><strong>入住:</strong> ${checkIn}</p>
                    <p><strong>退房:</strong> ${checkOut}</p>
                    <p><strong>入住详情:</strong> ${nights} 晚 ${peopleNum}人</p>
                    <p style="margin-bottom:20px; "><strong>订单总额:</strong>  <strong style="font-size: 18px; color: #ff0000; float: right;">$ ${orderPrice}</strong></p>
                    <button type="button" class="btn btn-success  btn-lg btn-block">立即预定</button>
                </div>
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