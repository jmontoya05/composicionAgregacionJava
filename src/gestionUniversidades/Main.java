package gestionUniversidades;

public class Main {

    public static void main(String[] args) {

        Universidad universidad = new Universidad("Universidad XYZ");

        Estudiante estudiante1 = new Estudiante("Carlos Jaramillo", 23, 101);
        Estudiante estudiante2 = new Estudiante("Juan Quiceno", 17, 102);
        Estudiante estudiante3 = new Estudiante("Luis Barco", 19, 103);

        universidad.agregarEstudiante(estudiante1);
        universidad.agregarEstudiante(estudiante2);
        universidad.agregarEstudiante(estudiante3);

        System.out.println("Nombre de la universidad: " + universidad.getNombre());

        Estudiante[] arregloEstudiantes = universidad.getEstudiantes();

        for (int i = 0; i < universidad.getCantidadEstudiantes(); i++){
            System.out.println("\nEstudiante # " + arregloEstudiantes[i].getNumeroDeEstudiante() +
                    "\nNombre: " + arregloEstudiantes[i].getNombre() +
                    "\nEdad: " + arregloEstudiantes[i].getEdad());
        }
    }



}
