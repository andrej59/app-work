<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Second Page</title>
</head>
<body>
Введенное имя: ${userJSP.name};
<br/>
Введенный пароль: ${userJSP.password};
<br/>
<p>Locale  ${locale}!</p> //берется из метода checkUser() в контроллере
</body>
</html>