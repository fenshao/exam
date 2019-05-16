<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Server
  Date: 2019/5/13
  Time: 17:12
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
<div class="container">
    <div class="row">
        <!--右边面板-->
        <div class="col-lg-12">
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">距离考试结束还有</div>
                        <div class="panel-body" >
                            <div id="timer" name="time" style="margin-left: 450px"></div>
                            <input id="time" value="${time}" type="hidden">
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading"><span name="paperId">${paperId}</span>、${title}</div>
                        <div class="panel-body">
                            <form action="AnswerServlet" method="post" class="form-horizontal">
                                <c:forEach items="${questionArrayList}" var="choice" >

                                    <span> ${choice.index}、 ${choice.title}</span>
                                    <br />
                                    <br />
                                    <lable>
                                        <p class="sp1"><input type="checkbox" name="${choice.questionId}" value="1" id="xz${choice.questionId}" />A、${choice.optionA}</p>
                                        <p class="sp1"><input type="checkbox" name="${choice.questionId}" value="2" id="xz${choice.questionId}"/>B、${choice.optionB}</p>
                                        <p class="sp1"><input type="checkbox" name="${choice.questionId}" value="3" id="xz${choice.questionId}"/>C、${choice.optionC}</p>
                                        <p class="sp1"><input type="checkbox" name="${choice.questionId}" value="4" id="xz${choice.questionId}" />D、${choice.optionD}</p>
                                    </lable>
                                    <br />
                                    <br />
                                </c:forEach>

                                <div class="text-center">
                                    <nav>
                                        <ul class="pagination">
                                            <li class="page-item"><a class="page-link" href="<c:url value="/ShowQuestionServlet?page=1"/>">首页</a></li>
                                            <li class="page-item"><a class="page-link" href="<c:url value="/ShowQuestionServlet?page=${page-1>1?page-1:1}"/>">&laquo;</a>
                                            </li>

                                            <c:forEach begin="1" end="${totalPages}" varStatus="loop">
                                                <c:set var="active" value="${loop.index==page?'active':''}"/>
                                                <li class="page-item ${active}">
                                                    <a class="page-link" href="<c:url value="/ShowQuestionServlet?page=${loop.index}"/>">${loop.index}</a>
                                                </li>
                                            </c:forEach>
                                            <li class="page-item">
                                                <a class="page-link" href="<c:url value="/ShowQuestionServlet?page=${page+1<totalPages?page+1:totalPages}"/>">&raquo;</a>
                                            </li>
                                            <li class="page-item">
                                                <a class="page-link" href="<c:url value="/ShowQuestionServlet?page=${totalPages}"/>">尾页</a>
                                            </li>
                                        </ul>
                                    </nav>
                                </div>

                                <div class="text-center form-group">
                                    <button type="submit" class="btn btn-primary" id="btn_query">交卷离开</button>
                                </div>

                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script language="JavaScript">
    var dataLis = [

    ]

    $(function () {

        //获取用户数据
        function getData(object,url) {
            $.ajax({
                url: url,
                type: "get",
                data: dataObject,
                traditional: true,
                success: function (data) {

                }
            });
        }

        //获取页码数据
        function getPage(index) {
            getData($(this), "ShowQuestionServlet?page=" + index);
        }
    })


    var time = $("#time").val();
    var maxtime = time * 1
    function CountDown(){
        if(maxtime>=0){
            minutes = Math.floor(maxtime/60);
            seconds = Math.floor(maxtime%60);
            hour = Math.floor(minutes / 60);
            msg = hour + " h " + minutes + " m " + seconds + " s ";
            document.all["timer"].innerHTML = msg;
            if(maxtime == 5*60) alert('注意，还有5分钟!');
            --maxtime;
        }
        else{
            clearInterval(timer);
            alert("时间到，请提交试卷");

            document.forms[0].submit();
        }
    }
    timer = setInterval("CountDown()",1000);
</script>
</body>
</html>