<%--
  Created by IntelliJ IDEA.
  User: Administrator.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>add</title>
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
        body{
            overflow-x:hidden;
        }
        #main{
            width:1200px;
            height:600px;
            margin-left:500px;
        }
    </style>
</head>
<body>

<div id="main">
    <!-- 标题 -->
    <div class="row">
        <div class="col-md-12">
            <h1>imooc-添加成员</h1>
        </div>
    </div>

    <form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/person/add" method="post">
        <div class="form-group">
            <label class="col-sm-1 control-label">人员名称</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" name="name" placeholder="请输入人员名称">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">密码</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" name="password" placeholder="请输入密码">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-1 col-sm-3">
                <button type="submit" class="btn btn-default">提交</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>
