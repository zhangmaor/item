<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/17
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
列表值：<c:forEach items="${list}" var="a">
    <p>${a}</p><font>测试！！！</font>

</c:forEach>
详细值：<h2>
        <h1>${ezdBigret}</h1>
</h2>
</body>
</html>
