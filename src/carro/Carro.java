package carro;

public class Carro {

    private Motor motor;
    private Llanta [] llantas;
    private int cantidadLlantas;

    public Carro(Motor motor) {
        this.motor = motor;
        this.llantas = new Llanta[4];
        this.cantidadLlantas = 0;
    }

    public void agregarLlanta(Llanta llanta){
        if (cantidadLlantas <= 3){
            this.llantas[cantidadLlantas] = llanta;
            System.out.println("Llanta agregada con éxito");
            cantidadLlantas += 1;
        } else {
            System.out.println("No se pueden agregar más llantas al carro");
        }
    }

    public String getDatosCarro(){
        String datosMotor = "\nDatos motor: \n-Marca: " + this.motor.getMarca() + "\n-Nombre valvula: " + this.motor.getNombreValvula();
        String datosLlantas = "";
        for (int i = 0; i < this.cantidadLlantas; i++){
            datosLlantas += "\nDatos llantas: -Llanta # " + (i+1) + ":\n* Marca: " + this.llantas[i].getMarca() + "\n* Tipo rin: " + this.llantas[i].getTipoRin();
        }
        return datosMotor + datosLlantas;
    }
}
