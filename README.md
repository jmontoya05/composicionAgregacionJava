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


3. En una universidad llamada "Universidad XYZ", se desea gestionar la información
   de sus estudiantes. Cada estudiante tiene un nombre, edad y número de
   estudiante. La universidad puede tener un máximo de 100 estudiantes.
   Debes implementar un programa en Java utilizando programación orientada a
   objetos que cumpla con los siguientes requisitos:
   Define una clase llamada "Universidad" que tenga los siguientes atributos:
   a. Un nombre de tipo String.
   b. Un vector de estudiantes de tipo Estudiante.
   c. Un contador de cantidad de estudiantes.
   La clase "Universidad" debe tener los siguientes métodos:
   d. Un constructor que reciba el nombre de la universidad y que
   inicialice el vector de estudiantes y el contador.
   e. Un método llamado "agregarEstudiante" que reciba un objeto de
   tipo Estudiante y lo agregue al vector de estudiantes si hay capacidad
   disponible.
   f. Un método llamado "getEstudiantes" que retorne el vector de
   estudiantes.
   g. Un método llamado "getCantidadEstudiantes" que retorne la
   cantidad actual de estudiantes en la universidad.
   Define una clase llamada "Estudiante" que tenga los siguientes atributos:
   h. Un nombre de tipo String.
   i. Una edad de tipo int.
   j. Un número de estudiante de tipo int.
   La clase "Estudiante" debe tener los siguientes métodos:
   k. Un constructor que reciba el nombre, la edad y el número de
   estudiante.
   En el método principal (main) del programa, realiza lo siguiente:
   l. Crea una instancia de la clase "Universidad" llamada "universidad"
   con el nombre "Universidad XYZ".
   m. Crea al menos dos instancias de la clase "Estudiante" con datos
   ficticios.
   n. Agrega los estudiantes creados a la universidad utilizando el método
   "agregarEstudiante" de la clase "Universidad".
   o. Imprime en la consola el nombre de la universidad.
   p. Recorre el vector de estudiantes utilizando un bucle y muestra en la
   consola la información de cada estudiante (nombre, edad y número
   de estudiante).
   Recuerda utilizar vectores en lugar de listas para almacenar los estudiantes en la
   clase "Universidad" según los requisitos del ejercicio.

![Gestión Universidades](https://i.ibb.co/fMjZhtS/Gesti-n-universidad.png)

4. Se desea modelar una relación de composición entre las clases "Casa" y
   "Habitación" utilizando vectores en lugar de listas. Cada casa está compuesta por
   varias habitaciones, y si la casa se destruye, las habitaciones también
   desaparecen. Cada habitación tiene un número y un tamaño en metros
   cuadrados.
   Debes implementar un programa en Java utilizando programación orientada a
   objetos que cumpla con los siguientes requisitos:
   Define una clase llamada "Casa" que tenga los siguientes atributos:
   o Un vector de habitaciones de tipo Habitación.
   o Un contador de cantidad de habitaciones.
   o Una constante llamada "CAPACIDAD_MAXIMA" con valor 100 para
   indicar la capacidad máxima de habitaciones en una casa.
   La clase "Casa" debe tener los siguientes métodos:
   o Un constructor que inicialice el vector de habitaciones y el contador.
   o Un método llamado "agregarHabitacion" que reciba un objeto de
   tipo Habitación y lo agregue al vector de habitaciones si hay
   capacidad disponible.
   o Un método llamado "destruirCasa" que elimine todas las
   habitaciones de la casa.
   o Un método llamado "mostrarInformacionCasa" que muestre en la
   consola la información de cada habitación en la casa.
   Define una clase llamada "Habitación" que tenga los siguientes atributos:
   o Un número de habitación de tipo int.
   o Un tamaño de habitación en metros cuadrados de tipo double.
   La clase "Habitación" debe tener los siguientes métodos:
   o Un constructor que reciba el número y el tamaño de la habitación.
   o Métodos getter para acceder al número y al tamaño de la habitación.
   En el método principal (main) del programa, realiza lo siguiente:
   o Crea una instancia de la clase "Casa" llamada "casa".
   o Crea al menos dos instancias de la clase "Habitación" con datos
   ficticios.
   o Agrega las habitaciones creadas a la casa utilizando el método
   "agregarHabitacion" de la clase "Casa".
   o Llama al método "mostrarInformacionCasa" de la clase "Casa" para
   mostrar la información de las habitaciones en la consola.
   o Llama al método "destruirCasa" de la clase "Casa" para simular la
   destrucción de la casa y vuelve a llamar al método
   "mostrarInformacionCasa" para verificar que las habitaciones se han
   eliminado.

![Composicion casa](https://i.ibb.co/hCm9235/Composicion-Casa.png)