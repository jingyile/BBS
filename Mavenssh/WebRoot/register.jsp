<%--
  Created by IntelliJ IDEA.
  User: jingyile
  Date: 19-5-19
  Time: ����10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=gb2312" language="java" %>
<html>
<HEAD><TITLE>ע�����û�</TITLE>
<META http-equiv=Content-Type content="text/html; charset=gb2312"/>
<LINK href="css/style_1_editor.css" type=text/css rel=stylesheet/>
<LINK href="css/style_1_common.css" type=text/css rel=stylesheet>
    <script type="text/javascript">
        function getXhr(){
            var xhr;
            if(window.XMLHttpRequest){
                xhr = new XMLHttpRequest();
            }else{
                xhr = new ActiveXObject("Microsoft.XMLHTTP");
            }
            return xhr;
        };
    </script>
    <script type="text/javascript">
        function checkname(){
            var name = document.getElementById("username").value;
            var xhr = getXhr();
            xhr.open("post","check.do");
            xhr.setRequestHeader("content-type","application/x-www-form-urlencoded");
            xhr.onreadystatechange=function(){
                if(xhr.readyState==4&&xhr.status==200){
                    var msg = xhr.responseText;
                    document.getElementById("username_msg").innerHTML=msg;
                }
            };
            xhr.send("name="+name);
            document.getElementById("username_msg").innerHTML="���ڼ��...";
        }
    </script>
</HEAD>
<BODY>
<DIV class=wrap>
<DIV id=header>
</DIV>
<DIV id=menu><SPAN class=avataonline>
</SPAN></DIV>
<DIV id=nav><a href="goIndex.action">������ҳ</a></DIV>
<DIV class="mainbox viewthread" id=previewtable style="DISPLAY: none">
<TABLE cellSpacing=0 cellPadding=0 >
  <TBODY>
  <TR>
    <TD class=postauthor><s:actionmessage></s:actionmessage><TD>
    <TD class=postcontent>
      <DIV class=postmessage id=previewmessage>
      <H2></H2></DIV></TD></TR></TBODY></TABLE></DIV><BR>
<DIV class="mainbox formbox">
<s:form name="form1" method="post" action="register" validate="true">
<TABLE id=newpost cellSpacing=0 cellPadding=0 summary=post>
	<thead>
	<TR>
    <TD><s:actionmessage/></TD>
    <TD><font color="red"><s:fielderror>���ѣ�</s:fielderror></font></TD>
  	</TR>
  	</thead>
  <TR>
    <TH>�û���</TH>
    <TD><input type="text" id="username" name="username" value="${request.username}" onblur="checkname()">
        <span id="username_msg" style="color: blue; size: 16px"></span>
<%--	     <font color="red">*</font>�û�������Ϊ6��15֮��</TD>--%>
  </TR>
  <TR>
	<TH>����</TH>
    <TD><input type="password" name="password">
<%--	    <font color="red">*</font>���볤��Ϊ6��15֮��</TD>--%>
  </TR>
    <TR>
	<TH>ȷ������</TH>
    <TD><input type="password" name="repassword">
<%--          <font color="red">*</font>ȷ�����볤��Ϊ6��15֮��</TD>--%>
  </TR>
    <TR>
	<TH>�Ա�</TH>
    <TD><select name="sex">
            <option value="0">��</option>
            <option value="1">Ů</option>
          </select></TD>
  </TR>
    <TR>
	<TH>����</TH>
    <TD> <input name="age" type="text" size="10" value="${request.age}"></TD>
  </TR>
    <TR>
	<TH>��������</TH>
    <TD><input type="text" name="birthDay"></TD>
  </TR>
   <TR>
	      <TD colspan="2" align="center"><input type="submit" value="ע��">
          <input type="reset"  value="����"></TD>
  </TR>
</TABLE>
</s:form>
</DIV>
    <%@include file="foot.jsp"%>
</BODY></HTML>
