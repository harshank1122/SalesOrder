<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create New Customer</title>
<%@ include file="bp.jsp"%>
</head>
<body>
<input type = "hidden" id = "status" value = "<%= request.getAttribute("status")%>">
   <div class="newcush">
        <h1>Create New Customer</h1>
    </div>
    <div class="user">
        <div class="for">
            <h1>>>>></h1>
        </div>
        <div class="newcus">
            <h1>Create new customer</h1>
        </div>
        <div class="mycust">
            <a href="mycus.jsp">My Customer</a>
        </div>
    </div>
   
    <div class="form" >
        <div class="container">
            <form action="NewCusData" method="post" class="row g-3">
                <br>
                <div class="cusde">
                <h1>Customer Details</h1>
                </div>
                <div class="col-md-6">
                    <input name = "customername" type="text" placeholder="Customer Name" class="form-control" id="inputEmail4">
                </div>
                <div class="col-md-6">
                    <input type="text" name="companyName" placeholder="Company Name" class="form-control" id="inputPassword4">
                </div>
                <div class="col-md-6">
                    <input type="email" name="email" placeholder="Contact e-mail" class="form-control" id="inputAddress">
                </div>
                <div class="col-md-6">
                    <input type="text" name="Contactno" placeholder="Contact no." class="form-control" id="inputAddress">
                </div>
                <div class="billadd">
                    <h1>Billing Address</h1>
                    </div>
                    <br><br>
                <div class="col-md-12">
                    <input type="text" name="Baddress" placeholder="Address" class="form-control" id="inputAddress">
                </div>

                <div class="col-md-3">
                    <select name="bcountry"  id="inputState" class="form-select">
                        <option selected>Country</option>
                        <option>US</option>
                        <option>India</option>
                        <option>UK</option>
                    </select>
                </div>

                <div class="col-md-3">
                    <select placeholder="state" name="bstate" id="inputState" class="form-select">
                        <option selected>State</option>
                        <option>Maharashtra</option>
                        <option>kerala</option>
                        <option>goa</option>
                    </select>
                </div>
                <div class="col-md-3">
                    <select placeholder="city" name="bcity" id="inputState" class="form-select">
                        <option selected>City</option>
                        <option>Mumbai</option>
                        <option>kalifornia</option>
                        <option>lundon</option>
                    </select>
                </div>
                <div class="col-md-3">
                    <input type="text" name="bzip" placeholder="zip" class="form-control" id="inputZip">
                </div>

                <div class="shipadd">
                    <h1>Shipping Address</h1>
                    </div>
                    <br><br>
                <div class="col-md-12">
                    <input type="text" name="sadd" placeholder="Adress" class="form-control" id="inputAddress">
                </div>

                <div class="col-md-3">
                    <select name="scountry"  id="inputState" class="form-select">
                        <option selected>Country</option>
                        <option>US</option>
                        <option>India</option>
                        <option>UK</option>
                    </select>
                </div>

                <div class="col-md-3">
                    <select name="sstate" placeholder="state" id="inputState" class="form-select">
                        <option selected>State</option>
                        <option>Maharashtra</option>
                        <option>kerala</option>
                        <option>goa</option>
                    </select>
                </div>
                <div class="col-md-3">
                    <select name="scity" placeholder="city" id="inputState" class="form-select">
                        <option selected>City</option>
                        <option>Mumbai</option>
                        <option>kalifornia</option>
                        <option>lundon</option>
                    </select>
                </div>
                <div class="col-md-3">
                    <input type="text" name="szip" placeholder="zip" class="form-control" id="inputZip">
                </div>
                <br><br>
                <div class="sub col-md-6">
                    <button type="submit" class="btn btn-primary">SUBMIT</button>
                </div>
            </form>
        </div>
    </div>
    
    <script type="text/javascript">
	   var status = document.getElementById("status").value;
	   if(status == "success"){
		   swal("Done" ,"New Customer Add" , "success" )
	   }
	   
	   if(status == "failed"){
		   swal("Sorry" ,"Not Added" , "error" )
	   }
	   
	</script>
	
	
</body>
</html>