<?php include 'includes/header.php'?>

	
	<section id="contact_us">
		<div class="container">
        <div class="row">
            <div class="col-md-7 ">
                <div data-form-type="formoid">
                    <h3>Use this form to contact the XYZ Consulting team.</h3>
                    <form action="process.php" method="post">
						  <div class="form-group">
						    <label for="exampleFormControlInput1">Name</label>
						    <input type="text" class="form-control" id="name" name="name" placeholder="Your Name">
						  </div>
						  <div class="form-group">
						    <label for="exampleFormControlInput1">Phone</label>
						    <input type="text" class="form-control" id="phone"  placeholder="Your Phone">
						  </div>
						  <div class="form-group">
						    <label for="exampleFormControlInput1">Email address</label>
						    <input type="email" class="form-control" id="email" name="email" placeholder="Your Email">
						  </div>
						  
						  <div class="form-group">
						    <label for="exampleFormControlTextarea1">Message</label>
						    <textarea class="form-control" id="message" name="message" rows="3"></textarea>
						  </div>

						  <button type="submit" class="btn btn-primary">Submit</button>
						</form>
                </div>
            </div>
            <div class="col-md-5 text-center">
                <h3>Write or Visit us</h3>
                <p>150 W 134 Avenue, Suit 1608</p>
							<p>Denver, Colorado 80234</p>
							<p>Email: rpaudel2@cougars.ccis.edu</p>
                

            </div>
            </div>

        </div>
  
</section>

 <div class="container-fluid map">
		<div class="row">
                <div class="google-map"><iframe frameborder="0" style="border:0" src="https://www.google.com/maps/embed/v1/place?key=AIzaSyA0Dx_boXQiwvdz8sJHoYeZNVTdoWONYkU&amp;q=place_id:ChIJn6wOs6lZwokRLKy1iqRcoKw" allowfullscreen=""></iframe>
        		</div>
       	</div>
</div>

<?php
include 'includes/footer.php'

?>