<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
    <title>产品详情页</title>
    <link rel="stylesheet" href="/resources/style/admin.css"/>
    <link rel="stylesheet" href="http://g.alicdn.com/sui/sui3/0.0.2/old/css/icons.min.css"/>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="http://g.alicdn.com/sui/sui3/0.0.18/css/sui.min.css">
    <script type="text/javascript" src="http://g.alicdn.com/sj/lib/jquery/dist/jquery.min.js"></script>
    <script type="text/javascript" src="http://g.alicdn.com/sui/sui3/0.0.18/js/sui.min.js"></script>
    <script src='http://maps.google.cn/maps/api/js?key=AIzaSyAjNbgkCbR5VzzBw2VsJagYKBASIJoa2iw' type="text/javascript"></script>
    <script src="/resources/js/product/SingleMarkerMap.js"></script>
    <script type="text/javascript">
        function  submitForm() {
            var url = "getRoomTypeList.do";
            $.ajax({
                type: "POST",
                url: url,
                data: $("#idForm").serialize(),
                success: function(data)
                {
                    var object = eval('(' + data + ')');
                    if(object.success){
                        $("#rooms_span").remove();
                        var html = "";
                        var obj = JSON.stringify(object.data);
                        alert(obj);
                        $.each(obj,function(n,value) {
                            alert(n+"value" +value);
                            var trs = "";
                            trs += "<tr><td>" + value.name +"</td></tr>";
                            html += trs;
                        });
                        alert("html:" + html);
                        $("#rooms_span").html("dsadadasdahdaskdhaks");
                    }else{
                        alert(object.message);
                    }
                }
            });
        }

    </script>
