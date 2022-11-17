<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="bp.jsp"%>
<title>SalesRepLogin</title>
</head>
<body>
    <div class="heding">
        <h1>Sales Representative Login</h1>
    </div>
    <input type = "hidden" id = "submit" value = "<%= request.getAttribute("submit")%>">
    <div class="login">
        <div class="container">
            <form action="SelsRepLoginVal" method="post" class="row g-3">
                <div class="col-md-6">
                    <label for="inputEmail4" class="form-label">Contact Number</label>
                    <input name = "conNum" type="text" class="form-control" id="inputEmail4">
                </div>
                <div class="col-md-6">
                    <label for="inputPassword4" class="form-label">Password</label>
                    <input name = "pass" type="password" class="form-control" id="inputPassword4">
                </div>
                <div class="col-md-6">
                    <a href="SRR.jsp">For Sign Up</a>
                </div>
                <div class="col-md-6">
                    <button type="submit" class="btn btn-primary">Login</button>
                </div>
            </form>
        </div>
    </div>
    
    <script type="text/javascript">
	   var status = document.getElementById("submit").value;
	   
	   if(status == "failed"){
		   swal("Sorry" ,"Incorrect User and Pass" , "error" )
	   }
	   
	</script>
	
	
</body>
</html>