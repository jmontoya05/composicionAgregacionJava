package cuentaBancaria;

public class Persona {
    private String nombre;
    private int edad;
    private String identificacion;

    //Contructor de clase
    public Persona(String nombre, int edad, String identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
    }

    //Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdentificacion() {
        return this.identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    //Metodo para mostrar los datos de una persona
    public String mostrar(){
        return "Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nIdentificación: " + this.identificacion;
    }

    //Metodo para validar si una persona es mayor de edad
    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }
}
