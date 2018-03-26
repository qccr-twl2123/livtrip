<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
    <title>产品管理</title>
    <link rel="stylesheet" href="/resources/style/admin.css"/>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="http://g.alicdn.com/sui/sui3/0.0.18/css/sui.min.css">
    <script type="text/javascript" src="http://g.alicdn.com/sj/lib/jquery/dist/jquery.min.js"></script>
    <script type="text/javascript" src="http://g.alicdn.com/sui/sui3/0.0.18/js/sui.min.js"></script>
    <script src='http://maps.google.cn/maps/api/js?key=AIzaSyAjNbgkCbR5VzzBw2VsJagYKBASIJoa2iw' type="text/javascript"></script>
    <script type="text/javascript" src="/resources/js/page.js"></script>
</head>


<body>
<div class="container">
    <ol class="breadcrumb">
        <li><a href="#">后台管理</a></li>
        <li class="active">产品列表</li>
    </ol>
    <div style="margin-top:5px; padding:0px; border:1px solid #d1d1d1; height:80px; border-radius:5px; text-align:center">
        <form class="form-inline" id="listForm" action="list.do" method="post" style="margin:25px auto; padding:0px;">
            <div class="form-group">
                <label  class="control-label" for="inputSuccess1">产品名称</label>
                <input type="text"  name="name" value="${name!}"  class="form-control" id="inputSuccess1"/>
            </div>
            <div class="form-group">
                <label  class="control-label" for="inputSuccess1">城市</label>
                <input type="text"  name="city" value="${city!}" class="form-control" id="inputSuccess1"/>
            </div>
            <div class="form-group">
                <label  class="control-label" for="inputSuccess1">酒店ID</label>
                <input type="text"  name="hotelId" value="${hotelId!}"  class="form-control" id="inputSuccess1"/>
            </div>
            <div class="form-group">
                <label class="control-label" for="inputSuccess2">精品</label>
                <select name="isBest" class="form-control" id="inputSuccess2">
                    <#if isBest??>
                        <option <#if isBest==0>selected="selected"</#if> value="0">否</option>
                        <option <#if isBest==1>selected="selected"</#if> value="1">是</option>
                    <#else >
                        <option value="">请选择</option>
                    </#if>
                   </select>
            </div>
            <div class="form-group">
                <label class="control-label" for="inputSuccess2">星级</label>
                <select name="starLevel" class="form-control" id="inputSuccess2">
                    <#if starLevel??>
                        <option <#if starLevel==1>selected="selected"</#if> value="1">1星级</option>
                        <option <#if starLevel==1.5>selected="selected"</#if> value="1.5">1.5星级</option>
                        <option <#if starLevel==2>selected="selected"</#if> value="2">2星级</option>
                        <option <#if starLevel==2.5>selected="selected"</#if> value="2.5">2.5星级</option>
                        <option <#if starLevel==3>selected="selected"</#if> value="3">3星级</option>
                        <option <#if starLevel==3.5>selected="selected"</#if> value="3.5">3.5星级</option>
                        <option <#if starLevel==4>selected="selected"</#if> value="4">4星级</option>
                        <option <#if starLevel==4.5>selected="selected"</#if> value="4.5">4.5星级</option>
                        <option <#if starLevel==5>selected="selected"</#if> value="5">5星级</option>
                    <#else >
                        <option value="">请选择</option>
                    </#if>
                    </select>
            </div>
            <button type="submit" class="btn btn-primary" style="width:80px">查询</button>
            <button type="reset" class="btn btn-primary" style="width:80px">重置</button>
    </div>
</div>

<div class="container" >
    <table class="table table-primary" style="margin:10px 0px;">
        <thead>
        <tr>
            <th>产品名称</th>
            <th>酒店ID</th>
            <th>城市</th>
            <th>州</th>
            <th>精品</th>
            <th>星级</th>
            <th>房间数</th>
            <th width="15%">操作</th>
        </tr>
        </thead>
        <tbody>
            <#list page.list as product>
            <tr>
                <td>${product.name!}</td>
                <td>${product.hotelId?c}</td>
                <td>${product.city!}</td>
                <td>${product.state!}</td>
                <td>
                    <#if product.isBest??>
                        <#if product.isBest == 1>
                           是
                        <#else>
                            否
                        </#if>
                    </#if>
                </td>
                <td>${product.startLevel!}</td>
                <td>${product.rooms!}</td>
                <td align="right">
                    <div class="btn-group">
                        <button type="button" class="btn btn-bordered btn-primary" onclick="location.href='edit.do?productId=${product.id?c}'">详情</button>
                        <button type="button" class="btn btn-bordered btn-danger" onclick="javascript:if(confirm('确实要删除该内容吗?'))location='delete.do?productId=${product.id!}'">删除</button>
                    </div>
                </td>
            </tr>
            </#list>
        </tbody>
    </table>
        <#include "/pagination_admin.ftl"/>
    </form>
</div>

</body>
</html>
