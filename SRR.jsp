<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CareerX2.0</title>
<%@ include file="bp.jsp"%>
</head>
<body>

    <input type = "hidden" id = "status" value = "<%= request.getAttribute("status")%>">
	<%@ include file="srrs.jsp"%>
	
	
	<script type="text/javascript">
	   var status = document.getElementById("status").value;
	   if(status == "success"){
		   swal("congrats" ,"Account Created Successfully" , "success" )
	   }
	   
	   if(status == "failed"){
		   swal("Sorry" ,"Sign Up Email Already Exists" , "error" )
	   }
	   
	</script>
	
</body>
</html>