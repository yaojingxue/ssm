<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2018/8/7
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Document</title>
    <link rel="stylesheet" href="/static/css/bootstrap-theme.min.css">
</head>
<body>
<div class="container">
    <div class="page-header">
        <h3>图书列表</h3>
        <c:if test="${not empty message}">
            <div class="alert alert-success">${message}</div>
        </c:if>
        <a href="/books/new" class="btn btn-success">添加新书籍</a>
    </div>
    <table>
        <thead>
        <tr>
            <th>图书编号</th>
            <th>图书名称</th>
            <th>作者</th>
            <th>出版社</th>
            <th>剩余</th>
            <th>总计</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${bookList}" var="book">
            <tr>
                <th>${book.booknumber}</th>
                <th>${book.title}</th>
                <th>${book.author}</th>
                <th>${book.publishing}</th>
                <th>${book.total}</th>
                <th>${book.count}</th>
                <th></th>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

</body>
</html>
