<!DOCTYPE HTML>
<html>
<head>
    <title>Livtrip管理系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="${base}/resources/assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
    <link href="${base}/resources/assets/css/bui-min.css" rel="stylesheet" type="text/css" />
    <link href="${base}/resources/assets/css/main-min.css" rel="stylesheet" type="text/css" />
</head>
<body>

<div class="header">

    <div class="dl-title">
        <a href="http://sc.chinaz.com" title="文档库地址" target="_blank">
            <span class="lp-title-port">Livtrip</span><span class="dl-title-text">后台管理</span>
        </a>
    </div>

    <div class="dl-log">欢迎您，<span class="dl-log-user">${userName}</span><a href="${base}//backend/admin/loginout" title="退出系统" class="dl-log-quit">[退出]</a><a href="http://http://sc.chinaz.com/" title="文档库" class="dl-log-quit">文档库</a>
    </div>
</div>
<div class="content">
    <div class="dl-main-nav">
        <div class="dl-inform"><div class="dl-inform-title">贴心小秘书<s class="dl-inform-icon dl-up"></s></div></div>
        <ul id="J_Nav"  class="nav-list ks-clear">
            <li class="nav-item dl-selected"><div class="nav-item-inner nav-home">首页</div></li>
            <li class="nav-item"><div class="nav-item-inner nav-order">营销</div></li>
            <li class="nav-item"><div class="nav-item-inner nav-inventory">清算</div></li>
            <li class="nav-item"><div class="nav-item-inner nav-supplier">详情页</div></li>
            <li class="nav-item"><div class="nav-item-inner nav-marketing">图表</div></li>
        </ul>
    </div>
    <ul id="J_NavContent" class="dl-tab-conten">

    </ul>
</div>
<script type="text/javascript" src="${base}/resources/assets/js/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="${base}/resources/assets/js/bui.js"></script>
<script type="text/javascript" src="${base}/resources/assets/js/config.js"></script>

<script>
    BUI.use('common/main',function(){
        var config = [{
            id:'menu',
            homePage : 'code',
            menu:[{
                text:'基础信息',
                items:[
                    {id:'code',text:'产品管理',href:'${base}/backend/product/list.do',closeable : false},
                    {id:'main-menu',text:'城市管理',href:'${base}/backend/dest/list.do'},
                    {id:'second-menu',text:'定时任务定义',href:'${base}/backend/task/list.do'},
                    {id:'dyna-menu',text:'定时任务日志',href:'${base}/backend/task/logs.do'}
                ]
            },{
                text:'会员管理',
                items:[
                    {id:'operation',text:'会员列表',href:'main/operation.do'},
                    {id:'quick',text:'会员等级',href:'main/quick.do'},
                    {id:'quick',text:'VIP会员',href:'main/quick.do'}
                ]
            },{
                text:'订单管理',
                items:[
                    {id:'resource',text:'今日订单',href:'main/resource.do'},
                    {id:'loader',text:'订单报表',href:'main/loader.do'}
                ]
            }]
        },{
            id:'form',
            menu:[{
                text:'营销管理',
                items:[
                    {id:'code',text:'表单代码',href:'form/code.do'},
                    {id:'example',text:'表单示例',href:'form/example.do'},
                    {id:'introduce',text:'表单简介',href:'form/introduce.do'},
                    {id:'valid',text:'表单基本验证',href:'form/basicValid.do'},
                    {id:'advalid',text:'表单复杂验证',href:'form/advalid.do'},
                    {id:'remote',text:'远程调用',href:'form/remote.do'},
                    {id:'group',text:'表单分组',href:'form/group.do'},
                    {id:'depends',text:'表单联动',href:'form/depends.do'}
                ]
            },{
                text:'成功失败页面',
                items:[
                    {id:'success',text:'成功页面',href:'form/success.do'},
                    {id:'fail',text:'失败页面',href:'form/fail.do'}

                ]
            },{
                text:'可编辑表格',
                items:[
                    {id:'grid',text:'可编辑表格',href:'form/grid.do'},
                    {id:'form-grid',text:'表单中的可编辑表格',href:'form/form-grid.do'},
                    {id:'dialog-grid',text:'使用弹出框',href:'form/dialog-grid.do'},
                    {id:'form-dialog-grid',text:'表单中使用弹出框',href:'form/form-dialog-grid.do'}
                ]
            }]
        },{
            id:'search',
            menu:[{
                text:'报表统计',
                items:[
                    {id:'code',text:'搜索页面代码',href:'search/code.do'},
                    {id:'example',text:'搜索页面示例',href:'search/example.do'},
                    {id:'example-dialog',text:'搜索页面编辑示例',href:'search/example-dialog.do'},
                    {id:'introduce',text:'搜索页面简介',href:'search/introduce.do'},
                    {id:'config',text:'搜索配置',href:'search/config.do'}
                ]
            },{
                text : '更多示例',
                items : [
                    {id : 'tab',text : '使用tab过滤',href : 'search/tab.do'}
                ]
            }]
        },{
            id:'detail',
            menu:[{
                text:'详情页面',
                items:[
                    {id:'code',text:'详情页面代码',href:'detail/code.do'},
                    {id:'example',text:'详情页面示例',href:'detail/example.do'},
                    {id:'introduce',text:'详情页面简介',href:'detail/introduce.do'}
                ]
            }]
        },{
            id : 'chart',
            menu : [{
                text : '图表',
                items:[
                    {id:'code',text:'引入代码',href:'chart/code.do'},
                    {id:'line',text:'折线图',href:'chart/line.do'},
                    {id:'area',text:'区域图',href:'chart/area.do'},
                    {id:'column',text:'柱状图',href:'chart/column.do'},
                    {id:'pie',text:'饼图',href:'chart/pie.do'},
                    {id:'radar',text:'雷达图',href:'chart/radar.do'}
                ]
            }]
        }];
        new PageUtil.MainPage({
            modulesConfig : config
        });
    });
</script>
<div style="display:none">

    <script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script>
</div>
</body>
</html>