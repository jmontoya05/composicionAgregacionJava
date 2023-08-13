package cuentaBancaria;

public class Banco {

    private Cuenta cuenta1;
    private Cuenta cuenta2;

    public Banco(Cuenta cuenta1, Cuenta cuenta2) {
        this.cuenta1 = cuenta1;
        this.cuenta2 = cuenta2;
        System.out.println("Banco creado con éxito");
    }

    public void realizarTransferenciaEntreCuentas(Cuenta cuentaEmisora, Cuenta cuentaReceptora, double cantidad){
        if (cantidad > 0){
            if (cuentaEmisora.getSaldoCuenta() - cantidad > 0){
                cuentaEmisora.setRetiro(cantidad);
                cuentaReceptora.setIngreso(cantidad);
                System.out.println("Transferencia realizada con éxito");
            } else {
                System.out.println("No puede transferir una cantidad menor o igual a 0");
            }
        }
    }
    public void imprimirNumeroCuentas(){
        System.out.println("Número de cuenta 1: " + (long) this.cuenta1.getNumeroDeCuenta() + "\nNumero de cuenta 2: " + (long) this.cuenta2.getNumeroDeCuenta());
    }
}
