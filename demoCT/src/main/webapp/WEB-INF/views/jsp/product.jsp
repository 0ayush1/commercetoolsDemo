<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<title>Hello World</title>
</head>
<body bgcolor="lightblue" modelAttribute="img" >

 <h1> Welcome to ComerceTools </h1>
          <h3> Product : ${pd}</h3>
          <p> Image: ${img.url} </p>
          <p> Name: ${img.label} </p>
          <p> Dimension: ${img.dimensions.h}height
           <br> ${img.dimensions.w}width</p>


</body>
</html>