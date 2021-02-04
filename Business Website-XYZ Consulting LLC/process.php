<?php
include 'dbconnect.php';
$name = $_POST["name"];
$email = $_POST["email"];
$message=$_POST["message"];

$sql = "INSERT INTO contact (name, email, message)
VALUES ('$name', '$email', '$message')";

if ($conn->query($sql) === TRUE) {
    echo "<script>alert('Your Message Has Been Sent Successfully')</script>";
    echo "<script>setTimeout(\"location.href = 'http://localhost:8888/rupesh/index.php';\",100);</script>";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();

?>