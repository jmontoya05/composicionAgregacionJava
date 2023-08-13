package carro;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Motor motorRenault = new Motor("Renault", "Escape");
        Carro renault = new Carro(motorRenault);

        renault.agregarLlanta(new Llanta("Michellin","Rin delantero izquierdo"));
        renault.agregarLlanta(new Llanta("Michellin","Rin delantero derecho"));
        renault.agregarLlanta(new Llanta("Pirelli","Rin trasero izquierdo"));
        renault.agregarLlanta(new Llanta("Pirelli","Rin trasero derecho"));

        System.out.println(renault.getDatosCarro());

        renault.agregarLlanta(new Llanta("Kenda","Rin opcional"));

    }
}