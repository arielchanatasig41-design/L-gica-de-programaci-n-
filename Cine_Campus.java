
import java.util.Scanner;

public class Cine_Campus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion, formato, cantidad, cliente, pago, edad;
        double precio, subtotal, descuento, recargo, total;

        do {
            System.out.println("===== CINE CAMPUS =====");
            System.out.println("1. Comprar entradas");
            System.out.println("2. Consultar precios");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese su edad:");
                    edad = scanner.nextInt();

                    System.out.println("Cantidad de entradas:");
                    cantidad = scanner.nextInt();

                    if (cantidad > 0) {
                        System.out.println("Formato:");
                        System.out.println("1. 2D ($3.50)");
                        System.out.println("2. 3D ($5.00)");
                        formato = scanner.nextInt();

                        if (formato == 1) {
                            precio = 3.50;
                        } else {
                            precio = 5.00;
                        }

                        System.out.println("Tipo de cliente:");
                        System.out.println("1. Estudiante");
                        System.out.println("2. Publico general");
                        cliente = scanner.nextInt();

                        System.out.println("Metodo de pago:");
                        System.out.println("1. Efectivo");
                        System.out.println("2. Tarjeta");
                        pago = scanner.nextInt();

                        subtotal = precio * cantidad;
                        descuento = 0;

                        if (cliente == 1) {
                            descuento = subtotal * 0.20;
                        } else {
                            if (cantidad >= 4) {
                                descuento = subtotal * 0.10;
                            }
                        }

                        recargo = 0;

                        if (pago == 2) {
                            recargo = (subtotal - descuento) * 0.05;
                        }

                        total = subtotal - descuento + recargo;

                        System.out.println("===== RESUMEN DE COMPRA =====");
                        System.out.println("Edad: " + edad);
                        System.out.println("Cantidad: " + cantidad);
                        System.out.println("Precio: $" + precio);
                        System.out.println("Subtotal: $" + subtotal);
                        System.out.println("Descuento: $" + descuento);
                        System.out.println("Recargo: $" + recargo);
                        System.out.println("Total a pagar: $" + total);
                    } else {
                        System.out.println("La cantidad debe ser mayor a 0.");
                    }
                    break;

                case 2:
                    System.out.println("===== PRECIOS =====");
                    System.out.println("2D: $3.50");
                    System.out.println("3D: $5.00");
                    System.out.println("Estudiantes: 20% de descuento");
                    System.out.println("4 o mas entradas: 10% de descuento");
                    System.out.println("Tarjeta: 5% de recargo");
                    break;

                case 3:
                    System.out.println("Gracias por usar Cine Campus.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }

        } while (opcion != 3);

        scanner.close();
    }
}