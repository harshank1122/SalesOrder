<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Place Order</title>
<%@ include file="bp.jsp"%>
</head>
<body>
     <div class="newcush">
        <h1>Create New Order</h1>
    </div>
    <div class="user">
        <div class="for">
            <h1>>>>></h1>
        </div>
        <div class="newcus">
            <h1>Place new Order</h1>
        </div>
        <div class="mycust">
            <a href="">My Order</a>
        </div>
    </div>

    <div class="orform">
        <div class="container">
            <form action="OrderCon" method="post" class="row g-3">
                <br>
                <div class="cusde">
                    <h1>Customer Details</h1>
                </div>
                <div class="col-md-3">
                    <label for="">Customer Name</label>
                    <input type="text" name="customername" value = "<%= session.getAttribute("cusName")%>" class="form-control" id="inputEmail4">
                </div>
                <div class="col-md-3">
                    <label for="">Customer ID</label>
                    <input type="text" name="cusid" value = "<%= session.getAttribute("cusid")%>" class="form-control" id="inputEmail4">
                </div>
                <div class="col-md-6">
                    <label for="">Company Name</label>
                    <input name="companyName" value = "<%= session.getAttribute("comName")%>"  type="password"  class="form-control" id="inputPassword4">
                </div>
                <div class="col-md-6">
                    <label for="">Contact e-mail</label>
                    <input type="email" name="email" value = "<%= session.getAttribute("conEmail")%>" class="form-control" id="inputAddress">
                </div>
                <div class="col-md-6">
                    <label for="">Contact no.</label>
                    <input type="text" name="Contactno" value = "<%= session.getAttribute("conNum")%>"  class="form-control" id="inputAddress">
                </div>


                <div class="col-md-6">
                    <label for="">Billing Address</label>
                    <input type="text" name="Baddress" value = "<%= session.getAttribute("badd")%>"  class="form-control" id="inputAddress">
                </div>
                <div class="col-md-6">
                    <label for="">Shipping Address</label>
                    <input type="text" name="saddress" value = "<%= session.getAttribute("sadd")%>"  class="form-control" id="inputAddress">
                </div>
                <div class="prose">
                    <h1>Select Product</h1>
                </div>
                  <br><br>
                <div class="col-md-3">
                    <label for="">Select product name</label>
                    <select name="product"  id="inputState" class="form-select">
                        <option>Lee Jeains</option>
                        <option>Cottonking Shirts</option>
                        <option>Huddy</option>
                        <option>T-Shirts</option>
                    </select>
                </div>

                <div class="col-md-3">
                    <label for="">Size</label>
                    <select name="size"  id="inputState" class="form-select">
                        <option>L</option>
                        <option>XL</option>
                        <option>XXL</option>
                        <option>XXXL</option>
                    </select>
                </div>
                <div class="col-md-3">
                    <label for="">Quantity</label>
                    <select name="Quantity" id="inputState" class="form-select">
                        <option>10</option>
                        <option>20</option>
                        <option>30</option>
                        <option>40</option>
                        <option>50</option>
                    </select>
                </div>
                <div class="sub col-md-6">
                    <button type="submit" class="btn btn-primary">SUBMIT</button>
                </div>

            </form>
        </div>
    </div>
</body>
</html>