package gestionUniversidades;

public class Estudiante {
    private String nombre;
    private int edad;
    private int numeroDeEstudiante;

    public Estudiante(String nombre, int edad, int numeroDeEstudiante) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroDeEstudiante = numeroDeEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumeroDeEstudiante() {
        return numeroDeEstudiante;
    }
}