</head>
<body>
<div id="address_text" style="display: none">${product.address}</div>
<div id="lat" style="display:none">${product.latitude}</div>
<div id="lng" style="display:none">${product.longitude}</div>
<div class="container">
    <ol class="breadcrumb">
        <li><a href="#">后台管理</a></li>
        <li><a href="javascription.hsitory(-1);">产品列表</a></li>
        <li class="active">产品详情页</li>
    </ol>

    <div role="tabpanel">

        <!-- Nav tabs -->
        <ul class="nav nav-tabs" role="tablist">
            <li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab">基础信息</a></li>
            <li role="presentation"><a href="#description" aria-controls="description" role="tab" data-toggle="tab">详情描述</a></li>
            <li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">图片资源</a></li>
            <li role="presentation"><a href="#messages" onclick="loadMap();" aria-controls="messages" role="tab" data-toggle="tab">地理位置</a></li>
            <li role="presentation"><a href="#settings" aria-controls="settings" role="tab" data-toggle="tab">房型数据</a></li>
        </ul>

        <!-- Tab panes -->
        <div class="tab-content">
            <div role="tabpanel" class="tab-pane active" id="home">
                <form class="form-horizontal" style="margin:20px 0px;">
                    <div class="form-group">
                        <label for="product_name" class="col-sm-2 control-label">产品名称</label>
                        <div class="col-sm-10">
                            <input type="email" class="form-control" id="product_name" value="${product.name}">
                        </div>
                    </div>
                    <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="hotel_id">酒店ID</label>
                        <div class="col-sm-10">
                            <input class="form-contro form-group-sm" disabled="disabled" name="hotelId" value="${product.hotelId}" type="text" id="hotel_id" />
                        </div>
                    </div>
                    <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="star">星级</label>
                        <div class="col-sm-10">
                            <input class="form-contro form-group-sm" name="startLevel" value="${product.startLevel}" type="text" id="star" />
                        </div>
                    </div>
                    <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="hotel_brand">酒店品牌</label>
                        <div class="col-sm-10">
                            <input class="form-contro form-group-sm" type="text" name="brandName" value="${product.brandName}" id="hotel_brand" />
                        </div>
                    </div>
                    <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="currency">计价货币</label>
                        <div class="col-sm-10">
                            <input class="form-contro form-group-sm" type="text" name="currency" value="${product.currency}" id="currency" />
                        </div>
                    </div>
                    <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="rooms">房间数</label>
                        <div class="col-sm-10">
                            <input class="form-contro form-group-sm" type="text" name="rooms" value="${product.rooms}" id="rooms"  />
                        </div>
                    </div>
                    <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="checkInTime">入住时间</label>
                        <div class="col-sm-10">
                            <input class="form-contro form-group-sm" type="text" name="checkInTime" value="${product.checkInTime}" id="checkInTime"  />
                        </div>
                    </div>
                    <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="checkOutTime">退房时间</label>
                        <div class="col-sm-10">
                            <input class="form-contro form-group-sm" type="text" name="checkOutTime" value="${product.checkOutTime}" id="checkOutTime" />
                        </div>
                    </div>
                    <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="phone">酒店电话</label>
                        <div class="col-sm-10">
                            <input class="form-contro form-group-sm" type="text" id="hotelPhone" value="${product.hotelPhone}" />
                        </div>
                    </div>
                    <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="fax">传真</label>
                        <div class="col-sm-10">
                            <input class="form-contro form-group-sm" type="text" id="hotelFax" name="hotelFax" value="${product.hotelFax}" />
                        </div>
                    </div>
                    <button type="submit" class="btn btn-primary" style=" margin-left:150px;">提 交</button>
                </form>
            </div>

            <div role="tabpanel" class="tab-pane" id="description">
                <form style="margin:20px 0px;">
                    <#if product.hotelDescriptionVOList??>
                        <#list product.hotelDescriptionVOList as description>
                            <div class="form-group">
                                <label for="category">${description.category!}</label>
                                <textarea  type="email" class="form-control" id="category" rows="5">${description.value!}</textarea>
                            </div>
                        </#list>
                    </#if>
                    <button type="submit" class="btn btn-primary" style=" margin-left:150px;">提 交</button>
                </form>
            </div>
            <div role="tabpanel" class="tab-pane" id="profile">
                <ul class="product_images_ul">
                    <#list product.hotelImageVOList as image>
                    <li>
                        <img src="${image.path!}" alt="..."/>
                    </li>
                    </#list>
                </ul>
            </div>
            <div role="tabpanel" class="tab-pane" id="messages">
                <form class="form-horizontal" style="margin:20px 0px;">
                    <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="country">国家</label>
                        <div class="col-sm-10">
                            <input class="form-contro form-group-lg" name="country" value="${product.country}" type="text" id="country" />
                        </div>
                    </div>
                    <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="state">州</label>
                        <div class="col-sm-10">
                            <input class="form-contro form-group-lg" type="text" value="${product.state}" id="state" />
                        </div>
                    </div>
                    <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="city">城市</label>
                        <div class="col-sm-10">
                            <input class="form-contro form-group-lg" value="${product.city}" type="text" id="city" />
                        </div>
                    </div>
                    <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="address">具体地址</label>
                        <div class="col-sm-10">
                            <input class="form-contro form-group-lg" value="${product.address}" type="text" id="address" />
                        </div>
                    </div>
                    <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="latitude">经度</label>
                        <div class="col-sm-10">
                            <input class="form-contro form-group-lg" value="${product.latitude}" type="text" id="latitude" />
                        </div>
                    </div>
                    <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="longitude">纬度</label>
                        <div class="col-sm-10">
                            <input class="form-contro form-group-lg" value="${product.longitude}" type="text" id="longitude" />
                        </div>
                    </div>
                    <div class="form-group form-group-sm">
                        <div class="hotel_map" id="map"></div>
                    </div>

                    <button type="submit" class="btn btn-primary" style=" margin-left:150px;">提 交</button>
                </form>
            </div>
            <div role="tabpanel" class="tab-pane" id="settings">
                <div style="margin-top:10px; padding:0px; border:1px solid #d1d1d1; height:80px; border-radius:5px; text-align:center">
                <form id="idForm" class="form-inline"  style="margin:45px auto; padding:0px;">
                    <input type="hidden" name="hotelId" value="${product.hotelId}"/>
                    <div class="form-group input-daterange" data-toggle="datepicker" >
                        <input type="text" name="checkIn" value="${product.checkIn}" id="checkIn" class="form-control input-date" placeholder="入住日期"  /> -
                        <input type="text" name="checkOut" value="${product.checkOut}" id="checkOut" class="form-control input-date" placeholder="退房日期" />
                    </div>
                    <div class="form-group">
                        <select class="form-control" style="width:100px" name="peopleNum">
                            <option value="1" selected="selected">1人</option>
                            <option value="2">2人</option>
                            <option value="3">3人</option>
                            <option value="4">4人</option>
                            <option value="5">5人</option>
                            <option value="6">6人</option>
                            <option value="7">7人</option>
                            <option value="8">8人</option>
                        </select>
                    </div>
                    <button type="button" onclick="submitForm();" class="btn btn-primary" style="width:120px">搜索</button>
                </form>
                </div>
                <table class="table table-bordered" style="margin-top: 10px;">
                    <tr>
                        <th style="width: 15%">房型</th>
                        <th style="width: 10%;text-align: center">每晚均价(原)</th>
                        <th style="width: 10%;text-align: center">每晚均价(销)</th>
                        <th style="width: 10%;text-align: center">入住时长</th>
                        <th style="width: 10%;text-align: center">手续费</th>
                        <th style="width: 10%;text-align: center">原总价</th>
                        <th style="width: 10%;text-align: center">销售总价</th>
                        <th style="width: 10%;text-align: center">利润</th>
                    </tr>
                    <span id="rooms_span">
                        <#if product.hotelRoomTypeVOS??>
                            <#list product.hotelRoomTypeVOS as roomType>
                            <tr>
                            <td style="max-width:300px;">${roomType.name!}</td>
                            <td  style=" text-align:center; vertical-align:middle;">$ ${roomType.originalPrice!}</td>
                            <td style="min-width:60px; text-align:center; vertical-align:middle;"> $ ${roomType.saleAvgPrice!}</td>
                            <td  style="text-align:center; vertical-align:middle;">${roomType.nights!} 晚</td>
                            <td style="min-width:60px; text-align:center; vertical-align:middle;">${roomType.commission!}</td>
                            <td style="min-width:60px; text-align:center; vertical-align:middle;">$ ${roomType.totalOriginalPrice!} </td>
                            <td style="min-width:60px; text-align:center; vertical-align:middle;">$ ${roomType.totalSalePrice!} </td>
                            <td style="min-width:60px; text-align:center; vertical-align:middle;">$ ${roomType.profit!} </td>
                            </tr>
                            </#list>
                        </#if>

                    </span>

                </table>

            </div>
        </div>

    </div>
</div>
</body>
</html>


