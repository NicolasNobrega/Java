
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title></title>
    <style>
    form{
    background-image: linear-gradient(to top, #FF8C00, #FFFF00);
    border: 2px solid black;
    border-radius: 5px;
    box-shadow: 5px 5px 7px rgba(0, 0, 0, 0.459);
    margin: 30px auto ; 
    padding: 20px;
    width: 300px;
    text-align: center;
    line-height: 30px;
}
    </style>
</head>

<body>
        <h4 align = "center">Formulario de calculo de Consumo de Combustivel</h4>
        <div id="div2">
            <form method="post" action="consumo.do">
                Número de Casas<input class="form-control" type="text" size="4" maxlength="4" name="kmi" placeholder="Digite o Numero da casa" />
                Número da TV:<input class="form-control" type="text"  name="kmf"  placeholder="O canal da TV" />
               
             
                <button class="btn btn-primary" type="submit" value="Registrar">Enviar</button>
                <button class="btn btn-danger" type="reset" value="Limpar">Limpar</button>
                <button class="btn btn-danger" type="" value="Limpar">Calcular</button>
                
        </form>
        </div>
   
</body>
    </body>
</html>
