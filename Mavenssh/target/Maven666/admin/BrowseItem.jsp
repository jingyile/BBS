<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<link rel="stylesheet" href="inc/css.css" type="text/css" />
</head>
<body>
<form name="form1" method="post" action="">
  <table width="600" border=0 align=center cellpadding=2 cellspacing=1 bordercolor="#799AE1" class=tableBorder>
    <tbody>
      <tr>
        <th align=center colspan=18 style="height: 23px">�����Ŀ</th>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td colspan="18" align="center" class=txlrow>&nbsp;</td>
      </tr>
      <tr align="center" bgcolor="#799AE1">
        <td align="center" class="txlHeaderBackgroundAlternate">��ĿID</td>
        <td align="center" class="txlHeaderBackgroundAlternate">��Ŀ����</td>
        <td align="center" class="txlHeaderBackgroundAlternate">��Ŀ����</td>
        <td align="center" class="txlHeaderBackgroundAlternate">��Ŀ����</td>
        <td align="center" class="txlHeaderBackgroundAlternate">ɾ����Ŀ</td>
      </tr>
   <s:if test="items.isEmpty()">
		<tr bgcolor="#DEE5FA"><td colspan="5">�����κ��û���¼!</td></tr>
	</s:if>
	<s:else>      
	<s:iterator value="items" var="item">
      <tr bgcolor="#DEE5FA">
        <td align="center" class="txlrow">${item.itemID}</td>
        <td align="center" class="txlrow">${item.itemName}</td>
        <td align="center" class="txlrow">${item.itemDescription}</td>
        <td align="center" class="txlrow">
        
        	<s:if test="null == #attr.item.manager">��ʱû�а���</s:if>
        	<s:else>
        		${item.manager.username}
        	</s:else>
        	</td>
        <td align="center" class="txlrow"><a href="itemDelete?itemID=${item.itemID}">ɾ��</td>
      </tr>
    </s:iterator>
    </s:else>
      <tr bgcolor="#DEE5FA">
        <td colspan="18" align=center bgcolor="#DEE5FA" class=txlrow>&nbsp;</td>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td colspan=18 align=center class=txlrow></td>
      </tr>
	</tbody></table>
</FORM>
</BODY>
  </HTML>