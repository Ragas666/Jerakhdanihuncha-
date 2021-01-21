<?php include 'includes/header.php'?>
<?php include 'dbconnect.php' ?>


	<div id="stage">
		<div id="stage-caption">
			<h1 class="display-3">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</h1>
			<!-- <a href="#" class="btn btn-lg btn-success">Contact us today!</a> -->
		</div>
		
	</div>

<?php

$sql = "SELECT * FROM work LIMIT 3";
$result = $conn->query($sql);



?>

	<section id="abroad">
		<div class="container">
				<h2 class="text-center work">Our Work</h2>
            <div class="row">
            <?php
            if ($result->num_rows > 0) {
                // output data of each row
                while($row = $result->fetch_assoc()) {
                    ?>
                    <div class="col-lg-4 d-flex align-items-stretch">
                        <div class="card" style="width: 18rem;">
                            <img class="card-img-top" src="img/<?php if($row['name'] == 'social-work'){echo $row['name'];}elseif ($row['name'] == 'human-relationship'){echo $row['name'];}else{echo 'society';} ?>.jpg" alt="Card image cap">
                            <div class="card-body">
                                <p class="card-text"><?php echo $row["content"] ?> </p>
                            </div>
                        </div>
                    </div>

                    <?php
                }
            }

            $conn->close();
            ?>

		</div>
		</div>
	</section>
	

	<section id="contact">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<form action="process.php" method="post">
						<div class="form-group">
							<label for="name">Name</label>
							<input type="text" class="form-control" id="name" name="name" placeholder="Enter Name">
						</div>
						<div class="form-group">
							<label for="email">Email address</label>
							<input type="email" class="form-control" id="email" name="email" aria-describedby="emailHelp" placeholder="Enter email">
							<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
						</div>
						<div class="form-group">
							<label for="message">Message</label>
							<textarea class="form-control" id="message" name="message" rows="3"></textarea>
						</div>
						<button type="submit" class="btn btn-success">Submit</button>
					</form> 
				</div>
				<div class="col-lg-5 offset-lg-1">
					<div class="row">
						<div class="col-lg-12">
							<h2>Address</h2>
							<p>150 W 134 Avenue, Suit 1608</p>
							<p>Denver, Colorado 80234</p>
							<p>Email: rpaudel2@cougars.ccis.edu</p>
						</div>
					</div>
					<div class="row">
						<div class="col-sm-1">
							<a href="https://www.facebook.com/" target="_blank"><i class="fa fa-facebook-square" style="font-size:2rem;color:#fff"></i></a>
						</div>
						<div class="col-sm-1">
							<a href="https://www.linkedin.com/" target="_blank"><i class="fa fa-linkedin-square" style="font-size:2rem;color:#fff"></i></a>
						</div> 
					</div>
				</div>
			</div>
		</div>
	</section>
<?php




include 'includes/footer.php'

?>