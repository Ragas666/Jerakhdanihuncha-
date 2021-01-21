
<!DOCTYPE html>
<html>
<head>
	<title>XYZ Consulting LLC</title>
	<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <link rel="stylesheet" href="<?php echo 'css/style.css' ?>">

  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<?php
$directoryURI = $_SERVER['REQUEST_URI'];
$path = parse_url($directoryURI, PHP_URL_PATH);
$components = explode('/', $path);
$first_part = $components[2];
?>
<nav class="navbar navbar-expand-md navbar-dark bg-dark ">
    <div class="container">
        <a class="navbar-brand" href="<?php echo 'index.php'?>">XYZ Consulting LLC</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-end" id="navbarText">
            <ul class="navbar-nav" id="nav">
                <li class="nav-item">
                    <a class="nav-link <?php if ($first_part=="" || $first_part =="index.php") {echo "active"; } else  {echo "noactive";}?>" href="<?php echo 'index.php'?>">Home <span class="sr-only">(current)</span></a>
                </li>

                <li class="nav-item">
                    <a class="nav-link <?php if ($first_part=="about.php") {echo "active"; } else  {echo "noactive";}?>" href="<?php echo 'about.php'?>">About us</a>
                </li>


                <li class="nav-item">
                    <a class="nav-link <?php if ($first_part=="contact.php") {echo "active"; } else  {echo "noactive";}?>" href="<?php echo 'contact.php'?>">Contact us</a>
                </li>

            </ul>

        </div>
    </div>
</nav>

