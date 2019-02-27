<%--
  Created by IntelliJ IDEA.
  User: Антон
  Date: 25.02.2019
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new user</title>
</head>
<body>
<div>
    <h1>Super app!</h1>
</div>
<div>
    <%
        if(request.getAttribute("exceptionLogin")!=null){
            out.println(request.getAttribute("exceptionLogin"));
        }
        if(request.getAttribute("exceptionValid")!=null){
            out.println(request.getAttribute("exceptionValid"));
        }

        if((request.getAttribute("userLogin")!= null)&&(request.getAttribute("userPassword")!=null)){
            out.println("<p>User '" + request.getAttribute("userLogin")+ "' added!</p>");

        }

    %>
</div>

<form method="post">
    <label>Login:
<input type="text" name ="login"><br />
    </label>

    <label>Password:
        <input type="password" name="password"><br />
    </label>

    <button type="submit">Submit</button>
</form>

<div>
    <button onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>
