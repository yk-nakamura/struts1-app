<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html>
<head>
    <title>Success Page</title>
</head>
<body>
    <h1>Success!</h1>
    <p>Message: <bean:write name="exampleForm" property="message"/></p>
</body>
</html>
