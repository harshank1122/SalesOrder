<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!doctype html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>adminlogin</title>
<%@ include file="bp.jsp"%>
</head>

<body>
<div class= "log">
   <h1>Order Processing Team Login</h1>
</div>
	<input type = "hidden" id = "submit" value = "<%= request.getAttribute("submit")%>">
	<%@ include file="login.jsp"%>
     <script type="text/javascript">
	   var status = document.getElementById("submit").value;
	   
	   if(status == "failed"){
		   swal("Sorry" ,"Incorrect User and Pass" , "error" )
	   }
	   
	</script>
</body>

</html>