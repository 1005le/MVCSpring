<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" context="text/html"; charset="UTF-8">
<title>Spring MVC -HelloWorld</title>

<link href="<c:url value='/resouce/css/style.css' />">
<script type="text/javascript" src="<c:url value='/resouce/js/main.js' />">
</script>
</head>
 
 
<body>
<img src="<c:url value='/resouce/images/1.png' />">
<img src="<c:url value='/resouce/images/2.png' />">
<img src="<c:url value='/resouce/images/3.png' />">

    <p> Form Nguoi Dung</p>
    <c:url value="/addUser" var="url"></c:url>
    <!-- nhay vao Post -->
    <form:form modelAttribute="user" method="post" action="${url}">
   <!--  Mapping model chuyen du lieu tu controller sang view--> 
   <p>Ten Nguoi dung</p><form:input path="name"/>
     <p>Pass Word</p><form:password path="password"/>
     <form:hidden path="id"/>
     <!-- value la gia tri gui len csdl, hoac gui vao doi tuong, label la gia tri hien thi len form html -->
       <p>So Thich</p><form:checkbox path="favorites" value="Xem phim" label="Xem phim"/>
       <form:checkbox path="favorites" value="Nghe Nhac" label="Nghe Nhac"/>
       <form:checkbox path="favorites" value="Doc Sach" label="Doc Sach"/>
      <%-- <p>So Thich</p><form:checkboxs path="favorites" items="${list}">
      </form:checkboxs> --%>
       <p>Gioi Tinh</p>
       <form:select path="gender">
       <form:option value="Name">Nam</form:option>
       <form:option value="Nu">Nu</form:option>
       </form:select>
       <p>Gioi thieu</p>
       
      <form:textarea path="about"/>
      <form:radiobutton path="acceptAgreement" value="true" label="Dong y dieu khoan su dung"/>
   
   <button type="submit"> Submit</button>
    </form:form>
</body>
 
 
</html>