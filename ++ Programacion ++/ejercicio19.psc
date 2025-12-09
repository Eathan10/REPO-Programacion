Algoritmo ejercicio19
	
	
	Definir n, i, contador Como Entero
	
    Escribir "Teclea un número:"
    Leer n
	
    contador = 0
	
    Para i = 1 Hasta n Hacer
        Si n % i = 0 Entonces
            contador = contador + 1
        FinSi
    FinPara
	
    Si contador = 2 Entonces
        Escribir n, " es primo."
    Sino
        Escribir n, " no es primo."
    FinSi
	
FinAlgoritmo

// 2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97