<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/17
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>
        大招会列表
    </h1>

<c:forEach items="${bigretList}" var="a">
    <p>${a}</p>
</c:forEach>
</body>
</html>
