

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
                <li><a href="">Categories</a></li>
                <li><a href="">Activities</a></li>
                <li><a href="">Допомога</a></li>
                <li><a href="">Admin</a></li>

            </ul>
        </div>
        <h1>Транзакції витрат</h1>
        <div class="container">
            <form action="/Transaction/create" method="post">
                <span>Назва </span>
                    <select>
                   <opition></opition>
                    </select>


                <br>
                <span>Сума</span><input name="amount" type="number"><br>
                <span>Тип</span><input name="type" type="text"><br>
                <span>Дата</span><input name="date" type="date"><br>

                <input class="btnblue"  type="submit" value="Зберегти">
                <input class="btnblue"  type="reset" value="Очистити">
            </form>


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
        margin: 0 30px;
    }
    .list-group
    {
        display: flex;
        align-items: center;

    }

    a {
        color: #fff;
        text-decoration: none;
    }

    input {
        margin: 5px 10px;
        border-radius: 5px;
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
        margin: 10px 20px;
        color: #fff;
    }

</style>

</body>
</html>