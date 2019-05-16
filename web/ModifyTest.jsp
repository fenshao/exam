<%@ page import="cn.ynni.exam.model.Question" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Server
  Date: 2019/5/16
  Time: 7:15
  To change this template use File | Settings | File Templates.
--%>
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
                    <a href="SelectServlet"><i class="glyphicon glyphicon-chevron-right"></i>试卷管理</a>
                </li>
                <li>
                    <a href="ModifyServlet"><i class="glyphicon glyphicon-chevron-right"></i>试题修改</a>
                </li>
            </ul>
        </div>
        <!--右边面板-->
        <div class="col-lg-10">
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <div class="text-muted bootstrap-admin-box-title">试题查询</div>
                        </div>
                        <div class="panel-body">
                            <form action="SelectQuestionServlet" method="post" class="form-horizontal">
                                <input type="hidden" name="tid" value="1"/>
                                <input type="hidden" name="show" value="1"/>
                                <div class="col-lg-7 form-group">
                                    <label class="col-lg-4 control-label">试题名称</label>
                                    <div class="col-lg-8">
                                        <select class="form-control" name="paperId">
                                            <c:forEach items="${paperArrayList}" var="paper1">
                                                <option value="${paper1.paperId}">${paper1.title}</option>
                                            </c:forEach>
                                        </select>
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
                            <div class="text-muted bootstrap-admin-box-title">修改考试时间、分数</div>
                        </div>
                        <div class="panel-body">
                            <form action="allUserInformationServlet" method="post" class="form-horizontal">
                                <div class="col-lg-3 form-group">
                                    <button type="button" class="btn btn-primary" id="btn_add" data-toggle="modal" data-target="#addModal">修改时间</button>
                                </div>
                            </form>

                            <form action="allUserInformationServlet" method="post" class="form-horizontal">
                                <div class="col-lg-3 text-right form-group">
                                    <button type="button" class="btn btn-primary" id="btn_add1" data-toggle="modal" data-target="#updateModal1">修改分数</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <div class="text-muted bootstrap-admin-box-title">试题信息</div>
                        </div>
                        <div class="panel-body">
                            <table id="data_list" class="table table-hover table-bordered"  cellspacing="0" width="100%">
                                <thead>
                                <tr>
                                    <th>标题</th>
                                    <th>答案</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                    <%
                                        ArrayList<Question> arrayList = (ArrayList<Question>) request.getAttribute("questionArrayList");

                                        if (arrayList == null)  arrayList = new ArrayList<Question>();

                                        for (int i = 0; i < arrayList.size(); i++) {
                                            Question question = (Question) arrayList.get(i);
                                    %>
                                    <tbody>
                                    <tr>

                                        <td><%=question.getTitle()%></td>
                                        <td><%=question.getAnswer()%></td>
                                        <td>
                                            <button type="button" class="btn btn-warning btn-xs" data-toggle="modal" data-target="#updateModal"
                                                    id="btn_update" onclick="showInfo2('<%=question.getTitle()%>', '<%=question.getQuestionId()%>', '<%=question.getOptionA()%>','<%=question.getOptionB()%>', '<%=question.getOptionC()%>',
                                                    '<%=question.getOptionD()%>', '<%=question.getAnswer()%>')">修改</button>
                                            <button type="button" class="btn btn-danger btn-xs" onclick="deletebook(<%=question.getQuestionId()%>)">删除</button>
                                        </td>
                                    </tr>
                                    </tbody>
                                <%}%>
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
                        <label for="" class="col-sm-3 control-label">真实姓名</label>
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

<!--修改考试时间-->
<!-- 模态框（Modal） -->
<form  class="form-horizontal"  method="post" action="TimeServlet">
    <div class="modal fade" id="addModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" id="myModalLabel">
                        修改考试时间
                    </h4>
                </div>
                <div class="modal-body">

                    <!--正文-->
                    <input type="hidden" name="tip" value="2" />
                    <input type="hidden" name="url" value="index" />
                    <div class="form-group">
                        <label for="" class="col-sm-3 control-label">时间(以秒为单位)</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" name="time" id="addusername" required="required"  placeholder="请输入时间">
                            <label class="control-label" for="username" style="display: none;"></label>
                        </div>
                    </div>


                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                        </button>
                        <button type="submit" class="btn btn-primary">
                            修改
                        </button>
                    </div>
                </div>
            </div>
        </div><!-- /.modal -->
    </div>
</form>

<!--修改考试分数-->
<!-- 模态框（Modal） -->
<form  class="form-horizontal"  method="post" action="UpdateTestServlet">
    <div class="modal fade" id="updateModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel1" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" id="myModalLabel1">
                        修改每题得分
                    </h4>
                </div>
                <div class="modal-body">
                    <!--正文-->
                    <input type="hidden" name="tip" value="2" />
                    <input type="hidden" name="url" value="index" />
                    <div class="form-group">
                        <label for="" class="col-sm-3 control-label">每题得分</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" name="score" id="addusername1" required="required"  placeholder="请输入得分">
                            <label class="control-label" for="username" style="display: none;"></label>
                        </div>
                    </div>

                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                        </button>
                        <button type="submit" class="btn btn-primary">
                            修改
                        </button>
                    </div>
                </div>
            </div><!-- /.modal -->
        </div>
</form>



<!--修改试题信息-->
<!-- 模态框（Modal） -->
<form  class="form-horizontal"  method="post" action="UpdataQuestion">
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
                        <label for="" class="col-sm-3 control-label">标题</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" name="title" id="title" required="required"  placeholder="请输入标题">
                            <label class="control-label" for="title" style="display: none;"></label>
                        </div>
                    </div>
                    <input type="hidden" class="form-control" name="paperId" id="paperId" hidden="hidden" />
                    <div class="form-group">
                        <label for="" class="col-sm-3 control-label">选项A</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" name="optionA" id="optionA" required="required"  placeholder="请输入A">
                            <label class="control-label" for="optionA" style="display: none;"></label>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="" class="col-sm-3 control-label">选项B</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" name="optionB" id="optionB" required="required"  placeholder="请输入B">
                            <label class="control-label" for="optionB" style="display: none;"></label>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="" class="col-sm-3 control-label">选项C</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" name="optionC" id="optionC" required="required"  placeholder="请输入C">
                            <label class="control-label" for="optionA" style="display: none;"></label>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="" class="col-sm-3 control-label">选项D</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" name="optionD" id="optionD" required="required"  placeholder="请输D">
                            <label class="control-label" for="optionD" style="display: none;"></label>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="" class="col-sm-3 control-label">答案</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" name="answer" id="answer" required="required"   placeholder="格式: 单个答案:A, 多个答案：A:B">
                            <label class="control-label" for="answer" style="display: none;"></label>
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
    function showInfo2(title, paperId, optionA, optionB, optionC, optionD, answer) {
        document.getElementById("title").value = title;
        document.getElementById("paperId").value = paperId;
        document.getElementById("optionA").value = optionA;
        document.getElementById("optionB").value = optionB;
        document.getElementById("optionC").value = optionC;
        document.getElementById("optionD").value = optionD;
        document.getElementById("answer").value = answer;
    }
    function deletebook(qid) {
        con = confirm("是否删除?");
        if(con == true){
            location.href = "/exam/DeleteQuestion?qid="+qid;
        }
    }
</script>
</body>
</html>
