<#setting number_format="computer">
<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="www.exus.co.uk">Exus</a>
        </div>

        <ul class="nav navbar-nav">
            <li><a href="https://gr.linkedin.com/in/alexandros-gazis">LinkedIn</a></li>
            <li><a href="https://github.com/AlexandreLeFou/Rest-API">Github Repo</a></li>
        </ul>
    </div>
</nav>

<div class="container" style="padding-bottom: 300px;padding-top: 50px;">
    <div class="col-lg-12" align="center">
        <h1 class="my-4">Search email Functionality</h1>
    </div>

    <#if users?size != 0>

    <table class="table table-striped">
        <tr>
            <th>ID</th>
            <th>first_name</th>
            <th>last_name</th>
            <th>email</th>
            <th>gender</th>
            <th>ip_address</th>


        </tr>

        <#list users as users>

            <tr>

            <td>${users.id}</td>
            <td>${users.first_name}</td>
            <td>${users.last_name}</td>
            <td>${users.email}</td>
            <td>${users.gender}</td>
            <td>${users.ip_address}</td>



            </tr>
        </#list>

            </table>
            <div class="col-lg-12" align="right">
                <img class="rounded-circle img-fluid d-block mx-auto" style="width:12%"
                     src="https://www.crissh2020.eu/wp-content/uploads/2017/06/exus.jpg" alt="">
            </div>


        <#else>

            <div class="col-lg-12" align="center">
                <br>
                <h2 class="my-4" >There are no data entries to display </h2>
                <img class="rounded-circle img-fluid d-block mx-auto" style="width:30% "
                     src="https://www.crissh2020.eu/wp-content/uploads/2017/06/exus.jpg" alt="" >
                <p></p>
            </div>

        </#if>
    <div class="col-lg-12" align="right">
        <FORM>
            <INPUT TYPE="button" style="height:50px; width:135px"; VALUE="Contact Me"
                   onClick="parent.location='mailto:alexandrosgazis.ee@gmail.com?subject=Rest-API GitHub Project&cc=agazis@ee.duth.gr'">
        </FORM>
    </div>
        <br>



</div>


<br><br>


</body>

</html>