<%--
  Created by IntelliJ IDEA.
  User: jingyile
  Date: 19-5-19
  Time: ����10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=gb2312" language="java" %>


<html>
<HEAD><TITLE>${topic.title}</TITLE>
<META http-equiv=Content-Type content="text/html; charset=gb2312">
<LINK href="css/style_1_viewthread.css" type=text/css rel=stylesheet>
<LINK href="css/style_1_common.css" type=text/css rel=stylesheet>
</HEAD>
<BODY>
<DIV class=wrap>
    <%@include file="head.jsp"%>
<DIV id=nav><A href="goIndex.action">BBS��̳</A> &raquo;<a href="showAllTopic.action?subItemID=${subItemID}">${subItemName}</a>&raquo;${topic.title}
<DIV class=pages_btns>
<DIV class=pages><EM>&nbsp;��<s:property value="page.totalPage"/>ҳ</EM>
	<s:if test="page.hasPrePage">
		<a href="showTopic.action?topicID=${topicID}&currentPage=1">��ҳ</a>
		<a href="showTopic.action?topicID=${topicID}&currentPage=${currentPage - 1}">��һҳ</a>
	</s:if>
	<s:else>
		<EM>��ҳ</EM>
		<EM>��һҳ</EM>
	</s:else>
	<s:if test="page.hasNextPage">
		<a href="showTopic.action?topicID=${topicID}&currentPage=${currentPage + 1}">��һҳ</a>
		<a href="showTopic.action?topicID=${topicID}&currentPage=${page.totalPage}">βҳ</a>
	</s:if>
	<s:else>
		<EM>��һҳ</EM>
		<EM>βҳ</EM>
	</s:else>
</DIV>
<SPAN class=replybtn><a href="#replays"><IMG src="image/reply.gif" alt="" width="75" height="29" border=0></a></SPAN></DIV>
<FORM name=modactions method=post>
  <DIV class="mainbox viewthread">
    <H1>${topic.title}</H1>
<TABLE id=pid256809 cellSpacing=0 cellPadding=0 summary=pid256809>
  <TBODY>
  <TR>
    <TD class=postauthor><P>${topic.user.username}</P>
      <P><EM>
          	<s:if test="topic.user.popedom == 3"> ����Ա</s:if>
          	<s:if test="topic.user.popedom == 2">��Ŀ����</s:if>
          	<s:if test="topic.user.popedom == 1">����Ŀ����</s:if>
          	<s:if test="topic.user.popedom == 0">��ͨ�û�</s:if>
          </EM>
      <DL class=profile>
        <DT>ID</DT>
        <DD>${topic.user.userID}</DD>
        <DT>����</DT>
        <DD>${topic.user.integral}</DD>
       </DL> 
      </TD>
    <TD class=postcontent>
      <DIV class=postinfo>
      ������ 
      ${topic.date}&nbsp;</DIV>
      <DIV class="postmessage defaultpost">
      <H2>${topic.title}</H2>
      <DIV class=t_msgfont id=postmessage_256809>
      	${topic.content}
      </DIV>
 </DIV>
      </TD>
  </TR>
  <TR>
    <TD class=postauthor>
      <DIV class="popupmenu_popup userinfopanel" id=userinfo256809_menu 
      style="DISPLAY: none">
      <DIV class=imicons></DIV>
      <DL></DL>
     </DIV></TD>
    <TD class=postcontent>
      <DIV class=postactions>
      <P><STRONG title=���� onclick=scroll(0,0)>TOP</STRONG> </P>
      <DIV id=ad_thread1_0></DIV></DIV></TD></TR></TBODY></TABLE></DIV>
<DIV id=ad_interthread></DIV>

<s:iterator value="replays" var="replay">
<DIV class="mainbox viewthread">
<TABLE id=pid256812 cellSpacing=0 cellPadding=0 summary=pid256812>
  <TBODY>
  <TR>
    <TD class=postauthor><CITE></CITE> 
      <P>${replay.user.username}</P>
      <P><EM>
      		<s:if test="#attr.replay.user.popedom == 3"> ����Ա</s:if>
          	<s:if test="#attr.replay.user.popedom == 2">��Ŀ����</s:if>
          	<s:if test="#attr.replay.user.popedom == 1">����Ŀ����</s:if>
          	<s:if test="#attr.replay.user.popedom == 0">��ͨ�û�</s:if>
         </EM></P>
      <DL class=profile>
        <DT>ID</DT>
        <DD>${replay.user.userID}</DD>
        <DT>����</DT>
        <DD>${replay.user.integral}</DD>
       </DL> 
      </TD>
    <TD class=postcontent>
      <DIV class=postinfo>������${replay.date}</DIV>
      <DIV class="postmessage defaultpost">
      <DIV class=t_msgfont id=postmessage_256812>${replay.content}</DIV>
      <DIV id=post_rate_div_256812></DIV></DIV>
      </TD>
  </TR>
  <TR>
    <TD class=postauthor>
      <DIV class="popupmenu_popup userinfopanel" id=userinfo256812_menu 
      style="DISPLAY: none">
      <DL></DL>
      <P></P></DIV></TD>
    <TD class=postcontent>
      <DIV class=postactions>
      <P><STRONG title=���� onclick=scroll(0,0)>TOP</STRONG> </P>
      <DIV id=ad_thread1_1></DIV></DIV>
      </TD>
   </TR>
   </TBODY>
  </TABLE>
</DIV>
</s:iterator>

<DIV class=pages_btns>
<DIV class=pages><EM>&nbsp;��<s:property value="page.totalPage"/>ҳ</EM>
	<s:if test="page.hasPrePage">
		<a href="showTopic.action?topicID=${topicID}&currentPage=1">��ҳ</a>
		<a href="showTopic.action?topicID=${topicID}&currentPage=${currentPage - 1}">��һҳ</a>
	</s:if>
	<s:else>
		<EM>��ҳ</EM>
		<EM>��һҳ</EM>
	</s:else>
	<s:if test="page.hasNextPage">
		<a href="showTopic.action?topicID=${topicID}&currentPage=${currentPage + 1}">��һҳ</a>
		<a href="showTopic.action?topicID=${topicID}&currentPage=${page.totalPage}">βҳ</a>
	</s:if>
	<s:else>
		<EM>��һҳ</EM>
		<EM>βҳ</EM>
	</s:else>
</DIV>
<SPAN 
class=replybtn><a href="#replays"><IMG src="image/reply.gif" alt="" width="75" height="29" border=0></a></SPAN></DIV>
</FORM>
<DIV class=ad_footerbanner>
<form action="replayAdd.action" method="post" name="replays">
	<input type="hidden" name="username" value="${session.username}"/>
    <input type="hidden" name="topidID" value="${topic.topicID}"/>
    <INPUT id=subject tabIndex=3 size=45 name="content">
<%--	<FCK:editor instanceName="content" basePath="/fckeditor" toolbarSet="Basic" height="200"></FCK:editor>--%>
	<BUTTON id=postsubmit tabIndex=300 name=topicsubmit type=submit value="true">����ظ�</BUTTON>
</form>  
</DIV>

    <%@include file="foot.jsp"%>
</BODY></HTML>

