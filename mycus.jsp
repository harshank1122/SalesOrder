<%@page import="org.careerX2.O.dto.CostomerDTO"%>
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
<title>My Customer</title>
<%@ include file="bp.jsp"%>
</head>
<body>
	<div class="updatetag">
		<h1>My Customer details</h1>
	</div>
	<div class="user">
		<div class="userin">
			<a href="salesRepLogin.jsp"><%=session.getAttribute("name")%></a>
		</div>
		<div class="mycus">
			<a href="SalesRepHomePa.jsp">My Order</a>
		</div>
		<div class="myor">
			<a href="mycus.jsp">My Customer</a>
		</div>
	</div>
	<div class="order">
		<div class="plcus">
			<a href="creatNewCus.jsp">+ Add New Customer</a>
		</div>
	</div>
	
	
	<div class="details">
	
		<table class="table">
			<thead class="table-dark">
				<tr>
				    <th>ID</th>
					<th>Email</th>
					<th>Name</th>
					<th>Contact no.</th>
					<th>Place Order</th>
					<th>Delete</th>
					<th>Update</th>
				</tr>
			</thead>
			<tbody>
				<%
				AllDao allDao = new AllDao();
				EntityManager entityManager = allDao.getEntityManager();
				Query query = entityManager.createQuery("from CostomerDTO");
				List<CostomerDTO> cusde = query.getResultList();
				for (CostomerDTO customerdto : cusde) {
				%>
				<tr>
					<td><%= customerdto.getId() %></td>
					<td><%=customerdto.getContactemail() %></td>
					<td><%=customerdto.getContactno() %></td>
					<td><%=customerdto.getCustomerName()%></td>
					<td><button type="submit" class="btn main-btn" onclick="window.location.href = 'OerderPlaceGet?cutomer_id=<%= customerdto.getId() %>' ; " >Click</button></td>
					<td><button type="submit" class="btn main-btn" onclick="window.location.href = 'delectcus?student_contactNo=<%= customerdto.getId() %>' ; ">Click</button></td>
					<td><button type="submit" class="btn main-btn">Click</button></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
	
	
	
	
</body>
</html>