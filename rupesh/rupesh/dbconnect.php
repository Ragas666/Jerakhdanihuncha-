<?php
$servername = "localhost";
$username = "root";
$password = "root";
$db = "xyz";

// Create connection
$conn = new mysqli($servername, $username, $password, $db);


// Check connection
if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
//else {
//    echo "Connected successfully";
//}


?>