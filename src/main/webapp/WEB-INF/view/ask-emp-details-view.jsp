<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<meta charset="UTF-8">

<html>
<head>
    <title>Ask details</title>
</head>

<body>

<h3>Dear Employee, please enter your details</h3>

<br>
<br>

<%--without Spring MVC form--%>
<%--<form action="showDetails" method="GET">--%>
<%--    <input type="text" name="empName"--%>
<%--    placeholder="Write your name"/>--%>
<%--    <input type="submit" value="OK"/>--%>
<%--</form>--%>

<%--with Spring MVC form--%>
<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department <form:select path="department">
    <!-- HARDCODED-->
<%--        <form:option value="Information Technology" label="IT"/>--%>
<%--        <form:option value="Human Resources" label="HR"/>--%>
<%--        <form:option value="Sales" label="Sales"/>--%>

        <form:options items="${employee.departments}"/>
</form:select>
    <br><br>
    Which car do you want?
    <!-- HARDCODED-->
<%--        VW <form:radiobutton path="carBrand" value="Volkswagen"/>--%>
<%--        Audi <form:radiobutton path="carBrand" value="Audi"/>--%>
<%--        MB <form:radiobutton path="carBrand" value="Mercedes-Benz"/>--%>

        <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br><br>
    Foreign language(s):
    <!-- HARDCODED-->
<%--    EN <form:checkbox path="languages" value="English"/>--%>
<%--    DE <form:checkbox path="languages" value="Deutch"/>--%>
<%--    FR <form:checkbox path="languages" value="French"/>--%>

    <form:checkboxes path="languages" items="${employee.languageList}"/>

    <br><br>

    Phone <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>

    E-mail: <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>

    <input type="submit" value="OK">

</form:form>

</body>

</html>