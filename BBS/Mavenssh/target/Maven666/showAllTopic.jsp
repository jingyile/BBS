<%--
  Created by IntelliJ IDEA.
  User: jingyile
  Date: 19-5-19
  Time: ����10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=gb2312" language="java" %>
<html>
<HEAD><TITLE><s:property value="subItemName"/></TITLE>
<META http-equiv=Content-Type content="text/html; charset=gb2312">
<LINK href="css/style_1_common.css" type=text/css rel=stylesheet>
<style type="text/css">
<!--
.STYLE1 {color: #069}
-->
</style>
</HEAD>
<BODY>
<DIV class=wrap>
<DIV id=header>
	<%@include file="head.jsp"%>
<DIV id=nav><A href="goIndex.action">BBS��̳</A> &raquo;<s:property value="subItemName"/>
<DIV class=pages_btns>
<DIV class=pages><EM>&nbsp;��<s:property value="page.totalPage"/>ҳ</EM>
	<s:if test="page.hasPrePage">
		<a href="showAllTopic.action?subItemID=${subItemID}&currentPage=1">��ҳ</a>
		<a href="showAllTopic.action?subItemID=${subItemID}&currentPage=${currentPage - 1}">��һҳ</a>
	</s:if>
	<s:else>
		<EM>��ҳ</EM>
		<EM>��һҳ</EM>
	</s:else>
	<s:if test="page.hasNextPage">
		<a href="showAllTopic.action?subItemID=${subItemID}&currentPage=${currentPage + 1}">��һҳ</a>
		<a href="showAllTopic.action?subItemID=${subItemID}&currentPage=${page.totalPage}">βҳ</a>
	</s:if>
	<s:else>
		<EM>��һҳ</EM>
		<EM>βҳ</EM>
	</s:else>
</DIV>
<SPAN class=postbtn id=newspecial ><a href="newTopic.jsp?subItemID=${param.subItemID}"><IMG src="image/newtopic.gif" alt=�������� width="84" height="29"></a></SPAN> </DIV>
<DIV id=headfilter></DIV>
<DIV class="mainbox threadlist">
<H1><s:property value="subItemName"/></H1>
  <TABLE cellSpacing=0 cellPadding=0 summary=forum_38>
  <THEAD class=category>
  <TR>
    <TD width="40" class=folder>&nbsp;</TD>
    <TD width="16" class=icon>&nbsp;</TD>
    <TH width="584">����</TH>
    <TD width="149" class=author>����</TD>
    <TD width="90" class=nums>�ظ�/�鿴</TD>
  </TR></THEAD>

  <s:iterator value="allTopic" var="topic">
  <TBODY>
  <TR>
    <TD class=folder><IMG
      src="image/folder_hot.gif" width="19" height="22"></TD>
    <TD class=icon>&nbsp; </TD>
    <TH class=hot><LABEL>&nbsp;</LABEL> <SPAN id=thread_60140><A
      style="FONT-WEIGHT: bold;" href="showTopic.action?subItemID=${subItemID}&topicID=${topic.topicID}">${topic.title}</A></SPAN></TH>
    <TD class=author><CITE><A href="">${topic.user.username}</A>
      </CITE><EM>${topic.date}</EM> </TD>
     <s:set var="replays" value="#attr.topic.replays"></s:set>
    <TD class=nums><STRONG><s:property value="replays.size"/></STRONG> / <EM>${topic.hasread}</EM></TD>
    </TR></TBODY>
    </s:iterator>
  </TABLE>
</DIV>
<DIV class=pages_btns>
<DIV class=pages><EM>&nbsp;��<s:property value="page.totalPage"/>ҳ</EM>
	<s:if test="page.hasPrePage">
		<a href="showAllTopic.action?subItemID=${subItemID}&currentPage=1">��ҳ</a>
		<a href="showAllTopic.action?subItemID=${subItemID}&currentPage=${currentPage - 1}">��һҳ</a>
	</s:if>
	<s:else>
		<EM>��ҳ</EM>
		<EM>��һҳ</EM>
	</s:else>
	<s:if test="page.hasNextPage">
		<a href="showAllTopic.action?subItemID=${subItemID}&currentPage=${currentPage + 1}">��һҳ</a>
		<a href="showAllTopic.action?subItemID=${subItemID}&currentPage=${page.totalPage}">βҳ</a>
	</s:if>
	<s:else>
		<EM>��һҳ</EM>
		<EM>βҳ</EM>
	</s:else>
</DIV>
<SPAN class=postbtn id=newspecialtmp >
<a href="newTopic.jsp?subItemID=${param.subItemID}"><IMG src="image/newtopic.gif" alt=�������� width="84" height="29"></a></SPAN> </DIV>

	<%@include file="foot.jsp"%>
</BODY></HTML>
