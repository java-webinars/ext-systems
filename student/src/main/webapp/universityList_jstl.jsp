<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        <h3>List of Universities ${today}</h3>

        <table border="1">
            <tbody>
                <c:forEach var="university" items="${universities}" varStatus="status">

                    <c:if test="${status.count%2==1}">
                      <tr style="background-color: yellow;">
                    </c:if>
                    <c:if test="${status.count%2!=1}">
                      <tr style="background-color: green;">
                    </c:if>

                        <td>${status.count}</td>
                        <td>${university.universityId}</td>
                        <td>${university.universityName}</td>

                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>
</html>

