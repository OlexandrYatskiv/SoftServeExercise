<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

<div class="wrap-category">

    <div class="category-table">
        <div class="navigator">
            <ul class="list-group">
                <li><a href="/">Categories</a></li>
                <li><a href="/transactions">Activities</a></li>
                <li><a href="">Допомога</a></li>
                <li><a href="">Admin</a></li>

            </ul>
        </div>
        <h1>Категорії витрат</h1>
        <div class="container">
            <form action="/" method="get">
                <input type="text" name="name" placeholder="Lower case, all one word"/>
                <input type="submit" value="Пошук"/>
            </form>



            <table>
                <tr>

                    <th>Id</th>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Управління</th>
                </tr>
           <#list products as category>

               <tr>
                   <td>${category.id}</td>
                   <td>${category.name}</td>
                   <td>${category.description}</td>
                   <td>
                       <div class="controllers">
                           <form action="/product/edit/${category.id}" method="get">
                               <input type="submit" value="O"/>
                           </form>
                           <form action="/product/delete/${category.id}" method="post">
                               <input type="submit" value="X"/>
                           </form>

                       </div>
                   </td>
               </tr>

           </#list>



            </table>

        </div>
        <a href="/Category/createcategory"class="btnblue">Додати дані</a>
    </div>
</div>
</div>
<style>
    * {
        margin: 0;
        padding: 0;

    }
    li{
        list-style: none;
    }
    a{
        color: #000;
    }

    table, td, th {
        border: 1px solid;
        padding: 5px 10px;

    }

    .list-group
    {
        display: flex;
        justify-content: space-around;
    }


    a {
        color: #fff;
    }

    input {
        margin: 5px 10px;
        border-radius: 20px
    }
    table {
        width: 100%;
        border-collapse: collapse;
    }
    th {
        height: 40px;
    }
    .navigator
    {

        height: 30px;
        width: 100%;
        background-color: black;
    }
    .wrap-category
    {

        max-width: 100%;
    }
    .controllers
    {
        width: 100%;
        display: flex;
        align-items: center;
        justify-content: space-around;
    }
    .updatedata
    {

    }
    .container
    {
        background-color: #ededed;
        padding: 20px;
        margin: 20px;
    }
    .btnblue
    {
        background-color: rgb(72, 72, 255);
        padding: 3px 8px;
        margin: 5px 20px;
        color: #fff;
        border: #000 solid 1px;
        text-decoration: none;
    }
</style>

</body>
</html>