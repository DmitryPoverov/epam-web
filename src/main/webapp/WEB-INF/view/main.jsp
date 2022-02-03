<%@ page contentType="text/html;charset=UTF-8" %>
<html>
    <head>
        <link href="/static/style.css" rel="stylesheet" type="text/css"/>
        <title>Main page</title>
    </head>
    <body>
        <div class="container">
            <h2>Hello, ${sessionScope.user}</h2>
            <h5>Returning data from sessionScope: ${sessionScope.testField}</h5>
        </div>
    </body>
</html>
