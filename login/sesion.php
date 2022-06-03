<?php
$hostname="localhost:3307";
$database="multifarmacia";
$username="root";
$password="root";
$json=array();
	if(isset($_GET["cedula"]) && isset($_GET["password"])){
		$cedula=$_GET['cedula'];
		$password=$_GET['password'];

		$conexion=mysqli_connect($hostname,$username,$password,$database);

		$consulta="SELECT nombre1, nombre2, apellido1, apellido2 FROM paciente WHERE cedula= '{$cedula}' AND password= '{$password}'";
		$resultado=mysqli_query($conexion,$consulta);

		if($consulta){

			if($reg=mysqli_fetch_array($resultado)){
				$json[0][]=$reg;
			}
			mysqli_close($conexion);
			echo json_encode($json);
		}
	}