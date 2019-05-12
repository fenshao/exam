<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<!-- <link rel="stylesheet" type="text/css" href="../public/css/base.css"> -->
	<link rel="stylesheet" type="text/css" href="css/index.css">
	<link rel="stylesheet" type="text/css" href="css/nav.css">
	<link rel="stylesheet" type="text/css" href="font/iconfont.css">

	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/nav.js"></script>
	<title>在线考试系统</title>
</head>
<body>
	<div class="nav">
		<div class="nav-top">
			<div id="mini" style="border-bottom:1px solid rgba(255,255,255,.1)"><img src="images/mini.png" ></div>
		</div>
		<ul>
			<li class="nav-item">
				<a href="javascript:;"><i class="my-icon nav-icon icon_1"></i><span>考试管理</span><i class="my-icon nav-more"></i></a>
				<ul>
					<li><a href="javascript:;"><span>试题上传</span></a></li>
					<li><a href="javascript:;"><span>发布考试</span></a></li>
				</ul>
			</li>
			<li class="nav-item">
				<a href="javascript:;"><i class="my-icon nav-icon icon_2"></i><span>学生管理</span><i class="my-icon nav-more"></i></a>
				<ul>
					<li><a href="javascript:;"><span>学生管理</span></a></li>
					<li><a href="javascript:;"><span>学生成绩</span></a></li>
				</ul>
			</li>
			<li class="nav-item">
				<a href="javascript:;"><i class="my-icon nav-icon icon_3"></i><span>个人设置</span><i class="my-icon nav-more"></i></a>
				<ul>
					<li><a href="javascript:;"><span>修改信息</span></a></li>
					<li><a href="javascript:;"><span>修改密码</span></a></li>
				</ul>
			</li>
		</ul>
	</div>

	<div style="text-align:center;margin:-650px 0; font:normal 14px/24px 'MicroSoft YaHei';">
	</div>
	<div class="rightmain" id="rightmain">
		<div class="rightcontent">
			<iframe src="main.jsp" id="main" name="main" frameborder="0" scrolling="yes"></iframe>
		</div>
	</div>
	<script src="js/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		//左侧导航切换出右侧页面ifream
		$(".nav ul li a").click(function(){
			var _link = $(this).attr('_link');
			//alert(_link)
		$("#main").attr('src',_link);
		$(this).addClass('current-menuleft').parent().siblings().children().removeClass('current-menuleft');
		$(this).parents('ul').siblings().find(' ul li a').removeClass('current-menuleft');
		});
	 </script>
</body>
</html>