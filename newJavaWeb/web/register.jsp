<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2019/9/20
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<html>
<head>
    <title>My JSP 'BB.jsp' staring page</title>
</head>
<body>
    <form action="RegisterServlet" method="post" style="padding-top: -700px;">
        输入用户名：<input name="name" type="text"><br><br>
        输入密码：  <input name="pwd" type="password"><br><br>
        选择性别：  <input type="radio" name="sex" value="男" checked>男
                   <input type="radio" name="sex" value="女">女<br><br>
        选择家乡：
        <select name="home">
            <option value="上海">上海</option>
            <option value="北京" selected>北京</option>
            <option value="纽约">纽约</option>
        </select><br>
        填写个人信息：<br>
        <textarea name="info" rows="5" cols="30"></textarea><br>
        <input type="reset" value="重置"><input type="submit" value="注册">
    </form>

</body>
</html>
