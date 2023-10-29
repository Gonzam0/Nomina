<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa</title>
<style>
  body {
    text-align: center;
    background-color: #f0f0f0;
    font-family: Arial, sans-serif;
  }

  h1 {
    margin-top: 20px;
  }

  table {
    margin: 0 auto;
    background-color: #fff;
    padding: 20px;
    border-radius: 10px;
    border: solid black;
  }

  td {
    padding: 10px;
  }

  a {
    text-decoration: none;
    color: #333;
    font-weight: bold;
  }

  a:hover {
    color: #0078d4;
  }
</style>
</head>
<body>
  <h1>Menú de opciones de Nóminas</h1>
  <table>
    <tr>
      <td><a href="ControladorEmpleados?opcion=mostrarEmp"> Mostrar los Empleados </a></td> <!-- LLeva al jsp de mostar empleados -->
    </tr>
    <tr>
      <td><a href="ControladorEmpleados?opcion=editarEmp"> Editar un Empleado </a></td> <!-- LLeva al jsp de editar empleados -->
    </tr>
    <tr>
      <td><a href="ControladorEmpleados?opcion=mostrarNom"> Mostrar Nóminas </a></td> <!-- LLeva al jsp de mostar nominas -->
    </tr>
  </table>
</body>
</html>
