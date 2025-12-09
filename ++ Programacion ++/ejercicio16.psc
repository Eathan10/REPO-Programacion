Algoritmo ejercicio16
	
	Definir numeroUsuario, calculoCuadrado, numImpar Como Entero
	
	Escribir "Teclea un numero para calcular su cuadrado"
	Leer numeroUsuario
	
	numImpar = 1
	
	Para i = 1 Hasta numeroUsuario Con Paso 1 Hacer
		
		calculoCuadrado = calculoCuadrado + numImpar
		
		numImpar = numImpar + 2
		
	Fin Para
	
	Escribir "El cuadrado de " numeroUsuario " es: " calculoCuadrado
	
	
FinAlgoritmo


