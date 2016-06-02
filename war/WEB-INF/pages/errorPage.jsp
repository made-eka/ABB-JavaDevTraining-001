<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<% response.addHeader("Refresh","5"); %>
<c:url var="resources" value="/resources/theme1" scope="request" />

<html>
    <head>
        <link href="${resources}/css/core.css" rel="stylesheet">
    </head>
    <body>
        <abb_h1>The Error Page</abb_h1><br>

        <form:form method="GET" action="/ABBJavaDev-SpringMVC/">
        <table>
        <tr><td><input type="submit" value="Welcome Page"/></td></tr>
        </table>
        </form:form>      
        
    </body>
</html>