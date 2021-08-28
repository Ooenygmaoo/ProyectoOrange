#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
@Regresion
Feature: Ingreso a orange

@Caso1
Scenario Outline:
 
	Given abrir el navegador
	 When Ingrese username <userName> y la contraseña <userPass>
	  
	 Examples:
	 
	 |userName    |userPass| 
	 |Admin       |admin123|
	 
	 
 @Caso2
Scenario Outline:
 
	Given abrir el navegador
	 When Ingrese username <userName> y la contraseña <userPass>
	 And Acceder a la opcion addEmployee
	 Then Diligenciar los campos firstname <firstname> y lastname <lastname>
	 Examples:
	 
	 |userName    |userPass|firstname|lastname|
	 |Admin       |admin123|David    | López  |
	 
