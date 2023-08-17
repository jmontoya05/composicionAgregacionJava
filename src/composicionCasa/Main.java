package composicionCasa;

public class Main {

    public static void main(String[] args) {

        Casa casa = new Casa();

        Habitacion sencilla = new Habitacion(201, 45);
        Habitacion doble = new Habitacion(202, 80);
        Habitacion familiar = new Habitacion(203, 100);

        casa.agregarHabitacion(sencilla);
        casa.agregarHabitacion(doble);
        casa.agregarHabitacion(familiar);

        System.out.println(casa.mostrarInformacionCasa());

        casa.destruirCasa();

        System.out.println(casa.mostrarInformacionCasa());
    }
}
