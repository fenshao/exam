<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
	        <meta name="viewport" content="width=device-width, initial-scale=1">
	        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
			<!-- Open-iconic -->
			<link href="https://cdn.bootcss.com/open-iconic/1.1.1/font/css/open-iconic-bootstrap.css" rel="stylesheet">
	</head>
	<body>
		<div class="nav">
			<div class="nav-top">
				<div id="mini" style="border-bottom:1px solid rgba(255,255,255,.1)"><img src="images/mini.png" ></div>
			</div>
			<ul>
				<li class="nav-item">
					<a href="javascript:;"><i class="my-icon nav-icon icon_1"></i><span>查看考试</span><i class="my-icon nav-more"></i></a>
					<ul>
						<li><a href="lookScoreServlet"><span>以往考试</span></a></li>
						<li><a href="javascript:;"><span>进入考试</span></a></li>
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
				<iframe src="examhistory.jsp" id="examhistory" name="examhistory" frameborder="0" scrolling="yes"></iframe>
			</div>
		</div>
		<div class="table-responsive">
			<table class="table table-hover">
			    <thead class="thead-light">
			        <tr>
			            <th scope="col">试卷编号</th>
			            <th scope="col">试卷标题</th>
			            <th scope="col">姓名</th>
						<th scope="col">得分</th>
			            <th scope="col">查看试卷</th>
			        </tr>
			    </thead>
			    <tbody>
					<c:forEach items="${infoArrayList}" var="info">
						<tr>
							<th scope="row">${info.paperId}</th>
							<td>${info.title}</td>
							<td>${info.stuName}</td>
							<td>${info.score}</td>
							<td><button type="submit" class="btn btn-primary btn-sm"><span class="oi oi-eye" title="查看试卷" aria-hidden="true"></span></button></td>
						</tr>
					</c:forEach>
			    </tbody>
			</table>
		</div>
		<script src="js/jquery.min.js"></script>
		<script src="bootstrap/js/bootstrap.min.js"></script>
	</body>
</html>