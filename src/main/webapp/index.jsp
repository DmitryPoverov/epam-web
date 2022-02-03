<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <link href="/static/style.css" rel="stylesheet" type="text/css"/>
    <title>Login page</title>
</head>
<body>
<div class="container">
    <form method="post" action="${pageContext.request.contextPath}/login?command=login">
        <label class="login-row" for="login">Login form</label>
        <input class="login-row" type="text" name="login" id="login"/>
        <label class="login-row" for="password">Password form</label>
        <input class="login-row" type="password" name="password" id="password"/>
        <input class="login-row" type="submit"/>
    </form>
    <div style="color: red">
        ${requestScope.errorMessage}
    </div>
</div>
<a href="test.jsp">Link to the expression language sample.</a>
</body>
</html>