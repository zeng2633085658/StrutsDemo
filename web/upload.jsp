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
    <form action="upload" method="post" enctype="multipart/form-data">
        <label for="myFile">上传文件</label>
        <input type="file" name="myFile" />
        <input type="text" name="test" />
        <input type="submit" value="Upload" />
    </form>
</body>
</html>
