<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2018/8/7
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <div class="page-header">
        <h3>添加新书籍</h3>
    </div>
    <div class="row">
        <div class="col-xs-4">


            <form action="" method="post">
                <div class="form-group">
                    <label>书籍编号</label>
                    <input type="text" name="booknumber" class="form-control">
                </div>
                <div class="form-group">
                    <label>书籍名称</label>
                    <input type="text" name="title" class="form-control">
                </div>
                <div class="form-group">
                    <label>书籍作者</label>
                    <input type="text" name="author" class="form-control">
                </div>
                <div class="form-group">
                    <label>出版社</label>
                    <input type="text" name="publishing" class="form-control">
                </div>
                <div class="form-group">
                    <label>书籍剩余量</label>
                    <input type="text" name="total" class="form-control">
                </div>
                <div class="form-group">
                    <label>书籍剩总量</label>
                    <input type="text" name="count" class="form-control">
                </div>
                <div class="form-group">
                    <button class="btn btn-primary">保存</button>
                </div>
            </form>

        </div>
    </div>


</div>


</body>
</html>
