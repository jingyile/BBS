<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<link rel="stylesheet" href="inc/css.css" type="text/css" />
	<script type="text/javascript">
		function submitForm(){
			var frm=document.subItemForm;
			frm.submit();
		}
	</script>
</head>
<body>
  <table width="600" border=0 align=center cellpadding=2 cellspacing=1 bordercolor="#799AE1" class=tableBorder>
    <tbody>
      <tr>
        <th align=center colspan=18 style="height: 23px">�������Ŀ</th>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td colspan="18" align="center" class=txlrow><div align="right">
         <form name="subItemForm" action="findAllSubItem.action" method="post">  
          ��ѡ����Ŀ��
          <select name="titemID" onchange="submitForm()">
          	<option value="0">
          		��ѡ����!
          	</option>
          	<s:iterator value="items" var="item">
            	<option value="${item.itemID}"
            	<s:if test="#attr.item.itemID == titemID">selected</s:if>
            	>${item.itemName}</option>
             </s:iterator>
          </select>
        </form>  
          </div></td>
      </tr>
      <tr align="center" bgcolor="#799AE1">
        <td align="center" class="txlHeaderBackgroundAlternate">����ĿID</td>
        <td align="center" class="txlHeaderBackgroundAlternate">����Ŀ����</td>
        <td align="center" class="txlHeaderBackgroundAlternate">����Ŀ����</td>
        <td align="center" class="txlHeaderBackgroundAlternate">����Ŀ����</td>
        <td align="center" class="txlHeaderBackgroundAlternate">ɾ������Ŀ</td>
      </tr>
   
   	<s:if test="subItems.isEmpty()">
		<tr bgcolor="#DEE5FA"><td colspan="5">�����κ��Ӱ���¼!</td></tr>
	</s:if>
	<s:else>      
	<s:iterator value="subItems" var="subItem">
      <tr bgcolor="#DEE5FA">
        <td align="center" class="txlrow">${subItem.subItemID}</td>
        <td align="center" class="txlrow">${subItem.subItemName}</td>
        <td align="center" class="txlrow">${subItem.itemDescription}</td>
        <td align="center" class="txlrow">
        	<s:if test="null == #attr.subItem.manager">��ʱû�а���</s:if>
        	<s:else>
        		${subItem.manager.username}
        	</s:else>
        </td>
        <td align="center" class="txlrow">
        	<a href="subItemDelete.action?subItemID=${subItem.subItemID}">ɾ��</a>
        </td>
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
</BODY>
  </HTML>