<%--
  Created by IntelliJ IDEA.
  User: jingyile
  Date: 19-5-19
  Time: ����10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=gb2312" language="java" %>
<html>
    <meta http-equiv="Content-Type" content="text/html; charset=x-gbk">
<META http-equiv=Content-Type content="text/html; charset=gbk"/>
<LINK href="css/style_1_editor.css" type=text/css rel=stylesheet/>
<LINK href="css/style_1_common.css" type=text/css rel=stylesheet>
</HEAD>
<BODY>
<DIV class=wrap>
<DIV id=header>
</DIV>
<DIV id=menu><SPAN class=avataonline>
</SPAN></DIV>
<DIV id=nav><a href="goIndex.action">������ҳ</a>&nbsp&nbsp<a href="register.jsp">ǰ��ע��</a></DIV>

<LINK href="bbs4_files/style_1_viewthread.css" type=text/css rel=stylesheet>
<DIV class="mainbox viewthread" id=previewtable style="DISPLAY: none">
<TABLE cellSpacing=0 cellPadding=0 >
  <TBODY>
  <TR>
    <TD class=postauthor><s:actionmessage></s:actionmessage><TD>
    <TD class=postcontent>
      <DIV class=postmessage id=previewmessage>
      <H2></H2></DIV></TD></TR></TBODY></TABLE></DIV><BR>
<DIV class="mainbox formbox">
<form name="form1" method="post" action="login.action">
<TABLE id=newpost cellSpacing=0 cellPadding=0 summary=post>
	<thead>
	<TR>
    <TD colspan="2"><font color="red" size="4"><s:actionmessage/></font></TD>
  	</TR>
  	</thead>
  <TR>
    <TH>�û���</TH>
    <TD><input type="text" name="username" value="${request.username}"></TD>
  </TR>
  <TR>
	<TH>����</TH>
    <TD><input type="password" name="password"></TD>
  </TR>
    <TH>��֤�룺</TH>
    ��<TD><input type="text" name="checkCode"></TD>����
    ����������<!--��Ҫ���ͼƬˢ�£����µõ�һ����֤�룬Ҫ�ں�����ϸ��������������֤ÿ���ύ��ȥ�Ķ��ǲ�һ����path����ֹ��Ϊ�����ʹͼƬ��ˢ��-->
    <img src="createImageAction.action" width="100px" style="margin-left: 100px" onclick="this.src='createImageAction.action?'+ Math.random()" title="���ͼƬˢ����֤��"/><br>
    <s:actionerror cssStyle="color:red"/>
     <TR>
	      <TD colspan="2" align="center"><input type="submit" value="��¼">
          <input type="reset"  value="����"></TD>
  </TR>
</TABLE>
</form>
</DIV>
    <%@include file="foot.jsp"%>
</BODY></HTML>
