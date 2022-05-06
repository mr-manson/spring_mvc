<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<meta charset="UTF-8">

<html>
<head>
    <title>Show details</title>
</head>

<body>

<h3>Dear Employee, you're welcome!</h3>
<br>
<!--Your name is ${param.empName}-->  <!--without Model-->
<!-- Your name is ${nameAttrbt} ${dscrptn}--> <!--with Model-->

Name: ${employee.name}
<br>
Surname: ${employee.surname}
<br>
Salary: ${employee.salary}
<br>
Department: ${employee.department}
<br>
Car: ${employee.carBrand}
<br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li> ${lang} </li>
    </c:forEach>
</ul>
<br>
Phone: ${employee.phoneNumber}
<br>
E-mail: ${employee.email}
<br>

</body>

</html>