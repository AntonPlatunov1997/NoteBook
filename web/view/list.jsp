<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Антон
  Date: 25.02.2019
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show all users</title>
</head>
<body>
<!-- html код -->
<%
    List<String> logins = (List<String>) request.getAttribute("userLogins");
    if(logins != null && !logins.isEmpty()) {
        for (String s:logins){
            out.println("<li>" + s + "</li>");
        }
    }
    // java код
%>
<!-- html код -->

</body>
</html>
