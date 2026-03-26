<?php
    echo "O nome é " . $_POST["nome"] . "</br>";
    echo "A senha é" . $_POST["senha"] . "</br>";
    echo "O anime é" . $_POST["anime"] . "</br>";
    echo "A formação é" . $_POST["formacao"] . "</br>";

    if(isset($_POST["termo"]))
        echo "Termo aceito. <br/>" . $_POST["termo"];

    echo "A altura é" . $_POST["altura"] . "</br>";

?>