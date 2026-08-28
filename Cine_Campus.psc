Algoritmo Cine_Campus
	
	Definir opcion, formato, cantidad, cliente, pago, edad Como Entero
	Definir precio, subtotal, descuento, recargo, total Como Real
	
	Repetir
		
		Escribir "===== CINE CAMPUS ====="
		Escribir "1. Comprar entradas"
		Escribir "2. Consultar precios"
		Escribir "3. Salir"
		Leer opcion
		
		Segun opcion Hacer
			
			1:
				Escribir "Ingrese su edad:"
				Leer edad
				
				Escribir "Cantidad de entradas:"
				Leer cantidad
				
				Si cantidad > 0 Entonces
					
					Escribir "Formato:"
					Escribir "1. 2D ($3.50)"
					Escribir "2. 3D ($5.00)"
					Leer formato
					
					Si formato = 1 Entonces
						precio <- 3.50
					SiNo
						precio <- 5.00
					FinSi
					
					Escribir "Tipo de cliente:"
					Escribir "1. Estudiante"
					Escribir "2. Publico general"
					Leer cliente
					
					Escribir "Metodo de pago:"
					Escribir "1. Efectivo"
					Escribir "2. Tarjeta"
					Leer pago
					
					subtotal <- precio * cantidad
					descuento <- 0
					
					Si cliente = 1 Entonces
						descuento <- subtotal * 0.20
					SiNo
						Si cantidad >= 4 Entonces
							descuento <- subtotal * 0.10
						FinSi
					FinSi
					
					recargo <- 0
					
					Si pago = 2 Entonces
						recargo <- (subtotal - descuento) * 0.05
					FinSi
					
					total <- subtotal - descuento + recargo
					
					Escribir "===== RESUMEN DE COMPRA ====="
					Escribir "Edad: ", edad
					Escribir "Cantidad: ", cantidad
					Escribir "Precio: $", precio
					Escribir "Subtotal: $", subtotal
					Escribir "Descuento: $", descuento
					Escribir "Recargo: $", recargo
					Escribir "Total a pagar: $", total
					
				SiNo
					Escribir "La cantidad debe ser mayor a 0."
				FinSi
				
			2:
				Escribir "===== PRECIOS ====="
				Escribir "2D: $3.50"
				Escribir "3D: $5.00"
				Escribir "Estudiantes: 20% de descuento"
				Escribir "4 o mas entradas: 10% de descuento"
				Escribir "Tarjeta: 5% de recargo"
				
			3:
				Escribir "Gracias por usar Cine Campus."
				
			De Otro Modo:
				Escribir "Opcion invalida."
				
		FinSegun
		
	Hasta Que opcion = 3
	
FinAlgoritmo