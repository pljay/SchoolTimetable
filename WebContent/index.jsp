<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String taskid = (String)session.getAttribute("taskid");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta charset="utf-8">
	<title>排课系统</title>
    <link  href="style.css" rel="stylesheet">
    <link href="bootstrap/css/bootstrap.css"  rel="stylesheet">
    <script src="jquery.min.js" ></script>
    <script src="index导航.js" ></script>
<script src="bootstrap/js/bootstrap.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
  </head>
<body onload="i()" style="font-size: 1.5em; font-family: 'Lato', Arial, sans-serif;color: #7c8d87;background: #f8f8f8;">
<div class="container">
    <nav>
        <ul class="dropdown">
            <li ><a onclick="a()">科目排课优先级规则</a></li>
            <li ><a onclick="b()">教师排课规则</a></li>
            <li ><a onclick="c()">合班上课规则</a></li>
            <li ><a onclick="i()">通用设置</a></li>
            <li class="drop"><a>排课时间规则</a>
                <ul class="sub_menu">
                    <li><a onclick="d()">统一设置</a></li>
                    <li><a onclick="e()">按科目设置</a></li>
                    <li><a onclick="f()">按教师设置</a></li>
                    <li><a onclick="g()">按班级设置</a></li>
                    <li><a onclick="h()">按课程设置</a></li>
                </ul>
            </li>
        </ul>
    </nav>
<div class="row" id="row">

</div>
</div>

</body>
</html>
