<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Server
  Date: 2019/5/14
  Time: 7:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <link rel="stylesheet" href="css/bootstrap-admin-theme.css" />
    <script type="text/javascript" src="js/jquery-3.3.1.min.js" ></script>
    <script type="text/javascript" src="js/bootstrap.min.js" ></script>
    <title>在线考试系统</title>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class=" navbar-collapse nav-divider">
                    <a class="navbar-brand" href="#"><strong>欢迎使用在线考试系统</strong></a>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown">
                                <i class="glyphicon glyphicon-user" aria-hidden="true"></i>欢迎您,
                                <%=request.getSession().getAttribute("username")%>
                                <b class="caret"></b>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="#updateinfo" data-toggle="modal">个人资料</a></li>
                                <li role="presentation" class="divider"></li>
                                <li><a href="#updatepwd" data-toggle="modal">修改密码</a></li>
                                <li role="presentation" class="divider"></li>
                                <li><a href="">退出</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</nav>

<!--左边列表-->
<div class="container">
    <div class="row">
        <!--左边的导航-->
        <div class="col-lg-2 bootstrap-admin-col-left">
            <ul class="nav navbar-collapse collapse bootstrap-admin-navbar-side">
                <li>
                    <a href="AdminScoreServlet"><i class="glyphicon glyphicon-chevron-right"></i>查询成绩</a>
                </li>
                <li>
                    <a href="allUserInformationServlet"><i class="glyphicon glyphicon-chevron-right"></i>学生管理</a>
                </li>
                <li>
                    <a href="#"><i class="glyphicon glyphicon-chevron-right"></i>试卷管理</a>
                </li>
            </ul>
        </div>
        <!--右边面板-->
        <div class="col-lg-10">
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <div class="text-muted bootstrap-admin-box-title">学生查询</div>
                        </div>
                        <div class="panel-body">
                            <form action="SelectStudentServlet" method="post" class="form-horizontal">
                                <input type="hidden" name="tid" value="1"/>
                                <input type="hidden" name="show" value="1"/>
                                <div class="col-lg-7 form-group">
                                    <label class="col-lg-4 control-label">学生姓名</label>
                                    <div class="col-lg-8">
                                        <input class="form-control" id="bookName" name="name" type="text" value="">
                                        <label class="control-label" for="name" style="display: none;"></label>
                                    </div>
                                </div>
                                <div class="col-lg-3 form-group">
                                    <button type="submit" class="btn btn-primary" id="btn_query">查询</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <div class="text-muted bootstrap-admin-box-title">添加学生</div>
                        </div>
                        <div class="panel-body">
                            <form action="allUserInformationServlet" method="post" class="form-horizontal">
                                <div class="col-lg-3 form-group">
                                    <button type="button" class="btn btn-primary" id="btn_add" data-toggle="modal" data-target="#addModal">添加学生</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <div class="text-muted bootstrap-admin-box-title">学生信息</div>
                        </div>
                        <div class="panel-body">
                            <table id="data_list" class="table table-hover table-bordered"  cellspacing="0" width="100%">
                                <thead>
                                <tr>
                                    <th>账号</th>
                                    <th>姓名</th>
                                    <th>性别</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <c:forEach items="${allStudent}" var="student">
                                    <tbody>
                                    <tr>

                                        <td>${student.stuId}</td>
                                        <td>${student.stuName}</td>
                                        <td>${student.stuSex}</td>
                                        <td>
                                            <button type="button" class="btn btn-warning btn-xs" data-toggle="modal" data-target="#updateModal"
                                                    id="btn_update" onclick="showInfo2('${student.stuId}','${student.stuName}','${student.stuSex}', '${student.stuPassword}')">修改</button>
                                            <button type="button" class="btn btn-danger btn-xs" onclick="deletebook(${student.stuId})">删除</button>
                                        </td>

                                    </tr>
                                    </tbody>
                                </c:forEach>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!--个人资料-->
<!-- 模态框（Modal） -->
<form  class="form-horizontal"  method="post" action="uNameAndSexServlet">
    <div class="modal fade" id="updateinfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" id="myModalLabel">
                        个人资料
                    </h4>
                </div>
                <div class="modal-body">

                    <!--正文-->
                    <input type="hidden" name="tip" value="2" />
                    <input type="hidden" name="url" value="index" />
                    <div class="form-group">
                        <label for="" class="col-sm-3 control-label">真实姓名</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" id="name" name="name" placeholder="请输入您的真实姓名" value="" />
                            <label class="control-label" for="name" style="display: none;"></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="" class="col-sm-3 control-label">性别</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" id="sex" name="sex" placeholder="请输入您的性别" value="" />
                            <label class="control-label" for="sex" style="display: none;"></label>
                        </div>
                    </div>

                </div>

                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                    </button>
                    <button type="submit" class="btn btn-primary">
                        修改
                    </button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>
