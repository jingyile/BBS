<%@ page contentType="text/html;charset=gb2312" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<link rel="stylesheet" href="inc/css.css" type="text/css" />
</head>
<body>
<form name="form1" method="post" action="userAdd.action">
  <table width="600" border=0 align=center cellpadding=5 cellspacing=0 >
    <tbody>
      <tr>
        <th align=center colspan=16 style="height: 23px">�����û�</th>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td colspan="16" align="center" class=txlrow>
        	<font color="red"><s:actionmessage/></font><!--��ʾ�Ƿ���ӳɹ�-->
        </td>
      </tr>
      
      <tr align="center" bgcolor="#DEE5FA">
      	<td colspan="3"><font color="red"><s:fielderror></s:fielderror></font></td>
      </tr>
      
      <tr align="center" bgcolor="#DEE5FA">
        <td align="center" class="txlrow" width="150"><div align="right">�û�����</div></td>
        <td align="center" class="txlrow">
	        <div align="left">
	          	<input type="text" name="username" value="${request.username}">
	          	<font color="red">*</font>�û�������Ϊ6��15֮��
	        </div>
        </td>
      </tr>
      <tr align="center" bgcolor="#DEE5FA">
        <td align="center" class="txlrow"><div align="right">���룺</div></td>
        <td align="center" class="txlrow">
        <div align="left">
         	<input type="password" name="password">
	        <font color="red">*</font>���볤��Ϊ6��15֮��
	     </div>
        </td>
      </tr>
   
      <tr bgcolor="#DEE5FA">
        <td align="center" class="txlrow"><div align="right">ȷ�����룺</div></td>
        <td align="center" class="txlrow"><div align="left">
          <input type="password" name="repassword">
          <font color="red">*</font>ȷ�����볤��Ϊ6��15֮��
        </div></td>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td align="center" class="txlrow"><div align="right">�Ա�</div></td>
        <td align="center" class="txlrow"><div align="left">
          <select name="sex">
            <option value="0">��</option>
            <option value="1">Ů</option>
          </select>
          </div></td>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td align="center" class="txlrow"><div align="right">���䣺</div></td>
        <td align="center" class="txlrow"><div align="left">
          <input name="age" type="text" size="10" value="${request.age}">
        </div></td>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td align="center" class="txlrow"><div align="right">�������ڣ�</div></td>
        <td align="center" class="txlrow"><div align="left">
          <input type="text" name="birthDay">
        </div></td>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td align="center" class="txlrow"><div align="right">Ȩ�ޣ�</div></td>
        <td align="center" class="txlrow"><div align="left">
          <select name="popedom">
            <option selected value="3">����Ա</option>
            <option value="2">��Ŀ����</option>
            <option value="1">����Ŀ����</option>
            <option value="0">��ͨ�û�</option>
          </select>
        </div></td>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td align="center" class="txlrow"><div align="right"></div></td>
        <td align="center" class="txlrow"><div align="left">
          <input type="submit" name="Submit" value="�ύ">
          <input type="reset" name="Submit2" value="����">
        </div></td>
      </tr>
    
      <tr bgcolor="#DEE5FA">
        <td colspan="16" align=center bgcolor="#DEE5FA" class=txlrow>&nbsp;</td>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td colspan=16 align=center class=txlrow></td>
      </tr>
 </tbody></table>
</FORM>
</BODY>
  </HTML>