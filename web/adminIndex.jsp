<%@ page import="cn.ynni.exam.model.Teacher" %>
<%@ page import="cn.ynni.exam.service.TeacherService" %><%--
  Created by IntelliJ IDEA.
  User: Server
  Date: 2019/5/13
  Time: 22:52
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

<%
    TeacherService teacherService = new TeacherService();
    Teacher teacher = teacherService.selectTeacher((String) request.getSession().getAttribute("username"));
%>

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
                                <li><a href="LoginOutServlet">退出</a></li>
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
                    <a href="selectPaper.jsp"><i class="glyphicon glyphicon-chevron-right"></i>试卷管理</a>
                </li>
                <li>
                    <a href="ModifyServlet"><i class="glyphicon glyphicon-chevron-right"></i>试题修改</a>
                </li>
            </ul>
        </div>
        <!--右边面板-->
        <div class="col-lg-10">
            <div class="row">
                <div class="col-lg-6">
                    <div class="panel panel-default">
                        <div class="panel-heading">查询成绩</div>
                        <div class="panel-body">
                            <ul>
                                <li>查看所有学生的成绩、查询一个学生的成绩</li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="panel panel-default">
                        <div class="panel-heading">学生管理</div>
                        <div class="panel-body">
                            <ul>
                                <li>添加、删除学生</li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="panel panel-default">
                        <div class="panel-heading">试卷管理</div>
                        <div class="panel-body">
                            <ul>
                                <li>添加试卷、修改试卷答案</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!--个人资料-->
<!-- 模态框（Modal） -->
<form  class="form-horizontal"  method="post" action="uTeaNameSexServlet">
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
                        <label for="" class="col-sm-3 control-label">姓名</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" id="name" name="name" placeholder="请输入您的真实姓名" value="" />
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

<!--修改密码-->
<!-- 模态框（Modal） -->
<form  class="form-horizontal"  method="post" action="uTeaPassServlet">
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

</body>
</html>

