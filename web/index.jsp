<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>首页</title>
</head>
<body>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
    <h1>Hello World From Struts2</h1>
        <form action="hello" method="post">
            <label for="name">请输入你的名字</label><br/>
            <input type="text" name="name"/>
            <input type="submit" value="Say Hello"/>
        </form>
</body>
</html>
</body>
</html>
