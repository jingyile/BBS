<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page contentType="text/html;charset=gb2312" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<link rel="stylesheet" href="inc/css.css" type="text/css" />
</head>
<body>
<form name="form1" method="post" action="subItemAdd.action">
  <table width="600" border=0 align=center cellpadding=5 cellspacing=0 >
    <tbody>
      <tr>
        <th align=center colspan=16 style="height: 23px">��������Ŀ</th>
      </tr>
      
      <tr bgcolor="#DEE5FA">
        <td colspan="16" align="center" class=txlrow>
        	<font color="red"><s:actionmessage/></font><!--��ʾ�Ƿ���ӳɹ�-->
        </td>
      </tr>
      
      <tr align="center" bgcolor="#DEE5FA">
      	<td colspan="2"><font color="red"><s:fielderror></s:fielderror></font></td>
      </tr>

      <tr align="center" bgcolor="#DEE5FA">
        <td align="center" class="txlrow"  width="150"><div align="right">����Ŀ���ƣ�</div></td>
        <td align="center" class="txlrow"><div align="left">
          <input type="text" name="subItemName">
        </div></td>
      </tr>
      <tr align="center" bgcolor="#DEE5FA">
        <td align="center" class="txlrow"><div align="right">������Ŀ��</div></td>
        <td align="center" class="txlrow"><div align="left">
          <select name="itemID">
          	<s:iterator value="items" var="item">
            	<option value="${item.itemID}">${item.itemName}</option>
             </s:iterator>
          </select>
          </div></td>
      </tr>
   
      <tr bgcolor="#DEE5FA">
        <td align="center" class="txlrow"><div align="right">����Ŀ���ܣ�</div></td>
        <td align="center" class="txlrow"><div align="left">
          <input name="itemDescription" type="text" size="50">
        </div></td>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td align="center" class="txlrow"><div align="right">����Ŀ������</div></td>
        <td align="center" class="txlrow"><div align="left">
          <input name="manager" type="text">
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