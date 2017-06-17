<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
    <title>城市管理</title>
    <link rel="stylesheet" href="resources/style/admin.css"/>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="http://g.alicdn.com/sui/sui3/0.0.18/css/sui.min.css">
    <script type="text/javascript" src="http://g.alicdn.com/sj/lib/jquery/dist/jquery.min.js"></script>
    <script type="text/javascript" src="http://g.alicdn.com/sui/sui3/0.0.18/js/sui.min.js"></script>
    <script src='http://maps.google.cn/maps/api/js?key=AIzaSyAjNbgkCbR5VzzBw2VsJagYKBASIJoa2iw' type="text/javascript"></script>
    <script type="text/javascript" src="resources/js/page.js"></script>
</head>
<script type="text/javascript">
    function  fetch(destinationId) {
//        alert(destinationId);
        $.ajax({
            url: "fetch.json?destinationId="+destinationId,
            dataType: "json",
            cache: true,
            type: "GET",
            success: function (data) {
                if(data.success == true){
                    alert("后台程序正在采集");
                }
            }
        });
    }

</script>

<body>
<div class="container">
    <ol class="breadcrumb">
        <li><a href="#">后台管理</a></li>
        <li class="active">城市列表</li>
    </ol>
    <div style="margin-top:5px; padding:0px; border:1px solid #d1d1d1; height:80px; border-radius:5px; text-align:center">
        <form class="form-inline"  id="listForm" action="#" method="post" style="margin:25px auto; padding:0px;">
            <div class="form-group">
                <label  class="control-label" for="inputSuccess1">城市名称</label>
                <input type="text"  name="cityName" value="${cityName!}"  class="form-control" id="inputSuccess1"/>
            </div>
            <div class="form-group">
                <label  class="control-label" for="inputSuccess1">所属州</label>
                <input type="text"  name="state" value="${state!}" class="form-control" id="inputSuccess1"/>
            </div>
            <div class="form-group">
                <label  class="control-label" for="inputSuccess1">DestinationID</label>
                <input type="text"  name="destinationId" value="${destinationId!}"  class="form-control" id="inputSuccess1"/>
            </div>

            <button type="submit" class="btn btn-primary" style="width:120px">查询</button>
    </div>
</div>

<div class="container" >
    <table class="table table-primary" style="margin:10px 0px;">
        <thead>
        <tr>
            <th>城市名称</th>
            <th>DestinationID</th>
            <th>所属州</th>
            <th width="15%">操作</th>
        </tr>
        </thead>
        <tbody>
            <#list page.list as destination>
            <tr>
                <td>${destination.cityName!}</td>
                <td>${destination.destinationId!}</td>
                <td>${destination.state!} </td>
                <td align="right">
                    <div class="btn-group btn-group-sm">
                        <button type="button" class="btn btn-bordered btn-success btn-sm"
                                onclick="fetch(${destination.destinationId!});">采集</button>
                    </div>
                </td>
            </tr>
            </#list>
        </tbody>
    </table>
    </form>
</div>

</body>
</html>
