<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2018/8/8
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <div class="page-header">
        <h3>编辑书籍</h3>
    </div>
    <div class="row">
        <div class="col-xs-4">


            <form action="" method="post">
                <input type="hidden" name="id" value="${book.id}">
                <div class="form-group">
                    <label>书籍编号</label>
                    <input type="text" name="booknumber" class="form-control" value="${book.booknumber}">
                </div>
                <div class="form-group">
                    <label>书籍名称</label>
                    <input type="text" name="title" class="form-control" value="${book.title}">
                </div>
                <div class="form-group">
                    <label>书籍作者</label>
                    <input type="text" name="author" class="form-control" value="${book.author}">
                </div>
                <div class="form-group">
                    <label>书籍出版社</label>
                    <input type="text" name="publishing" class="form-control" value="${book.publishing}">
                </div>
                <div class="form-group">
                    <label>书籍剩余数量</label>
                    <input type="text" name="total" class="form-control" value="${book.total}">
                </div>
                <div class="form-group">
                    <label>书籍总计数量</label>
                    <input type="text" name="count" class="form-control" value="${book.count}">
                </div>


                    <button class="btn btn-primary">保存</button>
                </div>
            </form>

        </div>
    </div>


</div>


</body>
</html>
