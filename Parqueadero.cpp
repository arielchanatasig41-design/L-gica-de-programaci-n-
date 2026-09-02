#include <iostream>
using namespace std;

int main() {
    int opcion, vehiculo, rol, dia, boleto, horas;
    double tarifa, total;

    do {
        cout << "===== PARQUEADERO =====" << endl;
        cout << "1. Calcular tarifa" << endl;
        cout << "2. Ver tarifas" << endl;
        cout << "3. Salir" << endl;
        cin >> opcion;

        switch (opcion) {
            case 1:
                cout << "Tipo de vehiculo:" << endl;
                cout << "1. Carro" << endl;
                cout << "2. Moto" << endl;
                cin >> vehiculo;

                cout << "Rol:" << endl;
                cout << "1. Estudiante" << endl;
                cout << "2. Docente" << endl;
                cout << "3. Administrativo" << endl;
                cin >> rol;

                cout << "Dia:" << endl;
                cout << "1. Laborable" << endl;
                cout << "2. Fin de semana" << endl;
                cin >> dia;

                cout << "Numero de horas:" << endl;
                cin >> horas;

                cout << "¿Perdio el boleto?" << endl;
                cout << "1. Si" << endl;
                cout << "2. No" << endl;
                cin >> boleto;

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

                cout << "Total a pagar: $" << total << endl;
                break;

            case 2:
                cout << "===== TARIFAS =====" << endl;
                cout << "Carro:" << endl;
                cout << "Estudiante: $0.50 por hora" << endl;
                cout << "Docente: $0.75 por hora" << endl;
                cout << "Administrativo: $1.00 por hora\n" << endl;
                cout << "Moto:" << endl;
                cout << "Estudiante: $0.25 por hora" << endl;
                cout << "Docente: $0.50 por hora" << endl;
                cout << "Administrativo: $0.75 por hora\n" << endl;
                cout << "Boleto perdido - Carro: $20" << endl;
                cout << "Boleto perdido - Moto: $10" << endl;
                break;

            case 3:
                cout << "Gracias por utilizar el parqueadero." << endl;
                break;

            default:
                cout << "Opcion no valida." << endl;
                break;
        }
    } while (opcion != 3);

    return 0;
}