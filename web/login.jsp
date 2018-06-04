<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="loginaction" method="post">
        用户名:<br/><input type="text" name="user"/><br/>
        密码:<br/><input type="password" name="password"/><br/>
        <input type="submit" value="Login"/></br>
    </form>
    <for>
</body>
</html>
