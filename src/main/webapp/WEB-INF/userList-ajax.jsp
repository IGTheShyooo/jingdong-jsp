<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>您好Springboot</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript">
		$(function(){
			$.ajax({
				type: "get",
				url: "http://localhost:8090/findAll",
				//data :ajax 想服务器提交的数据
				dataType: "json", //服务器数据的返回值类型
				success: function(result){//服务器的返回数据
					$.each(result,function (index, user) {
						var id = user.id;
						var name = user.name;
						var age = user.age;
						var sex= user.sex;
						var tr = "<tr align='center'><td>"+id+"</td><td>"+name+"</td><td>"+age+"</td><td>"+sex+"</td></tr>";
						$("#userTable").append(tr);
					});
					alert(" ajax调用成功 真tm难");
				}
			});
		});
	</script>>

</head>
<body>
	<table id = "userTable" border="1px" width="65%" align="center">
		<tr>
			<td colspan="6" align="center"><h3>学生信息</h3></td>
		</tr>
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别</th>
			<th></th>
		</tr>
		
		<c:forEach items="${userList}" var="u">
			<tr>
				<th>${u.id}</th>
				<th>${u.name}</th>
				<th>${u.age}</th>
				<th>${u.sex}</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>