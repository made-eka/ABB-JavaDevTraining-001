<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% response.addHeader("Refresh","5"); %>
<c:url var="resources" value="/resources/theme1" scope="request" />

<html>
    <head>
        <link href="${resources}/css/core.css" rel="stylesheet">
    </head>
    <body>
        <abb_h1>The Error Pages</abb_h1><br>
        <abb_h2>${input_message}</abb_h2>
        
        <input type="button" value="Back" onclick="window.location.assign('/ABBJavaDev-SpringMVC/')"/>
    </body>
</html>