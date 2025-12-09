Algoritmo ejercicio10
	
	Definir importe Como Real
	Definir consumo Como Entero
	
	Escribir "Teclea tu consumo en minutos"
	Leer consumo
	
	Si consumo < 300 Entonces
		importe = consumo * 0.04
	Fin Si
	
	Si consumo > 300 y consumo < 500 Entonces
		importe = consumo * 0.03
	Fin Si
	
	Si consumo > 500 Entonces
		importe = (300 * 0.03) + ((consumo - 300) * 0.02 ) 
	Fin Si
	
	Si consumo > 800 Entonces
		importe = (300 * 0.03) + ((consumo - 300) * 0.02 )
		importe = importe * 0.9875
	Fin Si
	
FinAlgoritmo
