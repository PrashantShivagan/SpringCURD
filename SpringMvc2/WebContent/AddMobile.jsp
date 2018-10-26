<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix = "foo" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<foo:form action="addata" method="post" modelAttribute="my">
<tr>
<td >Mobile Id </td>
<td><foo:input path = "mobid"/>
</tr>

<tr>
<td >Mobile Name </td>
<td><foo:input path = "mobNmae"/>
</tr>

<tr>
<td >Mobile Price </td>
<td><foo:input path = "mobPrice"/>
</tr>

<tr>
<td >Mobile Category </td>
<td><foo:input path = "mobCategory"/>
</tr>

<tr>
<td>Online</td>
<td><foo:radiobutton path="mobonline" value="Yes"/>Yes
<td><foo:radiobutton path="mobonline" value="No"/>No
</td>


<tr>
<td><input type="submit" path="Add Mobile"/>
</tr>



</foo:form>
</table>
</body>
</html>