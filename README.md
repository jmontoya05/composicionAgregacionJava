# Composicion y agregacion en Java

1. En este ejercicio queremos representar como está compuesto un carro.
• Un motor que tiene las siguientes propiedades (marca, nombre de válvula)
• Una llanta que tiene las siguientes propiedades (tipo de rin, marca)
• Un carro tiene 4 llantas, y 1 motor, si tiene menos llantas o más motores, 
no se puede construir el carro. 
Implementar el diagrama de clases de esta solución con sus respectivas relaciones, 
además de esto para cada clase hacer el encapsulamiento y los constructores.
En el Main crear las llantas, el motor y el objecto carro.

Solución ubicada en el paquete carro

![Descripción de la imagen](https://i.ibb.co/dMfrw8G/Carro.png)

2. Ejerció practico.
Crear una clase que permita crear cuentas bancarias. La clase ha de tener los siguientes
requisitos:
• Nombre: Cuenta.
• Tendrá las siguientes propiedades:
§ saldoDeCuenta,	de	tipo double.
§ nombreDelTitular,	de	tipo String.
§ numeroDeCuenta,	de	tipo long.
• Constructor de la clase con dos parámetros:
§ nombreDelTitular,	de	tipo String.
§ saldoDeCuenta,	de	tipo double.
• Métodos de la clase:
§ Se	crearán	dos setters,	uno	para	hacer ingresos (setIngreso)	y	otro	para	
hacer reintegros (setReintegro).	Se	crearán	en	un	objeto	de	tipo CCC.
§ Se	crearán	dos getters,	uno	permitirá obtener el saldo (getSaldoCuenta)	de	la	
cuenta	corriente	y	el	otro obtendrá los datos generales (getDatosCuenta)	de	
una Cuenta .
El constructor de la clase Cuenta será el encargado de establecer:
• Un nombre para el titular de la cuenta corriente
• Un saldo inicial para la cuenta corriente.
• Asignará un número de cuenta corriente, de tipo long, de forma aleatoria.
Luego se necesita crear la siguiente clase con su relación respectiva.
• Nombre: Banco.
• Tendrá las siguientes propiedades:
§ cuenta1,	de	tipo Cuenta.
§ cuenta2,	de	tipo Cuenta.
• Constructor de la clase con dos parámetros (cuenta1, cuenta2):
• Métodos de la clase:
§ Se	creará	un método (RealizarTransferenciaEntreCuentas) para	permitir	realizar	
transferencias	de	dinero	de	una	cuenta	a	otra	(de	una Cuenta a	otra),	por	lo	tanto	
debe	de	recibir	
§ Se	creará	un método (ImprimirNumeroCuentas) el	cual	debe	de	imprimir	el	numero	
de	la	cuenta1	y cuenta2.

Solución ubicada en el paquete cuentaBancaria

![Descripción de la imagen](https://i.ibb.co/Bf9xYbk/cuentas-Bancarias.png)
