<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/17
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>
        大招会列表
    </h1>
<form action="/bg/bigretDetail" method="get">
<c:forEach items="${list}" var="a">

    <p>${a}</p>
    <button type="submit" value="${a.bigretId}" name="id" >提交</button>
    <%--<a href="/bg/bigretDetail?id=${a.bigretId}">提交</a>--%>
    <font>aaaa</font>
</c:forEach>

    <script src="/js/jquery.js"></script>
</form>
</body>
</html>