</form>

<!--修改密码-->
<!-- 模态框（Modal） -->
<form  class="form-horizontal"  method="post" action="uPasswordServlet">
    <div class="modal fade" id="updatepwd" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" id="myModalLabel">
                        修改密码
                    </h4>
                </div>
                <div class="modal-body">

                    <!--正文-->
                    <input type="hidden" name="tip" value="1" />
                    <input type="hidden" name="url" value="index" />
                    <div class="form-group">
                        <label for="" class="col-sm-3 control-label">原密码</label>
                        <div class="col-lg-7">
                            <input type="password" class="form-control" id="oldPwd" name="password" placeholder="请输入原密码" value="" />
                            <label class="control-label" for="name" style="display: none;"></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="" class="col-sm-3 control-label">新密码</label>
                        <div class="col-lg-7">
                            <input type="password" class="form-control" id="newPwd" name="password2" placeholder="请输入新密码" value="" />
                            <label class="control-label" for="name" style="display: none;"></label>
                        </div>
                    </div>
                </div>

                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                    </button>
                    <button type="submit" class="btn btn-primary">
                        修改
                    </button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>
</form>

<!--添加学生-->
<!-- 模态框（Modal） -->
<form  class="form-horizontal"  method="post" action="AddStudentServlet">
    <div class="modal fade" id="addModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" id="myModalLabel">
                        添加新学生
                    </h4>
                </div>
                <div class="modal-body">

                    <!--正文-->
                    <input type="hidden" name="tip" value="2" />
                    <input type="hidden" name="url" value="index" />
                    <div class="form-group">
                        <label for="" class="col-sm-3 control-label">学号</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" name="username" id="addusername" required="required"  placeholder="请输入学号">
                            <label class="control-label" for="username" style="display: none;"></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="" class="col-sm-3 control-label">姓名</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" name="names" id="addnames" required="required"  placeholder="请输入姓名">
                            <label class="control-label" for="names" style="display: none;"></label>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="" class="col-sm-3 control-label">密码</label>
                        <div class="col-lg-7">
                            <input type="password" class="form-control" name="password" id="addpassword" required="required"   placeholder="请输入密码">
                            <label class="control-label" for="password" style="display: none;"></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="" class="col-sm-3 control-label">性别</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" name="sex" id="addsex" required="required"  placeholder="性别">
                            <label class="control-label" for="sex" style="display: none;"></label>
                        </div>
                    </div>
                </div>

                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                    </button>
                    <button type="submit" class="btn btn-primary">
                        添加
                    </button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>
</form>

<!--修改学生信息-->
<!-- 模态框（Modal） -->
<form  class="form-horizontal"  method="post" action="UpdataStudent">
    <div class="modal fade" id="updateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" id="myModalLabel">
                        修改学生信息
                    </h4>
                </div>
                <div class="modal-body">

                    <!--正文-->
                    <input type="hidden" name="tip" value="2" />
                    <input type="hidden" name="url" value="index" />
                    <div class="form-group">
                        <label for="" class="col-sm-3 control-label">学号</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" name="username" id="username" required="required"  placeholder="请输入学号">
                            <label class="control-label" for="username" style="display: none;"></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="" class="col-sm-3 control-label">姓名</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" name="names" id="names" required="required"  placeholder="请输入姓名">
                            <label class="control-label" for="names" style="display: none;"></label>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="" class="col-sm-3 control-label">密码</label>
                        <div class="col-lg-7">
                            <input type="password" class="form-control" name="password" id="password" required="required"   placeholder="请输入密码">
                            <label class="control-label" for="password" style="display: none;"></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="" class="col-sm-3 control-label">性别</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" name="sex" id="sex" required="required"  placeholder="性别">
                            <label class="control-label" for="sex" style="display: none;"></label>
                        </div>
                    </div>
                </div>

                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                    </button>
                    <button type="submit" class="btn btn-primary">
                        修改
                    </button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>
</form>

<%
    if ((String)request.getAttribute("str") == "true") {
%>
<script>alert("操作成功！");</script>
<%}%>

<script type="text/javascript">
    function showInfo2(userName, stuName, sex, password) {
        document.getElementById("username").value = userName;
        document.getElementById("names").value = stuName;
        document.getElementById("sex").value = sex;
        document.getElementById("password").value = password;
    }
    function deletebook(userName) {
        con = confirm("是否删除?");
        if(con == true){
            location.href = "/exam/DeleteStudent?userName="+userName;
        }
    }
</script>
</body>
</html>