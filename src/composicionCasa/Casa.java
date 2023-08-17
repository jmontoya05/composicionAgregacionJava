package composicionCasa;

public class Casa {
    private Habitacion[] habitaciones;
    private int cantidadDeHabitaciones;
    private int CAPACIDAD_MAXIMA;

    public Casa() {
        this.CAPACIDAD_MAXIMA = 100;
        this.habitaciones = new Habitacion[CAPACIDAD_MAXIMA];
        this.cantidadDeHabitaciones = 0;
    }

    public void agregarHabitacion(Habitacion habitacion){
        if (cantidadDeHabitaciones < CAPACIDAD_MAXIMA){
            this.habitaciones[cantidadDeHabitaciones] = habitacion;
            this.cantidadDeHabitaciones += 1;
            System.out.println("Habitación agregada correctamente");
        } else {
            System.out.println("No es posible tener más habitaciones en esta casa");
        }
    }

    public void destruirCasa(){
        this.habitaciones = new Habitacion[CAPACIDAD_MAXIMA];
        this.cantidadDeHabitaciones = 0;
        System.out.println("La casa se ha destruida éxitosamnte");
    }

    public String mostrarInformacionCasa(){
        String informacion;
        informacion = "\nLa casa tiene en total " + this.cantidadDeHabitaciones + " habitaciones";
        for (int i = 0; i < this.cantidadDeHabitaciones; i++ ){
            informacion += "\nHabitación número: " + this.habitaciones[i].getNumeroDeHabitacion() +
                    "\nTamaño de la habitación: " + this.habitaciones[i].getTamano() + "\n";

        }
        return informacion;
    }
}
