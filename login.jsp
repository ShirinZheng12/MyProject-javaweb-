<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>登录</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
		<!-- <style>
			.bg {
				background:url(images/306790.jpg);
				background-repeat:repeat;
			}
		</style> -->

	</head>
	
	<body style="background:url(admin/images/300170.jpg)">

		<form action="loginAction" method="post">
			<table
				style="position:relative; margin-top:300px; margin-left:700px; background-image: url(admin/images/login_error.png); width: 460px; height: 260px;">
				<tr>
					<!-- <td colspan="2">
						<img src="admin/images/login_header.png">
					</td> -->
					
					<td colspan="2" style="padding-left:150px; padding-top:20px">
						<h1>题库管理系统</h1>
					</td>
				</tr>
				<tr>
					<td>
						&nbsp;&nbsp;&nbsp;<img src="admin/images/login_computer.png" style="width: 120px; height: 120px">
					</td>
					
					<td>
						<table align="center">
							<tr>
								<td align="left" style="width: 60px;">
									用户名
								</td>
								<td align="left">
									<input type="text" name="username" style="width: 200px;">
								</td>
							</tr>
							<tr><td colspan="2"></td></tr>
							<tr>
								<td align="left">
									密码
								</td>
								<td align="left">
									<input type="password" name="password" style="width: 200px;">
								</td>
							</tr>
							<tr><td colspan="2"></td></tr>
							<tr>
								<!-- <td colspan="2" align="right">
									<input type="radio" name="userClass" value="student"
										checked="checked">学生
									<input type="radio" name="userClass" value="teacher">老师
									<input type="radio" name="userClass" value="teacher">管理员
								</td> -->
								<td colspan="2" align="center">
									<!-- <input type="radio" name="userClass" value="student"
										checked="checked">学生 -->
									<input type="radio" name="userClass" value="teacher">老师
									<input type="radio" name="userClass" value="teacher">管理员
								</td>
							</tr>
							<tr><td colspan="2"></td></tr>
							<tr>
								<td colspan="2" align="center">
									<input type="submit" value="登录">
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</form>
		
	</body>
	
</html>
