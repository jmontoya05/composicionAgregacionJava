package cuentaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creación de cuenta 1
        System.out.println("Por favor diligencie los siguientes datos para la creación de su cuenta");
        System.out.println("Nombre del titular");
        String nombre = sc.next();
        System.out.println("Edad del titular");
        int edad = sc.nextInt();
        System.out.println("Numero de identificación del titular");
        String identificacion = sc.next();
        System.out.println("Saldo inicial de la cuenta");
        double saldoCuenta = sc.nextDouble();

        Cuenta cuenta1 = new Cuenta(nombre, edad, identificacion, saldoCuenta);
        System.out.println(cuenta1.getDatosCuenta());
        System.out.println(" ");

        //Creación de cuenta 2
        System.out.println("Por favor diligencie los siguientes datos para la creación de su cuenta");
        System.out.println("Nombre del titular");
        nombre = sc.next();
        System.out.println("Edad del titular");
        edad = sc.nextInt();
        System.out.println("Numero de identificación del titular");
        identificacion = sc.next();
        System.out.println("Saldo inicial de la cuenta");
        saldoCuenta = sc.nextDouble();

        Cuenta cuenta2 = new Cuenta(nombre, edad, identificacion, saldoCuenta);
        System.out.println(cuenta2.getDatosCuenta());
        System.out.println(" ");

        //Creación de banco
        Banco bancoAmistad = new Banco(cuenta1, cuenta2);

        bancoAmistad.imprimirNumeroCuentas();

        int opcion;
        while (true) {
            System.out.println("Seleccione la operación que desea realizar");
            System.out.println("1 Obtener número de la cuenta");
            System.out.println("2 Obtener saldo de la cuenta");
            System.out.println("3 Obtener datos de la cuenta");
            System.out.println("4 Recargar cuenta");
            System.out.println("5 Hacer un retiro de la cuenta");
            System.out.println("6 Realizar una transferencia entre cuentas");
            System.out.println("7 Mostrar los números de cuentas del banco");
            System.out.println("8 Salir");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 8) {
                if (opcion == 8) {
                    break;
                } else {
                    int cuenta;
                    switch (opcion) {
                        case 1:
                            System.out.println("Sobre que cuenta desea realizar la operación (1 o 2)?");
                            cuenta = sc.nextInt();
                            if (cuenta == 1) {
                                System.out.println(cuenta1.getNumeroDeCuenta());
                            } else if (cuenta == 2) {
                                System.out.println(cuenta2.getNumeroDeCuenta());
                            } else {
                                System.out.println("Ingresó una cuenta incorrecta");
                            }
                            break;
                        case 2:
                            System.out.println("Sobre que cuenta desea realizar la operación (1 o 2)?");
                            cuenta = sc.nextInt();
                            if (cuenta == 1) {
                                System.out.println(cuenta1.getSaldoCuenta());
                            } else if (cuenta == 2) {
                                System.out.println(cuenta2.getSaldoCuenta());
                            } else {
                                System.out.println("Ingresó una cuenta incorrecta");
                            }
                            break;
                        case 3:
                            System.out.println("Sobre que cuenta desea realizar la operación (1 o 2)?");
                            cuenta = sc.nextInt();
                            if (cuenta == 1) {
                                System.out.println(cuenta1.getDatosCuenta());
                            } else if (cuenta == 2) {
                                System.out.println(cuenta2.getDatosCuenta());
                            } else {
                                System.out.println("Ingresó una cuenta incorrecta");
                            }
                            break;
                        case 4:
                            System.out.println("Sobre que cuenta desea realizar la operación (1 o 2)?");
                            cuenta = sc.nextInt();
                            System.out.println("Ingrese la cantidad que desea recargar");
                            double recarga = sc.nextDouble();
                            if (cuenta == 1) {
                                cuenta1.setIngreso(recarga);
                            } else if (cuenta == 2) {
                                cuenta1.setIngreso(recarga);
                            } else {
                                System.out.println("Ingresó una cuenta incorrecta");
                            }
                            break;
                        case 5:
                            System.out.println("Sobre que cuenta desea realizar la operación (1 o 2)?");
                            cuenta = sc.nextInt();
                            System.out.println("Ingrese la cantidad que desea retirar");
                            double retiro = sc.nextDouble();
                            if (cuenta == 1) {
                                cuenta1.setRetiro(retiro);
                            } else if (cuenta == 2) {
                                cuenta1.setRetiro(retiro);
                            } else {
                                System.out.println("Ingresó una cuenta incorrecta");
                            }
                            break;
                        case 6:
                            System.out.println("Sobre que cuenta desea realizar la operación (1 o 2)?");
                            cuenta = sc.nextInt();
                            if (cuenta == 1 || cuenta == 2) {
                                System.out.println("Ingrese la cantidad que desea transferir");
                                double cantidad = sc.nextDouble();
                                if (cuenta == 1) {
                                    bancoAmistad.realizarTransferenciaEntreCuentas(cuenta1, cuenta2, cantidad);
                                } else {
                                    bancoAmistad.realizarTransferenciaEntreCuentas(cuenta2, cuenta1, cantidad);
                                }

                            } else {
                                System.out.println("Ingresó una cuenta incorrecta");
                            }
                            System.out.println("Así quedó el saldo de la cuenta 1: " + cuenta1.getSaldoCuenta());
                            System.out.println("Así quedó el saldo de la cuenta 2: " + cuenta2.getSaldoCuenta());

                        default:
                            bancoAmistad.imprimirNumeroCuentas();
                    }
                }
            } else {
                System.out.println("Ingresó una opción incorrecta, intentelo nuevamente");
            }
        }
    }
}
