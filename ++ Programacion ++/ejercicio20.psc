Funcion primo <- esPrimo ( n, i, contador )
	
	Para i = 1 Hasta n Hacer
		Si n % i = 0 Entonces
			contador = contador + 1
		FinSi
	FinPara
	
	Si contador = 2 Entonces
		Escribir n
	FinSi
	
Fin Funcion

Algoritmo ejercicio20
	
	
	
	Definir n, i, contador Como Entero
	
	Escribir "Teclea un número:"
    Leer n
	
	contador = 0
	
	Mientras n <> 0 Hacer
		
		
		Escribir  esPrimo(n,i,contador)
		
		n = n - 1
		contador = 0
		
	Fin Mientras
	
	
	
	
FinAlgoritmo
