<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
    <form method="POST" action="">
        <label for="email">Email:</label>
        <input type="text" id="email" name="email" placeholder="username@gmail.com" required>
        
        <label for="senha">Senha:</label>
        <input type="password" id="senha" name="senha" placeholder="**********" required>
        
        <button type="submit">Entrar</button>
    </form>
</body>
</html>
<?php
session_start();

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $email = $_POST['email'] ?? '';
    $senha = $_POST['senha'] ?? '';

    // Exemplo básico de validação
    if (!empty($email) && !empty($senha)) {
        echo "Login efetuado com sucesso! Email: " . htmlspecialchars($email);
        // Aqui você pode implementar lógica de autenticação, como consulta ao banco de dados
    } else {
        echo "Por favor, preencha todos os campos.";
    }
}
?>
