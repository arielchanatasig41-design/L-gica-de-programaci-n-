
#include <iostream>

using namespace std;

int main() {
    int opcion, formato, cantidad, cliente, pago, edad;
    double precio, subtotal, descuento, recargo, total;

    do {
        cout << "===== CINE CAMPUS =====" << endl;
        cout << "1. Comprar entradas" << endl;
        cout << "2. Consultar precios" << endl;
        cout << "3. Salir" << endl;
        cin >> opcion;

        switch (opcion) {
            case 1:
                cout << "Ingrese su edad:" << endl;
                cin >> edad;

                cout << "Cantidad de entradas:" << endl;
                cin >> cantidad;

                if (cantidad > 0) {
                    cout << "Formato:" << endl;
                    cout << "1. 2D ($3.50)" << endl;
                    cout << "2. 3D ($5.00)" << endl;
                    cin >> formato;

                    if (formato == 1) {
                        precio = 3.50;
                    } else {
                        precio = 5.00;
                    }

                    cout << "Tipo de cliente:" << endl;
                    cout << "1. Estudiante" << endl;
                    cout << "2. Publico general" << endl;
                    cin >> cliente;

                    cout << "Metodo de pago:" << endl;
                    cout << "1. Efectivo" << endl;
                    cout << "2. Tarjeta" << endl;
                    cin >> pago;

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

                    cout << "===== RESUMEN DE COMPRA =====" << endl;
                    cout << "Edad: " << edad << endl;
                    cout << "Cantidad: " << cantidad << endl;
                    cout << "Precio: $" << precio << endl;
                    cout << "Subtotal: $" << subtotal << endl;
                    cout << "Descuento: $" << descuento << endl;
                    cout << "Recargo: $" << recargo << endl;
                    cout << "Total a pagar: $" << total << endl;
                } else {
                    cout << "La cantidad debe ser mayor a 0." << endl;
                }
                break;

            case 2:
                cout << "===== PRECIOS =====" << endl;
                cout << "2D: $3.50" << endl;
                cout << "3D: $5.00" << endl;
                cout << "Estudiantes: 20% de descuento" << endl;
                cout << "4 o mas entradas: 10% de descuento" << endl;
                cout << "Tarjeta: 5% de recargo" << endl;
                break;

            case 3:
                cout << "Gracias por usar Cine Campus." << endl;
                break;

            default:
                cout << "Opcion invalida." << endl;
                break;
        }

    } while (opcion != 3);

    return 0;
}