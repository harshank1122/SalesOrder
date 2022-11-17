<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IOrder Details</title>
<%@ include file="bp.jsp"%>
</head>
<body>
	<div class="orh1">
		<h1>Customer Details and Order Details</h1>
	</div>

	<div class="list">
		<h2>Order Details</h2>
         
		<ul>
			<li>Product Name : <span><%=session.getAttribute("proname")%>
					<%=session.getAttribute("lname")%></span></li>
			<li>Size : <span><%=session.getAttribute("size")%></span></li>
			<li>Quantity : <span><%=session.getAttribute("quantity")%></span></li>
		</ul>
		<h2>Customer Details</h2>

		<ul>
			<li>Name : <span><%=session.getAttribute("CusName")%></span></li>
			<li>Email : <span><%=session.getAttribute("email")%></span></li>
			<li>Contact Number : <span><%=session.getAttribute("CusNUm")%></span></li>
			<li>Company Name : <span><%=session.getAttribute("Cupname")%></span></li>

		</ul>

		<h2>Billing Address</h2>
		<ul>
			<li><%=session.getAttribute("badd")%></li>
		</ul>

		<h2>Shipping Address</h2>
		<ul>
			<li><%=session.getAttribute("Sadd")%></li>
		</ul>

	</div>
</body>
</html>