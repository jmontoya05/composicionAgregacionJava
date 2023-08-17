package composicionCasa;

public class Habitacion {
    private int numeroDeHabitacion;
    private double tamano;

    public Habitacion(int numeroDeHabitacion, double tamano) {
        this.numeroDeHabitacion = numeroDeHabitacion;
        this.tamano = tamano;
    }

    public int getNumeroDeHabitacion() {
        return numeroDeHabitacion;
    }

    public double getTamano() {
        return tamano;
    }
}
