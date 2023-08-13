package cuentaBancaria;

public class Cuenta {
    private Persona titular;
    private double saldoDeCuenta;
    private long numeroDeCuenta;

    public Cuenta(String nombre, int edad, String identificacion, double saldoDeCuenta) {
        this.titular = new Persona(nombre, edad, identificacion);
        this.saldoDeCuenta = saldoDeCuenta;
        this.numeroDeCuenta = (long) (Math.random() * 10000000000L);//Se agrega la L para que lo reconozca como un long
        System.out.println("Cuenta creada con éxito");

    }

    //Metodos get para obtener el saldo de la cuenta y los datos generales
    public double getSaldoCuenta() {
        return this.saldoDeCuenta;
    }

    public long getNumeroDeCuenta() {
        return this.numeroDeCuenta;
    }

    public String getDatosCuenta() {
        return "Nombre del titular: " + this.titular.getNombre() + "\nSaldo de la cuenta: " + this.saldoDeCuenta + "\nNúmero de cuenta: " + this.numeroDeCuenta;
    }

    //Metodo para ingresar una cantidad a la cuenta
    public void setIngreso(double cantidad) {
        if (cantidad > 0){
            this.saldoDeCuenta += cantidad;
        } else {
            System.out.println("No puede recargar un saldo menor o igual a 0");
        }
    }
    //Metodo para retirar una cantidad de la cuenta
    public void setRetiro(double cantidad) {
        if (this.saldoDeCuenta - cantidad >= 0) {
            saldoDeCuenta -= cantidad;
        } else {
            System.out.println("Saldo insuficiente para el retiro solicitado, su saldo actual es de " + this.saldoDeCuenta);
        }
    }
}
