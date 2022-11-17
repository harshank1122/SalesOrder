<%@page import="org.careerX2.O.dto.Ordetails"%>
<%@page import="java.util.List"%>
<%@page import="javax.persistence.Query"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="org.careerX2.O.dao.AllDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order</title>
<%@ include file="bp.jsp"%>
</head>
<body>
   
    <div class="order">
        <div class="plor">
            <a href="">+ Place order</a>
        </div>
        <div class="date">
            <h1>Order Date : 6/11/22 - 13/11/22</h1>
        </div>
    </div>
    
    <div class="details">
	
		<table class="table">
			<thead class="table-dark">
				<tr>
					<th>Contact no.</th>
					<th>Product Name</th>
					<th>Size</th>
					<th>Quantity</th>
					<th>Date Of Order</th>
					<th>Order Details</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<%
				AllDao allDao = new AllDao();
				EntityManager entityManager = allDao.getEntityManager();
				Query query = entityManager.createQuery("from Ordetails");
				List<Ordetails> orde = query.getResultList();
				for (Ordetails or : orde) {
				%>
				<tr>
					<td><%= or.getConnu() %></td>
					<td><%= or.getProductN() %></td>
					<td><%= or.getSize() %></td>
					<td><%= or.getQuantity() %></td>
					<td>13/11/22</td>
					<td><button type="submit" class="btn main-btn" onclick="window.location.href = 'viewOrder?cutomernum=<%= or.getConnu() %>' ; " >Click</button></td>
					<td><button type="submit" class="btn main-btn" onclick="window.location.href = 'RecDelete?student_contactNo=<%= or.getConnu() %>' ; ">Click</button></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>