package gestionUniversidades;

public class Universidad {

    private String nombre;
    private int cantidadEstudiantes;
    private Estudiante [] estudiantes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.cantidadEstudiantes = 0;
        this.estudiantes = new Estudiante [99];
    }

    public void agregarEstudiante(Estudiante estudiante){
        if (cantidadEstudiantes < 100){
            this.estudiantes[cantidadEstudiantes] = estudiante;
            cantidadEstudiantes += 1;
            System.out.println("\n Estudiante agregado con éxito\n");
        } else {
            System.out.println("\nNo es posible ingresar el estudiante, la universidad tiene el cupo completo");
        }
    }

    public Estudiante[] getEstudiantes() {
        return this.estudiantes;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public String getNombre(){
        return this.nombre;
    }
}
