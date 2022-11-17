
<div class="heding">
	<h1>Sales Representative Registration</h1>
</div>
<div class="form">
	<div class="container">
		<form action="SalesRepController" method="post" class="row g-3">
			<div class="col-md-6">
				<label for="inputAddress" class="form-label">First Name</label> <input
					name = "fname" type="text" class="form-control" id="inputAddress">
			</div>
			<div class="col-md-6">
				<label for="inputAddress" class="form-label">Last Name</label> <input
					name = "lname" type="text" class="form-control" id="inputAddress">
			</div>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">Email</label> <input
					name="email" type="email" class="form-control" id="inputEmail4">
			</div>
			<div class="col-md-6">
				<label for="inputPassword4" class="form-label">Password</label> <input
					name="pass" type="password" class="form-control" id="inputPassword4">
			</div>
			<div class="col-md-6">
				<label for="inputAddress" class="form-label">Contact No</label> <input
					name="contactno" type="text" class="form-control" id="inputAddress">
			</div>
			<div class="col-md-6">
				<label for="inputAddress" class="form-label">Company Name</label> <input
					name="comname" type="text" class="form-control" id="inputAddress">
			</div>
			<div class="col-md-6">
				<label for="inputCity" class="form-label">Address</label> <input
					name="addres" type="text" class="form-control" id="inputCity">
			</div>
			<div class="col-md-4">
				<label for="inputState" class="form-label">State</label> <select
					name="state" id="inputState" class="form-select">
					<option selected>Choose...</option>
					<option>Maharashtra</option>
					<option>kerala</option>
					<option>goa</option>
				</select>
			</div>
			<div class="col-md-2">
				<label for="inputZip" class="form-label">Zip</label> <input
					name="zip" type="text" class="form-control" id="inputZip">
			</div>
			<div class="col-md-6">
				<button type="submit" class="btn btn-primary">Sign Up</button>
			</div>
			<div class="col-md-6">
				<a href="salesRepLogin.jsp">For Login Page</a>
			</div>
		</form>
	</div>
</div>