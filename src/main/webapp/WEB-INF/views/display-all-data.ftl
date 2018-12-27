<#setting number_format="computer">
<!DOCTYPE html>
<html lang="en">


<div class="container">
    <div class="col-lg-12">
         <h2 class="my-4">Display all Db values</h2>
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






    </table>
    <br>
</div>


<!-- /.container -->


</html>
