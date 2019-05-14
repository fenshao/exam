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
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<style>
		.option {
			margin-top: 25px;
			width: 300px;
			height: 42px;
			border-radius: 6px;
			padding: 0 15px;
			background: rgba(45,45,45,.15);
		}

	</style>
<body>

<div class="login-container">
	<h1 class="text-center text-light">欢迎登录在线考试系统</h1>
	
	<div class="connect text-center text-light">
		<p>请开始你的表演</p>
	</div>
	
	<form action="loginServlet" method="post" id="loginForm">
		<span style="background: red">${message}</span>
		<div class="mb-3">
	  		<div class="input-group-prepend">
				<input type="text" name="username" id="username" class="form-control" placeholder="用户名" autocomplete="off"/>
			</div>
		</div>
		<br>
		<div class="mb-3">
			<select class="custom-select" name="option">
				 <option value="0" selected>学生</option>
				 <option value="1">教师</option>
			</select>
		</div>
		<div class="mb-3">
	  		<div class="input-group-prepend">
				<input type="password" name="password" id="password" class="form-control" placeholder="密码" oncontextmenu="return false" onpaste="return false" />
			</div>
		</div>
		<button id="submit" type="submit">登 录</button>
	</form>
	<div class="mb-3 text-center">
		<a href="register.jsp">
			<button type="button" class="register-tis">还有没有账号？</button>
		</a>
	</div>

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
