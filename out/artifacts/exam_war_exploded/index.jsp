<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>在线考试系统</title>
<meta name="keywords" content="jquery特效,表单验证,登录界面,表单提交,表单验证插件,登录界面模板,登录模板,css3登陆界面" />
<meta name="description" content="jquery css3带背景透明登录注册表单提交代码。" />
<link rel="stylesheet" href="css/style.css" />

<body>

<div class="login-container">
	<h1>欢迎登录在线考试系统</h1>
	
	<div class="connect">
		<p>请开始你的表演</p>
	</div>
	
	<form action="" method="post" id="loginForm">
		<div>
			<input type="text" name="username" class="username" placeholder="用户名" autocomplete="off"/>
		</div>
		<div>
			<input type="password" name="password" class="password" placeholder="密码" oncontextmenu="return false" onpaste="return false" />
		</div>
		<button id="submit" type="submit">登 陆</button>
	</form>

	<a href="register.jsp">
		<button type="button" class="register-tis">还有没有账号？</button>
	</a>

</div>

<script src="js/jquery.min.js"></script>
<script src="js/common.js"></script>
<!--背景图片自动更换-->
<script src="js/supersized.3.2.7.min.js"></script>
<script src="js/supersized-init.js"></script>
<!--表单验证-->
<script src="js/jquery.validate.min.js?var1.14.0"></script>

</body>
</html>