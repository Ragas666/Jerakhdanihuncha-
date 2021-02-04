<footer class="main-footer">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-6">
                Copyright @ 2019 XYZ ConsultingLLC. All right reserved
            </div>
            <div class="col-md-2 offset-lg-4 justify-content-end">
                Designed by <a href="index.php">Rupesh Paudel</a>
            </div>
        </div>
    </div>
</footer>



<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>


<script>
    jQuery(document).ready(function() {
        jQuery('#nav li a').click(function() {
            var current = document.getElementsByClassName("active");
            current[0].className = current[0].className.replace(" active", "");
            this.className += " active";
        });
    });
</script>