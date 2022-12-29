<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
<title>Hello World</title>
</head>
<body>
<h1>Welcome</h1>


 <div align="center">
        <h2>User Registration</h2>
        <form:form action="qwerty" method="Post" modelAttribute="form">

            <form:label path="customerId">Customer ID</form:label>
            <form:input path="customerId"/><br/>

            <form:label path="externalId">External ID:</form:label>
            <form:input path="externalId"/><br/>

            <form:label path="title">Title</form:label>
            <form:input path="title"/><br/>

            <form:label path="firstName">First Name</form:label>
            <form:input path="firstName"/><br/>

            <form:label path="lastName">Last Name</form:label>
            <form:input path="lastName"/><br/>

            <form:label path="email">Email:</form:label>
            <form:input path="email"/><br/>

            <form:label path="password">Password:</form:label>
            <form:password path="password"/><br/>

             <form:label path="company">company Name:</form:label>
             <form:input path="company"/><br/>



            <form:button>Register</form:button>
        </form:form>
    </div>




</body>
</html>