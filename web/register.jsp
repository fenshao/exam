<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>在线考试系统</title>
<link rel="stylesheet" href="css/style.css" />
<body>

<div class="register-container">
	<h1>欢迎注册在线考试系统</h1>
	
	<div class="connect">
		<p>请开始你的表演</p>
	</div>
	
	<form action="registerServlet" method="post" id="registerForm">
		<span style="background: red">${message}</span>
		<div>
			<input type="text" name="username" class="username" placeholder="您的用户名" autocomplete="off"/>
		</div>
		<div>
			<input type="password" name="password" class="password" placeholder="输入密码" oncontextmenu="return false" onpaste="return false" />
		</div>
		<div>
			<input type="password" name="confirm_password" class="confirm_password" placeholder="再次输入密码" oncontextmenu="return false" onpaste="return false" />
		</div>
		<div>
			<input type="text" name="number" class="phone_number" placeholder="姓名" autocomplete="off" id="number"/>
		</div>
		<div>
			<input type="text" name="sex" class="t" placeholder="性别" oncontextmenu="return false" onpaste="return false" />
		</div>

		<button id="submit" type="submit">注 册</button>
	</form>
	<a href="index.jsp">
		<button type="button" class="register-tis">已经有账号？</button>
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