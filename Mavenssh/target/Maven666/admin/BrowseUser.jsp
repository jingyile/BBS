<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<link rel="stylesheet" href="inc/css.css" type="text/css" />
	<script type="text/javascript">
		function submitForm(){
			var frm=document.userForm;
			frm.submit();
		}
	</script>
</head>
<body>
  <table width="600" border=0 align=center cellpadding=2 cellspacing=1 bordercolor="#799AE1" class=tableBorder>
    <tbody>
      <tr>
        <th align=center colspan=22 style="height: 23px">����û�</th>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td colspan="22" align="center" class=txlrow><div align="right">
          <form name="userForm" action="findAllUser" method="post">
          ��ѡ��Ȩ�ޣ�<select name="popedom" onchange="submitForm()">
            <option value="3" 
            	<s:if test="popedom == 3">selected</s:if>
            >����Ա</option>
            <option value="2"
            	<s:if test="popedom == 2">selected</s:if>
            >��Ŀ����</option>
            <option value="1"
            	<s:if test="popedom == 1">selected</s:if>
            >����Ŀ����</option>
            <option value="0"
            	<s:if test="popedom == 0">selected</s:if>
            >��ͨ�û�</option>
          </select>
          </form>
          </div></td>
      </tr>
      <tr align="center" bgcolor="#799AE1">
        <td align="center" class="txlHeaderBackgroundAlternate">�û�ID</td>
        <td align="center" class="txlHeaderBackgroundAlternate">�û���</td>
        <td align="center" class="txlHeaderBackgroundAlternate">����</td>
        <td align="center" class="txlHeaderBackgroundAlternate">�Ա�</td>
        <td align="center" class="txlHeaderBackgroundAlternate">����</td>
        <td align="center" class="txlHeaderBackgroundAlternate">��������</td>
        <td align="center" class="txlHeaderBackgroundAlternate">����</td>
        <td align="center" class="txlHeaderBackgroundAlternate">ɾ���û�</td>
      </tr>
      
	<s:if test="allUser.isEmpty()">
		<tr bgcolor="#DEE5FA"><td colspan="8">�����κ��û���¼!</td></tr>
	</s:if>
	<s:else>      
	<s:iterator value="allUser" var="user">
		<tr bgcolor="#DEE5FA">
	       <td align="center" class="txlrow">${user.userID}</td>
	       <td align="center" class="txlrow">${user.username}</td>
	       <td align="center" class="txlrow">${user.password}</td>
	       <td align="center" class="txlrow">${user.sex == 0 ? '��':'Ů'}</td>
	       <td align="center" class="txlrow">${user.age}</td>
	       <td align="center" class="txlrow"><s:date name="#attr.user.birthDay" format="yyyy��MM��dd��"/></td>
	       <td align="center" class="txlrow">${user.integral}</td>
	       <td align="center" class="txlrow"><a href="userDelete.action?username=${user.username}">ɾ��</a></td>
		</tr>
	</s:iterator>
    </s:else>
      <tr bgcolor="#DEE5FA">
        <td colspan="22" align=center bgcolor="#DEE5FA" class=txlrow>&nbsp;</td>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td colspan=22 align=center class=txlrow></td>
      </tr>
	</tbody></table>
</BODY>
  </HTML>