<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Login</title>
    <link rel="stylesheet" href="resources/style/public.css"/>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="http://g.alicdn.com/sui/sui3/0.0.18/css/sui.min.css">
    <script type="text/javascript" src="http://g.alicdn.com/sj/lib/jquery/dist/jquery.min.js"></script>
    <script type="text/javascript" src="http://g.alicdn.com/sui/sui3/0.0.18/js/sui.min.js"></script>
    <script src="resources/js/tool.js" type="text/javascript"></script>

    <script type="text/javascript">
        function login(){
            var params = formToObject("loginForm");
            doPost("/login/signIn", params, function(data) {
                if(printError(data)){
                    render("login/toMain",null);
                }
            });
        }
    </script>
</head>
<body style="background: #F8F8F8; text-align: center;">
<div style="margin:200px auto; padding: 0px;max-width: 400px;  ">
    <form  id="loginForm" action="/login" class="form-horizontal" method="post">
        <div class="form-group" style="text-align: center">
            <label for="userName" class="col-md-2 control-label"></label>
            <div class="col-md-10">
                <h3 style="text-align: center; width: 100%;">11台登录系统</h3>
            </div>
        </div>
        <div class="form-group">
            <label for="userName" class="col-md-2 control-label"></label>
            <div class="col-md-10">
                <input type="text" name="username" class="form-control input-lg" id="username" placeholder="userName">
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-md-2 control-label"></label>
            <div class="col-md-10">
                <input type="password" name="password" class="form-control input-lg" id="password" placeholder="Password">
            </div>
        </div>
        <div class="form-group">
            <div class="col-md-2"></div>
            <div class="col-md-10">
                <button type="submit"  class="btn btn-success btn-lg" style="width:100%">登 录</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>
