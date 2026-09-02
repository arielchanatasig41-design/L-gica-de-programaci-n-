Algoritmo Parqueadero
	
	Definir opcion, vehiculo, rol, dia, boleto, horas Como Entero
	Definir tarifa, total Como Real
	
	Repetir
		
		Escribir "===== PARQUEADERO ====="
		Escribir "1. Calcular tarifa"
		Escribir "2. Ver tarifas"
		Escribir "3. Salir"
		Leer opcion
		
		Segun opcion Hacer
			
			1:
				Escribir "Tipo de vehiculo:"
				Escribir "1. Carro"
				Escribir "2. Moto"
				Leer vehiculo
				
				Escribir "Rol:"
				Escribir "1. Estudiante"
				Escribir "2. Docente"
				Escribir "3. Administrativo"
				Leer rol
				
				Escribir "Dia:"
				Escribir "1. Laborable"
				Escribir "2. Fin de semana"
				Leer dia
				
				Escribir "Numero de horas:"
				Leer horas
				
				Escribir "¿Perdio el boleto?"
				Escribir "1. Si"
				Escribir "2. No"
				Leer boleto
				
				Si boleto = 1 Entonces
					
					Si vehiculo = 1 Entonces
						total <- 20
					SiNo
						total <- 10
					FinSi
					
				SiNo
					
					Si vehiculo = 1 Entonces
						
						Si rol = 1 Entonces
							tarifa <- 0.50
						SiNo
							Si rol = 2 Entonces
								tarifa <- 0.75
							SiNo
								tarifa <- 1
							FinSi
						FinSi
						
					SiNo
						
						Si rol = 1 Entonces
							tarifa <- 0.25
						SiNo
							Si rol = 2 Entonces
								tarifa <- 0.50
							SiNo
								tarifa <- 0.75
							FinSi
						FinSi
						
					FinSi
					
					total <- tarifa * horas
					
				FinSi
				
				Escribir "Total a pagar: $", total
				
			2:
				Escribir "===== TARIFAS ====="
				Escribir "Carro:"
				Escribir "Estudiante: $0.50 por hora"
				Escribir "Docente: $0.75 por hora"
				Escribir "Administrativo: $1.00 por hora"
				Escribir ""
				Escribir "Moto:"
				Escribir "Estudiante: $0.25 por hora"
				Escribir "Docente: $0.50 por hora"
				Escribir "Administrativo: $0.75 por hora"
				Escribir ""
				Escribir "Boleto perdido - Carro: $20"
				Escribir "Boleto perdido - Moto: $10"
				
			3:
				Escribir "Gracias por utilizar el parqueadero."
				
			De Otro Modo:
				Escribir "Opcion no valida."
				
		FinSegun
		
	Hasta Que opcion = 3
	
FinAlgoritmo
