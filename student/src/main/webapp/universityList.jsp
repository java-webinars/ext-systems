<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="edu.javacourse.student.domain.University, java.util.List"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test Page</title>
    </head>
    <body>
        <h1>List of Universities ${today}</h1>

        <%
            List<University> list = (List<University>)request.getAttribute("universities");
            for(University u : list) {
                out.println(u.getUniversityName());
                out.println("<br/>");
            }
        %>

    </body>
</html>
