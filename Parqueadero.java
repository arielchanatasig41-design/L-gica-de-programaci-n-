import java.util.Scanner;

public class Parqueadero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion, vehiculo, rol, dia, boleto, horas;
        double tarifa, total;

        do {
            System.out.println("===== PARQUEADERO =====");
            System.out.println("1. Calcular tarifa");
            System.out.println("2. Ver tarifas");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Tipo de vehiculo:");
                    System.out.println("1. Carro");
                    System.out.println("2. Moto");
                    vehiculo = scanner.nextInt();

                    System.out.println("Rol:");
                    System.out.println("1. Estudiante");
                    System.out.println("2. Docente");
                    System.out.println("3. Administrativo");
                    rol = scanner.nextInt();

                    System.out.println("Dia:");
                    System.out.println("1. Laborable");
                    System.out.println("2. Fin de semana");
                    dia = scanner.nextInt();

                    System.out.println("Numero de horas:");
                    horas = scanner.nextInt();

                    System.out.println("¿Perdio el boleto?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    boleto = scanner.nextInt();

                    if (boleto == 1) {
                        if (vehiculo == 1) {
                            total = 20;
                        } else {
                            total = 10;
                        }
                    } else {
                        if (vehiculo == 1) {
                            if (rol == 1) {
                                tarifa = 0.50;
                            } else if (rol == 2) {
                                tarifa = 0.75;
                            } else {
                                tarifa = 1.0;
                            }
                        } else {
                            if (rol == 1) {
                                tarifa = 0.25;
                            } else if (rol == 2) {
                                tarifa = 0.50;
                            } else {
                                tarifa = 0.75;
                            }
                        }
                        total = tarifa * horas;
                    }

                    System.out.println("Total a pagar: $" + total);
                    break;

                case 2:
                    System.out.println("===== TARIFAS =====");
                    System.out.println("Carro:");
                    System.out.println("Estudiante: $0.50 por hora");
                    System.out.println("Docente: $0.75 por hora");
                    System.out.println("Administrativo: $1.00 por hora\n");
                    System.out.println("Moto:");
                    System.out.println("Estudiante: $0.25 por hora");
                    System.out.println("Docente: $0.50 por hora");
                    System.out.println("Administrativo: $0.75 por hora\n");
                    System.out.println("Boleto perdido - Carro: $20");
                    System.out.println("Boleto perdido - Moto: $10");
                    break;

                case 3:
                    System.out.println("Gracias por utilizar el parqueadero.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }
}