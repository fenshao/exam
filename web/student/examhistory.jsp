<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
	        <meta name="viewport" content="width=device-width, initial-scale=1">
	        <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
			<!-- Open-iconic -->
			<link href="https://cdn.bootcss.com/open-iconic/1.1.1/font/css/open-iconic-bootstrap.css" rel="stylesheet">
	</head>
	<body>
		<div class="table-responsive">
			<table class="table table-hover">
			    <thead class="thead-light">
			        <tr>
			            <th scope="col">试卷编号</th>
			            <th scope="col">试卷标题</th>
			            <th scope="col">分数</th>
			            <th scope="col">查看试卷</th>
			        </tr>
			    </thead>
			    <tbody>
			        <tr>
			            <th scope="row">1</th>
			            <td>小明</td>
			            <td>90</td>
			            <td><button type="submit" class="btn btn-primary btn-sm"><span class="oi oi-eye" title="查看试卷" aria-hidden="true"></button></td>
			        </tr>
			        <tr>
			            <th scope="row">2</th>
			            <td>小红</td>
			            <td>80</td>
			            <td><button type="submit" class="btn btn-primary btn-sm"><span class="oi oi-eye" title="查看试卷" aria-hidden="true"></button></td>
			        </tr>
			    </tbody>
			</table>
		</div>
		<script src="../js/jquery.min.js"></script>
		<script src="../bootstrap/js/bootstrap.min.js"></script>
	</body>
</html>