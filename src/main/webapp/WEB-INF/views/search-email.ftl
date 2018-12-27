<#setting number_format="computer">
<!DOCTYPE html>

<html lang="en">


<body>

<div class="container" style="padding-bottom: 300px;padding-top: 50px;">
    <div class="col-lg-12">
        <center> <h2 class="my-4">Search email Functionality</h2> </center>
    </div>

    </table>
    <#if users?size != 0>
    <div class="col-lg-12">
        <img class="rounded-circle img-fluid d-block mx-auto"style="width:20%" src="https://www.crissh2020.eu/wp-content/uploads/2017/06/exus.jpg" alt="">
        <p></p>
    </div>
        <table class ="table table-striped">
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

    <#else>
        <center> <h5 class="my-4">There are no data entries to display </h5> </center>
        <div class="col-lg-12">
            <img class="rounded-circle img-fluid d-block mx-auto"style="width:50%" src="https://www.crissh2020.eu/wp-content/uploads/2017/06/exus.jpg" alt="">
            <p></p>
        </div>
    </#if>
    <br>
</div>
</body>
</html>