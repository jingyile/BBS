<%--
  Created by IntelliJ IDEA.
  User: jingyile
  Date: 19-5-19
  Time: ����2:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>��ӭ������̨����ҳ��</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
</head>

<body align="center">

��ӭ������̨����ҳ�棡
<table border="2" align="center">
    <tr><th><a href="findAllItem">���������Ŀ</a></th></tr>
    <tr><th><a  href="findAllSubItem">�������Ŀ</a></th></tr>
    <tr><th><a href="findAllUser">��������û�</a></th></tr>
    <tr><th><a href="admin/NewItem.jsp">������Ŀ</a></th></tr>
    <tr><th><a href="subItemAddBefore">��������Ŀ</a></th></tr>
    <tr><th><a href="admin/NewUser.jsp">�����û�</a></th></tr>
</table>
<br>
</body>
</html>

