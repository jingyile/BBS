<%--
  Created by IntelliJ IDEA.
  User: jingyile
  Date: 19-5-19
  Time: ����10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gb2312" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/style_1_common.css">
    <script>
		var flag=true;
        function kill()
        {
            alert("�����µ�¼!");
			window.location="login.jsp";
		}
		function admin() {
			alert("Ŀǰδ��������,������������");
			window.location="admin.jsp";
		}
		function admin0() {
			alert("��ӭ���Ĺ���Ա�û���");
		}
    </script>
</head>
<body>
<DIV id=menu><SPAN class=avataonline>
			��ӭ�����̴�BBS��̳!<br>
		<s:if test="#session.username != null">���Ǳ�վ�ĵڡ�
			<%=application.getAttribute("count") %>
			��λ�ÿͣ�
			<br>
            ��ǰ��¼�˻�����${username}
			<button onclick="kill()">�л��û�</button>
			<s:if test="#session.username=='admin'">
				<script>
					if(flag==true)//ֻ���״ε�¼ʱ��ʾ����
					{
						alert("��ӭ��,���Ĺ���Ա�û���");
						flag=false;
					}
				</script>
				<button onclick="admin()">����Աר�����������룡</button>
			</s:if>
        </s:if>
		<s:else>
			<A href="register.jsp">ע��</A>
			<A href="login.jsp">��¼</A>
			<a href="goIndex">���ο���ݷ���</a><br>
			<a href="file.jsp">�ļ��ϴ���ʾ</a>
		</s:else>

		</SPAN>
</DIV>
</body>
</html>
